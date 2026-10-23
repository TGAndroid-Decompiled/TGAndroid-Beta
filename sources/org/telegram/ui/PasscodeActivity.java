package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
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
    public int M;
    public int N;
    public int O;
    public int P;
    public org.telegram.ui.ActionBar.u0 Q;
    public boolean R;
    public final zk0 S;
    public al0 T;
    public kb0 U;
    public o71 V;
    public org.telegram.ui.Components.bk0 f33527a;
    private int autoLockRow;
    public el0 f33528b;
    public org.telegram.ui.Components.mm0 f33529c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.s11 e;
    public org.telegram.ui.Components.vd0 f33530f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public od0 f33531n;
    public TextView f33532r;
    public ImageView f33533s;
    public org.telegram.ui.Components.fs v;
    public org.telegram.ui.Components.h20 f33534w;
    public final int f33535x;
    public int f33536y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f33536y = 0;
        this.E = 0;
        this.S = new zk0(this, 5);
        this.f33535x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.qd0 qd0Var, int i10) {
        int value = qd0Var.getValue();
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
        passcodeActivity.f33528b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new xt(passcodeActivity, 28));
                c2Var.show();
                org.telegram.ui.ActionBar.r6.W((TextView) c2Var.d(-1), org.telegram.ui.ActionBar.k6.f21421q7, null);
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20678a;
                    c2Var2.R = string2;
                    org.telegram.ui.Components.qd0 qd0Var = new org.telegram.ui.Components.qd0(passcodeActivity.getParentActivity(), null);
                    qd0Var.setMinValue(0);
                    qd0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        qd0Var.setValue(0);
                    } else if (i11 == 60) {
                        qd0Var.setValue(1);
                    } else if (i11 == 300) {
                        qd0Var.setValue(2);
                    } else if (i11 == 3600) {
                        qd0Var.setValue(3);
                    } else if (i11 == 18000) {
                        qd0Var.setValue(4);
                    }
                    qd0Var.setFormatter(new wv(11));
                    alertDialog$Builder2.o(qd0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new hg.b2(passcodeActivity, qd0Var, i10, 14));
                    passcodeActivity.showDialog(c2Var2);
                }
            } else if (i10 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.useFingerprintLock);
            } else if (i10 == passcodeActivity.N) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(SharedConfig.allowScreenCapture);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                if (!SharedConfig.allowScreenCapture) {
                    org.telegram.ui.Components.f5.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                }
            } else if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(passcodeActivity.currentAccount);
                boolean z10 = !w9.I();
                if (w9.f34750m != z10) {
                    w9.f34750m = z10;
                    try {
                        org.telegram.ui.Wallet.l0.v().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", w9.f34750m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.l0.j("failed to save prefs", e);
                    }
                }
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(w9.I());
            } else if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(passcodeActivity.currentAccount);
                boolean H = w10.H();
                boolean z11 = !H;
                ai.y8 y8Var = new ai.y8(7, view, H);
                org.telegram.ui.Wallet.p0 p0Var = w10.f34743c;
                if (p0Var == null) {
                    y8Var.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.s8(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(y8Var, 0), 10));
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 e0() {
        if (!SharedConfig.passcodeHash.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new g(6);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21518v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21462s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    public final void d0(Runnable runnable) {
        if (!h0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            od0 od0Var = this.f33531n;
            vr[] vrVarArr = od0Var.f41793f;
            if (i10 < vrVarArr.length) {
                vr vrVar = vrVarArr[i10];
                vrVar.postDelayed(new bl0(vrVar, 0), i10 * 75);
                i10++;
            } else {
                od0Var.postDelayed(new bh0(7, this, runnable), (vrVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f33535x == 0) {
                p0();
                el0 el0Var = this.f33528b;
                if (el0Var != null) {
                    el0Var.l();
                }
            }
        }
    }

    public final boolean f0() {
        if (h0() && this.f33535x != 0 && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g0() {
        int i10 = this.f33535x;
        if ((i10 == 1 && this.f33536y == 1) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21125a7));
        if (this.f33535x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21462s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21310k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21327l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33529c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f33529c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    public final boolean h0() {
        int i10 = this.f33535x;
        if ((i10 == 1 && this.f33536y == 0) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f33535x != 0) {
            return true;
        }
        return false;
    }

    public final void i0() {
        View view;
        float f7;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (h0()) {
            for (vr vrVar : this.f33531n.f41793f) {
                vrVar.i(1.0f);
            }
        } else {
            this.f33530f.a(1.0f);
        }
        if (h0()) {
            view = this.f33531n;
        } else {
            view = this.f33530f;
        }
        if (h0()) {
            f7 = 10.0f;
        } else {
            f7 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f7, new zk0(this, 3));
    }

    public final void j0() {
        String obj;
        vr[] vrVarArr;
        vr[] vrVarArr2;
        if (g0() && this.h.getText().length() == 0) {
            i0();
            return;
        }
        if (h0()) {
            obj = this.f33531n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f33535x;
        if (i10 == 1) {
            if (!this.F.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f33532r, true);
                for (vr vrVar : this.f33531n.f41793f) {
                    vrVar.setText("");
                }
                if (h0()) {
                    this.f33531n.f41793f[0].requestFocus();
                }
                this.h.setText("");
                i0();
                this.f33531n.removeCallbacks(this.S);
                this.f33531n.post(new zk0(this, 0));
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
            SharedConfig.passcodeType = this.f33536y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (vr vrVar2 : this.f33531n.f41793f) {
                vrVar2.clearFocus();
                AndroidUtilities.hideKeyboard(vrVar2);
            }
            this.v.setEditText(null);
            d0(new al0(this, isEmpty, 0));
        } else if (i10 == 2 || i10 == 3) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (vr vrVar3 : this.f33531n.f41793f) {
                    vrVar3.setText("");
                }
                this.h.setText("");
                if (h0()) {
                    this.f33531n.f41793f[0].requestFocus();
                }
                i0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (vr vrVar4 : this.f33531n.f41793f) {
                    vrVar4.setText("");
                }
                if (h0()) {
                    this.f33531n.f41793f[0].requestFocus();
                }
                i0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (vr vrVar5 : this.f33531n.f41793f) {
                    vrVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(vrVar5);
                }
                this.v.setEditText(null);
                if (i10 == 3) {
                    d0(new zk0(this, 1));
                } else {
                    d0(new zk0(this, 2));
                }
            }
        }
    }

    public final void k0() {
        String obj;
        if ((this.f33536y == 1 && this.h.getText().length() == 0) || (this.f33536y == 0 && this.f33531n.getCode().length() != 4)) {
            i0();
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.Q;
        if (u0Var != null) {
            u0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (h0()) {
            obj = this.f33531n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (vr vrVar : this.f33531n.f41793f) {
            vrVar.setText("");
        }
        n0();
        this.E = 1;
    }

    public final void l0(boolean z10, boolean z11) {
        float f7;
        org.telegram.ui.Components.bs bsVar;
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
            org.telegram.ui.Components.fs fsVar = this.v;
            if (!z10) {
                i10 = 8;
            }
            fsVar.setVisibility(i10);
            org.telegram.ui.Components.fs fsVar2 = this.v;
            if (!z10) {
                f10 = 0.0f;
            }
            fsVar2.setAlpha(f10);
            org.telegram.ui.Components.fs fsVar3 = this.v;
            if (!z10) {
                f11 = AndroidUtilities.dp(230.0f);
            }
            fsVar3.setTranslationY(f11);
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
            bsVar = org.telegram.ui.Components.bs.f25133f;
        } else {
            bsVar = org.telegram.ui.Components.st.e;
        }
        duration.setInterpolator(bsVar);
        duration.addUpdateListener(new d3(this, 19));
        duration.addListener(new o40(3, this, z10));
        duration.start();
    }

    public final void m0(Runnable runnable) {
        this.U = (kb0) runnable;
    }

    public final void n0() {
        if (h0()) {
            this.f33531n.f41793f[0].requestFocus();
            if (!f0()) {
                AndroidUtilities.showKeyboard(this.f33531n.f41793f[0]);
            }
        } else if (g0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void o0() {
        String charSequence;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f33535x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (i12 == 3) {
            charSequence = LocaleController.getString(R.string.WalletAuthorizeTransactionPasscode);
        } else if (this.E == 0) {
            if (this.f33536y == 0) {
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
        } else if (i12 == 3) {
            this.e.setText(LocaleController.getString(R.string.WalletAuthorizeTransactionPasscode));
        } else if (this.E == 0) {
            org.telegram.ui.Components.s11 s11Var = this.e;
            if (this.f33536y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            s11Var.a(LocaleController.getString(i11), z10, false);
        }
        if (h0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33531n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f33530f, false, 1.0f, z10);
        } else if (g0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f33531n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f33530f, true, 1.0f, z10);
        }
        if (g0()) {
            al0 al0Var = new al0(this, z10, 1);
            this.T = al0Var;
            AndroidUtilities.runOnUIThread(al0Var, 3000L);
        } else {
            this.f33534w.e(false, z10);
        }
        l0(f0(), z10);
        n0();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        vr[] vrVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        l0(f0(), false);
        org.telegram.ui.Components.bk0 bk0Var = this.f33527a;
        if (bk0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    bk0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            bk0Var.setVisibility(i10);
        }
        od0 od0Var = this.f33531n;
        if (od0Var != null && (vrVarArr = od0Var.f41793f) != null) {
            for (vr vrVar : vrVarArr) {
                vrVar.setShowSoftInputOnFocusCompat(!f0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        p0();
        if (this.f33535x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f33535x == 0) {
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
        el0 el0Var = this.f33528b;
        if (el0Var != null) {
            el0Var.l();
        }
        if (this.f33535x != 0 && !f0()) {
            AndroidUtilities.runOnUIThread(new zk0(this, 6), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (f0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.f21327l6, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f33535x != 0) {
            n0();
        }
    }

    public final void p0() {
        this.I = -1;
        this.J = -1;
        this.fingerprintRow = -1;
        this.K = -1;
        this.L = -1;
        this.G = 1;
        this.P = 3;
        this.changePasscodeRow = 2;
        try {
            if (new androidx.biometric.e(new k6.h(ApplicationLoader.applicationContext, 1)).f(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i10 = this.P;
                this.P = i10 + 1;
                this.fingerprintRow = i10;
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
        int i11 = this.P;
        this.autoLockRow = i11;
        this.P = i11 + 2;
        this.H = i11 + 1;
        if (getMessagesController().config.walletAvailable.get()) {
            int i12 = this.P;
            this.I = i12;
            this.P = i12 + 2;
            this.J = i12 + 1;
            if (org.telegram.ui.Wallet.p0.i(ApplicationLoader.applicationContext)) {
                int i13 = this.P;
                this.P = i13 + 1;
                this.K = i13;
            }
            int i14 = this.P;
            this.P = i14 + 1;
            this.L = i14;
        }
        int i15 = this.P;
        this.M = i15;
        this.N = i15 + 1;
        this.O = i15 + 2;
        this.P = i15 + 4;
        this.disablePasscodeRow = i15 + 3;
    }
}
