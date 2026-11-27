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
public class PasscodeActivity extends org.telegram.ui.ActionBar.e implements fn7 {
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
    public s7 R;
    public boolean S;
    public final ly7 T;
    public my7 U;
    public w56 V;
    public se4 W;
    public e29 a;
    private int autoLockRow;
    public t20 b;
    public d79 c;
    private int changePasscodeRow;
    public TextView d;
    private int disablePasscodeRow;
    public wmb e;
    public lu7 f;
    private int fingerprintRow;
    public EditTextBoldCursor h;
    public bf6 n;
    public TextView r;
    public ImageView s;
    public k53 w;
    public zp4 x;
    public final byte y;

    public PasscodeActivity(int i) {
        super(null);
        this.E = false;
        this.F = false;
        this.T = new ly7(this, (byte) 5);
        this.y = i;
    }

    public static int Y(PasscodeActivity passcodeActivity) {
        return passcodeActivity.autoLockRow;
    }

    public static int Z(PasscodeActivity passcodeActivity) {
        return passcodeActivity.changePasscodeRow;
    }

    public static int a0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.disablePasscodeRow;
    }

    public static int b0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.fingerprintRow;
    }

    public static int i0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int j0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static int k0(PasscodeActivity passcodeActivity) {
        return passcodeActivity.currentAccount;
    }

    public static org.telegram.ui.ActionBar.e m0() {
        if (!xea.r.isEmpty()) {
            return new PasscodeActivity(2);
        }
        return new v8(6);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override
    public final android.view.View createView(android.content.Context r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PasscodeActivity.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.n0) {
            if ((objArr.length == 0 || ((Boolean) objArr[0]).booleanValue()) && this.y == 0) {
                z0();
                t20 t20Var = this.b;
                if (t20Var != null) {
                    t20Var.f();
                }
            }
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.a7));
        if (this.y != 0) {
            arrayList.add(new apb(this.actionBar, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        }
        arrayList.add(new apb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G8));
        arrayList.add(new apb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F8));
        arrayList.add(new apb(this.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.D6));
        arrayList.add(new apb(this.h, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.k6));
        arrayList.add(new apb(this.h, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.l6));
        arrayList.add(new apb(this.c, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.c, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
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
            bf6 bf6Var = this.n;
            ok2[] ok2VarArr = bf6Var.f;
            if (i < ok2VarArr.length) {
                ok2 ok2Var = ok2VarArr[i];
                ok2Var.postDelayed(new ny7(ok2Var, (byte) 0), i * 75);
                i++;
            } else {
                bf6Var.postDelayed(new ql7(this, runnable, (byte) 16), (ok2VarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean n0() {
        if (p0() && this.y != 0 && !hl.O1()) {
            Point point = hl.q;
            if (point.x < point.y && !hl.A1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean o0() {
        byte b = this.y;
        if ((b == 1 && this.E) || ((b == 2 || b == 3) && xea.q == 1)) {
            return true;
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ok2[] ok2VarArr;
        int i;
        super.onConfigurationChanged(configuration);
        w0(n0(), false);
        e29 e29Var = this.a;
        if (e29Var != null) {
            if (!hl.M1()) {
                Point point = hl.q;
                if (point.x < point.y) {
                    i = 0;
                    e29Var.setVisibility(i);
                }
            }
            i = 8;
            e29Var.setVisibility(i);
        }
        bf6 bf6Var = this.n;
        if (bf6Var != null && (ok2VarArr = bf6Var.f) != null) {
            for (ok2 ok2Var : ok2VarArr) {
                ok2Var.setShowSoftInputOnFocusCompat(!n0());
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        z0();
        if (this.y == 0) {
            jn7.e().b(this, jn7.n0);
            return true;
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.y == 0) {
            jn7.e().n(this, jn7.n0);
        }
        hl.y2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        hl.z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.b;
        if (t20Var != null) {
            t20Var.f();
        }
        if (this.y != 0 && !n0()) {
            hl.d3(new ly7(this, (byte) 6), 200L);
        }
        hl.V2(getParentActivity(), this.classGuid);
        if (n0()) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            EditTextBoldCursor editTextBoldCursor = this.h;
            if (editTextBoldCursor != null) {
                yob.l(editTextBoldCursor, 30, aob.l6, null);
            }
        } catch (Exception e) {
            cc4.g(e, true);
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
        if ((b == 1 && !this.E) || ((b == 2 || b == 3) && xea.q == 0)) {
            return true;
        }
        return false;
    }

    public final void q0(hq7 hq7Var, int i) {
        int value = hq7Var.getValue();
        if (value == 0) {
            xea.x = 0;
        } else if (value == 1) {
            xea.x = 60;
        } else if (value == 2) {
            xea.x = 300;
        } else if (value == 3) {
            xea.x = 3600;
        } else if (value == 4) {
            xea.x = 18000;
        }
        this.b.g(i);
        yac.h(this.currentAccount).u(false);
    }

    public final void r0(int i, View view) {
        if (view.isEnabled()) {
            if (i == this.disablePasscodeRow) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131751398, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131751397, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.j(ob6.M0(2131751396, null), new bm6(this, (byte) 28));
                idVar.show();
                yob.X((TextView) idVar.c(-1), aob.q7, null);
            } else if (i == this.changePasscodeRow) {
                presentFragment(new PasscodeActivity(1));
            } else if (i == this.autoLockRow) {
                if (getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                    String M02 = ob6.M0(2131753793, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M02;
                    hq7 hq7Var = new hq7(getParentActivity(), null);
                    hq7Var.setMinValue(0);
                    hq7Var.setMaxValue(4);
                    int i2 = xea.x;
                    if (i2 == 0) {
                        hq7Var.setValue(0);
                    } else if (i2 == 60) {
                        hq7Var.setValue(1);
                    } else if (i2 == 300) {
                        hq7Var.setValue(2);
                    } else if (i2 == 3600) {
                        hq7Var.setValue(3);
                    } else if (i2 == 18000) {
                        hq7Var.setValue(4);
                    }
                    hq7Var.setFormatter(new ku7((byte) 9));
                    alertDialog$Builder2.n(hq7Var);
                    alertDialog$Builder2.g(ob6.M0(2131751319, null), new bf(this, hq7Var, i, (byte) 12));
                    showDialog(idVar2);
                }
            } else if (i == this.fingerprintRow) {
                xea.C = !xea.C;
                yac.h(this.currentAccount).u(false);
                ((wkb) view).setChecked(xea.C);
            } else if (i == this.O) {
                xea.z = !xea.z;
                yac.h(this.currentAccount).u(false);
                ((wkb) view).setChecked(xea.z);
                jn7.e().k(jn7.n0, Boolean.FALSE);
                if (!xea.z) {
                    jj.r0(this, null, ob6.M0(2131745572, null), null);
                }
            } else if (i == this.K) {
                org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean z = !C.S();
                if (C.m != z) {
                    C.m = z;
                    try {
                        org.telegram.ui.Wallet.c.B().getSharedPreferences("gram_wallet", 0).edit().putBoolean("passcode", C.m).apply();
                    } catch (Exception e) {
                        org.telegram.ui.Wallet.c.n("failed to save prefs", e);
                    }
                }
                yac.h(this.currentAccount).u(false);
                ((wkb) view).setChecked(C.S());
            } else if (i == this.L) {
                org.telegram.ui.Wallet.c C2 = org.telegram.ui.Wallet.c.C(this.currentAccount);
                boolean R = C2.R();
                boolean z2 = !R;
                sa saVar = new sa((byte) 3, view, R);
                k35 k35Var = C2.c;
                if (k35Var == null) {
                    saVar.a(Boolean.FALSE);
                    return;
                }
                k35.i.execute(new j61(k35Var, k35Var.l(), z2, new zj3(saVar, (byte) 13), (byte) 1));
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
            for (ok2 ok2Var : this.n.f) {
                ok2Var.A(1.0f);
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
        hl.A3(f, view, new ly7(this, (byte) 3));
    }

    public final void t0() {
        String obj;
        ok2[] ok2VarArr;
        ok2[] ok2VarArr2;
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
                hl.R3(this.r, true);
                for (ok2 ok2Var : this.n.f) {
                    ok2Var.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                this.h.setText("");
                s0();
                this.n.removeCallbacks(this.T);
                this.n.post(new ly7(this, (byte) 0));
                return;
            }
            boolean isEmpty = xea.r.isEmpty();
            try {
                xea.v = new byte[16];
                Utilities.b.nextBytes(xea.v);
                byte[] bytes = this.G.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length + 32;
                byte[] bArr = new byte[length];
                System.arraycopy(xea.v, 0, bArr, 0, 16);
                System.arraycopy(bytes, 0, bArr, 16, bytes.length);
                System.arraycopy(xea.v, 0, bArr, bytes.length + 16, 16);
                xea.r = Utilities.f(Utilities.o(length, bArr));
            } catch (Exception e) {
                cc4.g(e, true);
            }
            xea.z = true;
            xea.q = this.E ? 1 : 0;
            xea.x();
            this.h.clearFocus();
            hl.t1(this.h);
            for (ok2 ok2Var2 : this.n.f) {
                ok2Var2.clearFocus();
                hl.t1(ok2Var2);
            }
            this.w.setEditText(null);
            l0(new my7(this, isEmpty, (byte) 0));
        } else if (b == 2 || b == 3) {
            long j = xea.s;
            if (j > 0) {
                Toast.makeText(getParentActivity(), ob6.a0("TooManyTries", null, 2131743690, ob6.G(Math.max(1, (int) Math.ceil(j / 1000.0d)), "Seconds", new Object[0])), 0).show();
                for (ok2 ok2Var3 : this.n.f) {
                    ok2Var3.setText("");
                }
                this.h.setText("");
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
            } else if (!xea.g(obj)) {
                xea.r();
                this.h.setText("");
                for (ok2 ok2Var4 : this.n.f) {
                    ok2Var4.setText("");
                }
                if (p0()) {
                    this.n.f[0].requestFocus();
                }
                s0();
            } else {
                xea.u = 0;
                xea.x();
                this.h.clearFocus();
                hl.t1(this.h);
                for (ok2 ok2Var5 : this.n.f) {
                    ok2Var5.clearFocus();
                    hl.t1(ok2Var5);
                }
                this.w.setEditText(null);
                if (b == 3) {
                    l0(new ly7(this, (byte) 1));
                } else {
                    l0(new ly7(this, (byte) 2));
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
        s7 s7Var = this.R;
        if (s7Var != null) {
            s7Var.setVisibility(8);
        }
        this.d.setText(ob6.M0(2131751780, null));
        this.e.setText(hl.S2(ob6.M0(2131747383, null)));
        if (p0()) {
            obj = this.n.getCode();
        } else {
            obj = this.h.getText().toString();
        }
        this.G = obj;
        this.h.setText("");
        this.h.setInputType(524417);
        for (ok2 ok2Var : this.n.f) {
            ok2Var.setText("");
        }
        x0();
        this.F = true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        if (this.y == 0) {
            return true;
        }
        return false;
    }

    public final void w0(boolean z, boolean z2) {
        k43 k43Var;
        if (z) {
            hl.t1(this.fragmentView);
            hl.W2(getParentActivity(), this.classGuid);
        } else {
            hl.z2(getParentActivity(), this.classGuid);
        }
        int i = 0;
        float f = 1.0f;
        float f2 = 0.0f;
        if (!z2) {
            k53 k53Var = this.w;
            if (!z) {
                i = 8;
            }
            k53Var.setVisibility(i);
            k53 k53Var2 = this.w;
            if (!z) {
                f = 0.0f;
            }
            k53Var2.setAlpha(f);
            k53 k53Var3 = this.w;
            if (!z) {
                f2 = hl.L(230.0f);
            }
            k53Var3.setTranslationY(f2);
            this.fragmentView.requestLayout();
            return;
        }
        if (!z) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(150L);
        if (z) {
            k43Var = k43.f;
        } else {
            k43Var = dt3.e;
        }
        duration.setInterpolator(k43Var);
        duration.addUpdateListener(new pv7(this, (byte) 1));
        duration.addListener(new gf4((byte) 18, this, z));
        duration.start();
    }

    public final void x0() {
        if (p0()) {
            this.n.f[0].requestFocus();
            if (!n0()) {
                hl.E3(this.n.f[0]);
            }
        } else if (o0()) {
            this.h.requestFocus();
            hl.E3(this.h);
        }
    }

    public final void y0() {
        String charSequence;
        int i;
        boolean z;
        int i2 = 2131751671;
        byte b = this.y;
        if (b == 2) {
            charSequence = ob6.M0(2131751076, null);
        } else if (b == 3) {
            charSequence = ob6.M0(2131742844, null);
        } else if (!this.F) {
            if (!this.E) {
                i = 2131751672;
            } else {
                i = 2131751671;
            }
            charSequence = ob6.M0(i, null);
        } else {
            charSequence = this.e.getCurrentView().getText().toString();
        }
        if (!this.e.getCurrentView().getText().equals(charSequence) && !TextUtils.isEmpty(this.e.getCurrentView().getText())) {
            z = true;
        } else {
            z = false;
        }
        if (b == 2) {
            this.e.a(ob6.M0(2131751076, null), z, false);
        } else if (b == 3) {
            this.e.setText(ob6.M0(2131742844, null));
        } else if (!this.F) {
            wmb wmbVar = this.e;
            if (!this.E) {
                i2 = 2131751672;
            }
            wmbVar.a(ob6.M0(i2, null), z, false);
        }
        if (p0()) {
            hl.T3(this.n, true, 1.0f, true, z);
            hl.T3(this.f, false, 1.0f, true, z);
        } else if (o0()) {
            hl.T3(this.n, false, 1.0f, true, z);
            hl.T3(this.f, true, 1.0f, true, z);
        }
        if (o0()) {
            my7 my7Var = new my7(this, z, (byte) 1);
            this.U = my7Var;
            hl.d3(my7Var, 3000L);
        } else {
            this.x.e(false, z);
        }
        w0(n0(), z);
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
            if (new fj0(new ej0(org.telegram.messenger.a.b, (byte) 0)).a(15) == 0) {
                Typeface typeface = hl.a;
                if (((KeyguardManager) org.telegram.messenger.a.b.getSystemService("keyguard")).isKeyguardSecure()) {
                    int i = this.Q;
                    this.Q = i + 1;
                    this.fingerprintRow = i;
                }
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        int i2 = this.Q;
        this.autoLockRow = i2;
        this.Q = i2 + 2;
        this.I = i2 + 1;
        if (getMessagesController().l4.v0.f) {
            int i3 = this.Q;
            this.J = i3;
            this.Q = i3 + 2;
            this.K = i3 + 1;
            if (k35.i(org.telegram.messenger.a.b)) {
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
