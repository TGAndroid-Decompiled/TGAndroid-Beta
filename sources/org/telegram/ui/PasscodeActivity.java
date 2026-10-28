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
public class PasscodeActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
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
    public org.telegram.ui.ActionBar.w0 Q;
    public boolean R;
    public final hl0 S;
    public il0 T;
    public jb0 U;
    public yc1 V;
    public org.telegram.ui.Components.bk0 f35617a;
    private int autoLockRow;
    public ol0 f35618b;
    public org.telegram.ui.Components.nm0 f35619c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.b21 e;
    public org.telegram.ui.Components.sd0 f35620f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public nd0 f35621n;
    public TextView f35622r;
    public ImageView f35623s;
    public org.telegram.ui.Components.hs v;
    public org.telegram.ui.Components.j20 f35624w;
    public final int f35625x;
    public int f35626y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f35626y = 0;
        this.E = 0;
        this.S = new hl0(this, 5);
        this.f35625x = i10;
    }

    public static void V(PasscodeActivity passcodeActivity, org.telegram.ui.Components.nd0 nd0Var, int i10) {
        int value = nd0Var.getValue();
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
        passcodeActivity.f35618b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void W(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new jl0(passcodeActivity, 0));
                e2Var.show();
                org.telegram.ui.ActionBar.f7.V((TextView) e2Var.d(-1), org.telegram.ui.ActionBar.y6.f23599q7, null);
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
                    e2Var2.R = string2;
                    org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(passcodeActivity.getParentActivity(), null);
                    nd0Var.setMinValue(0);
                    nd0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        nd0Var.setValue(0);
                    } else if (i11 == 60) {
                        nd0Var.setValue(1);
                    } else if (i11 == 300) {
                        nd0Var.setValue(2);
                    } else if (i11 == 3600) {
                        nd0Var.setValue(3);
                    } else if (i11 == 18000) {
                        nd0Var.setValue(4);
                    }
                    nd0Var.setFormatter(new org.telegram.ui.Components.voip.c1(14));
                    alertDialog$Builder2.o(nd0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new i2.z(passcodeActivity, nd0Var, i10, 15));
                    passcodeActivity.showDialog(e2Var2);
                }
            } else if (i10 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.useFingerprintLock);
            } else if (i10 == passcodeActivity.N) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.a9) view).setChecked(SharedConfig.allowScreenCapture);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                if (!SharedConfig.allowScreenCapture) {
                    org.telegram.ui.Components.g5.t0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                }
            } else if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean z10 = !x9.K();
                if (x9.f36843m != z10) {
                    x9.f36843m = z10;
                    try {
                        org.telegram.ui.Wallet.l0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x9.f36843m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.l0.k("failed to save prefs", e);
                    }
                }
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.a9) view).setChecked(x9.K());
            } else if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean J = x10.J();
                boolean z11 = !J;
                bi.t8 t8Var = new bi.t8(7, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x10.f36836c;
                if (p0Var == null) {
                    t8Var.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.v8(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(t8Var, 0), 10));
            }
        }
    }

    public static org.telegram.ui.ActionBar.r2 l0() {
        if (!SharedConfig.passcodeHash.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new g(6);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f35625x == 0) {
                w0();
                ol0 ol0Var = this.f35618b;
                if (ol0Var != null) {
                    ol0Var.l();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f35619c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23300a7));
        if (this.f35625x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23637s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23485k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23503l6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35619c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35619c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f35625x != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f35625x == 0) {
            return true;
        }
        return false;
    }

    public final void k0(Runnable runnable) {
        if (!o0()) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            nd0 nd0Var = this.f35621n;
            zr[] zrVarArr = nd0Var.f45772f;
            if (i10 < zrVarArr.length) {
                zr zrVar = zrVarArr[i10];
                zrVar.postDelayed(new kl0(zrVar, 0), i10 * 75);
                i10++;
            } else {
                nd0Var.postDelayed(new kb0(27, this, runnable), (zrVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean m0() {
        if (o0() && this.f35625x != 0 && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean n0() {
        int i10 = this.f35625x;
        if ((i10 == 1 && this.f35626y == 1) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    public final boolean o0() {
        int i10 = this.f35625x;
        if ((i10 == 1 && this.f35626y == 0) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        zr[] zrVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        s0(m0(), false);
        org.telegram.ui.Components.bk0 bk0Var = this.f35617a;
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
        nd0 nd0Var = this.f35621n;
        if (nd0Var != null && (zrVarArr = nd0Var.f45772f) != null) {
            for (zr zrVar : zrVarArr) {
                zrVar.setShowSoftInputOnFocusCompat(!m0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        if (this.f35625x == 0) {
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35625x == 0) {
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
        ol0 ol0Var = this.f35618b;
        if (ol0Var != null) {
            ol0Var.l();
        }
        if (this.f35625x != 0 && !m0()) {
            AndroidUtilities.runOnUIThread(new hl0(this, 6), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (m0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.y6.f23503l6, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f35625x != 0) {
            u0();
        }
    }

    public final void p0() {
        View view;
        float f7;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (o0()) {
            for (zr zrVar : this.f35621n.f45772f) {
                zrVar.i(1.0f);
            }
        } else {
            this.f35620f.a(1.0f);
        }
        if (o0()) {
            view = this.f35621n;
        } else {
            view = this.f35620f;
        }
        if (o0()) {
            f7 = 10.0f;
        } else {
            f7 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f7, new hl0(this, 3));
    }

    public final void q0() {
        String obj;
        zr[] zrVarArr;
        zr[] zrVarArr2;
        if (n0() && this.h.getText().length() == 0) {
            p0();
            return;
        }
        if (o0()) {
            obj = this.f35621n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f35625x;
        if (i10 == 1) {
            if (!this.F.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f35622r, true);
                for (zr zrVar : this.f35621n.f45772f) {
                    zrVar.setText("");
                }
                if (o0()) {
                    this.f35621n.f45772f[0].requestFocus();
                }
                this.h.setText("");
                p0();
                this.f35621n.removeCallbacks(this.S);
                this.f35621n.post(new hl0(this, 0));
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
            SharedConfig.passcodeType = this.f35626y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (zr zrVar2 : this.f35621n.f45772f) {
                zrVar2.clearFocus();
                AndroidUtilities.hideKeyboard(zrVar2);
            }
            this.v.setEditText(null);
            k0(new il0(this, isEmpty, 0));
        } else if (i10 == 2 || i10 == 3) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (zr zrVar3 : this.f35621n.f45772f) {
                    zrVar3.setText("");
                }
                this.h.setText("");
                if (o0()) {
                    this.f35621n.f45772f[0].requestFocus();
                }
                p0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (zr zrVar4 : this.f35621n.f45772f) {
                    zrVar4.setText("");
                }
                if (o0()) {
                    this.f35621n.f45772f[0].requestFocus();
                }
                p0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (zr zrVar5 : this.f35621n.f45772f) {
                    zrVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(zrVar5);
                }
                this.v.setEditText(null);
                if (i10 == 3) {
                    k0(new hl0(this, 1));
                } else {
                    k0(new hl0(this, 2));
                }
            }
        }
    }

    public final void r0() {
        String obj;
        if ((this.f35626y == 1 && this.h.getText().length() == 0) || (this.f35626y == 0 && this.f35621n.getCode().length() != 4)) {
            p0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.Q;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (o0()) {
            obj = this.f35621n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (zr zrVar : this.f35621n.f45772f) {
            zrVar.setText("");
        }
        u0();
        this.E = 1;
    }

    public final void s0(boolean z10, boolean z11) {
        float f7;
        org.telegram.ui.Components.ds dsVar;
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
            org.telegram.ui.Components.hs hsVar = this.v;
            if (!z10) {
                i10 = 8;
            }
            hsVar.setVisibility(i10);
            org.telegram.ui.Components.hs hsVar2 = this.v;
            if (!z10) {
                f10 = 0.0f;
            }
            hsVar2.setAlpha(f10);
            org.telegram.ui.Components.hs hsVar3 = this.v;
            if (!z10) {
                f11 = AndroidUtilities.dp(230.0f);
            }
            hsVar3.setTranslationY(f11);
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
            dsVar = org.telegram.ui.Components.ds.f27530f;
        } else {
            dsVar = org.telegram.ui.Components.ut.e;
        }
        duration.setInterpolator(dsVar);
        duration.addUpdateListener(new b3(this, 18));
        duration.addListener(new s40(3, this, z10));
        duration.start();
    }

    public final void t0(Runnable runnable) {
        this.U = (jb0) runnable;
    }

    public final void u0() {
        if (o0()) {
            this.f35621n.f45772f[0].requestFocus();
            if (!m0()) {
                AndroidUtilities.showKeyboard(this.f35621n.f45772f[0]);
            }
        } else if (n0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f35625x == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String charSequence;
        int i10;
        boolean z10;
        int i11;
        int i12 = this.f35625x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (i12 == 3) {
            charSequence = LocaleController.getString(R.string.WalletAuthorizeTransactionPasscode);
        } else if (this.E == 0) {
            if (this.f35626y == 0) {
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
            org.telegram.ui.Components.b21 b21Var = this.e;
            if (this.f35626y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            b21Var.a(LocaleController.getString(i11), z10, false);
        }
        if (o0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35621n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35620f, false, 1.0f, z10);
        } else if (n0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35621n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35620f, true, 1.0f, z10);
        }
        if (n0()) {
            il0 il0Var = new il0(this, z10, 1);
            this.T = il0Var;
            AndroidUtilities.runOnUIThread(il0Var, 3000L);
        } else {
            this.f35624w.e(false, z10);
        }
        s0(m0(), z10);
        u0();
    }

    public final void w0() {
        this.I = -1;
        this.J = -1;
        this.fingerprintRow = -1;
        this.K = -1;
        this.L = -1;
        this.G = 1;
        this.P = 3;
        this.changePasscodeRow = 2;
        try {
            if (new a8.h0(new l6.h(ApplicationLoader.applicationContext, 1)).h(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
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
