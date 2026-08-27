package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

public class PasscodeActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public String B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public org.telegram.ui.ActionBar.v0 I;
    public boolean J;
    public final uk0 K;
    public vk0 L;
    public jb0 M;

    public org.telegram.ui.Components.ri0 f35568a;
    private int autoLockRow;

    public al0 f35569b;

    public org.telegram.ui.Components.zk0 f35570c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;

    public org.telegram.ui.Components.zz0 f35571e;

    public org.telegram.ui.Components.jc0 f35572f;
    private int fingerprintRow;
    public EditTextBoldCursor h;

    public od0 f35573n;

    public TextView f35574r;

    public ImageView f35575s;
    public org.telegram.ui.Components.ir v;

    public org.telegram.ui.Components.m10 f35576w;

    public final int f35577x;

    public int f35578y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f35578y = 0;
        this.A = 0;
        this.K = new uk0(this, 4);
        this.f35577x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.fc0 fc0Var, int i10) {
        int value = fc0Var.getValue();
        if (value == 0) {
            SharedConfig.autoLockIn = 0;
        } else if (value == 1) {
            SharedConfig.autoLockIn = 60;
        } else if (value == 2) {
            SharedConfig.autoLockIn = 300;
        } else if (value == 3) {
            SharedConfig.autoLockIn = 3600;
        } else if (value == 4) {
            SharedConfig.autoLockIn = 18000;
        }
        passcodeActivity.f35569b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new zt(passcodeActivity, 29));
                b2Var.show();
                ((TextView) b2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
                return;
            }
            if (i10 != passcodeActivity.autoLockRow) {
                if (i10 == passcodeActivity.fingerprintRow) {
                    SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                    UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                    ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.useFingerprintLock);
                    return;
                } else {
                    if (i10 == passcodeActivity.F) {
                        SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                        ((org.telegram.ui.Cells.p8) view).setChecked(SharedConfig.allowScreenCapture);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                        if (SharedConfig.allowScreenCapture) {
                            return;
                        }
                        org.telegram.ui.Components.y4.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                        return;
                    }
                    return;
                }
            }
            if (passcodeActivity.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
            String string2 = LocaleController.getString(R.string.AutoLock);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.N = string2;
            org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(passcodeActivity.getParentActivity(), null);
            fc0Var.setMinValue(0);
            fc0Var.setMaxValue(4);
            int i11 = SharedConfig.autoLockIn;
            if (i11 == 0) {
                fc0Var.setValue(0);
            } else if (i11 == 60) {
                fc0Var.setValue(1);
            } else if (i11 == 300) {
                fc0Var.setValue(2);
            } else if (i11 == 3600) {
                fc0Var.setValue(3);
            } else if (i11 == 18000) {
                fc0Var.setValue(4);
            }
            fc0Var.setFormatter(new j70(6));
            alertDialog$Builder2.n(fc0Var);
            alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new c3.d(passcodeActivity, fc0Var, i10, 11));
            passcodeActivity.showDialog(b2Var2);
        }
    }

    public static org.telegram.ui.ActionBar.n2 b0() {
        return !SharedConfig.passcodeHash.isEmpty() ? new PasscodeActivity(2) : new h(6);
    }

    public final void a0(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            od0 od0Var = this.f35573n;
            wr[] wrVarArr = od0Var.f43279f;
            if (i10 >= wrVarArr.length) {
                od0Var.postDelayed(new ff0(11, this, runnable), (((long) wrVarArr.length) * 75) + 350);
                return;
            } else {
                wr wrVar = wrVarArr[i10];
                wrVar.postDelayed(new wk0(wrVar, 0), ((long) i10) * 75);
                i10++;
            }
        }
    }

    public final boolean c0() {
        if (!e0() || this.f35577x == 0 || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        int i10;
        org.telegram.ui.ActionBar.f1 f1VarE;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = false;
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 8));
        FrameLayout frameLayout2 = new FrameLayout(context);
        int i11 = 1;
        int i12 = this.f35577x;
        if (i12 == 0) {
            frameLayout = frameLayout2;
        } else {
            ScrollView scrollView = new ScrollView(context);
            scrollView.addView(frameLayout2, h7.z5.c(-2.0f, -1));
            scrollView.setFillViewport(true);
            frameLayout = scrollView;
        }
        org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90(this, context, frameLayout, 1);
        i90Var.setDelegate(new cd0(1, this));
        this.fragmentView = i90Var;
        i90Var.addView(frameLayout, h7.z5.l(1.0f, -1, 0));
        org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context);
        this.v = irVar;
        irVar.setVisibility(c0() ? 0 : 8);
        i90Var.addView(this.v, h7.z5.n(-1, 230));
        if (i12 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Passcode));
            int i13 = org.telegram.ui.ActionBar.g6.f22999a7;
            frameLayout2.setTag(Integer.valueOf(i13));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
            org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
            this.f35570c = zk0Var;
            zk0Var.p1();
            this.actionBar.setAdaptiveBackground(this.f35570c);
            this.f35570c.setLayoutManager(new j(i11, z10, 12));
            this.f35570c.setVerticalScrollBarEnabled(false);
            this.f35570c.setItemAnimator(null);
            this.f35570c.setLayoutAnimation(null);
            frameLayout2.addView(this.f35570c, h7.z5.c(-1.0f, -1));
            org.telegram.ui.Components.zk0 zk0Var2 = this.f35570c;
            al0 al0Var = new al0(this, context);
            this.f35569b = al0Var;
            zk0Var2.setAdapter(al0Var);
            this.f35570c.setOnItemClickListener(new i(this, 19));
        } else if (i12 == 1 || i12 == 2) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
                this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false), false);
                this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23359u8, false), false);
                this.actionBar.setCastShadows(false);
                org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
                if (i12 == 1) {
                    org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, R.drawable.ic_ab_other);
                    this.I = v0VarA;
                    f1VarE = v0VarA.e(1, R.drawable.msg_permissions, LocaleController.getString(R.string.PasscodeSwitchToPassword));
                } else {
                    f1VarE = null;
                }
                this.actionBar.setActionBarMenuOnItemClick(new xk0(this, f1VarE));
            }
            FrameLayout frameLayout3 = new FrameLayout(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            frameLayout2.addView(linearLayout, h7.z5.c(-1.0f, -1));
            org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
            this.f35568a = ri0Var;
            ri0Var.setFocusable(false);
            this.f35568a.f(R.raw.tsv_setup_intro, 120, 120, null);
            this.f35568a.setAutoRepeat(false);
            this.f35568a.d();
            org.telegram.ui.Components.ri0 ri0Var2 = this.f35568a;
            if (AndroidUtilities.isSmallScreen()) {
                i10 = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            ri0Var2.setVisibility(i10);
            linearLayout.addView(this.f35568a, h7.z5.q(120, 120, 1));
            TextView textView = new TextView(context);
            this.d = textView;
            int i14 = org.telegram.ui.ActionBar.g6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            this.d.setTypeface(AndroidUtilities.bold());
            if (i12 != 1) {
                this.d.setText(LocaleController.getString(R.string.EnterYourPasscode));
            } else if (SharedConfig.passcodeHash.isEmpty()) {
                this.d.setText(LocaleController.getString(R.string.CreatePasscode));
            } else {
                this.d.setText(LocaleController.getString(R.string.EnterNewPasscode));
            }
            this.d.setTextSize(1, 18.0f);
            this.d.setGravity(1);
            linearLayout.addView(this.d, h7.z5.t(-2, -2, 1, 0, 16, 0, 0));
            org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0(context);
            this.f35571e = zz0Var;
            zz0Var.setFactory(new dg0(context, 1));
            this.f35571e.setInAnimation(context, R.anim.alpha_in);
            this.f35571e.setOutAnimation(context, R.anim.alpha_out);
            linearLayout.addView(this.f35571e, h7.z5.t(-2, -2, 1, 20, 8, 20, 0));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
            textView2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            textView2.setGravity((d0() ? 3 : 1) | 16);
            textView2.setOnClickListener(new u50(context, 12));
            textView2.setVisibility(i12 == 2 ? 0 : 8);
            textView2.setText(LocaleController.getString(R.string.ForgotPasscode));
            frameLayout2.addView(textView2, h7.z5.d(-1, 56.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            i6.q2(textView2);
            TextView textView3 = new TextView(context);
            this.f35574r = textView3;
            textView3.setTextSize(1, 14.0f);
            this.f35574r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
            this.f35574r.setText(LocaleController.getString(R.string.PasscodesDoNotMatchTryAgain));
            this.f35574r.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
            AndroidUtilities.updateViewVisibilityAnimated(this.f35574r, false, 1.0f, false);
            frameLayout2.addView(this.f35574r, h7.z5.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
            org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
            this.f35572f = jc0Var;
            jc0Var.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.h = editTextBoldCursor;
            editTextBoldCursor.setInputType(524417);
            this.h.setTextSize(1, 18.0f);
            this.h.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            this.h.setBackground(null);
            this.h.setMaxLines(1);
            this.h.setLines(1);
            this.h.setGravity(LocaleController.isRTL ? 5 : 3);
            this.h.setSingleLine(true);
            if (i12 == 1) {
                this.A = 0;
                this.h.setImeOptions(5);
            } else {
                this.A = 1;
                this.h.setImeOptions(6);
            }
            this.h.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.h.setTypeface(Typeface.DEFAULT);
            this.h.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false));
            this.h.setCursorSize(AndroidUtilities.dp(20.0f));
            this.h.setCursorWidth(1.5f);
            int iDp = AndroidUtilities.dp(16.0f);
            this.h.setPadding(iDp, iDp, iDp, iDp);
            this.h.setOnFocusChangeListener(new ld(this, 10));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            linearLayout2.addView(this.h, h7.z5.l(1.0f, 0, -2));
            ImageView imageView = new ImageView(context);
            this.f35575s = imageView;
            imageView.setImageResource(R.drawable.msg_message);
            this.f35575s.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.H6, false));
            this.f35575s.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 1, -1));
            AndroidUtilities.updateViewVisibilityAnimated(this.f35575s, i12 == 1 && this.A == 0, 0.1f, false);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.h.addTextChangedListener(new gh.n4(this, atomicBoolean, false, 9));
            this.f35575s.setOnClickListener(new u70(11, this, atomicBoolean));
            linearLayout2.addView(this.f35575s, h7.z5.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            this.f35572f.addView(linearLayout2, h7.z5.c(-2.0f, -1));
            frameLayout3.addView(this.f35572f, h7.z5.t(-1, -2, 1, 32, 0, 32, 0));
            this.h.setOnEditorActionListener(new fa(this, 8));
            this.h.addTextChangedListener(new yk0(this, 0));
            this.h.setCustomSelectionActionModeCallback(new org.telegram.ui.ActionBar.j0(2));
            od0 od0Var = new od0(this, context, 2);
            this.f35573n = od0Var;
            od0Var.b(4, 10);
            for (wr wrVar : this.f35573n.f43279f) {
                wrVar.setShowSoftInputOnFocusCompat(!c0());
                wrVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                wrVar.setTextSize(1, 24.0f);
                wrVar.addTextChangedListener(new yk0(this, 1));
                wrVar.setOnFocusChangeListener(new hh.p8(this, wrVar, 3));
            }
            frameLayout3.addView(this.f35573n, h7.z5.d(-2, -2.0f, 1, 40.0f, 10.0f, 40.0f, 0.0f));
            linearLayout.addView(frameLayout3, h7.z5.t(-1, -2, 1, 0, 32, 0, 72));
            if (i12 == 1) {
                frameLayout2.setTag(Integer.valueOf(org.telegram.ui.ActionBar.g6.f23053d6));
            }
            org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
            this.f35576w = m10Var;
            i6.q2(m10Var);
            frameLayout2.addView(this.f35576w, h7.z5.d(56, 56.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f));
            this.f35576w.setOnClickListener(new u50(this, 13));
            org.telegram.ui.Components.l21 l21Var = new org.telegram.ui.Components.l21(context);
            l21Var.setTransformType(1);
            l21Var.setProgress(0.0f);
            l21Var.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
            l21Var.setDrawBackground(false);
            this.f35576w.setContentDescription(LocaleController.getString(R.string.Next));
            this.f35576w.addView(l21Var, h7.z5.e(56, 56, 17));
            org.telegram.ui.Components.m10 m10Var2 = this.f35576w;
            m10Var2.a(m10Var2);
            l0();
        }
        return this.fragmentView;
    }

    public final boolean d0() {
        int i10 = this.f35577x;
        return (i10 == 1 && this.f35578y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f35577x == 0) {
                m0();
                al0 al0Var = this.f35569b;
                if (al0Var != null) {
                    al0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.f35577x;
        return (i10 == 1 && this.f35578y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0);
    }

    public final void f0() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (e0()) {
            for (wr wrVar : this.f35573n.f43279f) {
                wrVar.i(1.0f);
            }
        } else {
            this.f35572f.a(1.0f);
        }
        AndroidUtilities.shakeViewSpring(e0() ? this.f35573n : this.f35572f, e0() ? 10.0f : 4.0f, new uk0(this, 2));
    }

    public final void g0() {
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        String code = e0() ? this.f35573n.getCode() : this.h.getText().toString();
        int i10 = 0;
        int i11 = this.f35577x;
        if (i11 == 1) {
            if (!this.B.equals(code)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f35574r, true);
                for (wr wrVar : this.f35573n.f43279f) {
                    wrVar.setText("");
                }
                if (e0()) {
                    this.f35573n.f43279f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.f35573n.removeCallbacks(this.K);
                this.f35573n.post(new uk0(this, 0));
                return;
            }
            boolean zIsEmpty = SharedConfig.passcodeHash.isEmpty();
            try {
                SharedConfig.passcodeSalt = new byte[16];
                Utilities.random.nextBytes(SharedConfig.passcodeSalt);
                byte[] bytes = this.B.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, bytes.length + 16, 16);
                SharedConfig.passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.f35578y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (wr wrVar2 : this.f35573n.f43279f) {
                wrVar2.clearFocus();
                AndroidUtilities.hideKeyboard(wrVar2);
            }
            this.v.setEditText(null);
            a0(new vk0(this, zIsEmpty, i10));
            return;
        }
        if (i11 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (wr wrVar3 : this.f35573n.f43279f) {
                    wrVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.f35573n.f43279f[0].requestFocus();
                }
                f0();
                return;
            }
            if (!SharedConfig.checkPasscode(code)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (wr wrVar4 : this.f35573n.f43279f) {
                    wrVar4.setText("");
                }
                if (e0()) {
                    this.f35573n.f43279f[0].requestFocus();
                }
                f0();
                return;
            }
            SharedConfig.badPasscodeTries = 0;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            wr[] wrVarArr = this.f35573n.f43279f;
            int length2 = wrVarArr.length;
            while (i10 < length2) {
                wr wrVar5 = wrVarArr[i10];
                wrVar5.clearFocus();
                AndroidUtilities.hideKeyboard(wrVar5);
                i10++;
            }
            this.v.setEditText(null);
            a0(new uk0(this, 1));
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 16, new Class[]{org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.x9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        if (this.f35577x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 262144, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35570c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    public final void h0() {
        if ((this.f35578y == 1 && this.h.getText().length() == 0) || (this.f35578y == 0 && this.f35573n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.I;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.f35571e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        this.B = e0() ? this.f35573n.getCode() : this.h.getText().toString();
        this.h.setText("");
        this.h.setInputType(524417);
        for (wr wrVar : this.f35573n.f43279f) {
            wrVar.setText("");
        }
        k0();
        this.A = 1;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return this.f35577x != 0;
    }

    public final void i0(boolean z10, boolean z11) {
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
        if (!z11) {
            this.v.setVisibility(z10 ? 0 : 8);
            this.v.setAlpha(z10 ? 1.0f : 0.0f);
            this.v.setTranslationY(z10 ? 0.0f : AndroidUtilities.dp(230.0f));
            this.fragmentView.requestLayout();
            return;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f).setDuration(150L);
        duration.setInterpolator(z10 ? org.telegram.ui.Components.er.f28122f : org.telegram.ui.Components.ws.f34319e);
        duration.addUpdateListener(new g3(this, 19));
        duration.addListener(new n40(3, this, z10));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.M = (jb0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.f35573n.f43279f[0].requestFocus();
            if (c0()) {
                return;
            }
            AndroidUtilities.showKeyboard(this.f35573n.f43279f[0]);
            return;
        }
        if (d0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void l0() {
        String string;
        int i10 = this.f35577x;
        if (i10 == 2) {
            string = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.A == 0) {
            string = LocaleController.getString(this.f35578y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword);
        } else {
            string = this.f35571e.getCurrentView().getText().toString();
        }
        boolean z10 = (this.f35571e.getCurrentView().getText().equals(string) || TextUtils.isEmpty(this.f35571e.getCurrentView().getText())) ? false : true;
        if (i10 == 2) {
            this.f35571e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.A == 0) {
            this.f35571e.a(LocaleController.getString(this.f35578y == 0 ? R.string.CreatePasscodeInfoPIN : R.string.CreatePasscodeInfoPassword), z10, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35573n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35572f, false, 1.0f, z10);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35573n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35572f, true, 1.0f, z10);
        }
        if (d0()) {
            vk0 vk0Var = new vk0(this, z10, 1);
            this.L = vk0Var;
            AndroidUtilities.runOnUIThread(vk0Var, 3000L);
        } else {
            this.f35576w.e(false, z10);
        }
        i0(c0(), z10);
        k0();
    }

    public final void m0() {
        this.fingerprintRow = -1;
        this.C = 1;
        this.H = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new a5.n(new androidx.biometric.s(ApplicationLoader.applicationContext, 0)).g(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.H;
                this.H = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        int i11 = this.H;
        this.autoLockRow = i11;
        this.D = i11 + 1;
        this.E = i11 + 2;
        this.F = i11 + 3;
        this.G = i11 + 4;
        this.H = i11 + 6;
        this.disablePasscodeRow = i11 + 5;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        wr[] wrVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.ri0 ri0Var = this.f35568a;
        if (ri0Var != null) {
            if (AndroidUtilities.isSmallScreen()) {
                i10 = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            }
            ri0Var.setVisibility(i10);
        }
        od0 od0Var = this.f35573n;
        if (od0Var == null || (wrVarArr = od0Var.f43279f) == null) {
            return;
        }
        for (wr wrVar : wrVarArr) {
            wrVar.setShowSoftInputOnFocusCompat(!c0());
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.f35577x != 0) {
            return true;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35577x == 0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        al0 al0Var = this.f35569b;
        if (al0Var != null) {
            al0Var.l();
        }
        if (this.f35577x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new uk0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 || this.f35577x == 0) {
            return;
        }
        k0();
    }
}
