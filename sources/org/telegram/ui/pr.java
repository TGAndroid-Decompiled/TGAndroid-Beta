package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class pr extends s4.o {
    public int f39618b;
    public int f39620e;
    public int f39621f;
    public int f39622g;
    public int h;
    public int f39623i;
    public int f39624j;
    public final vr f39628n;
    public final SparseIntArray f39619c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39625k = new ArrayList();
    public final ArrayList f39626l = new ArrayList();
    public final ArrayList f39627m = new ArrayList();

    public pr(vr vrVar) {
        this.f39628n = vrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f39628n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f39623i;
        vr vrVar = this.f39628n;
        if (i10 >= i12 && i10 < this.f39624j && i11 >= vrVar.X0 && i11 < vrVar.Y0) {
            return ((TLObject) this.f39626l.get(i10 - i12)).equals(vrVar.G.get(i11 - vrVar.X0));
        }
        int i13 = this.f39622g;
        if (i10 >= i13 && i10 < this.h && i11 >= vrVar.U0 && i11 < vrVar.V0) {
            return ((TLObject) this.f39627m.get(i10 - i13)).equals(vrVar.H.get(i11 - vrVar.U0));
        }
        int i14 = this.f39620e;
        if (i10 >= i14 && i10 < this.f39621f && i11 >= vrVar.E0 && i11 < vrVar.F0) {
            return ((TLObject) this.f39625k.get(i10 - i14)).equals(vrVar.F.get(i11 - vrVar.E0));
        }
        if (this.f39619c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39628n.f41639d1;
    }

    @Override
    public final int e() {
        return this.f39618b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        vr vrVar = this.f39628n;
        g(1, vrVar.f41677v0, sparseIntArray);
        g(2, vrVar.f41688z0, sparseIntArray);
        g(3, vrVar.A0, sparseIntArray);
        g(4, vrVar.C0, sparseIntArray);
        g(5, vrVar.D0, sparseIntArray);
        g(6, vrVar.G0, sparseIntArray);
        g(7, vrVar.H0, sparseIntArray);
        g(8, vrVar.f41671s0, sparseIntArray);
        g(9, vrVar.f41673t0, sparseIntArray);
        g(10, vrVar.f41675u0, sparseIntArray);
        g(11, vrVar.f41634b1, sparseIntArray);
        g(12, vrVar.f41637c1, sparseIntArray);
        g(13, vrVar.S, sparseIntArray);
        g(14, vrVar.T, sparseIntArray);
        g(15, vrVar.U, sparseIntArray);
        g(16, vrVar.f41641e0, sparseIntArray);
        g(17, vrVar.f41638d0, sparseIntArray);
        g(18, vrVar.f41644f0, sparseIntArray);
        g(19, vrVar.f41648h0, sparseIntArray);
        g(20, vrVar.m0, sparseIntArray);
        g(21, vrVar.f41650i0, sparseIntArray);
        g(22, vrVar.f41652j0, sparseIntArray);
        int i10 = 23;
        g(23, vrVar.f41654k0, sparseIntArray);
        if (vrVar.f41682x) {
            i10 = 24;
            g(24, vrVar.f41656l0, sparseIntArray);
        }
        g(i10 + 1, vrVar.f41646g0, sparseIntArray);
        g(i10 + 2, vrVar.B0, sparseIntArray);
        g(i10 + 3, vrVar.T0, sparseIntArray);
        g(i10 + 4, vrVar.W0, sparseIntArray);
        g(i10 + 5, vrVar.Z0, sparseIntArray);
        g(i10 + 6, vrVar.N0, sparseIntArray);
        g(i10 + 7, vrVar.O0, sparseIntArray);
        g(i10 + 8, vrVar.P0, sparseIntArray);
        g(i10 + 9, vrVar.Q0, sparseIntArray);
        g(i10 + 10, vrVar.S0, sparseIntArray);
        g(i10 + 11, vrVar.R0, sparseIntArray);
        g(i10 + 12, vrVar.f41631a1, sparseIntArray);
        g(i10 + 13, vrVar.f41645f1, sparseIntArray);
        g(i10 + 14, vrVar.f41647g1, sparseIntArray);
        g(i10 + 15, vrVar.f41649h1, sparseIntArray);
        g(i10 + 16, vrVar.f41651i1, sparseIntArray);
        g(i10 + 17, vrVar.f41653j1, sparseIntArray);
        g(i10 + 18, vrVar.f41659n0, sparseIntArray);
        g(i10 + 19, vrVar.f41661o0, sparseIntArray);
        g(i10 + 20, vrVar.f41663p0, sparseIntArray);
        g(i10 + 21, vrVar.f41665q0, sparseIntArray);
        g(i10 + 22, vrVar.f41668r0, sparseIntArray);
    }
}
