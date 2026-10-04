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
    public final hl0 O;
    public il0 P;
    public yb0 Q;
    public org.telegram.ui.Components.nj0 f33839a;
    private int autoLockRow;
    public ol0 f33840b;
    public org.telegram.ui.Components.zl0 f33841c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.o11 f33842e;
    public org.telegram.ui.Components.ld0 f33843f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public be0 f33844n;
    public TextView f33845r;
    public ImageView f33846s;
    public org.telegram.ui.Components.xr v;
    public org.telegram.ui.Components.c20 f33847w;
    public final int f33848x;
    public int f33849y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f33849y = 0;
        this.E = 0;
        this.O = new hl0(this, 4);
        this.f33848x = i10;
    }

    public static void S(PasscodeActivity passcodeActivity, org.telegram.ui.Components.gd0 gd0Var, int i10) {
        int value = gd0Var.getValue();
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
        passcodeActivity.f33840b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void T(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20367a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new jl0(passcodeActivity, 0));
                b2Var.show();
                ((TextView) b2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21058q7, false));
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20367a;
                    b2Var2.R = string2;
                    org.telegram.ui.Components.gd0 gd0Var = new org.telegram.ui.Components.gd0(passcodeActivity.getParentActivity(), null);
                    gd0Var.setMinValue(0);
                    gd0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        gd0Var.setValue(0);
                    } else if (i11 == 60) {
                        gd0Var.setValue(1);
                    } else if (i11 == 300) {
                        gd0Var.setValue(2);
                    } else if (i11 == 3600) {
                        gd0Var.setValue(3);
                    } else if (i11 == 18000) {
                        gd0Var.setValue(4);
                    }
                    gd0Var.setFormatter(new org.telegram.ui.Components.voip.e1(16));
                    alertDialog$Builder2.n(gd0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new gg.d2(passcodeActivity, gd0Var, i10, 14));
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

    public final void Z(Runnable runnable) {
        if (!e0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            be0 be0Var = this.f33844n;
            es[] esVarArr = be0Var.f35543f;
            if (i10 < esVarArr.length) {
                es esVar = esVarArr[i10];
                esVar.postDelayed(new kl0(esVar, 0), i10 * 75);
                i10++;
            } else {
                be0Var.postDelayed(new wj0(2, this, runnable), (esVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean c0() {
        if (e0() && this.f33848x != 0 && !AndroidUtilities.isTablet()) {
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
        int i10 = this.f33848x;
        if ((i10 == 1 && this.f33849y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f33848x == 0) {
                m0();
                ol0 ol0Var = this.f33840b;
                if (ol0Var != null) {
                    ol0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.f33848x;
        if ((i10 == 1 && this.f33849y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0)) {
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
            for (es esVar : this.f33844n.f35543f) {
                esVar.i(1.0f);
            }
        } else {
            this.f33843f.a(1.0f);
        }
        if (e0()) {
            view = this.f33844n;
        } else {
            view = this.f33843f;
        }
        if (e0()) {
            f7 = 10.0f;
        } else {
            f7 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f7, new hl0(this, 2));
    }

    public final void g0() {
        String obj;
        es[] esVarArr;
        es[] esVarArr2;
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        if (e0()) {
            obj = this.f33844n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f33848x;
        if (i10 == 1) {
            if (!this.F.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f33845r, true);
                for (es esVar : this.f33844n.f35543f) {
                    esVar.setText("");
                }
                if (e0()) {
                    this.f33844n.f35543f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.f33844n.removeCallbacks(this.O);
                this.f33844n.post(new hl0(this, 0));
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
            SharedConfig.passcodeType = this.f33849y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (es esVar2 : this.f33844n.f35543f) {
                esVar2.clearFocus();
                AndroidUtilities.hideKeyboard(esVar2);
            }
            this.v.setEditText(null);
            Z(new il0(this, isEmpty, 0));
        } else if (i10 == 2) {
            long j3 = SharedConfig.passcodeRetryInMs;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j3 / 1000.0d)), new Object[0])), 0).show();
                for (es esVar3 : this.f33844n.f35543f) {
                    esVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.f33844n.f35543f[0].requestFocus();
                }
                f0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (es esVar4 : this.f33844n.f35543f) {
                    esVar4.setText("");
                }
                if (e0()) {
                    this.f33844n.f35543f[0].requestFocus();
                }
                f0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (es esVar5 : this.f33844n.f35543f) {
                    esVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(esVar5);
                }
                this.v.setEditText(null);
                Z(new hl0(this, 1));
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.i6.f20817d6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 16, new Class[]{org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.ea.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.i6.f20761a7));
        if (this.f33848x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f21099s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21099s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21154v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21118t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20908i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20940k0, null, null, org.telegram.ui.ActionBar.i6.f20818d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.f20946k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.f20964l6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 262144, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 262144, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f33841c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        return arrayList;
    }

    public final void h0() {
        String obj;
        if ((this.f33849y == 1 && this.h.getText().length() == 0) || (this.f33849y == 0 && this.f33844n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.M;
        if (v0Var != null) {
            v0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.f33842e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (e0()) {
            obj = this.f33844n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (es esVar : this.f33844n.f35543f) {
            esVar.setText("");
        }
        k0();
        this.E = 1;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f33848x != 0) {
            return true;
        }
        return false;
    }

    public final void i0(boolean z10, boolean z11) {
        float f7;
        org.telegram.ui.Components.tr trVar;
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
            org.telegram.ui.Components.xr xrVar = this.v;
            if (!z10) {
                i10 = 8;
            }
            xrVar.setVisibility(i10);
            org.telegram.ui.Components.xr xrVar2 = this.v;
            if (!z10) {
                f10 = 0.0f;
            }
            xrVar2.setAlpha(f10);
            org.telegram.ui.Components.xr xrVar3 = this.v;
            if (!z10) {
                f11 = AndroidUtilities.dp(230.0f);
            }
            xrVar3.setTranslationY(f11);
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
            trVar = org.telegram.ui.Components.tr.f31140f;
        } else {
            trVar = org.telegram.ui.Components.nt.f29061e;
        }
        duration.setInterpolator(trVar);
        duration.addUpdateListener(new c3(this, 18));
        duration.addListener(new g70(2, this, z10));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.Q = (yb0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.f33844n.f35543f[0].requestFocus();
            if (!c0()) {
                AndroidUtilities.showKeyboard(this.f33844n.f35543f[0]);
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
        int i12 = this.f33848x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.E == 0) {
            if (this.f33849y == 0) {
                i10 = R.string.CreatePasscodeInfoPIN;
            } else {
                i10 = R.string.CreatePasscodeInfoPassword;
            }
            charSequence = LocaleController.getString(i10);
        } else {
            charSequence = this.f33842e.getCurrentView().getText().toString();
        }
        if (!this.f33842e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f33842e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            this.f33842e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.E == 0) {
            org.telegram.ui.Components.o11 o11Var = this.f33842e;
            if (this.f33849y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            o11Var.a(LocaleController.getString(i11), z10, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33844n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f33843f, false, 1.0f, z10);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33844n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f33843f, true, 1.0f, z10);
        }
        if (d0()) {
            il0 il0Var = new il0(this, z10, 1);
            this.P = il0Var;
            AndroidUtilities.runOnUIThread(il0Var, 3000L);
        } else {
            this.f33847w.e(false, z10);
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
        es[] esVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.nj0 nj0Var = this.f33839a;
        if (nj0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    nj0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            nj0Var.setVisibility(i10);
        }
        be0 be0Var = this.f33844n;
        if (be0Var != null && (esVarArr = be0Var.f35543f) != null) {
            for (es esVar : esVarArr) {
                esVar.setShowSoftInputOnFocusCompat(!c0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.f33848x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f33848x == 0) {
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
        ol0 ol0Var = this.f33840b;
        if (ol0Var != null) {
            ol0Var.l();
        }
        if (this.f33848x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new hl0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f33848x != 0) {
            k0();
        }
    }
}
