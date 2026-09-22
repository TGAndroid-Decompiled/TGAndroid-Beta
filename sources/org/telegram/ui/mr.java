package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class mr extends s4.o {
    public int f35816b;
    public int e;
    public int f35818f;
    public int f35819g;
    public int h;
    public int f35820i;
    public int f35821j;
    public final sr f35825n;
    public final SparseIntArray f35817c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35822k = new ArrayList();
    public final ArrayList f35823l = new ArrayList();
    public final ArrayList f35824m = new ArrayList();

    public mr(sr srVar) {
        this.f35825n = srVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35825n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35820i;
        sr srVar = this.f35825n;
        if (i10 >= i12 && i10 < this.f35821j && i11 >= srVar.X0 && i11 < srVar.Y0) {
            return ((TLObject) this.f35823l.get(i10 - i12)).equals(srVar.G.get(i11 - srVar.X0));
        }
        int i13 = this.f35819g;
        if (i10 >= i13 && i10 < this.h && i11 >= srVar.U0 && i11 < srVar.V0) {
            return ((TLObject) this.f35824m.get(i10 - i13)).equals(srVar.H.get(i11 - srVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35818f && i11 >= srVar.E0 && i11 < srVar.F0) {
            return ((TLObject) this.f35822k.get(i10 - i14)).equals(srVar.F.get(i11 - srVar.E0));
        }
        if (this.f35817c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35825n.f37481d1;
    }

    @Override
    public final int e() {
        return this.f35816b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        sr srVar = this.f35825n;
        g(1, srVar.f37518v0, sparseIntArray);
        g(2, srVar.f37529z0, sparseIntArray);
        g(3, srVar.A0, sparseIntArray);
        g(4, srVar.C0, sparseIntArray);
        g(5, srVar.D0, sparseIntArray);
        g(6, srVar.G0, sparseIntArray);
        g(7, srVar.H0, sparseIntArray);
        g(8, srVar.f37512s0, sparseIntArray);
        g(9, srVar.f37514t0, sparseIntArray);
        g(10, srVar.f37516u0, sparseIntArray);
        g(11, srVar.f37476b1, sparseIntArray);
        g(12, srVar.f37479c1, sparseIntArray);
        g(13, srVar.S, sparseIntArray);
        g(14, srVar.T, sparseIntArray);
        g(15, srVar.U, sparseIntArray);
        g(16, srVar.f37482e0, sparseIntArray);
        g(17, srVar.f37480d0, sparseIntArray);
        g(18, srVar.f37485f0, sparseIntArray);
        g(19, srVar.f37489h0, sparseIntArray);
        g(20, srVar.m0, sparseIntArray);
        g(21, srVar.f37491i0, sparseIntArray);
        g(22, srVar.f37493j0, sparseIntArray);
        int i10 = 23;
        g(23, srVar.f37495k0, sparseIntArray);
        if (srVar.f37523x) {
            i10 = 24;
            g(24, srVar.f37497l0, sparseIntArray);
        }
        g(i10 + 1, srVar.f37487g0, sparseIntArray);
        g(i10 + 2, srVar.B0, sparseIntArray);
        g(i10 + 3, srVar.T0, sparseIntArray);
        g(i10 + 4, srVar.W0, sparseIntArray);
        g(i10 + 5, srVar.Z0, sparseIntArray);
        g(i10 + 6, srVar.N0, sparseIntArray);
        g(i10 + 7, srVar.O0, sparseIntArray);
        g(i10 + 8, srVar.P0, sparseIntArray);
        g(i10 + 9, srVar.Q0, sparseIntArray);
        g(i10 + 10, srVar.S0, sparseIntArray);
        g(i10 + 11, srVar.R0, sparseIntArray);
        g(i10 + 12, srVar.f37473a1, sparseIntArray);
        g(i10 + 13, srVar.f37486f1, sparseIntArray);
        g(i10 + 14, srVar.f37488g1, sparseIntArray);
        g(i10 + 15, srVar.f37490h1, sparseIntArray);
        g(i10 + 16, srVar.f37492i1, sparseIntArray);
        g(i10 + 17, srVar.f37494j1, sparseIntArray);
        g(i10 + 18, srVar.f37500n0, sparseIntArray);
        g(i10 + 19, srVar.f37502o0, sparseIntArray);
        g(i10 + 20, srVar.f37504p0, sparseIntArray);
        g(i10 + 21, srVar.f37506q0, sparseIntArray);
        g(i10 + 22, srVar.f37509r0, sparseIntArray);
    }
}
