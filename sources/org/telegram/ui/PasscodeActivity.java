package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.graphics.Point;
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
public class PasscodeActivity extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
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
    public final rl0 S;
    public sl0 T;
    public dc0 U;
    public wg1 V;
    public org.telegram.ui.Components.bk0 f31875a;
    private int autoLockRow;
    public wl0 f31876b;
    public org.telegram.ui.Components.mm0 f31877c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.s11 e;
    public org.telegram.ui.Components.yd0 f31878f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public ge0 f31879n;
    public TextView f31880r;
    public ImageView f31881s;
    public org.telegram.ui.Components.is v;
    public org.telegram.ui.Components.l20 f31882w;
    public final int f31883x;
    public int f31884y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f31884y = 0;
        this.E = 0;
        this.S = new rl0(this, 5);
        this.f31883x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ud0 ud0Var, int i10) {
        int value = ud0Var.getValue();
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
        passcodeActivity.f31876b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19248a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new mu(passcodeActivity, 28));
                a2Var.show();
                ((TextView) a2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19248a;
                    a2Var2.R = string2;
                    org.telegram.ui.Components.ud0 ud0Var = new org.telegram.ui.Components.ud0(passcodeActivity.getParentActivity(), null);
                    ud0Var.setMinValue(0);
                    ud0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        ud0Var.setValue(0);
                    } else if (i11 == 60) {
                        ud0Var.setValue(1);
                    } else if (i11 == 300) {
                        ud0Var.setValue(2);
                    } else if (i11 == 3600) {
                        ud0Var.setValue(3);
                    } else if (i11 == 18000) {
                        ud0Var.setValue(4);
                    }
                    ud0Var.setFormatter(new org.telegram.ui.Components.co0(28));
                    alertDialog$Builder2.n(ud0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new hg.b2(passcodeActivity, ud0Var, i10, 14));
                    passcodeActivity.showDialog(a2Var2);
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
                    org.telegram.ui.Components.g5.t0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                }
            } else if (i10 == passcodeActivity.J) {
                org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(passcodeActivity.currentAccount);
                boolean z10 = !v.H();
                if (v.f33101m != z10) {
                    v.f33101m = z10;
                    try {
                        org.telegram.ui.Wallet.k0.u().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", v.f33101m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.k0.j("failed to save prefs", e);
                    }
                }
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.w8) view).setChecked(v.H());
            } else if (i10 == passcodeActivity.K) {
                org.telegram.ui.Wallet.k0 v10 = org.telegram.ui.Wallet.k0.v(passcodeActivity.currentAccount);
                boolean G = v10.G();
                boolean z11 = !G;
                bi.y2 y2Var = new bi.y2(6, view, G);
                org.telegram.ui.Wallet.p0 p0Var = v10.f33094c;
                if (p0Var == null) {
                    y2Var.run(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.p0.h.execute(new org.telegram.messenger.r8(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(y2Var, 0), 10));
            }
        }
    }

    public static org.telegram.ui.ActionBar.m2 e0() {
        if (!SharedConfig.passcodeHash.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new h(6);
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
            ge0 ge0Var = this.f31879n;
            ks[] ksVarArr = ge0Var.f36645f;
            if (i10 < ksVarArr.length) {
                ks ksVar = ksVarArr[i10];
                ksVar.postDelayed(new tl0(ksVar, 0), i10 * 75);
                i10++;
            } else {
                ge0Var.postDelayed(new se0(19, this, runnable), (ksVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f31883x == 0) {
                p0();
                wl0 wl0Var = this.f31876b;
                if (wl0Var != null) {
                    wl0Var.l();
                }
            }
        }
    }

    public final boolean f0() {
        if (h0() && this.f31883x != 0 && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g0() {
        int i10 = this.f31883x;
        if ((i10 == 1 && this.f31884y == 1) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f19601d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 16, new Class[]{org.telegram.ui.Cells.w8.class, org.telegram.ui.Cells.ca.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        if (this.f31883x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f19728k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f19745l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 262144, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 262144, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31877c, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        return arrayList;
    }

    public final boolean h0() {
        int i10 = this.f31883x;
        if ((i10 == 1 && this.f31884y == 0) || ((i10 == 2 || i10 == 3) && SharedConfig.passcodeType == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f31883x != 0) {
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
            for (ks ksVar : this.f31879n.f36645f) {
                ksVar.i(1.0f);
            }
        } else {
            this.f31878f.a(1.0f);
        }
        if (h0()) {
            view = this.f31879n;
        } else {
            view = this.f31878f;
        }
        if (h0()) {
            f7 = 10.0f;
        } else {
            f7 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f7, new rl0(this, 3));
    }

    public final void j0() {
        String obj;
        ks[] ksVarArr;
        ks[] ksVarArr2;
        if (g0() && this.h.getText().length() == 0) {
            i0();
            return;
        }
        if (h0()) {
            obj = this.f31879n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f31883x;
        if (i10 == 1) {
            if (!this.F.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f31880r, true);
                for (ks ksVar : this.f31879n.f36645f) {
                    ksVar.setText("");
                }
                if (h0()) {
                    this.f31879n.f36645f[0].requestFocus();
                }
                this.h.setText("");
                i0();
                this.f31879n.removeCallbacks(this.S);
                this.f31879n.post(new rl0(this, 0));
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
            SharedConfig.passcodeType = this.f31884y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (ks ksVar2 : this.f31879n.f36645f) {
                ksVar2.clearFocus();
                AndroidUtilities.hideKeyboard(ksVar2);
            }
            this.v.setEditText(null);
            d0(new sl0(this, isEmpty, 0));
        } else if (i10 == 2 || i10 == 3) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (ks ksVar3 : this.f31879n.f36645f) {
                    ksVar3.setText("");
                }
                this.h.setText("");
                if (h0()) {
                    this.f31879n.f36645f[0].requestFocus();
                }
                i0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (ks ksVar4 : this.f31879n.f36645f) {
                    ksVar4.setText("");
                }
                if (h0()) {
                    this.f31879n.f36645f[0].requestFocus();
                }
                i0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (ks ksVar5 : this.f31879n.f36645f) {
                    ksVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(ksVar5);
                }
                this.v.setEditText(null);
                if (i10 == 3) {
                    d0(new rl0(this, 1));
                } else {
                    d0(new rl0(this, 2));
                }
            }
        }
    }

    public final void k0() {
        String obj;
        if ((this.f31884y == 1 && this.h.getText().length() == 0) || (this.f31884y == 0 && this.f31879n.getCode().length() != 4)) {
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
            obj = this.f31879n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.F = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (ks ksVar : this.f31879n.f36645f) {
            ksVar.setText("");
        }
        n0();
        this.E = 1;
    }

    public final void l0(boolean z10, boolean z11) {
        float f7;
        org.telegram.ui.Components.es esVar;
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
            org.telegram.ui.Components.is isVar = this.v;
            if (!z10) {
                i10 = 8;
            }
            isVar.setVisibility(i10);
            org.telegram.ui.Components.is isVar2 = this.v;
            if (!z10) {
                f10 = 0.0f;
            }
            isVar2.setAlpha(f10);
            org.telegram.ui.Components.is isVar3 = this.v;
            if (!z10) {
                f11 = AndroidUtilities.dp(230.0f);
            }
            isVar3.setTranslationY(f11);
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
            esVar = org.telegram.ui.Components.es.f24465f;
        } else {
            esVar = org.telegram.ui.Components.xt.e;
        }
        duration.setInterpolator(esVar);
        duration.addUpdateListener(new e3(this, 19));
        duration.addListener(new i50(3, this, z10));
        duration.start();
    }

    public final void m0(Runnable runnable) {
        this.U = (dc0) runnable;
    }

    public final void n0() {
        if (h0()) {
            this.f31879n.f36645f[0].requestFocus();
            if (!f0()) {
                AndroidUtilities.showKeyboard(this.f31879n.f36645f[0]);
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
        int i12 = this.f31883x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (i12 == 3) {
            charSequence = LocaleController.getString(R.string.WalletAuthorizeTransactionPasscode);
        } else if (this.E == 0) {
            if (this.f31884y == 0) {
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
            if (this.f31884y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            s11Var.a(LocaleController.getString(i11), z10, false);
        }
        if (h0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f31879n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f31878f, false, 1.0f, z10);
        } else if (g0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f31879n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f31878f, true, 1.0f, z10);
        }
        if (g0()) {
            sl0 sl0Var = new sl0(this, z10, 1);
            this.T = sl0Var;
            AndroidUtilities.runOnUIThread(sl0Var, 3000L);
        } else {
            this.f31882w.e(false, z10);
        }
        l0(f0(), z10);
        n0();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ks[] ksVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        l0(f0(), false);
        org.telegram.ui.Components.bk0 bk0Var = this.f31875a;
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
        ge0 ge0Var = this.f31879n;
        if (ge0Var != null && (ksVarArr = ge0Var.f36645f) != null) {
            for (ks ksVar : ksVarArr) {
                ksVar.setShowSoftInputOnFocusCompat(!f0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        p0();
        if (this.f31883x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f31883x == 0) {
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
        wl0 wl0Var = this.f31876b;
        if (wl0Var != null) {
            wl0Var.l();
        }
        if (this.f31883x != 0 && !f0()) {
            AndroidUtilities.runOnUIThread(new rl0(this, 6), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (f0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f31883x != 0) {
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
            if (new androidx.biometric.e(new androidx.biometric.t(ApplicationLoader.applicationContext, 0)).f(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
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
