package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class jr extends s4.o {
    public int f34840b;
    public int e;
    public int f34842f;
    public int f34843g;
    public int h;
    public int f34844i;
    public int f34845j;
    public final pr f34849n;
    public final SparseIntArray f34841c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f34846k = new ArrayList();
    public final ArrayList f34847l = new ArrayList();
    public final ArrayList f34848m = new ArrayList();

    public jr(pr prVar) {
        this.f34849n = prVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f34849n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f34844i;
        pr prVar = this.f34849n;
        if (i10 >= i12 && i10 < this.f34845j && i11 >= prVar.X0 && i11 < prVar.Y0) {
            return ((TLObject) this.f34847l.get(i10 - i12)).equals(prVar.G.get(i11 - prVar.X0));
        }
        int i13 = this.f34843g;
        if (i10 >= i13 && i10 < this.h && i11 >= prVar.U0 && i11 < prVar.V0) {
            return ((TLObject) this.f34848m.get(i10 - i13)).equals(prVar.H.get(i11 - prVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f34842f && i11 >= prVar.E0 && i11 < prVar.F0) {
            return ((TLObject) this.f34846k.get(i10 - i14)).equals(prVar.F.get(i11 - prVar.E0));
        }
        if (this.f34841c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34849n.f36608d1;
    }

    @Override
    public final int e() {
        return this.f34840b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        pr prVar = this.f34849n;
        g(1, prVar.f36645v0, sparseIntArray);
        g(2, prVar.f36656z0, sparseIntArray);
        g(3, prVar.A0, sparseIntArray);
        g(4, prVar.C0, sparseIntArray);
        g(5, prVar.D0, sparseIntArray);
        g(6, prVar.G0, sparseIntArray);
        g(7, prVar.H0, sparseIntArray);
        g(8, prVar.f36639s0, sparseIntArray);
        g(9, prVar.f36641t0, sparseIntArray);
        g(10, prVar.f36643u0, sparseIntArray);
        g(11, prVar.f36603b1, sparseIntArray);
        g(12, prVar.f36606c1, sparseIntArray);
        g(13, prVar.S, sparseIntArray);
        g(14, prVar.T, sparseIntArray);
        g(15, prVar.U, sparseIntArray);
        g(16, prVar.f36609e0, sparseIntArray);
        g(17, prVar.f36607d0, sparseIntArray);
        g(18, prVar.f36612f0, sparseIntArray);
        g(19, prVar.f36616h0, sparseIntArray);
        g(20, prVar.m0, sparseIntArray);
        g(21, prVar.f36618i0, sparseIntArray);
        g(22, prVar.f36620j0, sparseIntArray);
        int i10 = 23;
        g(23, prVar.f36622k0, sparseIntArray);
        if (prVar.f36650x) {
            i10 = 24;
            g(24, prVar.f36624l0, sparseIntArray);
        }
        g(i10 + 1, prVar.f36614g0, sparseIntArray);
        g(i10 + 2, prVar.B0, sparseIntArray);
        g(i10 + 3, prVar.T0, sparseIntArray);
        g(i10 + 4, prVar.W0, sparseIntArray);
        g(i10 + 5, prVar.Z0, sparseIntArray);
        g(i10 + 6, prVar.N0, sparseIntArray);
        g(i10 + 7, prVar.O0, sparseIntArray);
        g(i10 + 8, prVar.P0, sparseIntArray);
        g(i10 + 9, prVar.Q0, sparseIntArray);
        g(i10 + 10, prVar.S0, sparseIntArray);
        g(i10 + 11, prVar.R0, sparseIntArray);
        g(i10 + 12, prVar.f36600a1, sparseIntArray);
        g(i10 + 13, prVar.f36613f1, sparseIntArray);
        g(i10 + 14, prVar.f36615g1, sparseIntArray);
        g(i10 + 15, prVar.f36617h1, sparseIntArray);
        g(i10 + 16, prVar.f36619i1, sparseIntArray);
        g(i10 + 17, prVar.f36621j1, sparseIntArray);
        g(i10 + 18, prVar.f36627n0, sparseIntArray);
        g(i10 + 19, prVar.f36629o0, sparseIntArray);
        g(i10 + 20, prVar.f36631p0, sparseIntArray);
        g(i10 + 21, prVar.f36633q0, sparseIntArray);
        g(i10 + 22, prVar.f36636r0, sparseIntArray);
    }
}
