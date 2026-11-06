package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class iq extends v4.o {
    public int f46704b;
    public int f46706e;
    public int f46707f;
    public int f46708g;
    public int h;
    public int f46709i;
    public int f46710j;
    public final oq f46714n;
    public final SparseIntArray f46705c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f46711k = new ArrayList();
    public final ArrayList f46712l = new ArrayList();
    public final ArrayList f46713m = new ArrayList();

    public iq(oq oqVar) {
        this.f46714n = oqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f46714n.C0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f46709i;
        oq oqVar = this.f46714n;
        if (i7 >= i11 && i7 < this.f46710j && i10 >= oqVar.W0 && i10 < oqVar.X0) {
            return ((TLObject) this.f46712l.get(i7 - i11)).equals(oqVar.F.get(i10 - oqVar.W0));
        }
        int i12 = this.f46708g;
        if (i7 >= i12 && i7 < this.h && i10 >= oqVar.T0 && i10 < oqVar.U0) {
            return ((TLObject) this.f46713m.get(i7 - i12)).equals(oqVar.G.get(i10 - oqVar.T0));
        }
        int i13 = this.f46706e;
        if (i7 >= i13 && i7 < this.f46707f && i10 >= oqVar.D0 && i10 < oqVar.E0) {
            return ((TLObject) this.f46711k.get(i7 - i13)).equals(oqVar.E.get(i10 - oqVar.D0));
        }
        if (this.f46705c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f46714n.f48476c1;
    }

    @Override
    public final int e() {
        return this.f46704b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        oq oqVar = this.f46714n;
        g(1, oqVar.f48513u0, sparseIntArray);
        g(2, oqVar.f48524y0, sparseIntArray);
        g(3, oqVar.f48526z0, sparseIntArray);
        g(4, oqVar.B0, sparseIntArray);
        g(5, oqVar.C0, sparseIntArray);
        g(6, oqVar.F0, sparseIntArray);
        g(7, oqVar.G0, sparseIntArray);
        g(8, oqVar.f48506r0, sparseIntArray);
        g(9, oqVar.f48509s0, sparseIntArray);
        g(10, oqVar.f48511t0, sparseIntArray);
        g(11, oqVar.f48470a1, sparseIntArray);
        g(12, oqVar.f48473b1, sparseIntArray);
        g(13, oqVar.R, sparseIntArray);
        g(14, oqVar.S, sparseIntArray);
        g(15, oqVar.T, sparseIntArray);
        g(16, oqVar.f48477d0, sparseIntArray);
        g(17, oqVar.f48475c0, sparseIntArray);
        g(18, oqVar.f48480e0, sparseIntArray);
        g(19, oqVar.f48485g0, sparseIntArray);
        g(20, oqVar.f48495l0, sparseIntArray);
        g(21, oqVar.f48487h0, sparseIntArray);
        g(22, oqVar.f48489i0, sparseIntArray);
        int i7 = 23;
        g(23, oqVar.f48491j0, sparseIntArray);
        if (oqVar.f48520x) {
            i7 = 24;
            g(24, oqVar.f48493k0, sparseIntArray);
        }
        g(i7 + 1, oqVar.f48483f0, sparseIntArray);
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
        g(i7 + 13, oqVar.f48481e1, sparseIntArray);
        g(i7 + 14, oqVar.f48484f1, sparseIntArray);
        g(i7 + 15, oqVar.f48486g1, sparseIntArray);
        g(i7 + 16, oqVar.f48488h1, sparseIntArray);
        g(i7 + 17, oqVar.f48490i1, sparseIntArray);
        g(i7 + 18, oqVar.m0, sparseIntArray);
        g(i7 + 19, oqVar.f48498n0, sparseIntArray);
        g(i7 + 20, oqVar.f48499o0, sparseIntArray);
        g(i7 + 21, oqVar.f48501p0, sparseIntArray);
        g(i7 + 22, oqVar.f48503q0, sparseIntArray);
    }
}
