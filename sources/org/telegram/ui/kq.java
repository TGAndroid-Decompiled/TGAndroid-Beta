package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class kq extends v4.o {
    public int f47328b;
    public int f47330e;
    public int f47331f;
    public int f47332g;
    public int h;
    public int f47333i;
    public int f47334j;
    public final qq f47338n;
    public final SparseIntArray f47329c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f47335k = new ArrayList();
    public final ArrayList f47336l = new ArrayList();
    public final ArrayList f47337m = new ArrayList();

    public kq(qq qqVar) {
        this.f47338n = qqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f47338n.C0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f47333i;
        qq qqVar = this.f47338n;
        if (i7 >= i11 && i7 < this.f47334j && i10 >= qqVar.W0 && i10 < qqVar.X0) {
            return ((TLObject) this.f47336l.get(i7 - i11)).equals(qqVar.F.get(i10 - qqVar.W0));
        }
        int i12 = this.f47332g;
        if (i7 >= i12 && i7 < this.h && i10 >= qqVar.T0 && i10 < qqVar.U0) {
            return ((TLObject) this.f47337m.get(i7 - i12)).equals(qqVar.G.get(i10 - qqVar.T0));
        }
        int i13 = this.f47330e;
        if (i7 >= i13 && i7 < this.f47331f && i10 >= qqVar.D0 && i10 < qqVar.E0) {
            return ((TLObject) this.f47335k.get(i7 - i13)).equals(qqVar.E.get(i10 - qqVar.D0));
        }
        if (this.f47329c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f47338n.f49123c1;
    }

    @Override
    public final int e() {
        return this.f47328b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        qq qqVar = this.f47338n;
        g(1, qqVar.f49160u0, sparseIntArray);
        g(2, qqVar.f49171y0, sparseIntArray);
        g(3, qqVar.f49173z0, sparseIntArray);
        g(4, qqVar.B0, sparseIntArray);
        g(5, qqVar.C0, sparseIntArray);
        g(6, qqVar.F0, sparseIntArray);
        g(7, qqVar.G0, sparseIntArray);
        g(8, qqVar.f49153r0, sparseIntArray);
        g(9, qqVar.f49156s0, sparseIntArray);
        g(10, qqVar.f49158t0, sparseIntArray);
        g(11, qqVar.f49117a1, sparseIntArray);
        g(12, qqVar.f49120b1, sparseIntArray);
        g(13, qqVar.R, sparseIntArray);
        g(14, qqVar.S, sparseIntArray);
        g(15, qqVar.T, sparseIntArray);
        g(16, qqVar.f49124d0, sparseIntArray);
        g(17, qqVar.f49122c0, sparseIntArray);
        g(18, qqVar.f49127e0, sparseIntArray);
        g(19, qqVar.f49132g0, sparseIntArray);
        g(20, qqVar.f49142l0, sparseIntArray);
        g(21, qqVar.f49134h0, sparseIntArray);
        g(22, qqVar.f49136i0, sparseIntArray);
        int i7 = 23;
        g(23, qqVar.f49138j0, sparseIntArray);
        if (qqVar.f49167x) {
            i7 = 24;
            g(24, qqVar.f49140k0, sparseIntArray);
        }
        g(i7 + 1, qqVar.f49130f0, sparseIntArray);
        g(i7 + 2, qqVar.A0, sparseIntArray);
        g(i7 + 3, qqVar.S0, sparseIntArray);
        g(i7 + 4, qqVar.V0, sparseIntArray);
        g(i7 + 5, qqVar.Y0, sparseIntArray);
        g(i7 + 6, qqVar.M0, sparseIntArray);
        g(i7 + 7, qqVar.N0, sparseIntArray);
        g(i7 + 8, qqVar.O0, sparseIntArray);
        g(i7 + 9, qqVar.P0, sparseIntArray);
        g(i7 + 10, qqVar.R0, sparseIntArray);
        g(i7 + 11, qqVar.Q0, sparseIntArray);
        g(i7 + 12, qqVar.Z0, sparseIntArray);
        g(i7 + 13, qqVar.f49128e1, sparseIntArray);
        g(i7 + 14, qqVar.f49131f1, sparseIntArray);
        g(i7 + 15, qqVar.f49133g1, sparseIntArray);
        g(i7 + 16, qqVar.f49135h1, sparseIntArray);
        g(i7 + 17, qqVar.f49137i1, sparseIntArray);
        g(i7 + 18, qqVar.m0, sparseIntArray);
        g(i7 + 19, qqVar.f49145n0, sparseIntArray);
        g(i7 + 20, qqVar.f49146o0, sparseIntArray);
        g(i7 + 21, qqVar.f49148p0, sparseIntArray);
        g(i7 + 22, qqVar.f49150q0, sparseIntArray);
    }
}
