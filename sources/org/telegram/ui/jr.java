package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class jr extends s4.n {
    public int f38525b;
    public int e;
    public int f38527f;
    public int f38528g;
    public int h;
    public int f38529i;
    public int f38530j;
    public final pr f38534n;
    public final SparseIntArray f38526c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f38531k = new ArrayList();
    public final ArrayList f38532l = new ArrayList();
    public final ArrayList f38533m = new ArrayList();

    public jr(pr prVar) {
        this.f38534n = prVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f38534n.C0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f38529i;
        pr prVar = this.f38534n;
        if (i10 >= i12 && i10 < this.f38530j && i11 >= prVar.W0 && i11 < prVar.X0) {
            return ((TLObject) this.f38532l.get(i10 - i12)).equals(prVar.F.get(i11 - prVar.W0));
        }
        int i13 = this.f38528g;
        if (i10 >= i13 && i10 < this.h && i11 >= prVar.T0 && i11 < prVar.U0) {
            return ((TLObject) this.f38533m.get(i10 - i13)).equals(prVar.G.get(i11 - prVar.T0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f38527f && i11 >= prVar.D0 && i11 < prVar.E0) {
            return ((TLObject) this.f38531k.get(i10 - i14)).equals(prVar.E.get(i11 - prVar.D0));
        }
        if (this.f38526c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38534n.f40533c1;
    }

    @Override
    public final int e() {
        return this.f38525b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        pr prVar = this.f38534n;
        g(1, prVar.f40570u0, sparseIntArray);
        g(2, prVar.f40581y0, sparseIntArray);
        g(3, prVar.f40583z0, sparseIntArray);
        g(4, prVar.B0, sparseIntArray);
        g(5, prVar.C0, sparseIntArray);
        g(6, prVar.F0, sparseIntArray);
        g(7, prVar.G0, sparseIntArray);
        g(8, prVar.f40563r0, sparseIntArray);
        g(9, prVar.f40566s0, sparseIntArray);
        g(10, prVar.f40568t0, sparseIntArray);
        g(11, prVar.f40527a1, sparseIntArray);
        g(12, prVar.f40530b1, sparseIntArray);
        g(13, prVar.R, sparseIntArray);
        g(14, prVar.S, sparseIntArray);
        g(15, prVar.T, sparseIntArray);
        g(16, prVar.f40534d0, sparseIntArray);
        g(17, prVar.f40532c0, sparseIntArray);
        g(18, prVar.f40536e0, sparseIntArray);
        g(19, prVar.f40541g0, sparseIntArray);
        g(20, prVar.f40551l0, sparseIntArray);
        g(21, prVar.f40543h0, sparseIntArray);
        g(22, prVar.f40545i0, sparseIntArray);
        int i10 = 23;
        g(23, prVar.f40547j0, sparseIntArray);
        if (prVar.f40577x) {
            i10 = 24;
            g(24, prVar.f40549k0, sparseIntArray);
        }
        g(i10 + 1, prVar.f40539f0, sparseIntArray);
        g(i10 + 2, prVar.A0, sparseIntArray);
        g(i10 + 3, prVar.S0, sparseIntArray);
        g(i10 + 4, prVar.V0, sparseIntArray);
        g(i10 + 5, prVar.Y0, sparseIntArray);
        g(i10 + 6, prVar.M0, sparseIntArray);
        g(i10 + 7, prVar.N0, sparseIntArray);
        g(i10 + 8, prVar.O0, sparseIntArray);
        g(i10 + 9, prVar.P0, sparseIntArray);
        g(i10 + 10, prVar.R0, sparseIntArray);
        g(i10 + 11, prVar.Q0, sparseIntArray);
        g(i10 + 12, prVar.Z0, sparseIntArray);
        g(i10 + 13, prVar.f40537e1, sparseIntArray);
        g(i10 + 14, prVar.f40540f1, sparseIntArray);
        g(i10 + 15, prVar.f40542g1, sparseIntArray);
        g(i10 + 16, prVar.f40544h1, sparseIntArray);
        g(i10 + 17, prVar.f40546i1, sparseIntArray);
        g(i10 + 18, prVar.m0, sparseIntArray);
        g(i10 + 19, prVar.f40554n0, sparseIntArray);
        g(i10 + 20, prVar.f40556o0, sparseIntArray);
        g(i10 + 21, prVar.f40558p0, sparseIntArray);
        g(i10 + 22, prVar.f40560q0, sparseIntArray);
    }
}
