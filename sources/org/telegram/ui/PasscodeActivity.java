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
    public final uk0 K;
    public vk0 L;
    public fb0 M;
    public org.telegram.ui.Components.pi0 f35565a;
    private int autoLockRow;
    public al0 f35566b;
    public org.telegram.ui.Components.wk0 f35567c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.xz0 f35568e;
    public org.telegram.ui.Components.fc0 f35569f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public ld0 f35570n;
    public TextView f35571r;
    public ImageView f35572s;
    public org.telegram.ui.Components.kr v;
    public org.telegram.ui.Components.j10 f35573w;
    public final int f35574x;
    public int f35575y;

    public PasscodeActivity(int i9) {
        super(null);
        this.f35575y = 0;
        this.A = 0;
        this.K = new uk0(this, 4);
        this.f35574x = i9;
    }

    public static void T(PasscodeActivity passcodeActivity, org.telegram.ui.Components.bc0 bc0Var, int i9) {
        int value = bc0Var.getValue();
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
        passcodeActivity.f35566b.m(i9);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void U(PasscodeActivity passcodeActivity, View view, int i9) {
        if (view.isEnabled()) {
            if (i9 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new wt(passcodeActivity, 29));
                c2Var.show();
                ((TextView) c2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
            } else if (i9 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i9 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.N = string2;
                    org.telegram.ui.Components.bc0 bc0Var = new org.telegram.ui.Components.bc0(passcodeActivity.getParentActivity(), null);
                    bc0Var.setMinValue(0);
                    bc0Var.setMaxValue(4);
                    int i10 = SharedConfig.autoLockIn;
                    if (i10 == 0) {
                        bc0Var.setValue(0);
                    } else if (i10 == 60) {
                        bc0Var.setValue(1);
                    } else if (i10 == 300) {
                        bc0Var.setValue(2);
                    } else if (i10 == 3600) {
                        bc0Var.setValue(3);
                    } else if (i10 == 18000) {
                        bc0Var.setValue(4);
                    }
                    bc0Var.setFormatter(new fk0(1));
                    alertDialog$Builder2.n(bc0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new c3.e(passcodeActivity, bc0Var, i9, 12));
                    passcodeActivity.showDialog(c2Var2);
                }
            } else if (i9 == passcodeActivity.fingerprintRow) {
                SharedConfig.useFingerprintLock = !SharedConfig.useFingerprintLock;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.useFingerprintLock);
            } else if (i9 == passcodeActivity.F) {
                SharedConfig.allowScreenCapture = !SharedConfig.allowScreenCapture;
                UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
                ((org.telegram.ui.Cells.t8) view).setChecked(SharedConfig.allowScreenCapture);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, Boolean.FALSE);
                if (!SharedConfig.allowScreenCapture) {
                    org.telegram.ui.Components.y4.u0(passcodeActivity, null, LocaleController.getString(R.string.ScreenCaptureAlert), null);
                }
            }
        }
    }

    public static org.telegram.ui.ActionBar.o2 a0() {
        if (!SharedConfig.passcodeHash.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new h(6);
    }

    public final void Z(Runnable runnable) {
        if (!d0()) {
            runnable.run();
            return;
        }
        int i9 = 0;
        while (true) {
            ld0 ld0Var = this.f35570n;
            vr[] vrVarArr = ld0Var.f42755f;
            if (i9 < vrVarArr.length) {
                vr vrVar = vrVarArr[i9];
                vrVar.postDelayed(new wk0(vrVar, 0), i9 * 75);
                i9++;
            } else {
                ld0Var.postDelayed(new cf0(11, this, runnable), (vrVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean b0() {
        if (d0() && this.f35574x != 0 && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c0() {
        int i9 = this.f35574x;
        if ((i9 == 1 && this.f35575y == 1) || (i9 == 2 && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    public final boolean d0() {
        int i9 = this.f35574x;
        if ((i9 == 1 && this.f35575y == 0) || (i9 == 2 && SharedConfig.passcodeType == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f35574x == 0) {
                l0();
                al0 al0Var = this.f35566b;
                if (al0Var != null) {
                    al0Var.l();
                }
            }
        }
    }

    public final void e0() {
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (d0()) {
            for (vr vrVar : this.f35570n.f42755f) {
                vrVar.i(1.0f);
            }
        } else {
            this.f35569f.a(1.0f);
        }
        if (d0()) {
            view = this.f35570n;
        } else {
            view = this.f35569f;
        }
        if (d0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f10, new uk0(this, 2));
    }

    public final void f0() {
        String obj;
        vr[] vrVarArr;
        vr[] vrVarArr2;
        if (c0() && this.h.getText().length() == 0) {
            e0();
            return;
        }
        if (d0()) {
            obj = this.f35570n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i9 = this.f35574x;
        if (i9 == 1) {
            if (!this.B.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f35571r, true);
                for (vr vrVar : this.f35570n.f42755f) {
                    vrVar.setText("");
                }
                if (d0()) {
                    this.f35570n.f42755f[0].requestFocus();
                }
                this.h.setText("");
                e0();
                this.f35570n.removeCallbacks(this.K);
                this.f35570n.post(new uk0(this, 0));
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
            SharedConfig.passcodeType = this.f35575y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (vr vrVar2 : this.f35570n.f42755f) {
                vrVar2.clearFocus();
                AndroidUtilities.hideKeyboard(vrVar2);
            }
            this.v.setEditText(null);
            Z(new vk0(this, isEmpty, 0));
        } else if (i9 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (vr vrVar3 : this.f35570n.f42755f) {
                    vrVar3.setText("");
                }
                this.h.setText("");
                if (d0()) {
                    this.f35570n.f42755f[0].requestFocus();
                }
                e0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (vr vrVar4 : this.f35570n.f42755f) {
                    vrVar4.setText("");
                }
                if (d0()) {
                    this.f35570n.f42755f[0].requestFocus();
                }
                e0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (vr vrVar5 : this.f35570n.f42755f) {
                    vrVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(vrVar5);
                }
                this.v.setEditText(null);
                Z(new uk0(this, 1));
            }
        }
    }

    public final void g0() {
        String obj;
        if ((this.f35575y == 1 && this.h.getText().length() == 0) || (this.f35575y == 0 && this.f35570n.getCode().length() != 4)) {
            e0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.I;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.f35568e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (d0()) {
            obj = this.f35570n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.B = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (vr vrVar : this.f35570n.f42755f) {
            vrVar.setText("");
        }
        j0();
        this.A = 1;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 16, new Class[]{org.telegram.ui.Cells.t8.class, org.telegram.ui.Cells.ba.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        if (this.f35574x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.f23144l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f35567c, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        return arrayList;
    }

    public final void h0(boolean z10, boolean z11) {
        float f10;
        org.telegram.ui.Components.gr grVar;
        if (z10) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
        int i9 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z11) {
            org.telegram.ui.Components.kr krVar = this.v;
            if (!z10) {
                i9 = 8;
            }
            krVar.setVisibility(i9);
            org.telegram.ui.Components.kr krVar2 = this.v;
            if (!z10) {
                f11 = 0.0f;
            }
            krVar2.setAlpha(f11);
            org.telegram.ui.Components.kr krVar3 = this.v;
            if (!z10) {
                f12 = AndroidUtilities.dp(230.0f);
            }
            krVar3.setTranslationY(f12);
            this.fragmentView.requestLayout();
            return;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f11 = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f11).setDuration(150L);
        if (z10) {
            grVar = org.telegram.ui.Components.gr.f28844f;
        } else {
            grVar = org.telegram.ui.Components.xs.f34754e;
        }
        duration.setInterpolator(grVar);
        duration.addUpdateListener(new f3(this, 19));
        duration.addListener(new n60(2, this, z10));
        duration.start();
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f35574x != 0) {
            return true;
        }
        return false;
    }

    public final void i0(Runnable runnable) {
        this.M = (fb0) runnable;
    }

    public final void j0() {
        if (d0()) {
            this.f35570n.f42755f[0].requestFocus();
            if (!b0()) {
                AndroidUtilities.showKeyboard(this.f35570n.f42755f[0]);
            }
        } else if (c0()) {
            this.h.requestFocus();
            AndroidUtilities.showKeyboard(this.h);
        }
    }

    public final void k0() {
        String charSequence;
        int i9;
        boolean z10;
        int i10;
        int i11 = this.f35574x;
        if (i11 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.A == 0) {
            if (this.f35575y == 0) {
                i9 = R.string.CreatePasscodeInfoPIN;
            } else {
                i9 = R.string.CreatePasscodeInfoPassword;
            }
            charSequence = LocaleController.getString(i9);
        } else {
            charSequence = this.f35568e.getCurrentView().getText().toString();
        }
        if (!this.f35568e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f35568e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            this.f35568e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z10, false);
        } else if (this.A == 0) {
            org.telegram.ui.Components.xz0 xz0Var = this.f35568e;
            if (this.f35575y == 0) {
                i10 = R.string.CreatePasscodeInfoPIN;
            } else {
                i10 = R.string.CreatePasscodeInfoPassword;
            }
            xz0Var.a(LocaleController.getString(i10), z10, false);
        }
        if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35570n, true, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35569f, false, 1.0f, z10);
        } else if (c0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f35570n, false, 1.0f, z10);
            AndroidUtilities.updateViewVisibilityAnimated(this.f35569f, true, 1.0f, z10);
        }
        if (c0()) {
            vk0 vk0Var = new vk0(this, z10, 1);
            this.L = vk0Var;
            AndroidUtilities.runOnUIThread(vk0Var, 3000L);
        } else {
            this.f35573w.e(false, z10);
        }
        h0(b0(), z10);
        j0();
    }

    public final void l0() {
        this.fingerprintRow = -1;
        this.C = 1;
        this.H = 3;
        this.changePasscodeRow = 2;
        try {
            if (Build.VERSION.SDK_INT >= 23 && new a5.m(new u5.h(ApplicationLoader.applicationContext, 1)).e(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
                int i9 = this.H;
                this.H = i9 + 1;
                this.fingerprintRow = i9;
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        int i10 = this.H;
        this.autoLockRow = i10;
        this.D = i10 + 1;
        this.E = i10 + 2;
        this.F = i10 + 3;
        this.G = i10 + 4;
        this.H = i10 + 6;
        this.disablePasscodeRow = i10 + 5;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        vr[] vrVarArr;
        int i9;
        super.onConfigurationChanged(configuration);
        h0(b0(), false);
        org.telegram.ui.Components.pi0 pi0Var = this.f35565a;
        if (pi0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i9 = 0;
                    pi0Var.setVisibility(i9);
                }
            }
            i9 = 8;
            pi0Var.setVisibility(i9);
        }
        ld0 ld0Var = this.f35570n;
        if (ld0Var != null && (vrVarArr = ld0Var.f42755f) != null) {
            for (vr vrVar : vrVarArr) {
                vrVar.setShowSoftInputOnFocusCompat(!b0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        l0();
        if (this.f35574x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f35574x == 0) {
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
        al0 al0Var = this.f35566b;
        if (al0Var != null) {
            al0Var.l();
        }
        if (this.f35574x != 0 && !b0()) {
            AndroidUtilities.runOnUIThread(new uk0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (b0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f35574x != 0) {
            j0();
        }
    }
}
