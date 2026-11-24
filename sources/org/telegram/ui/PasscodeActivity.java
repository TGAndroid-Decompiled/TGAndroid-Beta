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
public class PasscodeActivity extends org.telegram.ui.ActionBar.d implements jm7 {
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
    public final gx7 T;
    public hx7 U;
    public t56 V;
    public ve4 W;
    public s09 a;
    private int autoLockRow;
    public s30 b;
    public r59 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public blb e;
    public gt7 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public xe6 n;
    public TextView r;
    public ImageView s;
    public d63 w;
    public wp4 x;
    public final byte y;

    public PasscodeActivity(int i) {
        super(null);
        this.E = false;
        this.F = false;
        this.T = new gx7(this, (byte) 5);
        this.y = i;
    }

    public static rja Z(PasscodeActivity passcodeActivity) {
        return passcodeActivity.simpleActionBar;
    }

    public static int a0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.fingerprintRow;
    }

    public static int b0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.autoLockRow;
    }

    public static int c0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.changePasscodeRow;
    }

    public static int d0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.disablePasscodeRow;
    }

    public static rja e0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.simpleActionBar;
    }

    public static int f0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int g0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int h0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static org.telegram.ui.ActionBar.a i0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.actionBar;
    }

    public static rja j0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.simpleActionBar;
    }

    public static rja k0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.simpleActionBar;
    }

    public static org.telegram.ui.ActionBar.a l0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.actionBar;
    }

    public static org.telegram.ui.ActionBar.d n0() {
        if (!gda.r.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new u8(6);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final android.view.View createView(android.content.Context r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                z0();
                s30 s30Var = this.b;
                if (s30Var != null) {
                    s30Var.f();
                }
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Z6));
        if (this.y != 0) {
            arrayList.add(new cnb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        }
        arrayList.add(new cnb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F8));
        arrayList.add(new cnb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E8));
        arrayList.add(new cnb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.C6));
        arrayList.add(new cnb(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.j6));
        arrayList.add(new cnb(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k6));
        arrayList.add(new cnb(this.c, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.c, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
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

    public final void m0(Runnable runnable) {
        if (!q0()) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            xe6 xe6Var = this.n;
            gl2[] gl2VarArr = xe6Var.f;
            if (i < gl2VarArr.length) {
                gl2 gl2Var = gl2VarArr[i];
                gl2Var.postDelayed(new ix7(gl2Var, (byte) 0), i * 75);
                i++;
            } else {
                xe6Var.postDelayed(new bl7(this, runnable, (byte) 18), (gl2VarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean o0() {
        if (q0() && this.y != 0 && !gm.O1()) {
            Point point = gm.q;
            if (point.x < point.y && !gm.A1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        gl2[] gl2VarArr;
        int i;
        super.onConfigurationChanged(configuration);
        w0(o0(), false);
        s09 s09Var = this.a;
        if (s09Var != null) {
            if (!gm.M1()) {
                Point point = gm.q;
                if (point.x < point.y) {
                    i = 0;
                    s09Var.setVisibility(i);
                }
            }
            i = 8;
            s09Var.setVisibility(i);
        }
        xe6 xe6Var = this.n;
        if (xe6Var != null && (gl2VarArr = xe6Var.f) != null) {
            for (gl2 gl2Var : gl2VarArr) {
                gl2Var.setShowSoftInputOnFocusCompat(!o0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        z0();
        if (this.y == 0) {
            nm7.e().b(this, nm7.n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            nm7.e().n(this, nm7.n0);
        }
        gm.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        gm.z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.b;
        if (s30Var != null) {
            s30Var.f();
        }
        if (this.y != 0 && !o0()) {
            gm.d3(new gx7(this, (byte) 6), 200L);
        }
        gm.V2(getParentActivity(), this.classGuid);
        if (o0()) {
            gm.t1(this.fragmentView);
            gm.W2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                anb.l(editTextBoldCursor, 30, cmb.k6, null);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && this.y != 0) {
            x0();
        }
    }

    public final boolean p0() {
        byte b = this.y;
        if ((b == 1 && this.E) || ((b == 2 || b == 3) && gda.q == 1)) {
            return true;
        }
        return false;
    }

    public final boolean q0() {
        byte b = this.y;
        if ((b == 1 && !this.E) || ((b == 2 || b == 3) && gda.q == 0)) {
            return true;
        }
        return false;
    }

    public final void r0(lp7 lp7Var, int i) {
        int value = lp7Var.getValue();
        if (value == 0) {
            gda.x = 0;
        } else if (value == 1) {
            gda.x = 60;
        } else if (value == 2) {
            gda.x = 300;
        } else if (value == 3) {
            gda.x = 3600;
        } else if (value == 4) {
            gda.x = 18000;
        }
        this.b.g(i);
        z8c.h(this.currentAccount).u(false);
    }

    public final void s0(int i, View view) {
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131751370, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131751369, null);
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(jb6.M0(2131751368, null), new cj6(this, (byte) 26));
                heVar.show();
                anb.X((TextView) heVar.c(-1), cmb.p7, null);
            } else if (i == this.changePasscodeRow) {
                presentFragment(new PasscodeActivity(1));
            } else if (i == this.autoLockRow) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M02 = jb6.M0(2131753765, null);
                    he heVar2 = alertDialog$Builder2.a;
                    heVar2.S = M02;
                    lp7 lp7Var = new lp7(getParentActivity(), null);
                    lp7Var.setMinValue(0);
                    lp7Var.setMaxValue(4);
                    int i2 = gda.x;
                    if (i2 == 0) {
                        lp7Var.setValue(0);
                    } else if (i2 == 60) {
                        lp7Var.setValue(1);
                    } else if (i2 == 300) {
                        lp7Var.setValue(2);
                    } else if (i2 == 3600) {
                        lp7Var.setValue(3);
                    } else if (i2 == 18000) {
                        lp7Var.setValue(4);
                    }
                    lp7Var.setFormatter(new bh7((byte) 23));
                    alertDialog$Builder2.n(lp7Var);
                    alertDialog$Builder2.g(jb6.M0(2131751291, null), new yg(this, lp7Var, i, (byte) 11));
                    showDialog(heVar2);
                }
            } else if (i == this.fingerprintRow) {
                gda.C = !gda.C;
                z8c.h(this.currentAccount).u(false);
                ((bjb) view).setChecked(gda.C);
            } else if (i == this.O) {
                gda.z = !gda.z;
                z8c.h(this.currentAccount).u(false);
                ((bjb) view).setChecked(gda.z);
                nm7.e().k(nm7.n0, Boolean.FALSE);
                if (!gda.z) {
                    ik.r0(this, null, jb6.M0(2131745578, null), null);
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
                z8c.h(this.currentAccount).u(false);
                ((bjb) view).setChecked(C.R());
            } else if (i == this.L) {
                org.telegram.ui.Wallet.c C2 = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean Q = C2.Q();
                boolean z2 = !Q;
                ra raVar = new ra((byte) 3, view, Q);
                g35 g35Var = C2.c;
                if (g35Var == null) {
                    raVar.a(Boolean.FALSE);
                    return;
                }
                g35.i.execute(new i71(g35Var, g35Var.l(), z2, new sk3(raVar, (byte) 13), (byte) 1));
            }
        }
    }

    public final void t0() {
        View view;
        float f;
        if (getParentActivity() == null) {
            return;
        }
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (q0()) {
            for (gl2 gl2Var : this.n.f) {
                gl2Var.A(1.0f);
            }
        } else {
            this.f.a(1.0f);
        }
        if (q0()) {
            view = this.n;
        } else {
            view = this.f;
        }
        if (q0()) {
            f = 10.0f;
        } else {
            f = 4.0f;
        }
        gm.A3(f, view, new gx7(this, (byte) 3));
    }

    public final void u0() {
        String obj;
        gl2[] gl2VarArr;
        gl2[] gl2VarArr2;
        if (p0() && this.h.getText().length() == 0) {
            t0();
            return;
        }
        if (q0()) {
            obj = this.n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        byte b = this.y;
        if (b == 1) {
            if (!this.G.equals(obj)) {
                gm.R3(this.r, true);
                for (gl2 gl2Var : this.n.f) {
                    gl2Var.setText("");
                }
                if (q0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                t0();
                this.n.removeCallbacks(this.T);
                this.n.post(new gx7(this, (byte) 0));
                return;
            }
            boolean isEmpty = gda.r.isEmpty();
            try {
                gda.v = new byte[16];
                Utilities.b.nextBytes(gda.v);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(gda.v, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(gda.v, 0, bArr, bytes.length + 16, 16);
                gda.r = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                fc4.g(e, true);
            }
            gda.z = true;
            gda.q = this.E ? 1 : 0;
            gda.x();
            this.h.clearFocus();
            gm.t1(this.h);
            for (gl2 gl2Var2 : this.n.f) {
                gl2Var2.clearFocus();
                gm.t1(gl2Var2);
            }
            this.w.setEditText(null);
            m0(new hx7(this, isEmpty, (byte) 0));
        } else if (b == 2 || b == 3) {
            long j = gda.s;
            if (j > 0) {
                Toast.makeText(getParentActivity(), jb6.a0("TooManyTries", null, 2131743722, jb6.G(Math.max(1, (int) Math.ceil(j / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (gl2 gl2Var3 : this.n.f) {
                    gl2Var3.setText("");
                }
                this.h.setText("");
                if (q0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
            } else if (!gda.g(obj)) {
                gda.r();
                this.h.setText("");
                for (gl2 gl2Var4 : this.n.f) {
                    gl2Var4.setText("");
                }
                if (q0()) {
                    this.n.f[0].requestFocus();
                }
                t0();
            } else {
                gda.u = 0;
                gda.x();
                this.h.clearFocus();
                gm.t1(this.h);
                for (gl2 gl2Var5 : this.n.f) {
                    gl2Var5.clearFocus();
                    gm.t1(gl2Var5);
                }
                this.w.setEditText(null);
                if (b == 3) {
                    m0(new gx7(this, (byte) 1));
                } else {
                    m0(new gx7(this, (byte) 2));
                }
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public final void v0() {
        String obj;
        if ((this.E && this.h.getText().length() == 0) || (!this.E && this.n.getCode().length() != 4)) {
            t0();
            return;
        }
        r7 r7Var = this.R;
        if (r7Var != null) {
            r7Var.setVisibility(8);
        }
        this.d.setText(jb6.M0(2131751752, null));
        this.e.setText(gm.S2(jb6.M0(2131747389, null)));
        if (q0()) {
            obj = this.n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (gl2 gl2Var : this.n.f) {
            gl2Var.setText("");
        }
        x0();
        this.F = true;
    }

    public final void w0(boolean z, boolean z2) {
        d53 d53Var;
        if (z) {
            gm.t1(this.fragmentView);
            gm.W2(getParentActivity(), this.classGuid);
        } else {
            gm.z2(getParentActivity(), this.classGuid);
        }
        int i = 0;
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z2) {
            d63 d63Var = this.w;
            if (!z) {
                i = 8;
            }
            d63Var.setVisibility(i);
            d63 d63Var2 = this.w;
            if (!z) {
                f = 0.0f;
            }
            d63Var2.setAlpha(f);
            d63 d63Var3 = this.w;
            if (!z) {
                f2 = gm.L(230.0f);
            }
            d63Var3.setTranslationY(f2);
            this.fragmentView.requestLayout();
            return;
        }
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(150L);
        if (z) {
            d53Var = d53.f;
        } else {
            d53Var = vt3.e;
        }
        duration.setInterpolator(d53Var);
        duration.addUpdateListener(new fx7(this, (byte) 0));
        duration.addListener(new jf4((byte) 18, this, z));
        duration.start();
    }

    public final void x0() {
        if (q0()) {
            this.n.f[0].requestFocus();
            if (!o0()) {
                gm.E3(this.n.f[0]);
            }
        } else if (p0()) {
            this.h.requestFocus();
            gm.E3(this.h);
        }
    }

    public final void y0() {
        String charSequence;
        int i;
        boolean z;
        int i2 = 2131751643;
        byte b = this.y;
        if (b == 2) {
            charSequence = jb6.M0(2131751048, null);
        } else if (b == 3) {
            charSequence = jb6.M0(2131742876, null);
        } else if (!this.F) {
            if (!this.E) {
                i = 2131751644;
            } else {
                i = 2131751643;
            }
            charSequence = jb6.M0(i, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        if (!this.e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.e.getCurrentView().getText())) {
            z = true;
        } else {
            z = false;
        }
        if (b == 2) {
            this.e.a(jb6.M0(2131751048, null), z, false);
        } else if (b == 3) {
            this.e.setText(jb6.M0(2131742876, null));
        } else if (!this.F) {
            blb blbVar = this.e;
            if (!this.E) {
                i2 = 2131751644;
            }
            blbVar.a(jb6.M0(i2, null), z, false);
        }
        if (q0()) {
            gm.T3(this.n, true, 1.0f, true, z);
            gm.T3(this.f, false, 1.0f, true, z);
        } else if (p0()) {
            gm.T3(this.n, false, 1.0f, true, z);
            gm.T3(this.f, true, 1.0f, true, z);
        }
        if (p0()) {
            hx7 hx7Var = new hx7(this, z, (byte) 1);
            this.U = hx7Var;
            gm.d3(hx7Var, 3000L);
        } else {
            this.x.e(false, z);
        }
        w0(o0(), z);
        x0();
    }

    public final void z0() {
        this.J = -1;
        this.K = -1;
        this.fingerprintRow = -1;
        this.L = -1;
        this.M = -1;
        this.H = true;
        this.Q = 3;
        this.changePasscodeRow = 2;
        try {
            if (new ek0(new dk0(org.telegram.messenger.a.b, (byte) 0)).a(15) == 0) {
                Typeface typeface = gm.a;
                if (((KeyguardManager) org.telegram.messenger.a.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i = this.Q;
                    this.Q = i + 1;
                    this.fingerprintRow = i;
                }
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        int i2 = this.Q;
        this.autoLockRow = i2;
        this.Q = i2 + 2;
        this.I = i2 + 1;
        if (getMessagesController().l4.n0.f) {
            int i3 = this.Q;
            this.J = i3;
            this.Q = i3 + 2;
            this.K = i3 + 1;
            if (g35.i(org.telegram.messenger.a.b)) {
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
