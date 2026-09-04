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
public class PasscodeActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public String F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public org.telegram.ui.ActionBar.v0 M;
    public boolean N;
    public final ml0 O;
    public nl0 P;
    public ac0 Q;
    public org.telegram.ui.Components.aj0 f33495a;
    private int autoLockRow;
    public sl0 f33496b;
    public org.telegram.ui.Components.ll0 f33497c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.p01 f33498e;
    public org.telegram.ui.Components.zc0 f33499f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public de0 f33500n;
    public TextView f33501r;
    public ImageView f33502s;
    public org.telegram.ui.Components.tr v;
    public org.telegram.ui.Components.y10 f33503w;
    public final int f33504x;
    public int f33505y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f33505y = 0;
        this.E = 0;
        this.O = new ml0(this, 4);
        this.f33504x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.vc0 vc0Var, int i10) {
        int value = vc0Var.getValue();
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
        passcodeActivity.f33496b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20198a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new iu(passcodeActivity, 29));
                b2Var.show();
                ((TextView) b2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20898q7, false));
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20198a;
                    b2Var2.R = string2;
                    org.telegram.ui.Components.vc0 vc0Var = new org.telegram.ui.Components.vc0(passcodeActivity.getParentActivity(), null);
                    vc0Var.setMinValue(0);
                    vc0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        vc0Var.setValue(0);
                    } else if (i11 == 60) {
                        vc0Var.setValue(1);
                    } else if (i11 == 300) {
                        vc0Var.setValue(2);
                    } else if (i11 == 3600) {
                        vc0Var.setValue(3);
                    } else if (i11 == 18000) {
                        vc0Var.setValue(4);
                    }
                    vc0Var.setFormatter(new org.telegram.ui.Components.wo0(26));
                    alertDialog$Builder2.n(vc0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new hg.c2(passcodeActivity, vc0Var, i10, 13));
                    passcodeActivity.showDialog(b2Var2);
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
                    org.telegram.ui.Components.e5.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.n2 b0() {
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
            de0 de0Var = this.f33500n;
            gs[] gsVarArr = de0Var.f36163f;
            if (i10 < gsVarArr.length) {
                gs gsVar = gsVarArr[i10];
                gsVar.postDelayed(new ol0(gsVar, 0), i10 * 75);
                i10++;
            } else {
                de0Var.postDelayed(new ej0(5, this, runnable), (gsVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean c0() {
        if (e0() && this.f33504x != 0 && !AndroidUtilities.isTablet()) {
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
        int i10 = this.f33504x;
        if ((i10 == 1 && this.f33505y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f33504x == 0) {
                m0();
                sl0 sl0Var = this.f33496b;
                if (sl0Var != null) {
                    sl0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.f33504x;
        if ((i10 == 1 && this.f33505y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0)) {
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
            for (gs gsVar : this.f33500n.f36163f) {
                gsVar.i(1.0f);
            }
        } else {
            this.f33499f.a(1.0f);
        }
        if (e0()) {
            view = this.f33500n;
        } else {
            view = this.f33499f;
        }
        if (e0()) {
            f7 = 10.0f;
        } else {
            f7 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f7, new ml0(this, 2));
    }

    public final void g0() {
        String obj;
        gs[] gsVarArr;
        gs[] gsVarArr2;
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        if (e0()) {
            obj = this.f33500n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f33504x;
        if (i10 == 1) {
            if (!this.F.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f33501r, true);
                for (gs gsVar : this.f33500n.f36163f) {
                    gsVar.setText("");
                }
                if (e0()) {
                    this.f33500n.f36163f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.f33500n.removeCallbacks(this.O);
                this.f33500n.post(new ml0(this, 0));
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.f33505y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (gs gsVar2 : this.f33500n.f36163f) {
                gsVar2.clearFocus();
                AndroidUtilities.hideKeyboard(gsVar2);
            }
            this.v.setEditText(null);
            a0(new nl0(this, isEmpty, 0));
        } else if (i10 == 2) {
            long j3 = SharedConfig.passcodeRetryInMs;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j3 / 1000.0d)), new Object[0])), 0).show();
                for (gs gsVar3 : this.f33500n.f36163f) {
                    gsVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.f33500n.f36163f[0].requestFocus();
                }
                f0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (gs gsVar4 : this.f33500n.f36163f) {
                    gsVar4.setText("");
                }
                if (e0()) {
                    this.f33500n.f36163f[0].requestFocus();
                }
                f0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (gs gsVar5 : this.f33500n.f36163f) {
                    gsVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(gsVar5);
                }
                this.v.setEditText(null);
                a0(new ml0(this, 1));
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f20663d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 16, new Class[]{org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.ea.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        if (this.f33504x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20791k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20809l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 262144, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 262144, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f33497c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    public final void h0() {
        String obj;
        if ((this.f33505y == 1 && this.h.getText().length() == 0) || (this.f33505y == 0 && this.f33500n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.M;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.f33498e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (e0()) {
            obj = this.f33500n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (gs gsVar : this.f33500n.f36163f) {
            gsVar.setText("");
        }
        k0();
        this.E = 1;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f33504x != 0) {
            return true;
        }
        return false;
    }

    public final void i0(boolean z10, boolean z11) {
        float f7;
        org.telegram.ui.Components.pr prVar;
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
            org.telegram.ui.Components.tr trVar = this.v;
            if (!z10) {
                i10 = 8;
            }
            trVar.setVisibility(i10);
            org.telegram.ui.Components.tr trVar2 = this.v;
            if (!z10) {
                f10 = 0.0f;
            }
            trVar2.setAlpha(f10);
            org.telegram.ui.Components.tr trVar3 = this.v;
            if (!z10) {
                f11 = AndroidUtilities.dp(230.0f);
            }
            trVar3.setTranslationY(f11);
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
            prVar = org.telegram.ui.Components.pr.f29466f;
        } else {
            prVar = org.telegram.ui.Components.jt.f27568e;
        }
        duration.setInterpolator(prVar);
        duration.addUpdateListener(new c3(this, 19));
        duration.addListener(new e50(3, this, z10));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.Q = (ac0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.f33500n.f36163f[0].requestFocus();
            if (!c0()) {
                AndroidUtilities.showKeyboard(this.f33500n.f36163f[0]);
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
        int i12 = this.f33504x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.E == 0) {
            if (this.f33505y == 0) {
                i10 = R.string.CreatePasscodeInfoPIN;
            } else {
                i10 = R.string.CreatePasscodeInfoPassword;
            }
            charSequence = LocaleController.getString(i10);
        } else {
            charSequence = this.f33498e.getCurrentView().getText().toString();
        }
        if (!this.f33498e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f33498e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            this.f33498e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.E == 0) {
            org.telegram.ui.Components.p01 p01Var = this.f33498e;
            if (this.f33505y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            p01Var.a(LocaleController.getString(i11), z10, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33500n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f33499f, false, 1.0f, z10);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33500n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f33499f, true, 1.0f, z10);
        }
        if (d0()) {
            nl0 nl0Var = new nl0(this, z10, 1);
            this.P = nl0Var;
            AndroidUtilities.runOnUIThread(nl0Var, 3000L);
        } else {
            this.f33503w.e(false, z10);
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
            if (Build.VERSION.SDK_INT >= 23 && new aa.a(new androidx.biometric.s(ApplicationLoader.applicationContext, 0)).g(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
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
        gs[] gsVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.aj0 aj0Var = this.f33495a;
        if (aj0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    aj0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            aj0Var.setVisibility(i10);
        }
        de0 de0Var = this.f33500n;
        if (de0Var != null && (gsVarArr = de0Var.f36163f) != null) {
            for (gs gsVar : gsVarArr) {
                gsVar.setShowSoftInputOnFocusCompat(!c0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.f33504x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f33504x == 0) {
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
        sl0 sl0Var = this.f33496b;
        if (sl0Var != null) {
            sl0Var.l();
        }
        if (this.f33504x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new ml0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f33504x != 0) {
            k0();
        }
    }
}
