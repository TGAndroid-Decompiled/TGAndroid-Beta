package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class mr extends s4.o {
    public int f39965b;
    public int f39967e;
    public int f39968f;
    public int f39969g;
    public int h;
    public int f39970i;
    public int f39971j;
    public final tr f39975n;
    public final SparseIntArray f39966c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39972k = new ArrayList();
    public final ArrayList f39973l = new ArrayList();
    public final ArrayList f39974m = new ArrayList();

    public mr(tr trVar) {
        this.f39975n = trVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f39975n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f39970i;
        tr trVar = this.f39975n;
        if (i10 >= i12 && i10 < this.f39971j && i11 >= trVar.X0 && i11 < trVar.Y0) {
            return ((TLObject) this.f39973l.get(i10 - i12)).equals(trVar.G.get(i11 - trVar.X0));
        }
        int i13 = this.f39969g;
        if (i10 >= i13 && i10 < this.h && i11 >= trVar.U0 && i11 < trVar.V0) {
            return ((TLObject) this.f39974m.get(i10 - i13)).equals(trVar.H.get(i11 - trVar.U0));
        }
        int i14 = this.f39967e;
        if (i10 >= i14 && i10 < this.f39968f && i11 >= trVar.E0 && i11 < trVar.F0) {
            return ((TLObject) this.f39972k.get(i10 - i14)).equals(trVar.F.get(i11 - trVar.E0));
        }
        if (this.f39966c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39975n.f42062d1;
    }

    @Override
    public final int e() {
        return this.f39965b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        tr trVar = this.f39975n;
        g(1, trVar.f42100v0, sparseIntArray);
        g(2, trVar.f42111z0, sparseIntArray);
        g(3, trVar.A0, sparseIntArray);
        g(4, trVar.C0, sparseIntArray);
        g(5, trVar.D0, sparseIntArray);
        g(6, trVar.G0, sparseIntArray);
        g(7, trVar.H0, sparseIntArray);
        g(8, trVar.f42094s0, sparseIntArray);
        g(9, trVar.f42096t0, sparseIntArray);
        g(10, trVar.f42098u0, sparseIntArray);
        g(11, trVar.f42057b1, sparseIntArray);
        g(12, trVar.f42060c1, sparseIntArray);
        g(13, trVar.S, sparseIntArray);
        g(14, trVar.T, sparseIntArray);
        g(15, trVar.U, sparseIntArray);
        g(16, trVar.f42064e0, sparseIntArray);
        g(17, trVar.f42061d0, sparseIntArray);
        g(18, trVar.f42067f0, sparseIntArray);
        g(19, trVar.f42071h0, sparseIntArray);
        g(20, trVar.m0, sparseIntArray);
        g(21, trVar.f42073i0, sparseIntArray);
        g(22, trVar.f42075j0, sparseIntArray);
        int i10 = 23;
        g(23, trVar.f42077k0, sparseIntArray);
        if (trVar.f42105x) {
            i10 = 24;
            g(24, trVar.f42079l0, sparseIntArray);
        }
        g(i10 + 1, trVar.f42069g0, sparseIntArray);
        g(i10 + 2, trVar.B0, sparseIntArray);
        g(i10 + 3, trVar.T0, sparseIntArray);
        g(i10 + 4, trVar.W0, sparseIntArray);
        g(i10 + 5, trVar.Z0, sparseIntArray);
        g(i10 + 6, trVar.N0, sparseIntArray);
        g(i10 + 7, trVar.O0, sparseIntArray);
        g(i10 + 8, trVar.P0, sparseIntArray);
        g(i10 + 9, trVar.Q0, sparseIntArray);
        g(i10 + 10, trVar.S0, sparseIntArray);
        g(i10 + 11, trVar.R0, sparseIntArray);
        g(i10 + 12, trVar.f42054a1, sparseIntArray);
        g(i10 + 13, trVar.f42068f1, sparseIntArray);
        g(i10 + 14, trVar.f42070g1, sparseIntArray);
        g(i10 + 15, trVar.f42072h1, sparseIntArray);
        g(i10 + 16, trVar.f42074i1, sparseIntArray);
        g(i10 + 17, trVar.f42076j1, sparseIntArray);
        g(i10 + 18, trVar.f42082n0, sparseIntArray);
        g(i10 + 19, trVar.f42084o0, sparseIntArray);
        g(i10 + 20, trVar.f42086p0, sparseIntArray);
        g(i10 + 21, trVar.f42088q0, sparseIntArray);
        g(i10 + 22, trVar.f42091r0, sparseIntArray);
    }
}
