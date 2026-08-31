package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
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
public class PasscodeActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public String C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public org.telegram.ui.ActionBar.w0 J;
    public boolean K;
    public final al0 L;
    public bl0 M;
    public rb0 N;
    public org.telegram.ui.Components.lj0 f34206a;
    private int autoLockRow;
    public hl0 f34207b;
    public org.telegram.ui.Components.tl0 f34208c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.v01 f34209e;
    public org.telegram.ui.Components.cd0 f34210f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public wd0 f34211n;
    public TextView f34212r;
    public ImageView f34213s;
    public org.telegram.ui.Components.ur v;
    public org.telegram.ui.Components.a20 f34214w;
    public final int f34215x;
    public int f34216y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f34216y = 0;
        this.B = 0;
        this.L = new al0(this, 4);
        this.f34215x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.yc0 yc0Var, int i10) {
        int value = yc0Var.getValue();
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
        passcodeActivity.f34207b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new gu(passcodeActivity, 29));
                d2Var.show();
                ((TextView) d2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21166a;
                    d2Var2.O = string2;
                    org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(passcodeActivity.getParentActivity(), null);
                    yc0Var.setMinValue(0);
                    yc0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        yc0Var.setValue(0);
                    } else if (i11 == 60) {
                        yc0Var.setValue(1);
                    } else if (i11 == 300) {
                        yc0Var.setValue(2);
                    } else if (i11 == 3600) {
                        yc0Var.setValue(3);
                    } else if (i11 == 18000) {
                        yc0Var.setValue(4);
                    }
                    yc0Var.setFormatter(new cl0(0));
                    alertDialog$Builder2.n(yc0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new e3.d(passcodeActivity, yc0Var, i10, 11));
                    passcodeActivity.showDialog(d2Var2);
                }
            } else if (i10 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.useFingerprintLock);
            } else if (i10 == passcodeActivity.G) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(SharedConfig.allowScreenCapture);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                if (!SharedConfig.allowScreenCapture) {
                    org.telegram.ui.Components.z4.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.p2 b0() {
        if (!SharedConfig.passcodeHash.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new i(6);
    }

    public final void a0(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            wd0 wd0Var = this.f34211n;
            cs[] csVarArr = wd0Var.f43982f;
            if (i10 < csVarArr.length) {
                cs csVar = csVarArr[i10];
                csVar.postDelayed(new dl0(csVar, 0), i10 * 75);
                i10++;
            } else {
                wd0Var.postDelayed(new he0(16, this, runnable), (csVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean c0() {
        if (e0() && this.f34215x != 0 && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    public final boolean d0() {
        int i10 = this.f34215x;
        if ((i10 == 1 && this.f34216y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f34215x == 0) {
                m0();
                hl0 hl0Var = this.f34207b;
                if (hl0Var != null) {
                    hl0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.f34215x;
        if ((i10 == 1 && this.f34216y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0)) {
            return true;
        }
        return false;
    }

    public final void f0() {
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (e0()) {
            for (cs csVar : this.f34211n.f43982f) {
                csVar.i(1.0f);
            }
        } else {
            this.f34210f.a(1.0f);
        }
        if (e0()) {
            view = this.f34211n;
        } else {
            view = this.f34210f;
        }
        if (e0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f10, new al0(this, 2));
    }

    public final void g0() {
        String obj;
        cs[] csVarArr;
        cs[] csVarArr2;
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        if (e0()) {
            obj = this.f34211n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f34215x;
        if (i10 == 1) {
            if (!this.C.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f34212r, true);
                for (cs csVar : this.f34211n.f43982f) {
                    csVar.setText("");
                }
                if (e0()) {
                    this.f34211n.f43982f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.f34211n.removeCallbacks(this.L);
                this.f34211n.post(new al0(this, 0));
                return;
            }
            boolean isEmpty = SharedConfig.passcodeHash.isEmpty();
            try {
                SharedConfig.passcodeSalt = new byte[16];
                Utilities.random.nextBytes(SharedConfig.passcodeSalt);
                byte[] bytes = this.C.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, bytes.length + 16, 16);
                SharedConfig.passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.f34216y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (cs csVar2 : this.f34211n.f43982f) {
                csVar2.clearFocus();
                AndroidUtilities.hideKeyboard(csVar2);
            }
            this.v.setEditText(null);
            a0(new bl0(this, isEmpty, 0));
        } else if (i10 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (cs csVar3 : this.f34211n.f43982f) {
                    csVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.f34211n.f43982f[0].requestFocus();
                }
                f0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (cs csVar4 : this.f34211n.f43982f) {
                    csVar4.setText("");
                }
                if (e0()) {
                    this.f34211n.f43982f[0].requestFocus();
                }
                f0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (cs csVar5 : this.f34211n.f43982f) {
                    csVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(csVar5);
                }
                this.v.setEditText(null);
                a0(new al0(this, 1));
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.k6.f21659d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 16, new Class[]{org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.aa.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        if (this.f34215x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21930s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21981v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21946t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21785k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21803l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f34208c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        return arrayList;
    }

    public final void h0() {
        String obj;
        if ((this.f34216y == 1 && this.h.getText().length() == 0) || (this.f34216y == 0 && this.f34211n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.J;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.f34209e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (e0()) {
            obj = this.f34211n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.C = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (cs csVar : this.f34211n.f43982f) {
            csVar.setText("");
        }
        k0();
        this.B = 1;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f34215x != 0) {
            return true;
        }
        return false;
    }

    public final void i0(boolean z4, boolean z10) {
        float f10;
        org.telegram.ui.Components.pr prVar;
        if (z4) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
        int i10 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            org.telegram.ui.Components.ur urVar = this.v;
            if (!z4) {
                i10 = 8;
            }
            urVar.setVisibility(i10);
            org.telegram.ui.Components.ur urVar2 = this.v;
            if (!z4) {
                f11 = 0.0f;
            }
            urVar2.setAlpha(f11);
            org.telegram.ui.Components.ur urVar3 = this.v;
            if (!z4) {
                f12 = AndroidUtilities.dp(230.0f);
            }
            urVar3.setTranslationY(f12);
            this.fragmentView.requestLayout();
            return;
        }
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(150L);
        if (z4) {
            prVar = org.telegram.ui.Components.pr.f30183f;
        } else {
            prVar = org.telegram.ui.Components.jt.f28199e;
        }
        duration.setInterpolator(prVar);
        duration.addUpdateListener(new e3(this, 19));
        duration.addListener(new org.telegram.ui.Components.x20(22, this, z4));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.N = (rb0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.f34211n.f43982f[0].requestFocus();
            if (!c0()) {
                AndroidUtilities.showKeyboard(this.f34211n.f43982f[0]);
            }
        } else if (d0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void l0() {
        String charSequence;
        int i10;
        boolean z4;
        int i11;
        int i12 = this.f34215x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.B == 0) {
            if (this.f34216y == 0) {
                i10 = R.string.CreatePasscodeInfoPIN;
            } else {
                i10 = R.string.CreatePasscodeInfoPassword;
            }
            charSequence = LocaleController.getString(i10);
        } else {
            charSequence = this.f34209e.getCurrentView().getText().toString();
        }
        if (!this.f34209e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f34209e.getCurrentView().getText())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i12 == 2) {
            this.f34209e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z4, false);
        } else if (this.B == 0) {
            org.telegram.ui.Components.v01 v01Var = this.f34209e;
            if (this.f34216y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            v01Var.a(LocaleController.getString(i11), z4, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f34211n, true, 1.0f, z4);
            AndroidUtilities.updateViewVisibilityAnimated(this.f34210f, false, 1.0f, z4);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f34211n, false, 1.0f, z4);
            AndroidUtilities.updateViewVisibilityAnimated(this.f34210f, true, 1.0f, z4);
        }
        if (d0()) {
            bl0 bl0Var = new bl0(this, z4, 1);
            this.M = bl0Var;
            AndroidUtilities.runOnUIThread(bl0Var, 3000L);
        } else {
            this.f34214w.e(false, z4);
        }
        i0(c0(), z4);
        k0();
    }

    public final void m0() {
        this.fingerprintRow = -1;
        this.D = 1;
        this.I = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new androidx.biometric.e(new androidx.biometric.u(ApplicationLoader.applicationContext, 0)).h(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.I;
                this.I = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        int i11 = this.I;
        this.autoLockRow = i11;
        this.E = i11 + 1;
        this.F = i11 + 2;
        this.G = i11 + 3;
        this.H = i11 + 4;
        this.I = i11 + 6;
        this.disablePasscodeRow = i11 + 5;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        cs[] csVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.lj0 lj0Var = this.f34206a;
        if (lj0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    lj0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            lj0Var.setVisibility(i10);
        }
        wd0 wd0Var = this.f34211n;
        if (wd0Var != null && (csVarArr = wd0Var.f43982f) != null) {
            for (cs csVar : csVarArr) {
                csVar.setShowSoftInputOnFocusCompat(!c0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.f34215x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f34215x == 0) {
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
        hl0 hl0Var = this.f34207b;
        if (hl0Var != null) {
            hl0Var.l();
        }
        if (this.f34215x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new al0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && this.f34215x != 0) {
            k0();
        }
    }
}
