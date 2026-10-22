package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class br extends s4.o {
    public int f35729b;
    public int e;
    public int f35731f;
    public int f35732g;
    public int h;
    public int f35733i;
    public int f35734j;
    public final hr f35738n;
    public final SparseIntArray f35730c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35735k = new ArrayList();
    public final ArrayList f35736l = new ArrayList();
    public final ArrayList f35737m = new ArrayList();

    public br(hr hrVar) {
        this.f35738n = hrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35738n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35733i;
        hr hrVar = this.f35738n;
        if (i10 >= i12 && i10 < this.f35734j && i11 >= hrVar.X0 && i11 < hrVar.Y0) {
            return ((TLObject) this.f35736l.get(i10 - i12)).equals(hrVar.G.get(i11 - hrVar.X0));
        }
        int i13 = this.f35732g;
        if (i10 >= i13 && i10 < this.h && i11 >= hrVar.U0 && i11 < hrVar.V0) {
            return ((TLObject) this.f35737m.get(i10 - i13)).equals(hrVar.H.get(i11 - hrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35731f && i11 >= hrVar.E0 && i11 < hrVar.F0) {
            return ((TLObject) this.f35735k.get(i10 - i14)).equals(hrVar.F.get(i11 - hrVar.E0));
        }
        if (this.f35730c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35738n.f37729d1;
    }

    @Override
    public final int e() {
        return this.f35729b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hr hrVar = this.f35738n;
        g(1, hrVar.f37766v0, sparseIntArray);
        g(2, hrVar.f37777z0, sparseIntArray);
        g(3, hrVar.A0, sparseIntArray);
        g(4, hrVar.C0, sparseIntArray);
        g(5, hrVar.D0, sparseIntArray);
        g(6, hrVar.G0, sparseIntArray);
        g(7, hrVar.H0, sparseIntArray);
        g(8, hrVar.f37760s0, sparseIntArray);
        g(9, hrVar.f37762t0, sparseIntArray);
        g(10, hrVar.f37764u0, sparseIntArray);
        g(11, hrVar.f37724b1, sparseIntArray);
        g(12, hrVar.f37727c1, sparseIntArray);
        g(13, hrVar.S, sparseIntArray);
        g(14, hrVar.T, sparseIntArray);
        g(15, hrVar.U, sparseIntArray);
        g(16, hrVar.f37730e0, sparseIntArray);
        g(17, hrVar.f37728d0, sparseIntArray);
        g(18, hrVar.f37733f0, sparseIntArray);
        g(19, hrVar.f37737h0, sparseIntArray);
        g(20, hrVar.m0, sparseIntArray);
        g(21, hrVar.f37739i0, sparseIntArray);
        g(22, hrVar.f37741j0, sparseIntArray);
        int i10 = 23;
        g(23, hrVar.f37743k0, sparseIntArray);
        if (hrVar.f37771x) {
            i10 = 24;
            g(24, hrVar.f37745l0, sparseIntArray);
        }
        g(i10 + 1, hrVar.f37735g0, sparseIntArray);
        g(i10 + 2, hrVar.B0, sparseIntArray);
        g(i10 + 3, hrVar.T0, sparseIntArray);
        g(i10 + 4, hrVar.W0, sparseIntArray);
        g(i10 + 5, hrVar.Z0, sparseIntArray);
        g(i10 + 6, hrVar.N0, sparseIntArray);
        g(i10 + 7, hrVar.O0, sparseIntArray);
        g(i10 + 8, hrVar.P0, sparseIntArray);
        g(i10 + 9, hrVar.Q0, sparseIntArray);
        g(i10 + 10, hrVar.S0, sparseIntArray);
        g(i10 + 11, hrVar.R0, sparseIntArray);
        g(i10 + 12, hrVar.f37721a1, sparseIntArray);
        g(i10 + 13, hrVar.f37734f1, sparseIntArray);
        g(i10 + 14, hrVar.f37736g1, sparseIntArray);
        g(i10 + 15, hrVar.f37738h1, sparseIntArray);
        g(i10 + 16, hrVar.f37740i1, sparseIntArray);
        g(i10 + 17, hrVar.f37742j1, sparseIntArray);
        g(i10 + 18, hrVar.f37748n0, sparseIntArray);
        g(i10 + 19, hrVar.f37750o0, sparseIntArray);
        g(i10 + 20, hrVar.f37752p0, sparseIntArray);
        g(i10 + 21, hrVar.f37754q0, sparseIntArray);
        g(i10 + 22, hrVar.f37757r0, sparseIntArray);
    }
}
