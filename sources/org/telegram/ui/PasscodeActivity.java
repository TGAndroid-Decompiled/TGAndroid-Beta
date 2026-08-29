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
    public int A;
    public String B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public org.telegram.ui.ActionBar.w0 I;
    public boolean J;
    public final qk0 K;
    public rk0 L;
    public hb0 M;
    public org.telegram.ui.Components.aj0 f35632a;
    private int autoLockRow;
    public wk0 f35633b;
    public org.telegram.ui.Components.jl0 f35634c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.j01 f35635e;
    public org.telegram.ui.Components.uc0 f35636f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public md0 f35637n;
    public TextView f35638r;
    public ImageView f35639s;
    public org.telegram.ui.Components.or v;
    public org.telegram.ui.Components.u10 f35640w;
    public final int f35641x;
    public int f35642y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f35642y = 0;
        this.A = 0;
        this.K = new qk0(this, 4);
        this.f35641x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.qc0 qc0Var, int i10) {
        int value = qc0Var.getValue();
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
        passcodeActivity.f35633b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new xt(passcodeActivity, 29));
                c2Var.show();
                ((TextView) c2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.N = string2;
                    org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(passcodeActivity.getParentActivity(), null);
                    qc0Var.setMinValue(0);
                    qc0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        qc0Var.setValue(0);
                    } else if (i11 == 60) {
                        qc0Var.setValue(1);
                    } else if (i11 == 300) {
                        qc0Var.setValue(2);
                    } else if (i11 == 3600) {
                        qc0Var.setValue(3);
                    } else if (i11 == 18000) {
                        qc0Var.setValue(4);
                    }
                    qc0Var.setFormatter(new org.telegram.ui.Components.xo0(25));
                    alertDialog$Builder2.n(qc0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new e3.d(passcodeActivity, qc0Var, i10, 11));
                    passcodeActivity.showDialog(c2Var2);
                }
            } else if (i10 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.useFingerprintLock);
            } else if (i10 == passcodeActivity.F) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(SharedConfig.allowScreenCapture);
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
        return new i(6);
    }

    public final void a0(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            md0 md0Var = this.f35637n;
            ur[] urVarArr = md0Var.f42455f;
            if (i10 < urVarArr.length) {
                ur urVar = urVarArr[i10];
                urVar.postDelayed(new sk0(urVar, 0), i10 * 75);
                i10++;
            } else {
                md0Var.postDelayed(new lf0(8, this, runnable), (urVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean c0() {
        if (e0() && this.f35641x != 0 && !AndroidUtilities.isTablet()) {
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
        int i10 = this.f35641x;
        if ((i10 == 1 && this.f35642y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f35641x == 0) {
                m0();
                wk0 wk0Var = this.f35633b;
                if (wk0Var != null) {
                    wk0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.f35641x;
        if ((i10 == 1 && this.f35642y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0)) {
            return true;
        }
        return false;
    }

    public final void f0() {
        View view;
        float f9;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (e0()) {
            for (ur urVar : this.f35637n.f42455f) {
                urVar.i(1.0f);
            }
        } else {
            this.f35636f.a(1.0f);
        }
        if (e0()) {
            view = this.f35637n;
        } else {
            view = this.f35636f;
        }
        if (e0()) {
            f9 = 10.0f;
        } else {
            f9 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f9, new qk0(this, 2));
    }

    public final void g0() {
        String obj;
        ur[] urVarArr;
        ur[] urVarArr2;
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        if (e0()) {
            obj = this.f35637n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f35641x;
        if (i10 == 1) {
            if (!this.B.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f35638r, true);
                for (ur urVar : this.f35637n.f42455f) {
                    urVar.setText("");
                }
                if (e0()) {
                    this.f35637n.f42455f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.f35637n.removeCallbacks(this.K);
                this.f35637n.post(new qk0(this, 0));
                return;
            }
            boolean isEmpty = SharedConfig.passcodeHash.isEmpty();
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.f35642y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (ur urVar2 : this.f35637n.f42455f) {
                urVar2.clearFocus();
                AndroidUtilities.hideKeyboard(urVar2);
            }
            this.v.setEditText(null);
            a0(new rk0(this, isEmpty, 0));
        } else if (i10 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (ur urVar3 : this.f35637n.f42455f) {
                    urVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.f35637n.f42455f[0].requestFocus();
                }
                f0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (ur urVar4 : this.f35637n.f42455f) {
                    urVar4.setText("");
                }
                if (e0()) {
                    this.f35637n.f42455f[0].requestFocus();
                }
                f0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (ur urVar5 : this.f35637n.f42455f) {
                    urVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(urVar5);
                }
                this.v.setEditText(null);
                a0(new qk0(this, 1));
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23062d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 16, new Class[]{org.telegram.ui.Cells.q8.class, org.telegram.ui.Cells.y9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        if (this.f35641x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23206l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 262144, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 0, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f35634c, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    public final void h0() {
        String obj;
        if ((this.f35642y == 1 && this.h.getText().length() == 0) || (this.f35642y == 0 && this.f35637n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.I;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.f35635e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (e0()) {
            obj = this.f35637n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.B = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (ur urVar : this.f35637n.f42455f) {
            urVar.setText("");
        }
        k0();
        this.A = 1;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f35641x != 0) {
            return true;
        }
        return false;
    }

    public final void i0(boolean z10, boolean z11) {
        float f9;
        org.telegram.ui.Components.jr jrVar;
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
            org.telegram.ui.Components.or orVar = this.v;
            if (!z10) {
                i10 = 8;
            }
            orVar.setVisibility(i10);
            org.telegram.ui.Components.or orVar2 = this.v;
            if (!z10) {
                f10 = 0.0f;
            }
            orVar2.setAlpha(f10);
            org.telegram.ui.Components.or orVar3 = this.v;
            if (!z10) {
                f11 = AndroidUtilities.dp(230.0f);
            }
            orVar3.setTranslationY(f11);
            this.fragmentView.requestLayout();
            return;
        }
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10) {
            f10 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f9, f10).setDuration(150L);
        if (z10) {
            jrVar = org.telegram.ui.Components.jr.f29800f;
        } else {
            jrVar = org.telegram.ui.Components.ct.f27567e;
        }
        duration.setInterpolator(jrVar);
        duration.addUpdateListener(new g3(this, 19));
        duration.addListener(new p60(2, this, z10));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.M = (hb0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.f35637n.f42455f[0].requestFocus();
            if (!c0()) {
                AndroidUtilities.showKeyboard(this.f35637n.f42455f[0]);
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
        int i12 = this.f35641x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.A == 0) {
            if (this.f35642y == 0) {
                i10 = R.string.CreatePasscodeInfoPIN;
            } else {
                i10 = R.string.CreatePasscodeInfoPassword;
            }
            charSequence = LocaleController.getString(i10);
        } else {
            charSequence = this.f35635e.getCurrentView().getText().toString();
        }
        if (!this.f35635e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f35635e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            this.f35635e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.A == 0) {
            org.telegram.ui.Components.j01 j01Var = this.f35635e;
            if (this.f35642y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            j01Var.a(LocaleController.getString(i11), z10, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35637n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35636f, false, 1.0f, z10);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35637n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35636f, true, 1.0f, z10);
        }
        if (d0()) {
            rk0 rk0Var = new rk0(this, z10, 1);
            this.L = rk0Var;
            AndroidUtilities.runOnUIThread(rk0Var, 3000L);
        } else {
            this.f35640w.e(false, z10);
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
            if (Build.VERSION.SDK_INT >= 23 && new androidx.biometric.e(new androidx.biometric.t(ApplicationLoader.applicationContext, 0)).d(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.H;
                this.H = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
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
        ur[] urVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.aj0 aj0Var = this.f35632a;
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
        md0 md0Var = this.f35637n;
        if (md0Var != null && (urVarArr = md0Var.f42455f) != null) {
            for (ur urVar : urVarArr) {
                urVar.setShowSoftInputOnFocusCompat(!c0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.f35641x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35641x == 0) {
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
        wk0 wk0Var = this.f35633b;
        if (wk0Var != null) {
            wk0Var.l();
        }
        if (this.f35641x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new qk0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f35641x != 0) {
            k0();
        }
    }
}
