package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class lr extends s4.o {
    public int f38317b;
    public int f38319e;
    public int f38320f;
    public int f38321g;
    public int h;
    public int f38322i;
    public int f38323j;
    public final rr f38327n;
    public final SparseIntArray f38318c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f38324k = new ArrayList();
    public final ArrayList f38325l = new ArrayList();
    public final ArrayList f38326m = new ArrayList();

    public lr(rr rrVar) {
        this.f38327n = rrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f38327n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f38322i;
        rr rrVar = this.f38327n;
        if (i10 >= i12 && i10 < this.f38323j && i11 >= rrVar.X0 && i11 < rrVar.Y0) {
            return ((TLObject) this.f38325l.get(i10 - i12)).equals(rrVar.G.get(i11 - rrVar.X0));
        }
        int i13 = this.f38321g;
        if (i10 >= i13 && i10 < this.h && i11 >= rrVar.U0 && i11 < rrVar.V0) {
            return ((TLObject) this.f38326m.get(i10 - i13)).equals(rrVar.H.get(i11 - rrVar.U0));
        }
        int i14 = this.f38319e;
        if (i10 >= i14 && i10 < this.f38320f && i11 >= rrVar.E0 && i11 < rrVar.F0) {
            return ((TLObject) this.f38324k.get(i10 - i14)).equals(rrVar.F.get(i11 - rrVar.E0));
        }
        if (this.f38318c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38327n.f40193d1;
    }

    @Override
    public final int e() {
        return this.f38317b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rr rrVar = this.f38327n;
        g(1, rrVar.f40231v0, sparseIntArray);
        g(2, rrVar.f40242z0, sparseIntArray);
        g(3, rrVar.A0, sparseIntArray);
        g(4, rrVar.C0, sparseIntArray);
        g(5, rrVar.D0, sparseIntArray);
        g(6, rrVar.G0, sparseIntArray);
        g(7, rrVar.H0, sparseIntArray);
        g(8, rrVar.f40225s0, sparseIntArray);
        g(9, rrVar.f40227t0, sparseIntArray);
        g(10, rrVar.f40229u0, sparseIntArray);
        g(11, rrVar.f40188b1, sparseIntArray);
        g(12, rrVar.f40191c1, sparseIntArray);
        g(13, rrVar.S, sparseIntArray);
        g(14, rrVar.T, sparseIntArray);
        g(15, rrVar.U, sparseIntArray);
        g(16, rrVar.f40195e0, sparseIntArray);
        g(17, rrVar.f40192d0, sparseIntArray);
        g(18, rrVar.f40198f0, sparseIntArray);
        g(19, rrVar.f40202h0, sparseIntArray);
        g(20, rrVar.m0, sparseIntArray);
        g(21, rrVar.f40204i0, sparseIntArray);
        g(22, rrVar.f40206j0, sparseIntArray);
        int i10 = 23;
        g(23, rrVar.f40208k0, sparseIntArray);
        if (rrVar.f40236x) {
            i10 = 24;
            g(24, rrVar.f40210l0, sparseIntArray);
        }
        g(i10 + 1, rrVar.f40200g0, sparseIntArray);
        g(i10 + 2, rrVar.B0, sparseIntArray);
        g(i10 + 3, rrVar.T0, sparseIntArray);
        g(i10 + 4, rrVar.W0, sparseIntArray);
        g(i10 + 5, rrVar.Z0, sparseIntArray);
        g(i10 + 6, rrVar.N0, sparseIntArray);
        g(i10 + 7, rrVar.O0, sparseIntArray);
        g(i10 + 8, rrVar.P0, sparseIntArray);
        g(i10 + 9, rrVar.Q0, sparseIntArray);
        g(i10 + 10, rrVar.S0, sparseIntArray);
        g(i10 + 11, rrVar.R0, sparseIntArray);
        g(i10 + 12, rrVar.f40185a1, sparseIntArray);
        g(i10 + 13, rrVar.f40199f1, sparseIntArray);
        g(i10 + 14, rrVar.f40201g1, sparseIntArray);
        g(i10 + 15, rrVar.f40203h1, sparseIntArray);
        g(i10 + 16, rrVar.f40205i1, sparseIntArray);
        g(i10 + 17, rrVar.f40207j1, sparseIntArray);
        g(i10 + 18, rrVar.f40213n0, sparseIntArray);
        g(i10 + 19, rrVar.f40215o0, sparseIntArray);
        g(i10 + 20, rrVar.f40217p0, sparseIntArray);
        g(i10 + 21, rrVar.f40219q0, sparseIntArray);
        g(i10 + 22, rrVar.f40222r0, sparseIntArray);
    }
}
