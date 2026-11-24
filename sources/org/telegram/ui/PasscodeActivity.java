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
public class PasscodeActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public boolean E;
    public boolean F;
    public String G;
    public boolean H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public r7 R;
    public boolean S;
    public final ev7 T;
    public fv7 U;
    public t36 V;
    public vc4 W;
    public ry8 a;
    private int autoLockRow;
    public s20 b;
    public o39 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public ajb e;
    public er7 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public yc6 n;
    public TextView r;
    public ImageView s;
    public s43 w;
    public un4 x;
    public final byte y;

    public PasscodeActivity(int i) {
        super(null);
        this.E = false;
        this.F = false;
        this.T = new ev7(this, (byte) 5);
        this.y = i;
    }

    public static int Z(PasscodeActivity passcodeActivity) {
        return passcodeActivity.fingerprintRow;
    }

    public static int a0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.autoLockRow;
    }

    public static int b0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.changePasscodeRow;
    }

    public static int c0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.disablePasscodeRow;
    }

    public static int e0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int f0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int g0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static org.telegram.ui.ActionBar.d m0() {
        if (!gba.r.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new u8(6);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final android.view.View createView(android.content.Context r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.m0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                y0();
                s20 s20Var = this.b;
                if (s20Var != null) {
                    s20Var.f();
                }
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Z6));
        if (this.y != 0) {
            arrayList.add(new blb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        }
        arrayList.add(new blb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F8));
        arrayList.add(new blb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E8));
        arrayList.add(new blb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.C6));
        arrayList.add(new blb(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.j6));
        arrayList.add(new blb(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.k6));
        arrayList.add(new blb(this.c, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.c, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        if (this.y != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public final void l0(Runnable runnable) {
        if (!p0()) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            yc6 yc6Var = this.n;
            sj2[] sj2VarArr = yc6Var.f;
            if (i < sj2VarArr.length) {
                sj2 sj2Var = sj2VarArr[i];
                sj2Var.postDelayed(new gv7(sj2Var, (byte) 0), i * 75);
                i++;
            } else {
                yc6Var.postDelayed(new bj7(this, runnable, (byte) 17), (sj2VarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean n0() {
        if (p0() && this.y != 0 && !gl.O1()) {
            Point point = gl.q;
            if (point.x < point.y && !gl.A1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean o0() {
        byte b = this.y;
        if ((b == 1 && this.E) || ((b == 2 || b == 3) && gba.q == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        sj2[] sj2VarArr;
        int i;
        super.onConfigurationChanged(configuration);
        v0(n0(), false);
        ry8 ry8Var = this.a;
        if (ry8Var != null) {
            if (!gl.M1()) {
                Point point = gl.q;
                if (point.x < point.y) {
                    i = 0;
                    ry8Var.setVisibility(i);
                }
            }
            i = 8;
            ry8Var.setVisibility(i);
        }
        yc6 yc6Var = this.n;
        if (yc6Var != null && (sj2VarArr = yc6Var.f) != null) {
            for (sj2 sj2Var : sj2VarArr) {
                sj2Var.setShowSoftInputOnFocusCompat(!n0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        y0();
        if (this.y == 0) {
            kk7.e().b(this, kk7.m0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            kk7.e().n(this, kk7.m0);
        }
        gl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        gl.z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.b;
        if (s20Var != null) {
            s20Var.f();
        }
        if (this.y != 0 && !n0()) {
            gl.d3(new ev7(this, (byte) 6), 200L);
        }
        gl.V2(getParentActivity(), this.classGuid);
        if (n0()) {
            gl.t1(this.fragmentView);
            gl.W2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                zkb.l(editTextBoldCursor, 30, bkb.k6, null);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && this.y != 0) {
            w0();
        }
    }

    public final boolean p0() {
        byte b = this.y;
        if ((b == 1 && !this.E) || ((b == 2 || b == 3) && gba.q == 0)) {
            return true;
        }
        return false;
    }

    public final void q0(hn7 hn7Var, int i) {
        int value = hn7Var.getValue();
        if (value == 0) {
            gba.x = 0;
        } else if (value == 1) {
            gba.x = 60;
        } else if (value == 2) {
            gba.x = 300;
        } else if (value == 3) {
            gba.x = 3600;
        } else if (value == 4) {
            gba.x = 18000;
        }
        this.b.g(i);
        y6c.h(this.currentAccount).u(false);
    }

    public final void r0(int i, View view) {
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131751421, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131751420, null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131751419, null), new im6(this, (byte) 23));
                hdVar.show();
                zkb.X((TextView) hdVar.c(-1), bkb.p7, null);
            } else if (i == this.changePasscodeRow) {
                presentFragment(new PasscodeActivity(1));
            } else if (i == this.autoLockRow) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M02 = k96.M0(2131753797, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    hn7 hn7Var = new hn7(getParentActivity(), null);
                    hn7Var.setMinValue(0);
                    hn7Var.setMaxValue(4);
                    int i2 = gba.x;
                    if (i2 == 0) {
                        hn7Var.setValue(0);
                    } else if (i2 == 60) {
                        hn7Var.setValue(1);
                    } else if (i2 == 300) {
                        hn7Var.setValue(2);
                    } else if (i2 == 3600) {
                        hn7Var.setValue(3);
                    } else if (i2 == 18000) {
                        hn7Var.setValue(4);
                    }
                    hn7Var.setFormatter(new fi7((byte) 21));
                    alertDialog$Builder2.n(hn7Var);
                    alertDialog$Builder2.g(k96.M0(2131751342, null), new yf(this, hn7Var, i, (byte) 10));
                    showDialog(hdVar2);
                }
            } else if (i == this.fingerprintRow) {
                gba.C = !gba.C;
                y6c.h(this.currentAccount).u(false);
                ((ahb) view).setChecked(gba.C);
            } else if (i == this.O) {
                gba.z = !gba.z;
                y6c.h(this.currentAccount).u(false);
                ((ahb) view).setChecked(gba.z);
                kk7.e().k(kk7.m0, Boolean.FALSE);
                if (!gba.z) {
                    ij.r0(this, null, k96.M0(2131745652, null), null);
                }
            } else if (i == this.K) {
                org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean z = !C.R();
                if (C.m != z) {
                    C.m = z;
                    try {
                        org.telegram.ui.Wallet.c.B().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", C.m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.c.n("failed to save prefs", e);
                    }
                }
                y6c.h(this.currentAccount).u(false);
                ((ahb) view).setChecked(C.R());
            } else if (i == this.L) {
                org.telegram.ui.Wallet.c C2 = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean Q = C2.Q();
                boolean z2 = !Q;
                ra raVar = new ra((byte) 3, view, Q);
                g15 g15Var = C2.c;
                if (g15Var == null) {
                    raVar.a(Boolean.FALSE);
                    return;
                }
                g15.i.execute(new b61(g15Var, g15Var.l(), z2, new hj3(raVar, (byte) 13), (byte) 1));
            }
        }
    }

    public final void s0() {
        View view;
        float f;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (p0()) {
            for (sj2 sj2Var : this.n.f) {
                sj2Var.A(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        if (p0()) {
            view = this.n;
        } else {
            view = this.f;
        }
        if (p0()) {
            f = 10.0f;
        } else {
            f = 4.0f;
        }
        gl.A3(f, view, new ev7(this, (byte) 3));
    }

    public final void t0() {
        String obj;
        sj2[] sj2VarArr;
        sj2[] sj2VarArr2;
        if (o0() && this.h.getText().length() == 0) {
            s0();
            return;
        }
        if (p0()) {
            obj = this.n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        byte b = this.y;
        if (b == 1) {
            if (!this.G.equals(obj)) {
                gl.R3(this.r, true);
                for (sj2 sj2Var : this.n.f) {
                    sj2Var.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                s0();
                this.n.removeCallbacks(this.T);
                this.n.post(new ev7(this, (byte) 0));
                return;
            }
            boolean isEmpty = gba.r.isEmpty();
            try {
                gba.v = new byte[16];
                Utilities.b.nextBytes(gba.v);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(gba.v, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(gba.v, 0, bArr, bytes.length + 16, 16);
                gba.r = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                fa4.g(e, true);
            }
            gba.z = true;
            gba.q = this.E ? 1 : 0;
            gba.x();
            this.h.clearFocus();
            gl.t1(this.h);
            for (sj2 sj2Var2 : this.n.f) {
                sj2Var2.clearFocus();
                gl.t1(sj2Var2);
            }
            this.w.setEditText(null);
            l0(new fv7(this, isEmpty, (byte) 0));
        } else if (b == 2 || b == 3) {
            long j = gba.s;
            if (j > 0) {
                Toast.makeText(getParentActivity(), k96.a0("TooManyTries", null, 2131743796, k96.G(Math.max(1, (int) Math.ceil(j / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (sj2 sj2Var3 : this.n.f) {
                    sj2Var3.setText("");
                }
                this.h.setText("");
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
            } else if (!gba.g(obj)) {
                gba.r();
                this.h.setText("");
                for (sj2 sj2Var4 : this.n.f) {
                    sj2Var4.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
            } else {
                gba.u = 0;
                gba.x();
                this.h.clearFocus();
                gl.t1(this.h);
                for (sj2 sj2Var5 : this.n.f) {
                    sj2Var5.clearFocus();
                    gl.t1(sj2Var5);
                }
                this.w.setEditText(null);
                if (b == 3) {
                    l0(new ev7(this, (byte) 1));
                } else {
                    l0(new ev7(this, (byte) 2));
                }
            }
        }
    }

    public final void u0() {
        String obj;
        if ((this.E && this.h.getText().length() == 0) || (!this.E && this.n.getCode().length() != 4)) {
            s0();
            return;
        }
        r7 r7Var = this.R;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        this.d.setText(k96.M0(2131751803, null));
        this.e.setText(gl.S2(k96.M0(2131747463, null)));
        if (p0()) {
            obj = this.n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (sj2 sj2Var : this.n.f) {
            sj2Var.setText("");
        }
        w0();
        this.F = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public final void v0(boolean z, boolean z2) {
        s33 s33Var;
        if (z) {
            gl.t1(this.fragmentView);
            gl.W2(getParentActivity(), this.classGuid);
        } else {
            gl.z2(getParentActivity(), this.classGuid);
        }
        int i = 0;
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z2) {
            s43 s43Var = this.w;
            if (!z) {
                i = 8;
            }
            s43Var.setVisibility(i);
            s43 s43Var2 = this.w;
            if (!z) {
                f = 0.0f;
            }
            s43Var2.setAlpha(f);
            s43 s43Var3 = this.w;
            if (!z) {
                f2 = gl.L(230.0f);
            }
            s43Var3.setTranslationY(f2);
            this.fragmentView.requestLayout();
            return;
        }
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(150L);
        if (z) {
            s33Var = s33.f;
        } else {
            s33Var = ls3.e;
        }
        duration.setInterpolator(s33Var);
        duration.addUpdateListener(new ni4(this, (byte) 28));
        duration.addListener(new id4((byte) 18, this, z));
        duration.start();
    }

    public final void w0() {
        if (p0()) {
            this.n.f[0].requestFocus();
            if (!n0()) {
                gl.E3(this.n.f[0]);
            }
        } else if (o0()) {
            this.h.requestFocus();
            gl.E3(this.h);
        }
    }

    public final void x0() {
        String charSequence;
        int i;
        boolean z;
        int i2 = 2131751694;
        byte b = this.y;
        if (b == 2) {
            charSequence = k96.M0(2131751099, null);
        } else if (b == 3) {
            charSequence = k96.M0(2131742950, null);
        } else if (!this.F) {
            if (!this.E) {
                i = 2131751695;
            } else {
                i = 2131751694;
            }
            charSequence = k96.M0(i, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        if (!this.e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.e.getCurrentView().getText())) {
            z = true;
        } else {
            z = false;
        }
        if (b == 2) {
            this.e.a(k96.M0(2131751099, null), z, false);
        } else if (b == 3) {
            this.e.setText(k96.M0(2131742950, null));
        } else if (!this.F) {
            ajb ajbVar = this.e;
            if (!this.E) {
                i2 = 2131751695;
            }
            ajbVar.a(k96.M0(i2, null), z, false);
        }
        if (p0()) {
            gl.T3(this.n, true, 1.0f, true, z);
            gl.T3(this.f, false, 1.0f, true, z);
        } else if (o0()) {
            gl.T3(this.n, false, 1.0f, true, z);
            gl.T3(this.f, true, 1.0f, true, z);
        }
        if (o0()) {
            fv7 fv7Var = new fv7(this, z, (byte) 1);
            this.U = fv7Var;
            gl.d3(fv7Var, 3000L);
        } else {
            this.x.e(false, z);
        }
        v0(n0(), z);
        w0();
    }

    public final void y0() {
        this.J = -1;
        this.K = -1;
        this.fingerprintRow = -1;
        this.L = -1;
        this.M = -1;
        this.H = true;
        this.Q = 3;
        this.changePasscodeRow = 2;
        try {
            if (new ej0(new dj0(org.telegram.messenger.a.b)).a(15) == 0) {
                Typeface typeface = gl.a;
                if (((KeyguardManager) org.telegram.messenger.a.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i = this.Q;
                    this.Q = i + 1;
                    this.fingerprintRow = i;
                }
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        int i2 = this.Q;
        this.autoLockRow = i2;
        this.Q = i2 + 2;
        this.I = i2 + 1;
        if (getMessagesController().k4.n0.f) {
            int i3 = this.Q;
            this.J = i3;
            this.Q = i3 + 2;
            this.K = i3 + 1;
            if (g15.i(org.telegram.messenger.a.b)) {
                int i4 = this.Q;
                this.Q = i4 + 1;
                this.L = i4;
            }
            int i5 = this.Q;
            this.Q = i5 + 1;
            this.M = i5;
        }
        int i6 = this.Q;
        this.N = i6;
        this.O = i6 + 1;
        this.P = i6 + 2;
        this.Q = i6 + 4;
        this.disablePasscodeRow = i6 + 3;
    }
}
