package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.KeyguardManager;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public class PasscodeActivity extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int E;
    public int F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public org.telegram.ui.ActionBar.q0 R;
    public boolean S;
    public final ai0 T;
    public bi0 U;
    public i90 V;
    public ma1 W;
    public org.telegram.ui.Components.fh0 f41354a;
    private int autoLockRow;
    public n4 f41355b;
    public org.telegram.ui.Components.tj0 f41356c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.vy0 f41357e;
    public org.telegram.ui.Components.gb0 f41358f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public ib0 f41359n;
    public TextView f41360r;
    public ImageView f41361s;
    public org.telegram.ui.Components.br f41362w;
    public org.telegram.ui.Components.l00 f41363x;
    public final int f41364y;

    public PasscodeActivity(int i3) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new ai0(this, 5);
        this.f41364y = i3;
    }

    public static void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.cb0 cb0Var, int i3) {
        int value = cb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.az.f21678y = 0;
        } else if (value == 1) {
            org.telegram.messenger.az.f21678y = 60;
        } else if (value == 2) {
            org.telegram.messenger.az.f21678y = 300;
        } else if (value == 3) {
            org.telegram.messenger.az.f21678y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.az.f21678y = 18000;
        }
        passcodeActivity.f41355b.g(i3);
        org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i3) {
        if (view.isEnabled()) {
            if (i3 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.bd.M0(2131751434, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131751433, null);
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751432, null), new ci0(passcodeActivity, 0));
                s1Var.show();
                org.telegram.ui.ActionBar.r6.V((TextView) s1Var.d(-1), org.telegram.ui.ActionBar.k6.f28122q7, null);
            } else if (i3 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i3 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String M02 = org.telegram.messenger.bd.M0(2131753800, null);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.S = M02;
                    org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(passcodeActivity.getParentActivity(), null);
                    cb0Var.setMinValue(0);
                    cb0Var.setMaxValue(4);
                    int i10 = org.telegram.messenger.az.f21678y;
                    if (i10 == 0) {
                        cb0Var.setValue(0);
                    } else if (i10 == 60) {
                        cb0Var.setValue(1);
                    } else if (i10 == 300) {
                        cb0Var.setValue(2);
                    } else if (i10 == 3600) {
                        cb0Var.setValue(3);
                    } else if (i10 == 18000) {
                        cb0Var.setValue(4);
                    }
                    cb0Var.setFormatter(new u70(3));
                    alertDialog$Builder2.o(cb0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131751355, null), new k2.y(passcodeActivity, cb0Var, i3, 14));
                    passcodeActivity.showDialog(s1Var2);
                }
            } else if (i3 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.az.D = !org.telegram.messenger.az.D;
                org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.D);
            } else if (i3 == passcodeActivity.O) {
                org.telegram.messenger.az.A = !org.telegram.messenger.az.A;
                org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.az.A);
                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23269n0, Boolean.FALSE);
                if (!org.telegram.messenger.az.A) {
                    org.telegram.ui.Components.t4.t0(passcodeActivity, null, org.telegram.messenger.bd.M0(2131745854, null), null);
                }
            } else if (i3 == passcodeActivity.K) {
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean z10 = !x10.K();
                if (x10.f42728m != z10) {
                    x10.f42728m = z10;
                    try {
                        org.telegram.ui.Wallet.k0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.f42728m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.k0.k("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.h10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(x10.K());
            } else if (i3 == passcodeActivity.L) {
                org.telegram.ui.Wallet.k0 x11 = org.telegram.ui.Wallet.k0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z11 = !J;
                ci.b8 b8Var = new ci.b8(7, view, J);
                org.telegram.ui.Wallet.o0 o0Var = x11.f42720c;
                if (o0Var == null) {
                    b8Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.o0.h.execute(new org.telegram.messenger.video.o(o0Var, o0Var.l(), z11, new org.telegram.ui.Wallet.k(b8Var, 0), 3));
            }
        }
    }

    public static int c0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.fingerprintRow;
    }

    public static int d0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.autoLockRow;
    }

    public static int e0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.changePasscodeRow;
    }

    public static int f0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.disablePasscodeRow;
    }

    public static int h0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int i0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int j0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static org.telegram.ui.ActionBar.d2 p0() {
        if (!org.telegram.messenger.az.f21661s.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new g(6);
    }

    public final void A0() {
        this.J = -1;
        this.K = -1;
        this.fingerprintRow = -1;
        this.L = -1;
        this.M = -1;
        this.H = 1;
        this.Q = 3;
        this.changePasscodeRow = 2;
        try {
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.f25457b, 0)).b(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.f22580a;
                if (((KeyguardManager) org.telegram.messenger.t0.f25457b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i3 = this.Q;
                    this.Q = i3 + 1;
                    this.fingerprintRow = i3;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        int i10 = this.Q;
        this.autoLockRow = i10;
        this.Q = i10 + 2;
        this.I = i10 + 1;
        if (((org.telegram.messenger.h0) getMessagesController().f23167x7.f24662j0.f13688b).f22814c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.o0.i(org.telegram.messenger.t0.f25457b)) {
                int i12 = this.Q;
                this.Q = i12 + 1;
                this.L = i12;
            }
            int i13 = this.Q;
            this.Q = i13 + 1;
            this.M = i13;
        }
        int i14 = this.Q;
        this.N = i14;
        this.O = i14 + 1;
        this.P = i14 + 2;
        this.Q = i14 + 4;
        this.disablePasscodeRow = i14 + 3;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.f23269n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f41364y == 0) {
                A0();
                n4 n4Var = this.f41355b;
                if (n4Var != null) {
                    n4Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f41356c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27824a7));
        if (this.f41364y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28160s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28026l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41356c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41356c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f41364y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f41364y == 0) {
            return true;
        }
        return false;
    }

    public final void o0(Runnable runnable) {
        if (!s0()) {
            runnable.run();
            return;
        }
        int i3 = 0;
        while (true) {
            ib0 ib0Var = this.f41359n;
            zq[] zqVarArr = ib0Var.f52078f;
            if (i3 < zqVarArr.length) {
                zq zqVar = zqVarArr[i3];
                zqVar.postDelayed(new di0(zqVar, 0), i3 * 75);
                i3++;
            } else {
                ib0Var.postDelayed(new tb0(20, this, runnable), (zqVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        zq[] zqVarArr;
        int i3;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.fh0 fh0Var = this.f41354a;
        if (fh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.f22608q;
                if (point.x < point.y) {
                    i3 = 0;
                    fh0Var.setVisibility(i3);
                }
            }
            i3 = 8;
            fh0Var.setVisibility(i3);
        }
        ib0 ib0Var = this.f41359n;
        if (ib0Var != null && (zqVarArr = ib0Var.f52078f) != null) {
            for (zq zqVar : zqVarArr) {
                zqVar.setShowSoftInputOnFocusCompat(!q0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.f41364y == 0) {
            org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23269n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f41364y == 0) {
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23269n0);
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        n4 n4Var = this.f41355b;
        if (n4Var != null) {
            n4Var.f();
        }
        if (this.f41364y != 0 && !q0()) {
            org.telegram.messenger.g0.i3(new ai0(this, 6), 200L);
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.f28026l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f41364y != 0) {
            y0();
        }
    }

    public final boolean q0() {
        if (s0() && this.f41364y != 0 && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0() {
        int i3 = this.f41364y;
        if ((i3 == 1 && this.E == 1) || ((i3 == 2 || i3 == 3) && org.telegram.messenger.az.f21658r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        int i3 = this.f41364y;
        if ((i3 == 1 && this.E == 0) || ((i3 == 2 || i3 == 3) && org.telegram.messenger.az.f21658r == 0)) {
            return true;
        }
        return false;
    }

    public final void t0() {
        View view;
        float f10;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (s0()) {
            for (zq zqVar : this.f41359n.f52078f) {
                zqVar.z(1.0f);
            }
        } else {
            this.f41358f.a(1.0f);
        }
        if (s0()) {
            view = this.f41359n;
        } else {
            view = this.f41358f;
        }
        if (s0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        org.telegram.messenger.g0.G3(f10, view, new ai0(this, 3));
    }

    public final void u0() {
        String obj;
        zq[] zqVarArr;
        zq[] zqVarArr2;
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        if (s0()) {
            obj = this.f41359n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i3 = this.f41364y;
        if (i3 == 1) {
            if (!this.G.equals(obj)) {
                org.telegram.messenger.g0.X3(this.f41360r, true);
                for (zq zqVar : this.f41359n.f52078f) {
                    zqVar.setText("");
                }
                if (s0()) {
                    this.f41359n.f52078f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.f41359n.removeCallbacks(this.T);
                this.f41359n.post(new ai0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.az.f21661s.isEmpty();
            try {
                org.telegram.messenger.az.f21672w = new byte[16];
                Utilities.f21385b.nextBytes(org.telegram.messenger.az.f21672w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.az.f21672w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.az.f21672w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.az.f21661s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.az.A = true;
            org.telegram.messenger.az.f21658r = this.E;
            org.telegram.messenger.az.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (zq zqVar2 : this.f41359n.f52078f) {
                zqVar2.clearFocus();
                org.telegram.messenger.g0.v1(zqVar2);
            }
            this.f41362w.setEditText(null);
            o0(new bi0(this, isEmpty, 0));
        } else if (i3 == 2 || i3 == 3) {
            long j10 = org.telegram.messenger.az.f21664t;
            if (j10 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.bd.a0("TooManyTries", null, 2131744046, org.telegram.messenger.bd.G(Math.max(1, (int) Math.ceil(j10 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (zq zqVar3 : this.f41359n.f52078f) {
                    zqVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.f41359n.f52078f[0].requestFocus();
                }
                t0();
            } else if (!org.telegram.messenger.az.g(obj)) {
                org.telegram.messenger.az.r();
                this.h.setText("");
                for (zq zqVar4 : this.f41359n.f52078f) {
                    zqVar4.setText("");
                }
                if (s0()) {
                    this.f41359n.f52078f[0].requestFocus();
                }
                t0();
            } else {
                org.telegram.messenger.az.v = 0;
                org.telegram.messenger.az.y();
                this.h.clearFocus();
                org.telegram.messenger.g0.v1(this.h);
                for (zq zqVar5 : this.f41359n.f52078f) {
                    zqVar5.clearFocus();
                    org.telegram.messenger.g0.v1(zqVar5);
                }
                this.f41362w.setEditText(null);
                if (i3 == 3) {
                    o0(new ai0(this, 1));
                } else {
                    o0(new ai0(this, 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f41364y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.E == 1 && this.h.getText().length() == 0) || (this.E == 0 && this.f41359n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.R;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.bd.M0(2131751815, null));
        this.f41357e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131747664, null)));
        if (s0()) {
            obj = this.f41359n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (zq zqVar : this.f41359n.f52078f) {
            zqVar.setText("");
        }
        y0();
        this.F = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        float f10;
        org.telegram.ui.Components.xq xqVar;
        if (z10) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
        int i3 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z11) {
            org.telegram.ui.Components.br brVar = this.f41362w;
            if (!z10) {
                i3 = 8;
            }
            brVar.setVisibility(i3);
            org.telegram.ui.Components.br brVar2 = this.f41362w;
            if (!z10) {
                f11 = 0.0f;
            }
            brVar2.setAlpha(f11);
            org.telegram.ui.Components.br brVar3 = this.f41362w;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(230.0f);
            }
            brVar3.setTranslationY(f12);
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
            xqVar = org.telegram.ui.Components.xq.f40452f;
        } else {
            xqVar = org.telegram.ui.Components.ks.f35477e;
        }
        duration.setInterpolator(xqVar);
        duration.addUpdateListener(new b3(this, 17));
        duration.addListener(new u40(2, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (i90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.f41359n.f52078f[0].requestFocus();
            if (!q0()) {
                org.telegram.messenger.g0.K3(this.f41359n.f52078f[0]);
            }
        } else if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.K3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i3;
        boolean z10;
        int i10 = 2131751707;
        int i11 = this.f41364y;
        if (i11 == 2) {
            charSequence = org.telegram.messenger.bd.M0(2131751112, null);
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.bd.M0(2131743203, null);
        } else if (this.F == 0) {
            if (this.E == 0) {
                i3 = 2131751708;
            } else {
                i3 = 2131751707;
            }
            charSequence = org.telegram.messenger.bd.M0(i3, null);
        } else {
            charSequence = this.f41357e.getCurrentView().getText().toString();
        }
        if (!this.f41357e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f41357e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            this.f41357e.a(org.telegram.messenger.bd.M0(2131751112, null), z10, false);
        } else if (i11 == 3) {
            this.f41357e.setText(org.telegram.messenger.bd.M0(2131743203, null));
        } else if (this.F == 0) {
            org.telegram.ui.Components.vy0 vy0Var = this.f41357e;
            if (this.E == 0) {
                i10 = 2131751708;
            }
            vy0Var.a(org.telegram.messenger.bd.M0(i10, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.Z3(this.f41359n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.Z3(this.f41358f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.Z3(this.f41359n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.Z3(this.f41358f, true, 1.0f, true, z10);
        }
        if (r0()) {
            bi0 bi0Var = new bi0(this, z10, 1);
            this.U = bi0Var;
            org.telegram.messenger.g0.i3(bi0Var, 3000L);
        } else {
            this.f41363x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
