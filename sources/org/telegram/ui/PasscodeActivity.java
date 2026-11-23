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
public class PasscodeActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
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
    public final ii0 T;
    public ji0 U;
    public l90 V;
    public mz0 W;
    public org.telegram.ui.Components.rh0 f43183a;
    private int autoLockRow;
    public l4 f43184b;
    public org.telegram.ui.Components.ek0 f43185c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.hz0 f43186e;
    public org.telegram.ui.Components.yb0 f43187f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public mb0 f43188n;
    public TextView f43189r;
    public ImageView f43190s;
    public org.telegram.ui.Components.rr f43191w;
    public org.telegram.ui.Components.c10 f43192x;
    public final int f43193y;

    public PasscodeActivity(int i7) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new ii0(this, 5);
        this.f43193y = i7;
    }

    public static void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.tb0 tb0Var, int i7) {
        int value = tb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.cz.f23456y = 0;
        } else if (value == 1) {
            org.telegram.messenger.cz.f23456y = 60;
        } else if (value == 2) {
            org.telegram.messenger.cz.f23456y = 300;
        } else if (value == 3) {
            org.telegram.messenger.cz.f23456y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.cz.f23456y = 18000;
        }
        passcodeActivity.f43184b.g(i7);
        org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String N0 = org.telegram.messenger.hd.N0(2131751421, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131751420, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751419, null), new zr(passcodeActivity, 29));
                t1Var.show();
                org.telegram.ui.ActionBar.t6.U((TextView) t1Var.d(-1), org.telegram.ui.ActionBar.m6.f29622q7, null);
            } else if (i7 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i7 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String N02 = org.telegram.messenger.hd.N0(2131753797, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28777a;
                    t1Var2.S = N02;
                    org.telegram.ui.Components.tb0 tb0Var = new org.telegram.ui.Components.tb0(passcodeActivity.getParentActivity(), null);
                    tb0Var.setMinValue(0);
                    tb0Var.setMaxValue(4);
                    int i10 = org.telegram.messenger.cz.f23456y;
                    if (i10 == 0) {
                        tb0Var.setValue(0);
                    } else if (i10 == 60) {
                        tb0Var.setValue(1);
                    } else if (i10 == 300) {
                        tb0Var.setValue(2);
                    } else if (i10 == 3600) {
                        tb0Var.setValue(3);
                    } else if (i10 == 18000) {
                        tb0Var.setValue(4);
                    }
                    tb0Var.setFormatter(new m60(5));
                    alertDialog$Builder2.o(tb0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131751342, null), new ai.u1(passcodeActivity, tb0Var, i7, 14));
                    passcodeActivity.showDialog(t1Var2);
                }
            } else if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.cz.D = !org.telegram.messenger.cz.D;
                org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.D);
            } else if (i7 == passcodeActivity.O) {
                org.telegram.messenger.cz.A = !org.telegram.messenger.cz.A;
                org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(org.telegram.messenger.cz.A);
                org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25349n0, Boolean.FALSE);
                if (!org.telegram.messenger.cz.A) {
                    org.telegram.ui.Components.c5.r0(passcodeActivity, null, org.telegram.messenger.hd.N0(2131745648, null), null);
                }
            } else if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.u0 D = org.telegram.ui.Wallet.u0.D(passcodeActivity.currentAccount);
                boolean z10 = !D.S();
                if (D.f45137m != z10) {
                    D.f45137m = z10;
                    try {
                        org.telegram.ui.Wallet.u0.C().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", D.f45137m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.u0.o("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.k10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.s8) view).setChecked(D.S());
            } else if (i7 == passcodeActivity.L) {
                org.telegram.ui.Wallet.u0 D2 = org.telegram.ui.Wallet.u0.D(passcodeActivity.currentAccount);
                boolean R = D2.R();
                boolean z11 = !R;
                ai.x2 x2Var = new ai.x2(8, view, R);
                org.telegram.ui.Wallet.z0 z0Var = D2.f45129c;
                if (z0Var == null) {
                    x2Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.z0.f45377i.execute(new ai.o2(z0Var, z0Var.l(), z11, new org.telegram.ui.Wallet.k(x2Var, 0), 4));
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

    public static org.telegram.ui.ActionBar.g2 p0() {
        if (!org.telegram.messenger.cz.f23439s.isEmpty()) {
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
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.f26931b, 0)).c(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.f24018a;
                if (((KeyguardManager) org.telegram.messenger.t0.f26931b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i7 = this.Q;
                    this.Q = i7 + 1;
                    this.fingerprintRow = i7;
                }
            }
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
        int i10 = this.Q;
        this.autoLockRow = i10;
        this.Q = i10 + 2;
        this.I = i10 + 1;
        if (((org.telegram.messenger.h0) getMessagesController().A7.f26239p0.f14030b).f24341c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.z0.i(org.telegram.messenger.t0.f26931b)) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25349n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f43193y == 0) {
                A0();
                l4 l4Var = this.f43184b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43185c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29324a7));
        if (this.f43193y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29661s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29510k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29528l6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43185c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43185c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f43193y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f43193y == 0) {
            return true;
        }
        return false;
    }

    public final void o0(Runnable runnable) {
        if (!s0()) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            mb0 mb0Var = this.f43188n;
            er[] erVarArr = mb0Var.f46301f;
            if (i7 < erVarArr.length) {
                er erVar = erVarArr[i7];
                erVar.postDelayed(new ki0(erVar, 0), i7 * 75);
                i7++;
            } else {
                mb0Var.postDelayed(new fe0(9, this, runnable), (erVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        er[] erVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.rh0 rh0Var = this.f43183a;
        if (rh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.f24046q;
                if (point.x < point.y) {
                    i7 = 0;
                    rh0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            rh0Var.setVisibility(i7);
        }
        mb0 mb0Var = this.f43188n;
        if (mb0Var != null && (erVarArr = mb0Var.f46301f) != null) {
            for (er erVar : erVarArr) {
                erVar.setShowSoftInputOnFocusCompat(!q0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.f43193y == 0) {
            org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25349n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f43193y == 0) {
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25349n0);
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
        l4 l4Var = this.f43184b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.f43193y != 0 && !q0()) {
            org.telegram.messenger.g0.h3(new ii0(this, 6), 200L);
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        if (q0()) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.m6.f29528l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f43193y != 0) {
            y0();
        }
    }

    public final boolean q0() {
        if (s0() && this.f43193y != 0 && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24046q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0() {
        int i7 = this.f43193y;
        if ((i7 == 1 && this.E == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.cz.f23436r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        int i7 = this.f43193y;
        if ((i7 == 1 && this.E == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.cz.f23436r == 0)) {
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
            for (er erVar : this.f43188n.f46301f) {
                erVar.A(1.0f);
            }
        } else {
            this.f43187f.a(1.0f);
        }
        if (s0()) {
            view = this.f43188n;
        } else {
            view = this.f43187f;
        }
        if (s0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        org.telegram.messenger.g0.E3(f10, view, new ii0(this, 3));
    }

    public final void u0() {
        String obj;
        er[] erVarArr;
        er[] erVarArr2;
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        if (s0()) {
            obj = this.f43188n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i7 = this.f43193y;
        if (i7 == 1) {
            if (!this.G.equals(obj)) {
                org.telegram.messenger.g0.V3(this.f43189r, true);
                for (er erVar : this.f43188n.f46301f) {
                    erVar.setText("");
                }
                if (s0()) {
                    this.f43188n.f46301f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.f43188n.removeCallbacks(this.T);
                this.f43188n.post(new ii0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.cz.f23439s.isEmpty();
            try {
                org.telegram.messenger.cz.f23450w = new byte[16];
                Utilities.f22808b.nextBytes(org.telegram.messenger.cz.f23450w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.cz.f23450w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.cz.f23450w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.cz.f23439s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.cz.A = true;
            org.telegram.messenger.cz.f23436r = this.E;
            org.telegram.messenger.cz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (er erVar2 : this.f43188n.f46301f) {
                erVar2.clearFocus();
                org.telegram.messenger.g0.v1(erVar2);
            }
            this.f43191w.setEditText(null);
            o0(new ji0(this, isEmpty, 0));
        } else if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.cz.f23442t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.hd.a0("TooManyTries", null, 2131743793, org.telegram.messenger.hd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (er erVar3 : this.f43188n.f46301f) {
                    erVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.f43188n.f46301f[0].requestFocus();
                }
                t0();
            } else if (!org.telegram.messenger.cz.g(obj)) {
                org.telegram.messenger.cz.r();
                this.h.setText("");
                for (er erVar4 : this.f43188n.f46301f) {
                    erVar4.setText("");
                }
                if (s0()) {
                    this.f43188n.f46301f[0].requestFocus();
                }
                t0();
            } else {
                org.telegram.messenger.cz.v = 0;
                org.telegram.messenger.cz.y();
                this.h.clearFocus();
                org.telegram.messenger.g0.v1(this.h);
                for (er erVar5 : this.f43188n.f46301f) {
                    erVar5.clearFocus();
                    org.telegram.messenger.g0.v1(erVar5);
                }
                this.f43191w.setEditText(null);
                if (i7 == 3) {
                    o0(new ii0(this, 1));
                } else {
                    o0(new ii0(this, 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f43193y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.E == 1 && this.h.getText().length() == 0) || (this.E == 0 && this.f43188n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.R;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.hd.N0(2131751803, null));
        this.f43186e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131747462, null)));
        if (s0()) {
            obj = this.f43188n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (er erVar : this.f43188n.f46301f) {
            erVar.setText("");
        }
        y0();
        this.F = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        float f10;
        org.telegram.ui.Components.nr nrVar;
        if (z10) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
        int i7 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z11) {
            org.telegram.ui.Components.rr rrVar = this.f43191w;
            if (!z10) {
                i7 = 8;
            }
            rrVar.setVisibility(i7);
            org.telegram.ui.Components.rr rrVar2 = this.f43191w;
            if (!z10) {
                f11 = 0.0f;
            }
            rrVar2.setAlpha(f11);
            org.telegram.ui.Components.rr rrVar3 = this.f43191w;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(230.0f);
            }
            rrVar3.setTranslationY(f12);
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
            nrVar = org.telegram.ui.Components.nr.f37961f;
        } else {
            nrVar = org.telegram.ui.Components.zs.f42978e;
        }
        duration.setInterpolator(nrVar);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new c30(3, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (l90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.f43188n.f46301f[0].requestFocus();
            if (!q0()) {
                org.telegram.messenger.g0.I3(this.f43188n.f46301f[0]);
            }
        } else if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.I3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i7;
        boolean z10;
        int i10 = 2131751694;
        int i11 = this.f43193y;
        if (i11 == 2) {
            charSequence = org.telegram.messenger.hd.N0(2131751099, null);
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.hd.N0(2131742947, null);
        } else if (this.F == 0) {
            if (this.E == 0) {
                i7 = 2131751695;
            } else {
                i7 = 2131751694;
            }
            charSequence = org.telegram.messenger.hd.N0(i7, null);
        } else {
            charSequence = this.f43186e.getCurrentView().getText().toString();
        }
        if (!this.f43186e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f43186e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            this.f43186e.a(org.telegram.messenger.hd.N0(2131751099, null), z10, false);
        } else if (i11 == 3) {
            this.f43186e.setText(org.telegram.messenger.hd.N0(2131742947, null));
        } else if (this.F == 0) {
            org.telegram.ui.Components.hz0 hz0Var = this.f43186e;
            if (this.E == 0) {
                i10 = 2131751695;
            }
            hz0Var.a(org.telegram.messenger.hd.N0(i10, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.X3(this.f43188n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f43187f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.X3(this.f43188n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f43187f, true, 1.0f, true, z10);
        }
        if (r0()) {
            ji0 ji0Var = new ji0(this, z10, 1);
            this.U = ji0Var;
            org.telegram.messenger.g0.h3(ji0Var, 3000L);
        } else {
            this.f43192x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
