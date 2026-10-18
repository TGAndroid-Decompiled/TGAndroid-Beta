package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class dr extends s4.o {
    public int f36308b;
    public int e;
    public int f36310f;
    public int f36311g;
    public int h;
    public int f36312i;
    public int f36313j;
    public final jr f36317n;
    public final SparseIntArray f36309c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f36314k = new ArrayList();
    public final ArrayList f36315l = new ArrayList();
    public final ArrayList f36316m = new ArrayList();

    public dr(jr jrVar) {
        this.f36317n = jrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f36317n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f36312i;
        jr jrVar = this.f36317n;
        if (i10 >= i12 && i10 < this.f36313j && i11 >= jrVar.X0 && i11 < jrVar.Y0) {
            return ((TLObject) this.f36315l.get(i10 - i12)).equals(jrVar.G.get(i11 - jrVar.X0));
        }
        int i13 = this.f36311g;
        if (i10 >= i13 && i10 < this.h && i11 >= jrVar.U0 && i11 < jrVar.V0) {
            return ((TLObject) this.f36316m.get(i10 - i13)).equals(jrVar.H.get(i11 - jrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f36310f && i11 >= jrVar.E0 && i11 < jrVar.F0) {
            return ((TLObject) this.f36314k.get(i10 - i14)).equals(jrVar.F.get(i11 - jrVar.E0));
        }
        if (this.f36309c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36317n.f38283d1;
    }

    @Override
    public final int e() {
        return this.f36308b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jr jrVar = this.f36317n;
        g(1, jrVar.f38320v0, sparseIntArray);
        g(2, jrVar.f38331z0, sparseIntArray);
        g(3, jrVar.A0, sparseIntArray);
        g(4, jrVar.C0, sparseIntArray);
        g(5, jrVar.D0, sparseIntArray);
        g(6, jrVar.G0, sparseIntArray);
        g(7, jrVar.H0, sparseIntArray);
        g(8, jrVar.f38314s0, sparseIntArray);
        g(9, jrVar.f38316t0, sparseIntArray);
        g(10, jrVar.f38318u0, sparseIntArray);
        g(11, jrVar.f38278b1, sparseIntArray);
        g(12, jrVar.f38281c1, sparseIntArray);
        g(13, jrVar.S, sparseIntArray);
        g(14, jrVar.T, sparseIntArray);
        g(15, jrVar.U, sparseIntArray);
        g(16, jrVar.f38284e0, sparseIntArray);
        g(17, jrVar.f38282d0, sparseIntArray);
        g(18, jrVar.f38287f0, sparseIntArray);
        g(19, jrVar.f38291h0, sparseIntArray);
        g(20, jrVar.m0, sparseIntArray);
        g(21, jrVar.f38293i0, sparseIntArray);
        g(22, jrVar.f38295j0, sparseIntArray);
        int i10 = 23;
        g(23, jrVar.f38297k0, sparseIntArray);
        if (jrVar.f38325x) {
            i10 = 24;
            g(24, jrVar.f38299l0, sparseIntArray);
        }
        g(i10 + 1, jrVar.f38289g0, sparseIntArray);
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
        g(i10 + 12, jrVar.f38275a1, sparseIntArray);
        g(i10 + 13, jrVar.f38288f1, sparseIntArray);
        g(i10 + 14, jrVar.f38290g1, sparseIntArray);
        g(i10 + 15, jrVar.f38292h1, sparseIntArray);
        g(i10 + 16, jrVar.f38294i1, sparseIntArray);
        g(i10 + 17, jrVar.f38296j1, sparseIntArray);
        g(i10 + 18, jrVar.f38302n0, sparseIntArray);
        g(i10 + 19, jrVar.f38304o0, sparseIntArray);
        g(i10 + 20, jrVar.f38306p0, sparseIntArray);
        g(i10 + 21, jrVar.f38308q0, sparseIntArray);
        g(i10 + 22, jrVar.f38311r0, sparseIntArray);
    }
}
