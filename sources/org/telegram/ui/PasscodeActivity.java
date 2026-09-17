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
public class PasscodeActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.ActionBar.w0 M;
    public boolean N;
    public final ll0 O;
    public ml0 P;
    public cc0 Q;
    public org.telegram.ui.Components.bj0 f30898a;
    private int autoLockRow;
    public tl0 f30899b;
    public org.telegram.ui.Components.ml0 f30900c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.r01 e;
    public org.telegram.ui.Components.yc0 f30901f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public fe0 f30902n;
    public TextView f30903r;
    public ImageView f30904s;
    public org.telegram.ui.Components.ur v;
    public org.telegram.ui.Components.y10 f30905w;
    public final int f30906x;
    public int f30907y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f30907y = 0;
        this.E = 0;
        this.O = new ll0(this, 4);
        this.f30906x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.uc0 uc0Var, int i10) {
        int value = uc0Var.getValue();
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
        passcodeActivity.f30899b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new nl0(passcodeActivity, 0));
                c2Var.show();
                ((TextView) c2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19100q7, false));
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18446a;
                    c2Var2.R = string2;
                    org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0(passcodeActivity.getParentActivity(), null);
                    uc0Var.setMinValue(0);
                    uc0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        uc0Var.setValue(0);
                    } else if (i11 == 60) {
                        uc0Var.setValue(1);
                    } else if (i11 == 300) {
                        uc0Var.setValue(2);
                    } else if (i11 == 3600) {
                        uc0Var.setValue(3);
                    } else if (i11 == 18000) {
                        uc0Var.setValue(4);
                    }
                    uc0Var.setFormatter(new org.telegram.ui.Components.bn0(29));
                    alertDialog$Builder2.n(uc0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new gg.d2(passcodeActivity, uc0Var, i10, 13));
                    passcodeActivity.showDialog(c2Var2);
                }
            } else if (i10 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.useFingerprintLock);
            } else if (i10 == passcodeActivity.J) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.allowScreenCapture);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                if (!SharedConfig.allowScreenCapture) {
                    org.telegram.ui.Components.c5.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 b0() {
        if (!SharedConfig.passcodeHash.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new h(6);
    }

    public final void a0(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            fe0 fe0Var = this.f30902n;
            is[] isVarArr = fe0Var.f33749f;
            if (i10 < isVarArr.length) {
                is isVar = isVarArr[i10];
                isVar.postDelayed(new ol0(isVar, 0), i10 * 75);
                i10++;
            } else {
                fe0Var.postDelayed(new oa0(29, this, runnable), (isVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean c0() {
        if (e0() && this.f30906x != 0 && !AndroidUtilities.isTablet()) {
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
        int i10 = this.f30906x;
        if ((i10 == 1 && this.f30907y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f30906x == 0) {
                m0();
                tl0 tl0Var = this.f30899b;
                if (tl0Var != null) {
                    tl0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.f30906x;
        if ((i10 == 1 && this.f30907y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0)) {
            return true;
        }
        return false;
    }

    public final void f0() {
        View view;
        float f7;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (e0()) {
            for (is isVar : this.f30902n.f33749f) {
                isVar.i(1.0f);
            }
        } else {
            this.f30901f.a(1.0f);
        }
        if (e0()) {
            view = this.f30902n;
        } else {
            view = this.f30901f;
        }
        if (e0()) {
            f7 = 10.0f;
        } else {
            f7 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f7, new ll0(this, 2));
    }

    public final void g0() {
        String obj;
        is[] isVarArr;
        is[] isVarArr2;
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        if (e0()) {
            obj = this.f30902n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f30906x;
        if (i10 == 1) {
            if (!this.F.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f30903r, true);
                for (is isVar : this.f30902n.f33749f) {
                    isVar.setText("");
                }
                if (e0()) {
                    this.f30902n.f33749f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.f30902n.removeCallbacks(this.O);
                this.f30902n.post(new ll0(this, 0));
                return;
            }
            boolean isEmpty = SharedConfig.passcodeHash.isEmpty();
            try {
                SharedConfig.passcodeSalt = new byte[16];
                Utilities.random.nextBytes(SharedConfig.passcodeSalt);
                byte[] bytes = this.F.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(SharedConfig.passcodeSalt, 0, bArr, bytes.length + 16, 16);
                SharedConfig.passcodeHash = Utilities.bytesToHex(Utilities.computeSHA256(bArr, 0, length));
            } catch (Exception e) {
                FileLog.e(e);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.f30907y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (is isVar2 : this.f30902n.f33749f) {
                isVar2.clearFocus();
                AndroidUtilities.hideKeyboard(isVar2);
            }
            this.v.setEditText(null);
            a0(new ml0(this, isEmpty, 0));
        } else if (i10 == 2) {
            long j3 = SharedConfig.passcodeRetryInMs;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j3 / 1000.0d)), new Object[0])), 0).show();
                for (is isVar3 : this.f30902n.f33749f) {
                    isVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.f30902n.f33749f[0].requestFocus();
                }
                f0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (is isVar4 : this.f30902n.f33749f) {
                    isVar4.setText("");
                }
                if (e0()) {
                    this.f30902n.f33749f[0].requestFocus();
                }
                f0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (is isVar5 : this.f30902n.f33749f) {
                    isVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(isVar5);
                }
                this.v.setEditText(null);
                a0(new ll0(this, 1));
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f18862d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 16, new Class[]{org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.ea.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f18806a7));
        if (this.f30906x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19139s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f19139s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19194v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19158t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18952i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18984k0, null, null, org.telegram.ui.ActionBar.j6.f18863d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f18990k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f19008l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 262144, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 262144, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f30900c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    public final void h0() {
        String obj;
        if ((this.f30907y == 1 && this.h.getText().length() == 0) || (this.f30907y == 0 && this.f30902n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.M;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (e0()) {
            obj = this.f30902n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (is isVar : this.f30902n.f33749f) {
            isVar.setText("");
        }
        k0();
        this.E = 1;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f30906x != 0) {
            return true;
        }
        return false;
    }

    public final void i0(boolean z10, boolean z11) {
        float f7;
        org.telegram.ui.Components.qr qrVar;
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
        int i10 = 0;
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z11) {
            org.telegram.ui.Components.ur urVar = this.v;
            if (!z10) {
                i10 = 8;
            }
            urVar.setVisibility(i10);
            org.telegram.ui.Components.ur urVar2 = this.v;
            if (!z10) {
                f10 = 0.0f;
            }
            urVar2.setAlpha(f10);
            org.telegram.ui.Components.ur urVar3 = this.v;
            if (!z10) {
                f11 = AndroidUtilities.dp(230.0f);
            }
            urVar3.setTranslationY(f11);
            this.fragmentView.requestLayout();
            return;
        }
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f10).setDuration(150L);
        if (z10) {
            qrVar = org.telegram.ui.Components.qr.f27380f;
        } else {
            qrVar = org.telegram.ui.Components.kt.e;
        }
        duration.setInterpolator(qrVar);
        duration.addUpdateListener(new b3(this, 18));
        duration.addListener(new j70(2, this, z10));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.Q = (cc0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.f30902n.f33749f[0].requestFocus();
            if (!c0()) {
                AndroidUtilities.showKeyboard(this.f30902n.f33749f[0]);
            }
        } else if (d0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void l0() {
        String charSequence;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f30906x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.E == 0) {
            if (this.f30907y == 0) {
                i10 = R.string.CreatePasscodeInfoPIN;
            } else {
                i10 = R.string.CreatePasscodeInfoPassword;
            }
            charSequence = LocaleController.getString(i10);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        if (!this.e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            this.e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.E == 0) {
            org.telegram.ui.Components.r01 r01Var = this.e;
            if (this.f30907y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            r01Var.a(LocaleController.getString(i11), z10, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f30902n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f30901f, false, 1.0f, z10);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f30902n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f30901f, true, 1.0f, z10);
        }
        if (d0()) {
            ml0 ml0Var = new ml0(this, z10, 1);
            this.P = ml0Var;
            AndroidUtilities.runOnUIThread(ml0Var, 3000L);
        } else {
            this.f30905w.e(false, z10);
        }
        i0(c0(), z10);
        k0();
    }

    public final void m0() {
        this.fingerprintRow = -1;
        this.G = 1;
        this.L = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new aa.a(new k6.h(ApplicationLoader.applicationContext, 1)).f(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.L;
                this.L = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        int i11 = this.L;
        this.autoLockRow = i11;
        this.H = i11 + 1;
        this.I = i11 + 2;
        this.J = i11 + 3;
        this.K = i11 + 4;
        this.L = i11 + 6;
        this.disablePasscodeRow = i11 + 5;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        is[] isVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.bj0 bj0Var = this.f30898a;
        if (bj0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    bj0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            bj0Var.setVisibility(i10);
        }
        fe0 fe0Var = this.f30902n;
        if (fe0Var != null && (isVarArr = fe0Var.f33749f) != null) {
            for (is isVar : isVarArr) {
                isVar.setShowSoftInputOnFocusCompat(!c0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.f30906x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f30906x == 0) {
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
        tl0 tl0Var = this.f30899b;
        if (tl0Var != null) {
            tl0Var.l();
        }
        if (this.f30906x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new ll0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f30906x != 0) {
            k0();
        }
    }
}
