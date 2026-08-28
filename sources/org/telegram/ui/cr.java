package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class cr extends f2.s {
    public int f37293b;
    public int f37295e;
    public int f37296f;
    public int f37297g;
    public int h;
    public int f37298i;
    public int f37299j;
    public final jr f37303n;
    public final SparseIntArray f37294c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f37300k = new ArrayList();
    public final ArrayList f37301l = new ArrayList();
    public final ArrayList f37302m = new ArrayList();

    public cr(jr jrVar) {
        this.f37303n = jrVar;
    }

    public static void g(int i9, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i9);
        }
    }

    @Override
    public final boolean a(int i9, int i10) {
        if (!b(i9, i10) || this.f37303n.f39616z0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i9, int i10) {
        int i11 = this.f37298i;
        jr jrVar = this.f37303n;
        if (i9 >= i11 && i9 < this.f37299j && i10 >= jrVar.T0 && i10 < jrVar.U0) {
            return ((TLObject) this.f37301l.get(i9 - i11)).equals(jrVar.C.get(i10 - jrVar.T0));
        }
        int i12 = this.f37297g;
        if (i9 >= i12 && i9 < this.h && i10 >= jrVar.Q0 && i10 < jrVar.R0) {
            return ((TLObject) this.f37302m.get(i9 - i12)).equals(jrVar.D.get(i10 - jrVar.Q0));
        }
        int i13 = this.f37295e;
        if (i9 >= i13 && i9 < this.f37296f && i10 >= jrVar.A0 && i10 < jrVar.B0) {
            return ((TLObject) this.f37300k.get(i9 - i13)).equals(jrVar.B.get(i10 - jrVar.A0));
        }
        if (this.f37294c.get(i9) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37303n.Z0;
    }

    @Override
    public final int e() {
        return this.f37293b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jr jrVar = this.f37303n;
        g(1, jrVar.f39596r0, sparseIntArray);
        g(2, jrVar.f39605v0, sparseIntArray);
        g(3, jrVar.f39608w0, sparseIntArray);
        g(4, jrVar.f39614y0, sparseIntArray);
        g(5, jrVar.f39616z0, sparseIntArray);
        g(6, jrVar.C0, sparseIntArray);
        g(7, jrVar.D0, sparseIntArray);
        g(8, jrVar.f39589o0, sparseIntArray);
        g(9, jrVar.f39591p0, sparseIntArray);
        g(10, jrVar.f39593q0, sparseIntArray);
        g(11, jrVar.X0, sparseIntArray);
        g(12, jrVar.Y0, sparseIntArray);
        g(13, jrVar.O, sparseIntArray);
        g(14, jrVar.P, sparseIntArray);
        g(15, jrVar.Q, sparseIntArray);
        g(16, jrVar.f39558a0, sparseIntArray);
        g(17, jrVar.Z, sparseIntArray);
        g(18, jrVar.f39561b0, sparseIntArray);
        g(19, jrVar.f39566d0, sparseIntArray);
        g(20, jrVar.f39578i0, sparseIntArray);
        g(21, jrVar.f39569e0, sparseIntArray);
        g(22, jrVar.f39572f0, sparseIntArray);
        int i9 = 23;
        g(23, jrVar.f39574g0, sparseIntArray);
        if (jrVar.f39610x) {
            i9 = 24;
            g(24, jrVar.f39576h0, sparseIntArray);
        }
        g(i9 + 1, jrVar.f39564c0, sparseIntArray);
        g(i9 + 2, jrVar.f39611x0, sparseIntArray);
        g(i9 + 3, jrVar.P0, sparseIntArray);
        g(i9 + 4, jrVar.S0, sparseIntArray);
        g(i9 + 5, jrVar.V0, sparseIntArray);
        g(i9 + 6, jrVar.J0, sparseIntArray);
        g(i9 + 7, jrVar.K0, sparseIntArray);
        g(i9 + 8, jrVar.L0, sparseIntArray);
        g(i9 + 9, jrVar.M0, sparseIntArray);
        g(i9 + 10, jrVar.O0, sparseIntArray);
        g(i9 + 11, jrVar.N0, sparseIntArray);
        g(i9 + 12, jrVar.W0, sparseIntArray);
        g(i9 + 13, jrVar.f39562b1, sparseIntArray);
        g(i9 + 14, jrVar.f39565c1, sparseIntArray);
        g(i9 + 15, jrVar.f39567d1, sparseIntArray);
        g(i9 + 16, jrVar.f39570e1, sparseIntArray);
        g(i9 + 17, jrVar.f39573f1, sparseIntArray);
        g(i9 + 18, jrVar.f39580j0, sparseIntArray);
        g(i9 + 19, jrVar.f39582k0, sparseIntArray);
        g(i9 + 20, jrVar.f39584l0, sparseIntArray);
        g(i9 + 21, jrVar.m0, sparseIntArray);
        g(i9 + 22, jrVar.f39587n0, sparseIntArray);
    }
}
