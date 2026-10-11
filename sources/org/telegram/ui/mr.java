package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class mr extends s4.o {
    public int f40056b;
    public int f40058e;
    public int f40059f;
    public int f40060g;
    public int h;
    public int f40061i;
    public int f40062j;
    public final sr f40066n;
    public final SparseIntArray f40057c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f40063k = new ArrayList();
    public final ArrayList f40064l = new ArrayList();
    public final ArrayList f40065m = new ArrayList();

    public mr(sr srVar) {
        this.f40066n = srVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f40066n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f40061i;
        sr srVar = this.f40066n;
        if (i10 >= i12 && i10 < this.f40062j && i11 >= srVar.X0 && i11 < srVar.Y0) {
            return ((TLObject) this.f40064l.get(i10 - i12)).equals(srVar.G.get(i11 - srVar.X0));
        }
        int i13 = this.f40060g;
        if (i10 >= i13 && i10 < this.h && i11 >= srVar.U0 && i11 < srVar.V0) {
            return ((TLObject) this.f40065m.get(i10 - i13)).equals(srVar.H.get(i11 - srVar.U0));
        }
        int i14 = this.f40058e;
        if (i10 >= i14 && i10 < this.f40059f && i11 >= srVar.E0 && i11 < srVar.F0) {
            return ((TLObject) this.f40063k.get(i10 - i14)).equals(srVar.F.get(i11 - srVar.E0));
        }
        if (this.f40057c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f40066n.f41794d1;
    }

    @Override
    public final int e() {
        return this.f40056b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        sr srVar = this.f40066n;
        g(1, srVar.f41832v0, sparseIntArray);
        g(2, srVar.f41843z0, sparseIntArray);
        g(3, srVar.A0, sparseIntArray);
        g(4, srVar.C0, sparseIntArray);
        g(5, srVar.D0, sparseIntArray);
        g(6, srVar.G0, sparseIntArray);
        g(7, srVar.H0, sparseIntArray);
        g(8, srVar.f41826s0, sparseIntArray);
        g(9, srVar.f41828t0, sparseIntArray);
        g(10, srVar.f41830u0, sparseIntArray);
        g(11, srVar.f41789b1, sparseIntArray);
        g(12, srVar.f41792c1, sparseIntArray);
        g(13, srVar.S, sparseIntArray);
        g(14, srVar.T, sparseIntArray);
        g(15, srVar.U, sparseIntArray);
        g(16, srVar.f41796e0, sparseIntArray);
        g(17, srVar.f41793d0, sparseIntArray);
        g(18, srVar.f41799f0, sparseIntArray);
        g(19, srVar.f41803h0, sparseIntArray);
        g(20, srVar.m0, sparseIntArray);
        g(21, srVar.f41805i0, sparseIntArray);
        g(22, srVar.f41807j0, sparseIntArray);
        int i10 = 23;
        g(23, srVar.f41809k0, sparseIntArray);
        if (srVar.f41837x) {
            i10 = 24;
            g(24, srVar.f41811l0, sparseIntArray);
        }
        g(i10 + 1, srVar.f41801g0, sparseIntArray);
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
        g(i10 + 12, srVar.f41786a1, sparseIntArray);
        g(i10 + 13, srVar.f41800f1, sparseIntArray);
        g(i10 + 14, srVar.f41802g1, sparseIntArray);
        g(i10 + 15, srVar.f41804h1, sparseIntArray);
        g(i10 + 16, srVar.f41806i1, sparseIntArray);
        g(i10 + 17, srVar.f41808j1, sparseIntArray);
        g(i10 + 18, srVar.f41814n0, sparseIntArray);
        g(i10 + 19, srVar.f41816o0, sparseIntArray);
        g(i10 + 20, srVar.f41818p0, sparseIntArray);
        g(i10 + 21, srVar.f41820q0, sparseIntArray);
        g(i10 + 22, srVar.f41823r0, sparseIntArray);
    }
}
