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
public class PasscodeActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
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
    public final gi0 T;
    public hi0 U;
    public k90 V;
    public org.telegram.ui.Wallet.r W;
    public org.telegram.ui.Components.qh0 f43258a;
    private int autoLockRow;
    public l4 f43259b;
    public org.telegram.ui.Components.ek0 f43260c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public org.telegram.ui.Components.gz0 f43261e;
    public org.telegram.ui.Components.vb0 f43262f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public lb0 f43263n;
    public TextView f43264r;
    public ImageView f43265s;
    public org.telegram.ui.Components.or f43266w;
    public org.telegram.ui.Components.a10 f43267x;
    public final int f43268y;

    public PasscodeActivity(int i7) {
        super(null);
        this.E = 0;
        this.F = 0;
        this.T = new gi0(this, 5);
        this.f43268y = i7;
    }

    public static void Z(PasscodeActivity passcodeActivity, org.telegram.ui.Components.qb0 qb0Var, int i7) {
        int value = qb0Var.getValue();
        if (value == 0) {
            org.telegram.messenger.bz.f23336y = 0;
        } else if (value == 1) {
            org.telegram.messenger.bz.f23336y = 60;
        } else if (value == 2) {
            org.telegram.messenger.bz.f23336y = 300;
        } else if (value == 3) {
            org.telegram.messenger.bz.f23336y = 3600;
        } else if (value == 4) {
            org.telegram.messenger.bz.f23336y = 18000;
        }
        passcodeActivity.f43259b.g(i7);
        org.telegram.messenger.i10.i(passcodeActivity.currentAccount).v(false);
    }

    public static void a0(PasscodeActivity passcodeActivity, View view, int i7) {
        if (view.isEnabled()) {
            if (i7 == passcodeActivity.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131751421, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131751420, null);
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751419, null), new zr(passcodeActivity, 29));
                t1Var.show();
                org.telegram.ui.ActionBar.u6.U((TextView) t1Var.d(-1), org.telegram.ui.ActionBar.n6.f29692q7, null);
            } else if (i7 == passcodeActivity.changePasscodeRow) {
                passcodeActivity.presentFragment(new PasscodeActivity(1));
            } else if (i7 == passcodeActivity.autoLockRow) {
                if (passcodeActivity.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(passcodeActivity.getParentActivity());
                    String N02 = org.telegram.messenger.gd.N0(2131753797, null);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28835a;
                    t1Var2.S = N02;
                    org.telegram.ui.Components.qb0 qb0Var = new org.telegram.ui.Components.qb0(passcodeActivity.getParentActivity(), null);
                    qb0Var.setMinValue(0);
                    qb0Var.setMaxValue(4);
                    int i10 = org.telegram.messenger.bz.f23336y;
                    if (i10 == 0) {
                        qb0Var.setValue(0);
                    } else if (i10 == 60) {
                        qb0Var.setValue(1);
                    } else if (i10 == 300) {
                        qb0Var.setValue(2);
                    } else if (i10 == 3600) {
                        qb0Var.setValue(3);
                    } else if (i10 == 18000) {
                        qb0Var.setValue(4);
                    }
                    qb0Var.setFormatter(new l60(5));
                    alertDialog$Builder2.o(qb0Var);
                    alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131751342, null), new ai.o1(passcodeActivity, qb0Var, i7, 14));
                    passcodeActivity.showDialog(t1Var2);
                }
            } else if (i7 == passcodeActivity.fingerprintRow) {
                org.telegram.messenger.bz.D = !org.telegram.messenger.bz.D;
                org.telegram.messenger.i10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.D);
            } else if (i7 == passcodeActivity.O) {
                org.telegram.messenger.bz.A = !org.telegram.messenger.bz.A;
                org.telegram.messenger.i10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(org.telegram.messenger.bz.A);
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25254n0, Boolean.FALSE);
                if (!org.telegram.messenger.bz.A) {
                    org.telegram.ui.Components.b5.r0(passcodeActivity, null, org.telegram.messenger.gd.N0(2131745648, null), null);
                }
            } else if (i7 == passcodeActivity.K) {
                org.telegram.ui.Wallet.v0 D = org.telegram.ui.Wallet.v0.D(passcodeActivity.currentAccount);
                boolean z10 = !D.S();
                if (D.f45265m != z10) {
                    D.f45265m = z10;
                    try {
                        org.telegram.ui.Wallet.v0.C().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", D.f45265m).apply();
                    } catch (Exception e10) {
                        org.telegram.ui.Wallet.v0.o("failed to save prefs", e10);
                    }
                }
                org.telegram.messenger.i10.i(passcodeActivity.currentAccount).v(false);
                ((org.telegram.ui.Cells.r8) view).setChecked(D.S());
            } else if (i7 == passcodeActivity.L) {
                org.telegram.ui.Wallet.v0 D2 = org.telegram.ui.Wallet.v0.D(passcodeActivity.currentAccount);
                boolean R = D2.R();
                boolean z11 = !R;
                ai.o2 o2Var = new ai.o2(8, view, R);
                org.telegram.ui.Wallet.a1 a1Var = D2.f45257c;
                if (a1Var == null) {
                    o2Var.a(Boolean.FALSE);
                    return;
                }
                org.telegram.ui.Wallet.a1.f44035i.execute(new ai.f2(a1Var, a1Var.l(), z11, new org.telegram.ui.Wallet.k(o2Var, 0), 4));
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
        if (!org.telegram.messenger.bz.f23319s.isEmpty()) {
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
            if (new android.support.v4.media.session.a0(new androidx.biometric.t(org.telegram.messenger.t0.f27013b, 0)).d(15) == 0) {
                Typeface typeface = org.telegram.messenger.g0.f24198a;
                if (((KeyguardManager) org.telegram.messenger.t0.f27013b.getSystemService("keyguard")).isKeyguardSecure()) {
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
        if (((org.telegram.messenger.h0) getMessagesController().A7.f26254p0.f17372b).f24439c) {
            int i11 = this.Q;
            this.J = i11;
            this.Q = i11 + 2;
            this.K = i11 + 1;
            if (org.telegram.ui.Wallet.a1.i(org.telegram.messenger.t0.f27013b)) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25254n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.f43268y == 0) {
                A0();
                l4 l4Var = this.f43259b;
                if (l4Var != null) {
                    l4Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43260c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29394a7));
        if (this.f43268y != 0) {
            arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29731s8));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29580k6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29598l6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43260c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.M6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f43260c, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.f43268y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.f43268y == 0) {
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
            lb0 lb0Var = this.f43263n;
            er[] erVarArr = lb0Var.f46491f;
            if (i7 < erVarArr.length) {
                er erVar = erVarArr[i7];
                erVar.postDelayed(new ii0(erVar, 0), i7 * 75);
                i7++;
            } else {
                lb0Var.postDelayed(new bd0(13, this, runnable), (erVarArr.length * 75) + 350);
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
        org.telegram.ui.Components.qh0 qh0Var = this.f43258a;
        if (qh0Var != null) {
            if (!org.telegram.messenger.g0.O1()) {
                Point point = org.telegram.messenger.g0.f24226q;
                if (point.x < point.y) {
                    i7 = 0;
                    qh0Var.setVisibility(i7);
                }
            }
            i7 = 8;
            qh0Var.setVisibility(i7);
        }
        lb0 lb0Var = this.f43263n;
        if (lb0Var != null && (erVarArr = lb0Var.f46491f) != null) {
            for (er erVar : erVarArr) {
                erVar.setShowSoftInputOnFocusCompat(!q0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        if (this.f43268y == 0) {
            org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25254n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f43268y == 0) {
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25254n0);
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
        l4 l4Var = this.f43259b;
        if (l4Var != null) {
            l4Var.f();
        }
        if (this.f43268y != 0 && !q0()) {
            org.telegram.messenger.g0.h3(new gi0(this, 6), 200L);
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
                org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 30, org.telegram.ui.ActionBar.n6.f29598l6, null);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && this.f43268y != 0) {
            y0();
        }
    }

    public final boolean q0() {
        if (s0() && this.f43268y != 0 && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24226q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean r0() {
        int i7 = this.f43268y;
        if ((i7 == 1 && this.E == 1) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.bz.f23316r == 1)) {
            return true;
        }
        return false;
    }

    public final boolean s0() {
        int i7 = this.f43268y;
        if ((i7 == 1 && this.E == 0) || ((i7 == 2 || i7 == 3) && org.telegram.messenger.bz.f23316r == 0)) {
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
            for (er erVar : this.f43263n.f46491f) {
                erVar.A(1.0f);
            }
        } else {
            this.f43262f.a(1.0f);
        }
        if (s0()) {
            view = this.f43263n;
        } else {
            view = this.f43262f;
        }
        if (s0()) {
            f10 = 10.0f;
        } else {
            f10 = 4.0f;
        }
        org.telegram.messenger.g0.E3(f10, view, new gi0(this, 3));
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
            obj = this.f43263n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        int i7 = this.f43268y;
        if (i7 == 1) {
            if (!this.G.equals(obj)) {
                org.telegram.messenger.g0.V3(this.f43264r, true);
                for (er erVar : this.f43263n.f46491f) {
                    erVar.setText("");
                }
                if (s0()) {
                    this.f43263n.f46491f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.f43263n.removeCallbacks(this.T);
                this.f43263n.post(new gi0(this, 0));
                return;
            }
            boolean isEmpty = org.telegram.messenger.bz.f23319s.isEmpty();
            try {
                org.telegram.messenger.bz.f23330w = new byte[16];
                Utilities.f22875b.nextBytes(org.telegram.messenger.bz.f23330w);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(org.telegram.messenger.bz.f23330w, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(org.telegram.messenger.bz.f23330w, 0, bArr, bytes.length + 16, 16);
                org.telegram.messenger.bz.f23319s = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            org.telegram.messenger.bz.A = true;
            org.telegram.messenger.bz.f23316r = this.E;
            org.telegram.messenger.bz.y();
            this.h.clearFocus();
            org.telegram.messenger.g0.v1(this.h);
            for (er erVar2 : this.f43263n.f46491f) {
                erVar2.clearFocus();
                org.telegram.messenger.g0.v1(erVar2);
            }
            this.f43266w.setEditText(null);
            o0(new hi0(this, isEmpty, 0));
        } else if (i7 == 2 || i7 == 3) {
            long j3 = org.telegram.messenger.bz.f23322t;
            if (j3 > 0) {
                Toast.makeText(getParentActivity(), org.telegram.messenger.gd.a0("TooManyTries", null, 2131743791, org.telegram.messenger.gd.G(Math.max(1, (int) Math.ceil(j3 / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (er erVar3 : this.f43263n.f46491f) {
                    erVar3.setText("");
                }
                this.h.setText("");
                if (s0()) {
                    this.f43263n.f46491f[0].requestFocus();
                }
                t0();
            } else if (!org.telegram.messenger.bz.g(obj)) {
                org.telegram.messenger.bz.r();
                this.h.setText("");
                for (er erVar4 : this.f43263n.f46491f) {
                    erVar4.setText("");
                }
                if (s0()) {
                    this.f43263n.f46491f[0].requestFocus();
                }
                t0();
            } else {
                org.telegram.messenger.bz.v = 0;
                org.telegram.messenger.bz.y();
                this.h.clearFocus();
                org.telegram.messenger.g0.v1(this.h);
                for (er erVar5 : this.f43263n.f46491f) {
                    erVar5.clearFocus();
                    org.telegram.messenger.g0.v1(erVar5);
                }
                this.f43266w.setEditText(null);
                if (i7 == 3) {
                    o0(new gi0(this, 1));
                } else {
                    o0(new gi0(this, 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.f43268y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.E == 1 && this.h.getText().length() == 0) || (this.E == 0 && this.f43263n.getCode().length() != 4)) {
            t0();
            return;
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.R;
        if (q0Var != null) {
            q0Var.setVisibility(8);
        }
        this.d.setText(org.telegram.messenger.gd.N0(2131751803, null));
        this.f43261e.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747462, null)));
        if (s0()) {
            obj = this.f43263n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (er erVar : this.f43263n.f46491f) {
            erVar.setText("");
        }
        y0();
        this.F = 1;
    }

    public final void w0(boolean z10, boolean z11) {
        float f10;
        org.telegram.ui.Components.kr krVar;
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
            org.telegram.ui.Components.or orVar = this.f43266w;
            if (!z10) {
                i7 = 8;
            }
            orVar.setVisibility(i7);
            org.telegram.ui.Components.or orVar2 = this.f43266w;
            if (!z10) {
                f11 = 0.0f;
            }
            orVar2.setAlpha(f11);
            org.telegram.ui.Components.or orVar3 = this.f43266w;
            if (!z10) {
                f12 = org.telegram.messenger.g0.L(230.0f);
            }
            orVar3.setTranslationY(f12);
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
            krVar = org.telegram.ui.Components.kr.f36858f;
        } else {
            krVar = org.telegram.ui.Components.ws.f41716e;
        }
        duration.setInterpolator(krVar);
        duration.addUpdateListener(new a3(this, 17));
        duration.addListener(new b30(3, this, z10));
        duration.start();
    }

    public final void x0(Runnable runnable) {
        this.V = (k90) runnable;
    }

    public final void y0() {
        if (s0()) {
            this.f43263n.f46491f[0].requestFocus();
            if (!q0()) {
                org.telegram.messenger.g0.I3(this.f43263n.f46491f[0]);
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
        int i11 = this.f43268y;
        if (i11 == 2) {
            charSequence = org.telegram.messenger.gd.N0(2131751099, null);
        } else if (i11 == 3) {
            charSequence = org.telegram.messenger.gd.N0(2131742942, null);
        } else if (this.F == 0) {
            if (this.E == 0) {
                i7 = 2131751695;
            } else {
                i7 = 2131751694;
            }
            charSequence = org.telegram.messenger.gd.N0(i7, null);
        } else {
            charSequence = this.f43261e.getCurrentView().getText().toString();
        }
        if (!this.f43261e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.f43261e.getCurrentView().getText())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            this.f43261e.a(org.telegram.messenger.gd.N0(2131751099, null), z10, false);
        } else if (i11 == 3) {
            this.f43261e.setText(org.telegram.messenger.gd.N0(2131742942, null));
        } else if (this.F == 0) {
            org.telegram.ui.Components.gz0 gz0Var = this.f43261e;
            if (this.E == 0) {
                i10 = 2131751695;
            }
            gz0Var.a(org.telegram.messenger.gd.N0(i10, null), z10, false);
        }
        if (s0()) {
            org.telegram.messenger.g0.X3(this.f43263n, true, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f43262f, false, 1.0f, true, z10);
        } else if (r0()) {
            org.telegram.messenger.g0.X3(this.f43263n, false, 1.0f, true, z10);
            org.telegram.messenger.g0.X3(this.f43262f, true, 1.0f, true, z10);
        }
        if (r0()) {
            hi0 hi0Var = new hi0(this, z10, 1);
            this.U = hi0Var;
            org.telegram.messenger.g0.h3(hi0Var, 3000L);
        } else {
            this.f43267x.e(false, z10);
        }
        w0(q0(), z10);
        y0();
    }
}
