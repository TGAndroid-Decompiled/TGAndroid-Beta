package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class dr extends s4.o {
    public int f36706b;
    public int e;
    public int f36708f;
    public int f36709g;
    public int h;
    public int f36710i;
    public int f36711j;
    public final jr f36715n;
    public final SparseIntArray f36707c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f36712k = new ArrayList();
    public final ArrayList f36713l = new ArrayList();
    public final ArrayList f36714m = new ArrayList();

    public dr(jr jrVar) {
        this.f36715n = jrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f36715n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f36710i;
        jr jrVar = this.f36715n;
        if (i10 >= i12 && i10 < this.f36711j && i11 >= jrVar.X0 && i11 < jrVar.Y0) {
            return ((TLObject) this.f36713l.get(i10 - i12)).equals(jrVar.G.get(i11 - jrVar.X0));
        }
        int i13 = this.f36709g;
        if (i10 >= i13 && i10 < this.h && i11 >= jrVar.U0 && i11 < jrVar.V0) {
            return ((TLObject) this.f36714m.get(i10 - i13)).equals(jrVar.H.get(i11 - jrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f36708f && i11 >= jrVar.E0 && i11 < jrVar.F0) {
            return ((TLObject) this.f36712k.get(i10 - i14)).equals(jrVar.F.get(i11 - jrVar.E0));
        }
        if (this.f36707c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36715n.f38626d1;
    }

    @Override
    public final int e() {
        return this.f36706b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jr jrVar = this.f36715n;
        g(1, jrVar.f38663v0, sparseIntArray);
        g(2, jrVar.f38674z0, sparseIntArray);
        g(3, jrVar.A0, sparseIntArray);
        g(4, jrVar.C0, sparseIntArray);
        g(5, jrVar.D0, sparseIntArray);
        g(6, jrVar.G0, sparseIntArray);
        g(7, jrVar.H0, sparseIntArray);
        g(8, jrVar.f38657s0, sparseIntArray);
        g(9, jrVar.f38659t0, sparseIntArray);
        g(10, jrVar.f38661u0, sparseIntArray);
        g(11, jrVar.f38621b1, sparseIntArray);
        g(12, jrVar.f38624c1, sparseIntArray);
        g(13, jrVar.S, sparseIntArray);
        g(14, jrVar.T, sparseIntArray);
        g(15, jrVar.U, sparseIntArray);
        g(16, jrVar.f38627e0, sparseIntArray);
        g(17, jrVar.f38625d0, sparseIntArray);
        g(18, jrVar.f38630f0, sparseIntArray);
        g(19, jrVar.f38634h0, sparseIntArray);
        g(20, jrVar.m0, sparseIntArray);
        g(21, jrVar.f38636i0, sparseIntArray);
        g(22, jrVar.f38638j0, sparseIntArray);
        int i10 = 23;
        g(23, jrVar.f38640k0, sparseIntArray);
        if (jrVar.f38668x) {
            i10 = 24;
            g(24, jrVar.f38642l0, sparseIntArray);
        }
        g(i10 + 1, jrVar.f38632g0, sparseIntArray);
        g(i10 + 2, jrVar.B0, sparseIntArray);
        g(i10 + 3, jrVar.T0, sparseIntArray);
        g(i10 + 4, jrVar.W0, sparseIntArray);
        g(i10 + 5, jrVar.Z0, sparseIntArray);
        g(i10 + 6, jrVar.N0, sparseIntArray);
        g(i10 + 7, jrVar.O0, sparseIntArray);
        g(i10 + 8, jrVar.P0, sparseIntArray);
        g(i10 + 9, jrVar.Q0, sparseIntArray);
        g(i10 + 10, jrVar.S0, sparseIntArray);
        g(i10 + 11, jrVar.R0, sparseIntArray);
        g(i10 + 12, jrVar.f38618a1, sparseIntArray);
        g(i10 + 13, jrVar.f38631f1, sparseIntArray);
        g(i10 + 14, jrVar.f38633g1, sparseIntArray);
        g(i10 + 15, jrVar.f38635h1, sparseIntArray);
        g(i10 + 16, jrVar.f38637i1, sparseIntArray);
        g(i10 + 17, jrVar.f38639j1, sparseIntArray);
        g(i10 + 18, jrVar.f38645n0, sparseIntArray);
        g(i10 + 19, jrVar.f38647o0, sparseIntArray);
        g(i10 + 20, jrVar.f38649p0, sparseIntArray);
        g(i10 + 21, jrVar.f38651q0, sparseIntArray);
        g(i10 + 22, jrVar.f38654r0, sparseIntArray);
    }
}
