package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class lq extends v4.o {
    public int f49674b;
    public int f49676e;
    public int f49677f;
    public int f49678g;
    public int h;
    public int f49679i;
    public int f49680j;
    public final rq f49684n;
    public final SparseIntArray f49675c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f49681k = new ArrayList();
    public final ArrayList f49682l = new ArrayList();
    public final ArrayList f49683m = new ArrayList();

    public lq(rq rqVar) {
        this.f49684n = rqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f49684n.D0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f49679i;
        rq rqVar = this.f49684n;
        if (i7 >= i11 && i7 < this.f49680j && i10 >= rqVar.X0 && i10 < rqVar.Y0) {
            return ((TLObject) this.f49682l.get(i7 - i11)).equals(rqVar.G.get(i10 - rqVar.X0));
        }
        int i12 = this.f49678g;
        if (i7 >= i12 && i7 < this.h && i10 >= rqVar.U0 && i10 < rqVar.V0) {
            return ((TLObject) this.f49683m.get(i7 - i12)).equals(rqVar.H.get(i10 - rqVar.U0));
        }
        int i13 = this.f49676e;
        if (i7 >= i13 && i7 < this.f49677f && i10 >= rqVar.E0 && i10 < rqVar.F0) {
            return ((TLObject) this.f49681k.get(i7 - i13)).equals(rqVar.F.get(i10 - rqVar.E0));
        }
        if (this.f49675c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f49684n.f51701d1;
    }

    @Override
    public final int e() {
        return this.f49674b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rq rqVar = this.f49684n;
        g(1, rqVar.f51738v0, sparseIntArray);
        g(2, rqVar.f51749z0, sparseIntArray);
        g(3, rqVar.A0, sparseIntArray);
        g(4, rqVar.C0, sparseIntArray);
        g(5, rqVar.D0, sparseIntArray);
        g(6, rqVar.G0, sparseIntArray);
        g(7, rqVar.H0, sparseIntArray);
        g(8, rqVar.f51732s0, sparseIntArray);
        g(9, rqVar.f51734t0, sparseIntArray);
        g(10, rqVar.f51736u0, sparseIntArray);
        g(11, rqVar.f51696b1, sparseIntArray);
        g(12, rqVar.f51699c1, sparseIntArray);
        g(13, rqVar.S, sparseIntArray);
        g(14, rqVar.T, sparseIntArray);
        g(15, rqVar.U, sparseIntArray);
        g(16, rqVar.f51703e0, sparseIntArray);
        g(17, rqVar.f51700d0, sparseIntArray);
        g(18, rqVar.f51706f0, sparseIntArray);
        g(19, rqVar.f51710h0, sparseIntArray);
        g(20, rqVar.m0, sparseIntArray);
        g(21, rqVar.f51712i0, sparseIntArray);
        g(22, rqVar.f51714j0, sparseIntArray);
        int i7 = 23;
        g(23, rqVar.f51716k0, sparseIntArray);
        if (rqVar.f51743x) {
            i7 = 24;
            g(24, rqVar.f51718l0, sparseIntArray);
        }
        g(i7 + 1, rqVar.f51708g0, sparseIntArray);
        g(i7 + 2, rqVar.B0, sparseIntArray);
        g(i7 + 3, rqVar.T0, sparseIntArray);
        g(i7 + 4, rqVar.W0, sparseIntArray);
        g(i7 + 5, rqVar.Z0, sparseIntArray);
        g(i7 + 6, rqVar.N0, sparseIntArray);
        g(i7 + 7, rqVar.O0, sparseIntArray);
        g(i7 + 8, rqVar.P0, sparseIntArray);
        g(i7 + 9, rqVar.Q0, sparseIntArray);
        g(i7 + 10, rqVar.S0, sparseIntArray);
        g(i7 + 11, rqVar.R0, sparseIntArray);
        g(i7 + 12, rqVar.f51693a1, sparseIntArray);
        g(i7 + 13, rqVar.f51707f1, sparseIntArray);
        g(i7 + 14, rqVar.f51709g1, sparseIntArray);
        g(i7 + 15, rqVar.f51711h1, sparseIntArray);
        g(i7 + 16, rqVar.f51713i1, sparseIntArray);
        g(i7 + 17, rqVar.f51715j1, sparseIntArray);
        g(i7 + 18, rqVar.f51721n0, sparseIntArray);
        g(i7 + 19, rqVar.f51722o0, sparseIntArray);
        g(i7 + 20, rqVar.f51724p0, sparseIntArray);
        g(i7 + 21, rqVar.f51726q0, sparseIntArray);
        g(i7 + 22, rqVar.f51729r0, sparseIntArray);
    }
}
