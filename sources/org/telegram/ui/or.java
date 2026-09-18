package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class or extends s4.o {
    public int f36408b;
    public int e;
    public int f36410f;
    public int f36411g;
    public int h;
    public int f36412i;
    public int f36413j;
    public final ur f36417n;
    public final SparseIntArray f36409c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f36414k = new ArrayList();
    public final ArrayList f36415l = new ArrayList();
    public final ArrayList f36416m = new ArrayList();

    public or(ur urVar) {
        this.f36417n = urVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f36417n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f36412i;
        ur urVar = this.f36417n;
        if (i10 >= i12 && i10 < this.f36413j && i11 >= urVar.X0 && i11 < urVar.Y0) {
            return ((TLObject) this.f36415l.get(i10 - i12)).equals(urVar.G.get(i11 - urVar.X0));
        }
        int i13 = this.f36411g;
        if (i10 >= i13 && i10 < this.h && i11 >= urVar.U0 && i11 < urVar.V0) {
            return ((TLObject) this.f36416m.get(i10 - i13)).equals(urVar.H.get(i11 - urVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f36410f && i11 >= urVar.E0 && i11 < urVar.F0) {
            return ((TLObject) this.f36414k.get(i10 - i14)).equals(urVar.F.get(i11 - urVar.E0));
        }
        if (this.f36409c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36417n.f38132d1;
    }

    @Override
    public final int e() {
        return this.f36408b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ur urVar = this.f36417n;
        g(1, urVar.f38169v0, sparseIntArray);
        g(2, urVar.f38180z0, sparseIntArray);
        g(3, urVar.A0, sparseIntArray);
        g(4, urVar.C0, sparseIntArray);
        g(5, urVar.D0, sparseIntArray);
        g(6, urVar.G0, sparseIntArray);
        g(7, urVar.H0, sparseIntArray);
        g(8, urVar.f38163s0, sparseIntArray);
        g(9, urVar.f38165t0, sparseIntArray);
        g(10, urVar.f38167u0, sparseIntArray);
        g(11, urVar.f38127b1, sparseIntArray);
        g(12, urVar.f38130c1, sparseIntArray);
        g(13, urVar.S, sparseIntArray);
        g(14, urVar.T, sparseIntArray);
        g(15, urVar.U, sparseIntArray);
        g(16, urVar.f38133e0, sparseIntArray);
        g(17, urVar.f38131d0, sparseIntArray);
        g(18, urVar.f38136f0, sparseIntArray);
        g(19, urVar.f38140h0, sparseIntArray);
        g(20, urVar.m0, sparseIntArray);
        g(21, urVar.f38142i0, sparseIntArray);
        g(22, urVar.f38144j0, sparseIntArray);
        int i10 = 23;
        g(23, urVar.f38146k0, sparseIntArray);
        if (urVar.f38174x) {
            i10 = 24;
            g(24, urVar.f38148l0, sparseIntArray);
        }
        g(i10 + 1, urVar.f38138g0, sparseIntArray);
        g(i10 + 2, urVar.B0, sparseIntArray);
        g(i10 + 3, urVar.T0, sparseIntArray);
        g(i10 + 4, urVar.W0, sparseIntArray);
        g(i10 + 5, urVar.Z0, sparseIntArray);
        g(i10 + 6, urVar.N0, sparseIntArray);
        g(i10 + 7, urVar.O0, sparseIntArray);
        g(i10 + 8, urVar.P0, sparseIntArray);
        g(i10 + 9, urVar.Q0, sparseIntArray);
        g(i10 + 10, urVar.S0, sparseIntArray);
        g(i10 + 11, urVar.R0, sparseIntArray);
        g(i10 + 12, urVar.f38124a1, sparseIntArray);
        g(i10 + 13, urVar.f38137f1, sparseIntArray);
        g(i10 + 14, urVar.f38139g1, sparseIntArray);
        g(i10 + 15, urVar.f38141h1, sparseIntArray);
        g(i10 + 16, urVar.f38143i1, sparseIntArray);
        g(i10 + 17, urVar.f38145j1, sparseIntArray);
        g(i10 + 18, urVar.f38151n0, sparseIntArray);
        g(i10 + 19, urVar.f38153o0, sparseIntArray);
        g(i10 + 20, urVar.f38155p0, sparseIntArray);
        g(i10 + 21, urVar.f38157q0, sparseIntArray);
        g(i10 + 22, urVar.f38160r0, sparseIntArray);
    }
}
