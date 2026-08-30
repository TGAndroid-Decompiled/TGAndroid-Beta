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
    public final yk0 L;
    public zk0 M;
    public qb0 N;
    public org.telegram.ui.Components.jj0 f31682a;
    private int autoLockRow;
    public fl0 f31683b;
    public org.telegram.ui.Components.sl0 f31684c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.u01 e;
    public org.telegram.ui.Components.ad0 f31685f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public vd0 f31686n;
    public TextView f31687r;
    public ImageView f31688s;
    public org.telegram.ui.Components.sr v;
    public org.telegram.ui.Components.z10 f31689w;
    public final int f31690x;
    public int f31691y;

    public PasscodeActivity(int i10) {
        super(null);
        this.f31691y = 0;
        this.B = 0;
        this.L = new yk0(this, 4);
        this.f31690x = i10;
    }

    public static void U(PasscodeActivity passcodeActivity, org.telegram.ui.Components.wc0 wc0Var, int i10) {
        int value = wc0Var.getValue();
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
        passcodeActivity.f31683b.m(i10);
        UserConfig.getInstance(passcodeActivity.currentAccount).saveConfig(false);
    }

    public static void V(PasscodeActivity passcodeActivity, View view, int i10) {
        if (view.isEnabled()) {
            if (i10 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String string = LocaleController.getString(R.string.DisablePasscode);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
                d2Var.O = string;
                d2Var.Q = LocaleController.getString(R.string.DisablePasscodeConfirmMessage);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.DisablePasscodeTurnOff), new fu(passcodeActivity, 29));
                d2Var.show();
                ((TextView) d2Var.d(-1)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
            } else if (i10 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i10 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String string2 = LocaleController.getString(R.string.AutoLock);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19503a;
                    d2Var2.O = string2;
                    org.telegram.ui.Components.wc0 wc0Var = new org.telegram.ui.Components.wc0(passcodeActivity.getParentActivity(), null);
                    wc0Var.setMinValue(0);
                    wc0Var.setMaxValue(4);
                    int i11 = SharedConfig.autoLockIn;
                    if (i11 == 0) {
                        wc0Var.setValue(0);
                    } else if (i11 == 60) {
                        wc0Var.setValue(1);
                    } else if (i11 == 300) {
                        wc0Var.setValue(2);
                    } else if (i11 == 3600) {
                        wc0Var.setValue(3);
                    } else if (i11 == 18000) {
                        wc0Var.setValue(4);
                    }
                    wc0Var.setFormatter(new al0(0));
                    alertDialog$Builder2.n(wc0Var);
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Done), new e3.d(passcodeActivity, wc0Var, i10, 11));
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
            vd0 vd0Var = this.f31686n;
            bs[] bsVarArr = vd0Var.f40565f;
            if (i10 < bsVarArr.length) {
                bs bsVar = bsVarArr[i10];
                bsVar.postDelayed(new bl0(bsVar, 0), i10 * 75);
                i10++;
            } else {
                vd0Var.postDelayed(new fe0(17, this, runnable), (bsVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean c0() {
        if (e0() && this.f31690x != 0 && !AndroidUtilities.isTablet()) {
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
        int i10 = this.f31690x;
        if ((i10 == 1 && this.f31691y == 1) || (i10 == 2 && SharedConfig.passcodeType == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetPasscode) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f31690x == 0) {
                m0();
                fl0 fl0Var = this.f31683b;
                if (fl0Var != null) {
                    fl0Var.l();
                }
            }
        }
    }

    public final boolean e0() {
        int i10 = this.f31690x;
        if ((i10 == 1 && this.f31691y == 0) || (i10 == 2 && SharedConfig.passcodeType == 0)) {
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
            for (bs bsVar : this.f31686n.f40565f) {
                bsVar.i(1.0f);
            }
        } else {
            this.f31685f.a(1.0f);
        }
        if (e0()) {
            view = this.f31686n;
        } else {
            view = this.f31685f;
        }
        if (e0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        AndroidUtilities.shakeViewSpring(view, f10, new yk0(this, 2));
    }

    public final void g0() {
        String obj;
        bs[] bsVarArr;
        bs[] bsVarArr2;
        if (d0() && this.h.getText().length() == 0) {
            f0();
            return;
        }
        if (e0()) {
            obj = this.f31686n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i10 = this.f31690x;
        if (i10 == 1) {
            if (!this.C.equals(obj)) {
                AndroidUtilities.updateViewVisibilityAnimated(this.f31687r, true);
                for (bs bsVar : this.f31686n.f40565f) {
                    bsVar.setText("");
                }
                if (e0()) {
                    this.f31686n.f40565f[0].requestFocus();
                }
                this.h.setText("");
                f0();
                this.f31686n.removeCallbacks(this.L);
                this.f31686n.post(new yk0(this, 0));
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
            } catch (Exception e) {
                FileLog.e(e);
            }
            SharedConfig.allowScreenCapture = true;
            SharedConfig.passcodeType = this.f31691y;
            SharedConfig.saveConfig();
            this.h.clearFocus();
            AndroidUtilities.hideKeyboard(this.h);
            for (bs bsVar2 : this.f31686n.f40565f) {
                bsVar2.clearFocus();
                AndroidUtilities.hideKeyboard(bsVar2);
            }
            this.v.setEditText(null);
            a0(new zk0(this, isEmpty, 0));
        } else if (i10 == 2) {
            long j10 = SharedConfig.passcodeRetryInMs;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), LocaleController.formatString("TooManyTries", R.string.TooManyTries, LocaleController.formatPluralString("Seconds", Math.max(1, (int) Math.ceil(j10 / 1000.0d)), new Object[0])), 0).show();
                for (bs bsVar3 : this.f31686n.f40565f) {
                    bsVar3.setText("");
                }
                this.h.setText("");
                if (e0()) {
                    this.f31686n.f40565f[0].requestFocus();
                }
                f0();
            } else if (!SharedConfig.checkPasscode(obj)) {
                SharedConfig.increaseBadPasscodeTries();
                this.h.setText("");
                for (bs bsVar4 : this.f31686n.f40565f) {
                    bsVar4.setText("");
                }
                if (e0()) {
                    this.f31686n.f40565f[0].requestFocus();
                }
                f0();
            } else {
                SharedConfig.badPasscodeTries = 0;
                SharedConfig.saveConfig();
                this.h.clearFocus();
                AndroidUtilities.hideKeyboard(this.h);
                for (bs bsVar5 : this.f31686n.f40565f) {
                    bsVar5.clearFocus();
                    AndroidUtilities.hideKeyboard(bsVar5);
                }
                this.v.setEditText(null);
                a0(new yk0(this, 1));
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 16, new Class[]{org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.aa.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19852a7));
        if (this.f31690x != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        EditTextBoldCursor editTextBoldCursor = this.h;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20031k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20049l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.E6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f31684c, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        return arrayList;
    }

    public final void h0() {
        String obj;
        if ((this.f31691y == 1 && this.h.getText().length() == 0) || (this.f31691y == 0 && this.f31686n.getCode().length() != 4)) {
            f0();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.J;
        if (w0Var != null) {
            w0Var.setVisibility(8);
        }
        this.d.setText(LocaleController.getString(R.string.ConfirmCreatePasscode));
        this.e.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PasscodeReinstallNotice)));
        if (e0()) {
            obj = this.f31686n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.C = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (bs bsVar : this.f31686n.f40565f) {
            bsVar.setText("");
        }
        k0();
        this.B = 1;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f31690x != 0) {
            return true;
        }
        return false;
    }

    public final void i0(boolean z4, boolean z10) {
        float f10;
        org.telegram.ui.Components.nr nrVar;
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
            org.telegram.ui.Components.sr srVar = this.v;
            if (!z4) {
                i10 = 8;
            }
            srVar.setVisibility(i10);
            org.telegram.ui.Components.sr srVar2 = this.v;
            if (!z4) {
                f11 = 0.0f;
            }
            srVar2.setAlpha(f11);
            org.telegram.ui.Components.sr srVar3 = this.v;
            if (!z4) {
                f12 = AndroidUtilities.dp(230.0f);
            }
            srVar3.setTranslationY(f12);
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
            nrVar = org.telegram.ui.Components.nr.f27346f;
        } else {
            nrVar = org.telegram.ui.Components.gt.e;
        }
        duration.setInterpolator(nrVar);
        duration.addUpdateListener(new e3(this, 19));
        duration.addListener(new org.telegram.ui.Components.l00(24, this, z4));
        duration.start();
    }

    public final void j0(Runnable runnable) {
        this.N = (qb0) runnable;
    }

    public final void k0() {
        if (e0()) {
            this.f31686n.f40565f[0].requestFocus();
            if (!c0()) {
                AndroidUtilities.showKeyboard(this.f31686n.f40565f[0]);
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
        int i12 = this.f31690x;
        if (i12 == 2) {
            charSequence = LocaleController.getString(R.string.EnterYourPasscodeInfo);
        } else if (this.B == 0) {
            if (this.f31691y == 0) {
                i10 = R.string.CreatePasscodeInfoPIN;
            } else {
                i10 = R.string.CreatePasscodeInfoPassword;
            }
            charSequence = LocaleController.getString(i10);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        if (!this.e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.e.getCurrentView().getText())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i12 == 2) {
            this.e.a(LocaleController.getString(R.string.EnterYourPasscodeInfo), z4, false);
        } else if (this.B == 0) {
            org.telegram.ui.Components.u01 u01Var = this.e;
            if (this.f31691y == 0) {
                i11 = R.string.CreatePasscodeInfoPIN;
            } else {
                i11 = R.string.CreatePasscodeInfoPassword;
            }
            u01Var.a(LocaleController.getString(i11), z4, false);
        }
        if (e0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f31686n, true, 1.0f, z4);
            AndroidUtilities.updateViewVisibilityAnimated(this.f31685f, false, 1.0f, z4);
        } else if (d0()) {
            AndroidUtilities.updateViewVisibilityAnimated(this.f31686n, false, 1.0f, z4);
            AndroidUtilities.updateViewVisibilityAnimated(this.f31685f, true, 1.0f, z4);
        }
        if (d0()) {
            zk0 zk0Var = new zk0(this, z4, 1);
            this.M = zk0Var;
            AndroidUtilities.runOnUIThread(zk0Var, 3000L);
        } else {
            this.f31689w.e(false, z4);
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
            if (Build.VERSION.SDK_INT >= 23 && new androidx.biometric.e(new androidx.biometric.u(ApplicationLoader.applicationContext, 0)).i(15) == 0 && AndroidUtilities.isKeyguardSecure()) {
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
        bs[] bsVarArr;
        int i10;
        super.onConfigurationChanged(configuration);
        i0(c0(), false);
        org.telegram.ui.Components.jj0 jj0Var = this.f31682a;
        if (jj0Var != null) {
            if (!AndroidUtilities.isSmallScreen()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x < point.y) {
                    i10 = 0;
                    jj0Var.setVisibility(i10);
                }
            }
            i10 = 8;
            jj0Var.setVisibility(i10);
        }
        vd0 vd0Var = this.f31686n;
        if (vd0Var != null && (bsVarArr = vd0Var.f40565f) != null) {
            for (bs bsVar : bsVarArr) {
                bsVar.setShowSoftInputOnFocusCompat(!c0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        m0();
        if (this.f31690x == 0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            return true;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f31690x == 0) {
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
        fl0 fl0Var = this.f31683b;
        if (fl0Var != null) {
            fl0Var.l();
        }
        if (this.f31690x != 0 && !c0()) {
            AndroidUtilities.runOnUIThread(new yk0(this, 5), 200L);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (c0()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && this.f31690x != 0) {
            k0();
        }
    }
}
