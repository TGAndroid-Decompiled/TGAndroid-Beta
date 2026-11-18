package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class lq extends v4.o {
    public int f49664b;
    public int f49666e;
    public int f49667f;
    public int f49668g;
    public int h;
    public int f49669i;
    public int f49670j;
    public final rq f49674n;
    public final SparseIntArray f49665c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f49671k = new ArrayList();
    public final ArrayList f49672l = new ArrayList();
    public final ArrayList f49673m = new ArrayList();

    public lq(rq rqVar) {
        this.f49674n = rqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f49674n.D0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f49669i;
        rq rqVar = this.f49674n;
        if (i7 >= i11 && i7 < this.f49670j && i10 >= rqVar.X0 && i10 < rqVar.Y0) {
            return ((TLObject) this.f49672l.get(i7 - i11)).equals(rqVar.G.get(i10 - rqVar.X0));
        }
        int i12 = this.f49668g;
        if (i7 >= i12 && i7 < this.h && i10 >= rqVar.U0 && i10 < rqVar.V0) {
            return ((TLObject) this.f49673m.get(i7 - i12)).equals(rqVar.H.get(i10 - rqVar.U0));
        }
        int i13 = this.f49666e;
        if (i7 >= i13 && i7 < this.f49667f && i10 >= rqVar.E0 && i10 < rqVar.F0) {
            return ((TLObject) this.f49671k.get(i7 - i13)).equals(rqVar.F.get(i10 - rqVar.E0));
        }
        if (this.f49665c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f49674n.f51737d1;
    }

    @Override
    public final int e() {
        return this.f49664b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rq rqVar = this.f49674n;
        g(1, rqVar.f51774v0, sparseIntArray);
        g(2, rqVar.f51785z0, sparseIntArray);
        g(3, rqVar.A0, sparseIntArray);
        g(4, rqVar.C0, sparseIntArray);
        g(5, rqVar.D0, sparseIntArray);
        g(6, rqVar.G0, sparseIntArray);
        g(7, rqVar.H0, sparseIntArray);
        g(8, rqVar.f51768s0, sparseIntArray);
        g(9, rqVar.f51770t0, sparseIntArray);
        g(10, rqVar.f51772u0, sparseIntArray);
        g(11, rqVar.f51732b1, sparseIntArray);
        g(12, rqVar.f51735c1, sparseIntArray);
        g(13, rqVar.S, sparseIntArray);
        g(14, rqVar.T, sparseIntArray);
        g(15, rqVar.U, sparseIntArray);
        g(16, rqVar.f51739e0, sparseIntArray);
        g(17, rqVar.f51736d0, sparseIntArray);
        g(18, rqVar.f51742f0, sparseIntArray);
        g(19, rqVar.f51746h0, sparseIntArray);
        g(20, rqVar.m0, sparseIntArray);
        g(21, rqVar.f51748i0, sparseIntArray);
        g(22, rqVar.f51750j0, sparseIntArray);
        int i7 = 23;
        g(23, rqVar.f51752k0, sparseIntArray);
        if (rqVar.f51779x) {
            i7 = 24;
            g(24, rqVar.f51754l0, sparseIntArray);
        }
        g(i7 + 1, rqVar.f51744g0, sparseIntArray);
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
        g(i7 + 12, rqVar.f51729a1, sparseIntArray);
        g(i7 + 13, rqVar.f51743f1, sparseIntArray);
        g(i7 + 14, rqVar.f51745g1, sparseIntArray);
        g(i7 + 15, rqVar.f51747h1, sparseIntArray);
        g(i7 + 16, rqVar.f51749i1, sparseIntArray);
        g(i7 + 17, rqVar.f51751j1, sparseIntArray);
        g(i7 + 18, rqVar.f51757n0, sparseIntArray);
        g(i7 + 19, rqVar.f51758o0, sparseIntArray);
        g(i7 + 20, rqVar.f51760p0, sparseIntArray);
        g(i7 + 21, rqVar.f51762q0, sparseIntArray);
        g(i7 + 22, rqVar.f51765r0, sparseIntArray);
    }
}
