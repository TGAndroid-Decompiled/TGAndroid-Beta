package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class pr extends s4.o {
    public int f39645b;
    public int f39647e;
    public int f39648f;
    public int f39649g;
    public int h;
    public int f39650i;
    public int f39651j;
    public final vr f39655n;
    public final SparseIntArray f39646c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39652k = new ArrayList();
    public final ArrayList f39653l = new ArrayList();
    public final ArrayList f39654m = new ArrayList();

    public pr(vr vrVar) {
        this.f39655n = vrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f39655n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f39650i;
        vr vrVar = this.f39655n;
        if (i10 >= i12 && i10 < this.f39651j && i11 >= vrVar.X0 && i11 < vrVar.Y0) {
            return ((TLObject) this.f39653l.get(i10 - i12)).equals(vrVar.G.get(i11 - vrVar.X0));
        }
        int i13 = this.f39649g;
        if (i10 >= i13 && i10 < this.h && i11 >= vrVar.U0 && i11 < vrVar.V0) {
            return ((TLObject) this.f39654m.get(i10 - i13)).equals(vrVar.H.get(i11 - vrVar.U0));
        }
        int i14 = this.f39647e;
        if (i10 >= i14 && i10 < this.f39648f && i11 >= vrVar.E0 && i11 < vrVar.F0) {
            return ((TLObject) this.f39652k.get(i10 - i14)).equals(vrVar.F.get(i11 - vrVar.E0));
        }
        if (this.f39646c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39655n.f41666d1;
    }

    @Override
    public final int e() {
        return this.f39645b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        vr vrVar = this.f39655n;
        g(1, vrVar.f41704v0, sparseIntArray);
        g(2, vrVar.f41715z0, sparseIntArray);
        g(3, vrVar.A0, sparseIntArray);
        g(4, vrVar.C0, sparseIntArray);
        g(5, vrVar.D0, sparseIntArray);
        g(6, vrVar.G0, sparseIntArray);
        g(7, vrVar.H0, sparseIntArray);
        g(8, vrVar.f41698s0, sparseIntArray);
        g(9, vrVar.f41700t0, sparseIntArray);
        g(10, vrVar.f41702u0, sparseIntArray);
        g(11, vrVar.f41661b1, sparseIntArray);
        g(12, vrVar.f41664c1, sparseIntArray);
        g(13, vrVar.S, sparseIntArray);
        g(14, vrVar.T, sparseIntArray);
        g(15, vrVar.U, sparseIntArray);
        g(16, vrVar.f41668e0, sparseIntArray);
        g(17, vrVar.f41665d0, sparseIntArray);
        g(18, vrVar.f41671f0, sparseIntArray);
        g(19, vrVar.f41675h0, sparseIntArray);
        g(20, vrVar.m0, sparseIntArray);
        g(21, vrVar.f41677i0, sparseIntArray);
        g(22, vrVar.f41679j0, sparseIntArray);
        int i10 = 23;
        g(23, vrVar.f41681k0, sparseIntArray);
        if (vrVar.f41709x) {
            i10 = 24;
            g(24, vrVar.f41683l0, sparseIntArray);
        }
        g(i10 + 1, vrVar.f41673g0, sparseIntArray);
        g(i10 + 2, vrVar.B0, sparseIntArray);
        g(i10 + 3, vrVar.T0, sparseIntArray);
        g(i10 + 4, vrVar.W0, sparseIntArray);
        g(i10 + 5, vrVar.Z0, sparseIntArray);
        g(i10 + 6, vrVar.N0, sparseIntArray);
        g(i10 + 7, vrVar.O0, sparseIntArray);
        g(i10 + 8, vrVar.P0, sparseIntArray);
        g(i10 + 9, vrVar.Q0, sparseIntArray);
        g(i10 + 10, vrVar.S0, sparseIntArray);
        g(i10 + 11, vrVar.R0, sparseIntArray);
        g(i10 + 12, vrVar.f41658a1, sparseIntArray);
        g(i10 + 13, vrVar.f41672f1, sparseIntArray);
        g(i10 + 14, vrVar.f41674g1, sparseIntArray);
        g(i10 + 15, vrVar.f41676h1, sparseIntArray);
        g(i10 + 16, vrVar.f41678i1, sparseIntArray);
        g(i10 + 17, vrVar.f41680j1, sparseIntArray);
        g(i10 + 18, vrVar.f41686n0, sparseIntArray);
        g(i10 + 19, vrVar.f41688o0, sparseIntArray);
        g(i10 + 20, vrVar.f41690p0, sparseIntArray);
        g(i10 + 21, vrVar.f41692q0, sparseIntArray);
        g(i10 + 22, vrVar.f41695r0, sparseIntArray);
    }
}
