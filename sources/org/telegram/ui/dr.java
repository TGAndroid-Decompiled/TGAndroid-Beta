package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class dr extends s4.o {
    public int f36271b;
    public int e;
    public int f36273f;
    public int f36274g;
    public int h;
    public int f36275i;
    public int f36276j;
    public final jr f36280n;
    public final SparseIntArray f36272c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f36277k = new ArrayList();
    public final ArrayList f36278l = new ArrayList();
    public final ArrayList f36279m = new ArrayList();

    public dr(jr jrVar) {
        this.f36280n = jrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f36280n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f36275i;
        jr jrVar = this.f36280n;
        if (i10 >= i12 && i10 < this.f36276j && i11 >= jrVar.X0 && i11 < jrVar.Y0) {
            return ((TLObject) this.f36278l.get(i10 - i12)).equals(jrVar.G.get(i11 - jrVar.X0));
        }
        int i13 = this.f36274g;
        if (i10 >= i13 && i10 < this.h && i11 >= jrVar.U0 && i11 < jrVar.V0) {
            return ((TLObject) this.f36279m.get(i10 - i13)).equals(jrVar.H.get(i11 - jrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f36273f && i11 >= jrVar.E0 && i11 < jrVar.F0) {
            return ((TLObject) this.f36277k.get(i10 - i14)).equals(jrVar.F.get(i11 - jrVar.E0));
        }
        if (this.f36272c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36280n.f38268d1;
    }

    @Override
    public final int e() {
        return this.f36271b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jr jrVar = this.f36280n;
        g(1, jrVar.f38305v0, sparseIntArray);
        g(2, jrVar.f38316z0, sparseIntArray);
        g(3, jrVar.A0, sparseIntArray);
        g(4, jrVar.C0, sparseIntArray);
        g(5, jrVar.D0, sparseIntArray);
        g(6, jrVar.G0, sparseIntArray);
        g(7, jrVar.H0, sparseIntArray);
        g(8, jrVar.f38299s0, sparseIntArray);
        g(9, jrVar.f38301t0, sparseIntArray);
        g(10, jrVar.f38303u0, sparseIntArray);
        g(11, jrVar.f38263b1, sparseIntArray);
        g(12, jrVar.f38266c1, sparseIntArray);
        g(13, jrVar.S, sparseIntArray);
        g(14, jrVar.T, sparseIntArray);
        g(15, jrVar.U, sparseIntArray);
        g(16, jrVar.f38269e0, sparseIntArray);
        g(17, jrVar.f38267d0, sparseIntArray);
        g(18, jrVar.f38272f0, sparseIntArray);
        g(19, jrVar.f38276h0, sparseIntArray);
        g(20, jrVar.m0, sparseIntArray);
        g(21, jrVar.f38278i0, sparseIntArray);
        g(22, jrVar.f38280j0, sparseIntArray);
        int i10 = 23;
        g(23, jrVar.f38282k0, sparseIntArray);
        if (jrVar.f38310x) {
            i10 = 24;
            g(24, jrVar.f38284l0, sparseIntArray);
        }
        g(i10 + 1, jrVar.f38274g0, sparseIntArray);
        g(i10 + 2, jrVar.B0, sparseIntArray);
        g(i10 + 3, jrVar.T0, sparseIntArray);
        g(i10 + 4, jrVar.W0, sparseIntArray);
        g(i10 + 5, jrVar.Z0, sparseIntArray);
        g(i10 + 6, jrVar.N0, sparseIntArray);
        g(i10 + 7, jrVar.O0, sparseIntArray);
        g(i10 + 8, jrVar.P0, sparseIntArray);
        g(i10 + 9, jrVar.Q0, sparseIntArray);
        g(i10 + 10, jrVar.S0, sparseIntArray);
        g(i10 + 11, jrVar.R0, sparseIntArray);
        g(i10 + 12, jrVar.f38260a1, sparseIntArray);
        g(i10 + 13, jrVar.f38273f1, sparseIntArray);
        g(i10 + 14, jrVar.f38275g1, sparseIntArray);
        g(i10 + 15, jrVar.f38277h1, sparseIntArray);
        g(i10 + 16, jrVar.f38279i1, sparseIntArray);
        g(i10 + 17, jrVar.f38281j1, sparseIntArray);
        g(i10 + 18, jrVar.f38287n0, sparseIntArray);
        g(i10 + 19, jrVar.f38289o0, sparseIntArray);
        g(i10 + 20, jrVar.f38291p0, sparseIntArray);
        g(i10 + 21, jrVar.f38293q0, sparseIntArray);
        g(i10 + 22, jrVar.f38296r0, sparseIntArray);
    }
}
