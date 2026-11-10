package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class lq extends v4.o {
    public int f47652b;
    public int f47654e;
    public int f47655f;
    public int f47656g;
    public int h;
    public int f47657i;
    public int f47658j;
    public final rq f47662n;
    public final SparseIntArray f47653c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f47659k = new ArrayList();
    public final ArrayList f47660l = new ArrayList();
    public final ArrayList f47661m = new ArrayList();

    public lq(rq rqVar) {
        this.f47662n = rqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f47662n.C0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f47657i;
        rq rqVar = this.f47662n;
        if (i7 >= i11 && i7 < this.f47658j && i10 >= rqVar.W0 && i10 < rqVar.X0) {
            return ((TLObject) this.f47660l.get(i7 - i11)).equals(rqVar.F.get(i10 - rqVar.W0));
        }
        int i12 = this.f47656g;
        if (i7 >= i12 && i7 < this.h && i10 >= rqVar.T0 && i10 < rqVar.U0) {
            return ((TLObject) this.f47661m.get(i7 - i12)).equals(rqVar.G.get(i10 - rqVar.T0));
        }
        int i13 = this.f47654e;
        if (i7 >= i13 && i7 < this.f47655f && i10 >= rqVar.D0 && i10 < rqVar.E0) {
            return ((TLObject) this.f47659k.get(i7 - i13)).equals(rqVar.E.get(i10 - rqVar.D0));
        }
        if (this.f47653c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f47662n.f49504c1;
    }

    @Override
    public final int e() {
        return this.f47652b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rq rqVar = this.f47662n;
        g(1, rqVar.f49541u0, sparseIntArray);
        g(2, rqVar.f49552y0, sparseIntArray);
        g(3, rqVar.f49554z0, sparseIntArray);
        g(4, rqVar.B0, sparseIntArray);
        g(5, rqVar.C0, sparseIntArray);
        g(6, rqVar.F0, sparseIntArray);
        g(7, rqVar.G0, sparseIntArray);
        g(8, rqVar.f49534r0, sparseIntArray);
        g(9, rqVar.f49537s0, sparseIntArray);
        g(10, rqVar.f49539t0, sparseIntArray);
        g(11, rqVar.f49498a1, sparseIntArray);
        g(12, rqVar.f49501b1, sparseIntArray);
        g(13, rqVar.R, sparseIntArray);
        g(14, rqVar.S, sparseIntArray);
        g(15, rqVar.T, sparseIntArray);
        g(16, rqVar.f49505d0, sparseIntArray);
        g(17, rqVar.f49503c0, sparseIntArray);
        g(18, rqVar.f49508e0, sparseIntArray);
        g(19, rqVar.f49513g0, sparseIntArray);
        g(20, rqVar.f49523l0, sparseIntArray);
        g(21, rqVar.f49515h0, sparseIntArray);
        g(22, rqVar.f49517i0, sparseIntArray);
        int i7 = 23;
        g(23, rqVar.f49519j0, sparseIntArray);
        if (rqVar.f49548x) {
            i7 = 24;
            g(24, rqVar.f49521k0, sparseIntArray);
        }
        g(i7 + 1, rqVar.f49511f0, sparseIntArray);
        g(i7 + 2, rqVar.A0, sparseIntArray);
        g(i7 + 3, rqVar.S0, sparseIntArray);
        g(i7 + 4, rqVar.V0, sparseIntArray);
        g(i7 + 5, rqVar.Y0, sparseIntArray);
        g(i7 + 6, rqVar.M0, sparseIntArray);
        g(i7 + 7, rqVar.N0, sparseIntArray);
        g(i7 + 8, rqVar.O0, sparseIntArray);
        g(i7 + 9, rqVar.P0, sparseIntArray);
        g(i7 + 10, rqVar.R0, sparseIntArray);
        g(i7 + 11, rqVar.Q0, sparseIntArray);
        g(i7 + 12, rqVar.Z0, sparseIntArray);
        g(i7 + 13, rqVar.f49509e1, sparseIntArray);
        g(i7 + 14, rqVar.f49512f1, sparseIntArray);
        g(i7 + 15, rqVar.f49514g1, sparseIntArray);
        g(i7 + 16, rqVar.f49516h1, sparseIntArray);
        g(i7 + 17, rqVar.f49518i1, sparseIntArray);
        g(i7 + 18, rqVar.m0, sparseIntArray);
        g(i7 + 19, rqVar.f49526n0, sparseIntArray);
        g(i7 + 20, rqVar.f49527o0, sparseIntArray);
        g(i7 + 21, rqVar.f49529p0, sparseIntArray);
        g(i7 + 22, rqVar.f49531q0, sparseIntArray);
    }
}
