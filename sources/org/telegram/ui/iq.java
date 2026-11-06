package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class iq extends v4.o {
    public int f46705b;
    public int f46707e;
    public int f46708f;
    public int f46709g;
    public int h;
    public int f46710i;
    public int f46711j;
    public final oq f46715n;
    public final SparseIntArray f46706c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f46712k = new ArrayList();
    public final ArrayList f46713l = new ArrayList();
    public final ArrayList f46714m = new ArrayList();

    public iq(oq oqVar) {
        this.f46715n = oqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f46715n.C0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f46710i;
        oq oqVar = this.f46715n;
        if (i7 >= i11 && i7 < this.f46711j && i10 >= oqVar.W0 && i10 < oqVar.X0) {
            return ((TLObject) this.f46713l.get(i7 - i11)).equals(oqVar.F.get(i10 - oqVar.W0));
        }
        int i12 = this.f46709g;
        if (i7 >= i12 && i7 < this.h && i10 >= oqVar.T0 && i10 < oqVar.U0) {
            return ((TLObject) this.f46714m.get(i7 - i12)).equals(oqVar.G.get(i10 - oqVar.T0));
        }
        int i13 = this.f46707e;
        if (i7 >= i13 && i7 < this.f46708f && i10 >= oqVar.D0 && i10 < oqVar.E0) {
            return ((TLObject) this.f46712k.get(i7 - i13)).equals(oqVar.E.get(i10 - oqVar.D0));
        }
        if (this.f46706c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f46715n.f48477c1;
    }

    @Override
    public final int e() {
        return this.f46705b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        oq oqVar = this.f46715n;
        g(1, oqVar.f48514u0, sparseIntArray);
        g(2, oqVar.f48525y0, sparseIntArray);
        g(3, oqVar.f48527z0, sparseIntArray);
        g(4, oqVar.B0, sparseIntArray);
        g(5, oqVar.C0, sparseIntArray);
        g(6, oqVar.F0, sparseIntArray);
        g(7, oqVar.G0, sparseIntArray);
        g(8, oqVar.f48507r0, sparseIntArray);
        g(9, oqVar.f48510s0, sparseIntArray);
        g(10, oqVar.f48512t0, sparseIntArray);
        g(11, oqVar.f48471a1, sparseIntArray);
        g(12, oqVar.f48474b1, sparseIntArray);
        g(13, oqVar.R, sparseIntArray);
        g(14, oqVar.S, sparseIntArray);
        g(15, oqVar.T, sparseIntArray);
        g(16, oqVar.f48478d0, sparseIntArray);
        g(17, oqVar.f48476c0, sparseIntArray);
        g(18, oqVar.f48481e0, sparseIntArray);
        g(19, oqVar.f48486g0, sparseIntArray);
        g(20, oqVar.f48496l0, sparseIntArray);
        g(21, oqVar.f48488h0, sparseIntArray);
        g(22, oqVar.f48490i0, sparseIntArray);
        int i7 = 23;
        g(23, oqVar.f48492j0, sparseIntArray);
        if (oqVar.f48521x) {
            i7 = 24;
            g(24, oqVar.f48494k0, sparseIntArray);
        }
        g(i7 + 1, oqVar.f48484f0, sparseIntArray);
        g(i7 + 2, oqVar.A0, sparseIntArray);
        g(i7 + 3, oqVar.S0, sparseIntArray);
        g(i7 + 4, oqVar.V0, sparseIntArray);
        g(i7 + 5, oqVar.Y0, sparseIntArray);
        g(i7 + 6, oqVar.M0, sparseIntArray);
        g(i7 + 7, oqVar.N0, sparseIntArray);
        g(i7 + 8, oqVar.O0, sparseIntArray);
        g(i7 + 9, oqVar.P0, sparseIntArray);
        g(i7 + 10, oqVar.R0, sparseIntArray);
        g(i7 + 11, oqVar.Q0, sparseIntArray);
        g(i7 + 12, oqVar.Z0, sparseIntArray);
        g(i7 + 13, oqVar.f48482e1, sparseIntArray);
        g(i7 + 14, oqVar.f48485f1, sparseIntArray);
        g(i7 + 15, oqVar.f48487g1, sparseIntArray);
        g(i7 + 16, oqVar.f48489h1, sparseIntArray);
        g(i7 + 17, oqVar.f48491i1, sparseIntArray);
        g(i7 + 18, oqVar.m0, sparseIntArray);
        g(i7 + 19, oqVar.f48499n0, sparseIntArray);
        g(i7 + 20, oqVar.f48500o0, sparseIntArray);
        g(i7 + 21, oqVar.f48502p0, sparseIntArray);
        g(i7 + 22, oqVar.f48504q0, sparseIntArray);
    }
}
