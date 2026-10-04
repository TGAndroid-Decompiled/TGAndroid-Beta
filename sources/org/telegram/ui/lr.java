package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class lr extends s4.o {
    public int f38318b;
    public int f38320e;
    public int f38321f;
    public int f38322g;
    public int h;
    public int f38323i;
    public int f38324j;
    public final rr f38328n;
    public final SparseIntArray f38319c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f38325k = new ArrayList();
    public final ArrayList f38326l = new ArrayList();
    public final ArrayList f38327m = new ArrayList();

    public lr(rr rrVar) {
        this.f38328n = rrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f38328n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f38323i;
        rr rrVar = this.f38328n;
        if (i10 >= i12 && i10 < this.f38324j && i11 >= rrVar.X0 && i11 < rrVar.Y0) {
            return ((TLObject) this.f38326l.get(i10 - i12)).equals(rrVar.G.get(i11 - rrVar.X0));
        }
        int i13 = this.f38322g;
        if (i10 >= i13 && i10 < this.h && i11 >= rrVar.U0 && i11 < rrVar.V0) {
            return ((TLObject) this.f38327m.get(i10 - i13)).equals(rrVar.H.get(i11 - rrVar.U0));
        }
        int i14 = this.f38320e;
        if (i10 >= i14 && i10 < this.f38321f && i11 >= rrVar.E0 && i11 < rrVar.F0) {
            return ((TLObject) this.f38325k.get(i10 - i14)).equals(rrVar.F.get(i11 - rrVar.E0));
        }
        if (this.f38319c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38328n.f40194d1;
    }

    @Override
    public final int e() {
        return this.f38318b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rr rrVar = this.f38328n;
        g(1, rrVar.f40232v0, sparseIntArray);
        g(2, rrVar.f40243z0, sparseIntArray);
        g(3, rrVar.A0, sparseIntArray);
        g(4, rrVar.C0, sparseIntArray);
        g(5, rrVar.D0, sparseIntArray);
        g(6, rrVar.G0, sparseIntArray);
        g(7, rrVar.H0, sparseIntArray);
        g(8, rrVar.f40226s0, sparseIntArray);
        g(9, rrVar.f40228t0, sparseIntArray);
        g(10, rrVar.f40230u0, sparseIntArray);
        g(11, rrVar.f40189b1, sparseIntArray);
        g(12, rrVar.f40192c1, sparseIntArray);
        g(13, rrVar.S, sparseIntArray);
        g(14, rrVar.T, sparseIntArray);
        g(15, rrVar.U, sparseIntArray);
        g(16, rrVar.f40196e0, sparseIntArray);
        g(17, rrVar.f40193d0, sparseIntArray);
        g(18, rrVar.f40199f0, sparseIntArray);
        g(19, rrVar.f40203h0, sparseIntArray);
        g(20, rrVar.m0, sparseIntArray);
        g(21, rrVar.f40205i0, sparseIntArray);
        g(22, rrVar.f40207j0, sparseIntArray);
        int i10 = 23;
        g(23, rrVar.f40209k0, sparseIntArray);
        if (rrVar.f40237x) {
            i10 = 24;
            g(24, rrVar.f40211l0, sparseIntArray);
        }
        g(i10 + 1, rrVar.f40201g0, sparseIntArray);
        g(i10 + 2, rrVar.B0, sparseIntArray);
        g(i10 + 3, rrVar.T0, sparseIntArray);
        g(i10 + 4, rrVar.W0, sparseIntArray);
        g(i10 + 5, rrVar.Z0, sparseIntArray);
        g(i10 + 6, rrVar.N0, sparseIntArray);
        g(i10 + 7, rrVar.O0, sparseIntArray);
        g(i10 + 8, rrVar.P0, sparseIntArray);
        g(i10 + 9, rrVar.Q0, sparseIntArray);
        g(i10 + 10, rrVar.S0, sparseIntArray);
        g(i10 + 11, rrVar.R0, sparseIntArray);
        g(i10 + 12, rrVar.f40186a1, sparseIntArray);
        g(i10 + 13, rrVar.f40200f1, sparseIntArray);
        g(i10 + 14, rrVar.f40202g1, sparseIntArray);
        g(i10 + 15, rrVar.f40204h1, sparseIntArray);
        g(i10 + 16, rrVar.f40206i1, sparseIntArray);
        g(i10 + 17, rrVar.f40208j1, sparseIntArray);
        g(i10 + 18, rrVar.f40214n0, sparseIntArray);
        g(i10 + 19, rrVar.f40216o0, sparseIntArray);
        g(i10 + 20, rrVar.f40218p0, sparseIntArray);
        g(i10 + 21, rrVar.f40220q0, sparseIntArray);
        g(i10 + 22, rrVar.f40223r0, sparseIntArray);
    }
}
