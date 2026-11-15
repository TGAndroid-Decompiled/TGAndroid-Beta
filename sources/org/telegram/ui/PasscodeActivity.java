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
public class PasscodeActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is {
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
    public final fi0 T;
    public gi0 U;
    public m90 V;
    public fy0 W;
    public org.telegram.ui.Components.fh0 f42693a;
    private int autoLockRow;
    public l4 f42694b;
    public org.telegram.ui.Components.uj0 f42695c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.yy0 f42696e;
    public org.telegram.ui.Components.mb0 f42697f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public lb0 f42698n;
    public TextView f42699r;
    public ImageView f42700s;
    public org.telegram.ui.Components.ir f42701w;
    public org.telegram.ui.Components.t00 f42702x;
    public final int f42703y;

    public PasscodeActivity(int i7) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new fi0(this, 5);
        this.f42703y = i7;
    }

    public static void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.ib0 ib0Var, int i7) {
        int value = ib0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.gz.f23995y = 0;
        } else if (value == 1) {
            org.telegram.messenger.gz.f23995y = 60;
        } else if (value == 2) {
            org.telegram.messenger.gz.f23995y = 300;
        } else if (value == 3) {
            org.telegram.messenger.gz.f23995y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.gz.f23995y = 18000;
        }
        passcodeActivity.f42694b.g(i7);
        org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131751433, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131751432, null);
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751431, null), new zr(passcodeActivity, 29));
                t1Var.show();
                org.telegram.ui.ActionBar.q6.U((TextView) t1Var.d(-1), org.telegram.ui.ActionBar.j6.f29090q7, null);
            } else if (i7 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i7 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String M02 = org.telegram.messenger.hd.M0(2131753800, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.S = M02;
                    org.telegram.ui.Components.ib0 ib0Var = new org.telegram.ui.Components.ib0(passcodeActivity.getParentActivity(), null);
                    ib0Var.setMinValue(0);
                    ib0Var.setMaxValue(4);
                    int i10 = org.telegram.messenger.gz.f23995y;
                    if (i10 == 0) {
                        ib0Var.setValue(0);
                    } else if (i10 == 60) {
                        ib0Var.setValue(1);
                    } else if (i10 == 300) {
                        ib0Var.setValue(2);
                    } else if (i10 == 3600) {
                        ib0Var.setValue(3);
                    } else if (i10 == 18000) {
                        ib0Var.setValue(4);
                    }
                    ib0Var.setFormatter(new t70(4));
                    alertDialog$Builder2.o(ib0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131751354, null), new ai.q1(passcodeActivity, ib0Var, i7, 13));
                    passcodeActivity.showDialog(t1Var2);
                }
            } else if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.gz.D = !org.telegram.messenger.gz.D;
                org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.D);
            } else if (i7 == passcodeActivity.O) {
                org.telegram.messenger.gz.A = !org.telegram.messenger.gz.A;
                org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(org.telegram.messenger.gz.A);
                org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25537n0, Boolean.FALSE);
                if (!org.telegram.messenger.gz.A) {
                    org.telegram.ui.Components.t4.r0(passcodeActivity, null, org.telegram.messenger.hd.M0(2131745844, null), null);
                }
            } else if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean z10 = !x10.K();
                if (x10.f44088m != z10) {
                    x10.f44088m = z10;
                    try {
                        org.telegram.ui.Wallet.l0.w().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", x10.f44088m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.l0.k("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.m10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.q8) view).setChecked(x10.K());
            } else if (i7 == passcodeActivity.L) {
                org.telegram.ui.Wallet.l0 x11 = org.telegram.ui.Wallet.l0.x(passcodeActivity.currentAccount);
                boolean J = x11.J();
                boolean z11 = !J;
                di.t7 t7Var = new di.t7(7, view, J);
                org.telegram.ui.Wallet.p0 p0Var = x11.f44080c;
                if (p0Var == null) {
                    t7Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.p0.h.execute(new ai.k2(p0Var, p0Var.l(), z11, new org.telegram.ui.Wallet.k(t7Var, 0), 4));
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

    public static org.telegram.ui.ActionBar.e2 p0() {
        if (!org.telegram.messenger.gz.f23978s.isEmpty()) {
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
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.f26600b)).c(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.f23581a;
                if (((KeyguardManager) org.telegram.messenger.t0.f26600b.getSystemService("keyguard")).isKeyguardSecure()) {
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
        if (((org.telegram.messenger.h0) getMessagesController().f25448y7.f25852j0.f14544b).f24006c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.p0.i(org.telegram.messenger.t0.f26600b)) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25537n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f42703y == 0) {
                A0();
                l4 l4Var = this.f42694b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f42695c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28792a7));
        if (this.f42703y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29129s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28978k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28996l6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42695c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f42695c, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f42703y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f42703y == 0) {
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
            lb0 lb0Var = this.f42698n;
            dr[] drVarArr = lb0Var.f45491f;
            if (i7 < drVarArr.length) {
                dr drVar = drVarArr[i7];
                drVar.postDelayed(new hi0(drVar, 0), i7 * 75);
                i7++;
            } else {
                lb0Var.postDelayed(new jd0(12, this, runnable), (drVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        dr[] drVarArr;
        int i7;
        super.onConfigurationChanged(configuration);
        w0(q0(), false);
        org.telegram.ui.Components.fh0 fh0Var = this.f42693a;
        if (fh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.f23609q;
                if (point.x < point.y) {
                    i7 = 0;
                    fh0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            fh0Var.setVisibility(i7);
        }
        lb0 lb0Var = this.f42698n;
        if (lb0Var != null && (drVarArr = lb0Var.f45491f) != null) {
            for (dr drVar : drVarArr) {
                drVar.setShowSoftInputOnFocusCompat(!q0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.f42703y == 0) {
            org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25537n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f42703y == 0) {
            org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25537n0);
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
        l4 l4Var = this.f42694b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.f42703y != 0 && !q0()) {
            org.telegram.messenger.g0.i3(new fi0(this, 6), 200L);
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
                org.telegram.ui.ActionBar.q6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.j6.f28996l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f42703y != 0) {
            y0();
        }
    }

    public final boolean q0() {
        if (s0() && this.f42703y != 0 && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f23609q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0() {
        int i7 = this.f42703y;
        if ((i7 == 1 && this.E == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.gz.f23975r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        int i7 = this.f42703y;
        if ((i7 == 1 && this.E == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.gz.f23975r == 0)) {
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
            for (dr drVar : this.f42698n.f45491f) {
                drVar.A(1.0f);
            }
        } else {
            this.f42697f.a(1.0f);
        }
        if (s0()) {
            view = this.f42698n;
        } else {
            view = this.f42697f;
        }
        if (s0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        org.telegram.messenger.g0.F3(f10, view, new fi0(this, 3));
    }

    public final void u0() {
        String obj;
        dr[] drVarArr;
        dr[] drVarArr2;
        if (r0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        if (s0()) {
            obj = this.f42698n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i7 = this.f42703y;
        if (i7 == 1) {
            if (!this.G.equals(obj)) {
                org.telegram.messenger.g0.W3(this.f42699r, true);
                for (dr drVar : this.f42698n.f45491f) {
                    drVar.setText("");
                }
                if (s0()) {
                    this.f42698n.f45491f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.f42698n.removeCallbacks(this.T);
                this.f42698n.post(new fi0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.gz.f23978s.isEmpty();
            try {
                org.telegram.messenger.gz.f23989w = new byte[16];
                Utilities.f22414b.nextBytes(org.telegram.messenger.gz.f23989w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.gz.f23989w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.gz.f23989w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.gz.f23978s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.gz.A = true;
            org.telegram.messenger.gz.f23975r = this.E;
            org.telegram.messenger.gz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (dr drVar2 : this.f42698n.f45491f) {
                drVar2.clearFocus();
                org.telegram.messenger.g0.v1(drVar2);
            }
            this.f42701w.setEditText(null);
            o0(new gi0(this, isEmpty, 0));
        } else if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.gz.f23981t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.hd.a0("TooManyTries", null, 2131744036, org.telegram.messenger.hd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (dr drVar3 : this.f42698n.f45491f) {
                    drVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.f42698n.f45491f[0].requestFocus();
                }
                t0();
            } else if (!org.telegram.messenger.gz.g(obj)) {
                org.telegram.messenger.gz.r();
                this.h.setText("");
                for (dr drVar4 : this.f42698n.f45491f) {
                    drVar4.setText("");
                }
                if (s0()) {
                    this.f42698n.f45491f[0].requestFocus();
                }
                t0();
            } else {
                org.telegram.messenger.gz.v = 0;
                org.telegram.messenger.gz.y();
                this.h.clearFocus();
                org.telegram.messenger.g0.v1(this.h);
                for (dr drVar5 : this.f42698n.f45491f) {
                    drVar5.clearFocus();
                    org.telegram.messenger.g0.v1(drVar5);
                }
                this.f42701w.setEditText(null);
                if (i7 == 3) {
                    o0(new fi0(this, 1));
                } else {
                    o0(new fi0(this, 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f42703y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.E == 1 && this.h.getText().length() == 0) || (this.E == 0 && this.f42698n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.R;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.hd.M0(2131751815, null));
        this.f42696e.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747656, null)));
        if (s0()) {
            obj = this.f42698n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (dr drVar : this.f42698n.f45491f) {
            drVar.setText("");
        }
        y0();
        this.F = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        float f10;
        org.telegram.ui.Components.er erVar;
        if (z10) {
            org.telegram.messenger.g0.v1(this.fragmentView);
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
        int i7 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z11) {
            org.telegram.ui.Components.ir irVar = this.f42701w;
            if (!z10) {
                i7 = 8;
            }
            irVar.setVisibility(i7);
            org.telegram.ui.Components.ir irVar2 = this.f42701w;
            if (!z10) {
                f11 = 0.0f;
            }
            irVar2.setAlpha(f11);
            org.telegram.ui.Components.ir irVar3 = this.f42701w;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(230.0f);
            }
            irVar3.setTranslationY(f12);
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
            erVar = org.telegram.ui.Components.er.f34420f;
        } else {
            erVar = org.telegram.ui.Components.qs.f38759e;
        }
        duration.setInterpolator(erVar);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new z20(3, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (m90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.f42698n.f45491f[0].requestFocus();
            if (!q0()) {
                org.telegram.messenger.g0.J3(this.f42698n.f45491f[0]);
            }
        } else if (r0()) {
            this.h.requestFocus();
            org.telegram.messenger.g0.J3(this.h);
        }
    }

    public final void z0() {
        String charSequence;
        int i7;
        boolean z10;
        int i10 = 2131751706;
        int i11 = this.f42703y;
        if (i11 == 2) {
            charSequence = org.telegram.messenger.hd.M0(2131751111, null);
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.hd.M0(2131743193, null);
        } else if (this.F == 0) {
            if (this.E == 0) {
                i7 = 2131751707;
            } else {
                i7 = 2131751706;
            }
            charSequence = org.telegram.messenger.hd.M0(i7, null);
        } else {
            charSequence = this.f42696e.getCurrentView().getText().toString();
        }
        if (!this.f42696e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f42696e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            this.f42696e.a(org.telegram.messenger.hd.M0(2131751111, null), z10, false);
        } else if (i11 == 3) {
            this.f42696e.setText(org.telegram.messenger.hd.M0(2131743193, null));
        } else if (this.F == 0) {
            org.telegram.ui.Components.yy0 yy0Var = this.f42696e;
            if (this.E == 0) {
                i10 = 2131751707;
            }
            yy0Var.a(org.telegram.messenger.hd.M0(i10, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.Y3(this.f42698n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.Y3(this.f42697f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.Y3(this.f42698n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.Y3(this.f42697f, true, 1.0f, true, z10);
        }
        if (r0()) {
            gi0 gi0Var = new gi0(this, z10, 1);
            this.U = gi0Var;
            org.telegram.messenger.g0.i3(gi0Var, 3000L);
        } else {
            this.f42702x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
