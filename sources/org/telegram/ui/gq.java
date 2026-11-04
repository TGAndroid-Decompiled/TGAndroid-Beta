package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class gq extends u4.o {
    public int f45691b;
    public int f45693e;
    public int f45694f;
    public int f45695g;
    public int h;
    public int f45696i;
    public int f45697j;
    public final nq f45701n;
    public final SparseIntArray f45692c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f45698k = new ArrayList();
    public final ArrayList f45699l = new ArrayList();
    public final ArrayList f45700m = new ArrayList();

    public gq(nq nqVar) {
        this.f45701n = nqVar;
    }

    public static void g(int i3, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i3);
        }
    }

    @Override
    public final boolean a(int i3, int i10) {
        if (!b(i3, i10) || this.f45701n.D0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i3, int i10) {
        int i11 = this.f45696i;
        nq nqVar = this.f45701n;
        if (i3 >= i11 && i3 < this.f45697j && i10 >= nqVar.X0 && i10 < nqVar.Y0) {
            return ((TLObject) this.f45699l.get(i3 - i11)).equals(nqVar.G.get(i10 - nqVar.X0));
        }
        int i12 = this.f45695g;
        if (i3 >= i12 && i3 < this.h && i10 >= nqVar.U0 && i10 < nqVar.V0) {
            return ((TLObject) this.f45700m.get(i3 - i12)).equals(nqVar.H.get(i10 - nqVar.U0));
        }
        int i13 = this.f45693e;
        if (i3 >= i13 && i3 < this.f45694f && i10 >= nqVar.E0 && i10 < nqVar.F0) {
            return ((TLObject) this.f45698k.get(i3 - i13)).equals(nqVar.F.get(i10 - nqVar.E0));
        }
        if (this.f45692c.get(i3) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f45701n.f48056d1;
    }

    @Override
    public final int e() {
        return this.f45691b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        nq nqVar = this.f45701n;
        g(1, nqVar.f48093v0, sparseIntArray);
        g(2, nqVar.f48104z0, sparseIntArray);
        g(3, nqVar.A0, sparseIntArray);
        g(4, nqVar.C0, sparseIntArray);
        g(5, nqVar.D0, sparseIntArray);
        g(6, nqVar.G0, sparseIntArray);
        g(7, nqVar.H0, sparseIntArray);
        g(8, nqVar.f48087s0, sparseIntArray);
        g(9, nqVar.f48089t0, sparseIntArray);
        g(10, nqVar.f48091u0, sparseIntArray);
        g(11, nqVar.f48051b1, sparseIntArray);
        g(12, nqVar.f48054c1, sparseIntArray);
        g(13, nqVar.S, sparseIntArray);
        g(14, nqVar.T, sparseIntArray);
        g(15, nqVar.U, sparseIntArray);
        g(16, nqVar.f48058e0, sparseIntArray);
        g(17, nqVar.f48055d0, sparseIntArray);
        g(18, nqVar.f48061f0, sparseIntArray);
        g(19, nqVar.f48065h0, sparseIntArray);
        g(20, nqVar.m0, sparseIntArray);
        g(21, nqVar.f48067i0, sparseIntArray);
        g(22, nqVar.f48069j0, sparseIntArray);
        int i3 = 23;
        g(23, nqVar.f48071k0, sparseIntArray);
        if (nqVar.f48098x) {
            i3 = 24;
            g(24, nqVar.f48072l0, sparseIntArray);
        }
        g(i3 + 1, nqVar.f48063g0, sparseIntArray);
        g(i3 + 2, nqVar.B0, sparseIntArray);
        g(i3 + 3, nqVar.T0, sparseIntArray);
        g(i3 + 4, nqVar.W0, sparseIntArray);
        g(i3 + 5, nqVar.Z0, sparseIntArray);
        g(i3 + 6, nqVar.N0, sparseIntArray);
        g(i3 + 7, nqVar.O0, sparseIntArray);
        g(i3 + 8, nqVar.P0, sparseIntArray);
        g(i3 + 9, nqVar.Q0, sparseIntArray);
        g(i3 + 10, nqVar.S0, sparseIntArray);
        g(i3 + 11, nqVar.R0, sparseIntArray);
        g(i3 + 12, nqVar.f48048a1, sparseIntArray);
        g(i3 + 13, nqVar.f48062f1, sparseIntArray);
        g(i3 + 14, nqVar.f48064g1, sparseIntArray);
        g(i3 + 15, nqVar.f48066h1, sparseIntArray);
        g(i3 + 16, nqVar.f48068i1, sparseIntArray);
        g(i3 + 17, nqVar.f48070j1, sparseIntArray);
        g(i3 + 18, nqVar.f48075n0, sparseIntArray);
        g(i3 + 19, nqVar.f48077o0, sparseIntArray);
        g(i3 + 20, nqVar.f48079p0, sparseIntArray);
        g(i3 + 21, nqVar.f48081q0, sparseIntArray);
        g(i3 + 22, nqVar.f48084r0, sparseIntArray);
    }
}
