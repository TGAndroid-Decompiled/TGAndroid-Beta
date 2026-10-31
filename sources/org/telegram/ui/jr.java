package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class jr extends s4.n {
    public int f38567b;
    public int e;
    public int f38569f;
    public int f38570g;
    public int h;
    public int f38571i;
    public int f38572j;
    public final pr f38576n;
    public final SparseIntArray f38568c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f38573k = new ArrayList();
    public final ArrayList f38574l = new ArrayList();
    public final ArrayList f38575m = new ArrayList();

    public jr(pr prVar) {
        this.f38576n = prVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f38576n.C0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f38571i;
        pr prVar = this.f38576n;
        if (i10 >= i12 && i10 < this.f38572j && i11 >= prVar.W0 && i11 < prVar.X0) {
            return ((TLObject) this.f38574l.get(i10 - i12)).equals(prVar.F.get(i11 - prVar.W0));
        }
        int i13 = this.f38570g;
        if (i10 >= i13 && i10 < this.h && i11 >= prVar.T0 && i11 < prVar.U0) {
            return ((TLObject) this.f38575m.get(i10 - i13)).equals(prVar.G.get(i11 - prVar.T0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f38569f && i11 >= prVar.D0 && i11 < prVar.E0) {
            return ((TLObject) this.f38573k.get(i10 - i14)).equals(prVar.E.get(i11 - prVar.D0));
        }
        if (this.f38568c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38576n.f40726c1;
    }

    @Override
    public final int e() {
        return this.f38567b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        pr prVar = this.f38576n;
        g(1, prVar.f40763u0, sparseIntArray);
        g(2, prVar.f40774y0, sparseIntArray);
        g(3, prVar.f40776z0, sparseIntArray);
        g(4, prVar.B0, sparseIntArray);
        g(5, prVar.C0, sparseIntArray);
        g(6, prVar.F0, sparseIntArray);
        g(7, prVar.G0, sparseIntArray);
        g(8, prVar.f40756r0, sparseIntArray);
        g(9, prVar.f40759s0, sparseIntArray);
        g(10, prVar.f40761t0, sparseIntArray);
        g(11, prVar.f40720a1, sparseIntArray);
        g(12, prVar.f40723b1, sparseIntArray);
        g(13, prVar.R, sparseIntArray);
        g(14, prVar.S, sparseIntArray);
        g(15, prVar.T, sparseIntArray);
        g(16, prVar.f40727d0, sparseIntArray);
        g(17, prVar.f40725c0, sparseIntArray);
        g(18, prVar.f40729e0, sparseIntArray);
        g(19, prVar.f40734g0, sparseIntArray);
        g(20, prVar.f40744l0, sparseIntArray);
        g(21, prVar.f40736h0, sparseIntArray);
        g(22, prVar.f40738i0, sparseIntArray);
        int i10 = 23;
        g(23, prVar.f40740j0, sparseIntArray);
        if (prVar.f40770x) {
            i10 = 24;
            g(24, prVar.f40742k0, sparseIntArray);
        }
        g(i10 + 1, prVar.f40732f0, sparseIntArray);
        g(i10 + 2, prVar.A0, sparseIntArray);
        g(i10 + 3, prVar.S0, sparseIntArray);
        g(i10 + 4, prVar.V0, sparseIntArray);
        g(i10 + 5, prVar.Y0, sparseIntArray);
        g(i10 + 6, prVar.M0, sparseIntArray);
        g(i10 + 7, prVar.N0, sparseIntArray);
        g(i10 + 8, prVar.O0, sparseIntArray);
        g(i10 + 9, prVar.P0, sparseIntArray);
        g(i10 + 10, prVar.R0, sparseIntArray);
        g(i10 + 11, prVar.Q0, sparseIntArray);
        g(i10 + 12, prVar.Z0, sparseIntArray);
        g(i10 + 13, prVar.f40730e1, sparseIntArray);
        g(i10 + 14, prVar.f40733f1, sparseIntArray);
        g(i10 + 15, prVar.f40735g1, sparseIntArray);
        g(i10 + 16, prVar.f40737h1, sparseIntArray);
        g(i10 + 17, prVar.f40739i1, sparseIntArray);
        g(i10 + 18, prVar.m0, sparseIntArray);
        g(i10 + 19, prVar.f40747n0, sparseIntArray);
        g(i10 + 20, prVar.f40749o0, sparseIntArray);
        g(i10 + 21, prVar.f40751p0, sparseIntArray);
        g(i10 + 22, prVar.f40753q0, sparseIntArray);
    }
}
