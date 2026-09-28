package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class jr extends s4.o {
    public int f34853b;
    public int e;
    public int f34855f;
    public int f34856g;
    public int h;
    public int f34857i;
    public int f34858j;
    public final pr f34862n;
    public final SparseIntArray f34854c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f34859k = new ArrayList();
    public final ArrayList f34860l = new ArrayList();
    public final ArrayList f34861m = new ArrayList();

    public jr(pr prVar) {
        this.f34862n = prVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f34862n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f34857i;
        pr prVar = this.f34862n;
        if (i10 >= i12 && i10 < this.f34858j && i11 >= prVar.X0 && i11 < prVar.Y0) {
            return ((TLObject) this.f34860l.get(i10 - i12)).equals(prVar.G.get(i11 - prVar.X0));
        }
        int i13 = this.f34856g;
        if (i10 >= i13 && i10 < this.h && i11 >= prVar.U0 && i11 < prVar.V0) {
            return ((TLObject) this.f34861m.get(i10 - i13)).equals(prVar.H.get(i11 - prVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f34855f && i11 >= prVar.E0 && i11 < prVar.F0) {
            return ((TLObject) this.f34859k.get(i10 - i14)).equals(prVar.F.get(i11 - prVar.E0));
        }
        if (this.f34854c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34862n.f36619d1;
    }

    @Override
    public final int e() {
        return this.f34853b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        pr prVar = this.f34862n;
        g(1, prVar.f36656v0, sparseIntArray);
        g(2, prVar.f36667z0, sparseIntArray);
        g(3, prVar.A0, sparseIntArray);
        g(4, prVar.C0, sparseIntArray);
        g(5, prVar.D0, sparseIntArray);
        g(6, prVar.G0, sparseIntArray);
        g(7, prVar.H0, sparseIntArray);
        g(8, prVar.f36650s0, sparseIntArray);
        g(9, prVar.f36652t0, sparseIntArray);
        g(10, prVar.f36654u0, sparseIntArray);
        g(11, prVar.f36614b1, sparseIntArray);
        g(12, prVar.f36617c1, sparseIntArray);
        g(13, prVar.S, sparseIntArray);
        g(14, prVar.T, sparseIntArray);
        g(15, prVar.U, sparseIntArray);
        g(16, prVar.f36620e0, sparseIntArray);
        g(17, prVar.f36618d0, sparseIntArray);
        g(18, prVar.f36623f0, sparseIntArray);
        g(19, prVar.f36627h0, sparseIntArray);
        g(20, prVar.m0, sparseIntArray);
        g(21, prVar.f36629i0, sparseIntArray);
        g(22, prVar.f36631j0, sparseIntArray);
        int i10 = 23;
        g(23, prVar.f36633k0, sparseIntArray);
        if (prVar.f36661x) {
            i10 = 24;
            g(24, prVar.f36635l0, sparseIntArray);
        }
        g(i10 + 1, prVar.f36625g0, sparseIntArray);
        g(i10 + 2, prVar.B0, sparseIntArray);
        g(i10 + 3, prVar.T0, sparseIntArray);
        g(i10 + 4, prVar.W0, sparseIntArray);
        g(i10 + 5, prVar.Z0, sparseIntArray);
        g(i10 + 6, prVar.N0, sparseIntArray);
        g(i10 + 7, prVar.O0, sparseIntArray);
        g(i10 + 8, prVar.P0, sparseIntArray);
        g(i10 + 9, prVar.Q0, sparseIntArray);
        g(i10 + 10, prVar.S0, sparseIntArray);
        g(i10 + 11, prVar.R0, sparseIntArray);
        g(i10 + 12, prVar.f36611a1, sparseIntArray);
        g(i10 + 13, prVar.f36624f1, sparseIntArray);
        g(i10 + 14, prVar.f36626g1, sparseIntArray);
        g(i10 + 15, prVar.f36628h1, sparseIntArray);
        g(i10 + 16, prVar.f36630i1, sparseIntArray);
        g(i10 + 17, prVar.f36632j1, sparseIntArray);
        g(i10 + 18, prVar.f36638n0, sparseIntArray);
        g(i10 + 19, prVar.f36640o0, sparseIntArray);
        g(i10 + 20, prVar.f36642p0, sparseIntArray);
        g(i10 + 21, prVar.f36644q0, sparseIntArray);
        g(i10 + 22, prVar.f36647r0, sparseIntArray);
    }
}
