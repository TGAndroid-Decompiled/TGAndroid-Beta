package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class mr extends s4.o {
    public int f40009b;
    public int f40011e;
    public int f40012f;
    public int f40013g;
    public int h;
    public int f40014i;
    public int f40015j;
    public final tr f40019n;
    public final SparseIntArray f40010c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f40016k = new ArrayList();
    public final ArrayList f40017l = new ArrayList();
    public final ArrayList f40018m = new ArrayList();

    public mr(tr trVar) {
        this.f40019n = trVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f40019n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f40014i;
        tr trVar = this.f40019n;
        if (i10 >= i12 && i10 < this.f40015j && i11 >= trVar.X0 && i11 < trVar.Y0) {
            return ((TLObject) this.f40017l.get(i10 - i12)).equals(trVar.G.get(i11 - trVar.X0));
        }
        int i13 = this.f40013g;
        if (i10 >= i13 && i10 < this.h && i11 >= trVar.U0 && i11 < trVar.V0) {
            return ((TLObject) this.f40018m.get(i10 - i13)).equals(trVar.H.get(i11 - trVar.U0));
        }
        int i14 = this.f40011e;
        if (i10 >= i14 && i10 < this.f40012f && i11 >= trVar.E0 && i11 < trVar.F0) {
            return ((TLObject) this.f40016k.get(i10 - i14)).equals(trVar.F.get(i11 - trVar.E0));
        }
        if (this.f40010c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f40019n.f42106d1;
    }

    @Override
    public final int e() {
        return this.f40009b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        tr trVar = this.f40019n;
        g(1, trVar.f42144v0, sparseIntArray);
        g(2, trVar.f42155z0, sparseIntArray);
        g(3, trVar.A0, sparseIntArray);
        g(4, trVar.C0, sparseIntArray);
        g(5, trVar.D0, sparseIntArray);
        g(6, trVar.G0, sparseIntArray);
        g(7, trVar.H0, sparseIntArray);
        g(8, trVar.f42138s0, sparseIntArray);
        g(9, trVar.f42140t0, sparseIntArray);
        g(10, trVar.f42142u0, sparseIntArray);
        g(11, trVar.f42101b1, sparseIntArray);
        g(12, trVar.f42104c1, sparseIntArray);
        g(13, trVar.S, sparseIntArray);
        g(14, trVar.T, sparseIntArray);
        g(15, trVar.U, sparseIntArray);
        g(16, trVar.f42108e0, sparseIntArray);
        g(17, trVar.f42105d0, sparseIntArray);
        g(18, trVar.f42111f0, sparseIntArray);
        g(19, trVar.f42115h0, sparseIntArray);
        g(20, trVar.m0, sparseIntArray);
        g(21, trVar.f42117i0, sparseIntArray);
        g(22, trVar.f42119j0, sparseIntArray);
        int i10 = 23;
        g(23, trVar.f42121k0, sparseIntArray);
        if (trVar.f42149x) {
            i10 = 24;
            g(24, trVar.f42123l0, sparseIntArray);
        }
        g(i10 + 1, trVar.f42113g0, sparseIntArray);
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
        g(i10 + 12, trVar.f42098a1, sparseIntArray);
        g(i10 + 13, trVar.f42112f1, sparseIntArray);
        g(i10 + 14, trVar.f42114g1, sparseIntArray);
        g(i10 + 15, trVar.f42116h1, sparseIntArray);
        g(i10 + 16, trVar.f42118i1, sparseIntArray);
        g(i10 + 17, trVar.f42120j1, sparseIntArray);
        g(i10 + 18, trVar.f42126n0, sparseIntArray);
        g(i10 + 19, trVar.f42128o0, sparseIntArray);
        g(i10 + 20, trVar.f42130p0, sparseIntArray);
        g(i10 + 21, trVar.f42132q0, sparseIntArray);
        g(i10 + 22, trVar.f42135r0, sparseIntArray);
    }
}
