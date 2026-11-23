package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class lq extends v4.o {
    public int f49653b;
    public int f49655e;
    public int f49656f;
    public int f49657g;
    public int h;
    public int f49658i;
    public int f49659j;
    public final rq f49663n;
    public final SparseIntArray f49654c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f49660k = new ArrayList();
    public final ArrayList f49661l = new ArrayList();
    public final ArrayList f49662m = new ArrayList();

    public lq(rq rqVar) {
        this.f49663n = rqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f49663n.D0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f49658i;
        rq rqVar = this.f49663n;
        if (i7 >= i11 && i7 < this.f49659j && i10 >= rqVar.X0 && i10 < rqVar.Y0) {
            return ((TLObject) this.f49661l.get(i7 - i11)).equals(rqVar.G.get(i10 - rqVar.X0));
        }
        int i12 = this.f49657g;
        if (i7 >= i12 && i7 < this.h && i10 >= rqVar.U0 && i10 < rqVar.V0) {
            return ((TLObject) this.f49662m.get(i7 - i12)).equals(rqVar.H.get(i10 - rqVar.U0));
        }
        int i13 = this.f49655e;
        if (i7 >= i13 && i7 < this.f49656f && i10 >= rqVar.E0 && i10 < rqVar.F0) {
            return ((TLObject) this.f49660k.get(i7 - i13)).equals(rqVar.F.get(i10 - rqVar.E0));
        }
        if (this.f49654c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f49663n.f51735d1;
    }

    @Override
    public final int e() {
        return this.f49653b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rq rqVar = this.f49663n;
        g(1, rqVar.f51772v0, sparseIntArray);
        g(2, rqVar.f51783z0, sparseIntArray);
        g(3, rqVar.A0, sparseIntArray);
        g(4, rqVar.C0, sparseIntArray);
        g(5, rqVar.D0, sparseIntArray);
        g(6, rqVar.G0, sparseIntArray);
        g(7, rqVar.H0, sparseIntArray);
        g(8, rqVar.f51766s0, sparseIntArray);
        g(9, rqVar.f51768t0, sparseIntArray);
        g(10, rqVar.f51770u0, sparseIntArray);
        g(11, rqVar.f51730b1, sparseIntArray);
        g(12, rqVar.f51733c1, sparseIntArray);
        g(13, rqVar.S, sparseIntArray);
        g(14, rqVar.T, sparseIntArray);
        g(15, rqVar.U, sparseIntArray);
        g(16, rqVar.f51737e0, sparseIntArray);
        g(17, rqVar.f51734d0, sparseIntArray);
        g(18, rqVar.f51740f0, sparseIntArray);
        g(19, rqVar.f51744h0, sparseIntArray);
        g(20, rqVar.m0, sparseIntArray);
        g(21, rqVar.f51746i0, sparseIntArray);
        g(22, rqVar.f51748j0, sparseIntArray);
        int i7 = 23;
        g(23, rqVar.f51750k0, sparseIntArray);
        if (rqVar.f51777x) {
            i7 = 24;
            g(24, rqVar.f51752l0, sparseIntArray);
        }
        g(i7 + 1, rqVar.f51742g0, sparseIntArray);
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
        g(i7 + 12, rqVar.f51727a1, sparseIntArray);
        g(i7 + 13, rqVar.f51741f1, sparseIntArray);
        g(i7 + 14, rqVar.f51743g1, sparseIntArray);
        g(i7 + 15, rqVar.f51745h1, sparseIntArray);
        g(i7 + 16, rqVar.f51747i1, sparseIntArray);
        g(i7 + 17, rqVar.f51749j1, sparseIntArray);
        g(i7 + 18, rqVar.f51755n0, sparseIntArray);
        g(i7 + 19, rqVar.f51756o0, sparseIntArray);
        g(i7 + 20, rqVar.f51758p0, sparseIntArray);
        g(i7 + 21, rqVar.f51760q0, sparseIntArray);
        g(i7 + 22, rqVar.f51763r0, sparseIntArray);
    }
}
