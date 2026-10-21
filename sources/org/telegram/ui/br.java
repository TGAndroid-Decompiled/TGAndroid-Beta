package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class br extends s4.o {
    public int f35726b;
    public int e;
    public int f35728f;
    public int f35729g;
    public int h;
    public int f35730i;
    public int f35731j;
    public final hr f35735n;
    public final SparseIntArray f35727c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35732k = new ArrayList();
    public final ArrayList f35733l = new ArrayList();
    public final ArrayList f35734m = new ArrayList();

    public br(hr hrVar) {
        this.f35735n = hrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35735n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35730i;
        hr hrVar = this.f35735n;
        if (i10 >= i12 && i10 < this.f35731j && i11 >= hrVar.X0 && i11 < hrVar.Y0) {
            return ((TLObject) this.f35733l.get(i10 - i12)).equals(hrVar.G.get(i11 - hrVar.X0));
        }
        int i13 = this.f35729g;
        if (i10 >= i13 && i10 < this.h && i11 >= hrVar.U0 && i11 < hrVar.V0) {
            return ((TLObject) this.f35734m.get(i10 - i13)).equals(hrVar.H.get(i11 - hrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35728f && i11 >= hrVar.E0 && i11 < hrVar.F0) {
            return ((TLObject) this.f35732k.get(i10 - i14)).equals(hrVar.F.get(i11 - hrVar.E0));
        }
        if (this.f35727c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35735n.f37726d1;
    }

    @Override
    public final int e() {
        return this.f35726b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hr hrVar = this.f35735n;
        g(1, hrVar.f37763v0, sparseIntArray);
        g(2, hrVar.f37774z0, sparseIntArray);
        g(3, hrVar.A0, sparseIntArray);
        g(4, hrVar.C0, sparseIntArray);
        g(5, hrVar.D0, sparseIntArray);
        g(6, hrVar.G0, sparseIntArray);
        g(7, hrVar.H0, sparseIntArray);
        g(8, hrVar.f37757s0, sparseIntArray);
        g(9, hrVar.f37759t0, sparseIntArray);
        g(10, hrVar.f37761u0, sparseIntArray);
        g(11, hrVar.f37721b1, sparseIntArray);
        g(12, hrVar.f37724c1, sparseIntArray);
        g(13, hrVar.S, sparseIntArray);
        g(14, hrVar.T, sparseIntArray);
        g(15, hrVar.U, sparseIntArray);
        g(16, hrVar.f37727e0, sparseIntArray);
        g(17, hrVar.f37725d0, sparseIntArray);
        g(18, hrVar.f37730f0, sparseIntArray);
        g(19, hrVar.f37734h0, sparseIntArray);
        g(20, hrVar.m0, sparseIntArray);
        g(21, hrVar.f37736i0, sparseIntArray);
        g(22, hrVar.f37738j0, sparseIntArray);
        int i10 = 23;
        g(23, hrVar.f37740k0, sparseIntArray);
        if (hrVar.f37768x) {
            i10 = 24;
            g(24, hrVar.f37742l0, sparseIntArray);
        }
        g(i10 + 1, hrVar.f37732g0, sparseIntArray);
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
        g(i10 + 12, hrVar.f37718a1, sparseIntArray);
        g(i10 + 13, hrVar.f37731f1, sparseIntArray);
        g(i10 + 14, hrVar.f37733g1, sparseIntArray);
        g(i10 + 15, hrVar.f37735h1, sparseIntArray);
        g(i10 + 16, hrVar.f37737i1, sparseIntArray);
        g(i10 + 17, hrVar.f37739j1, sparseIntArray);
        g(i10 + 18, hrVar.f37745n0, sparseIntArray);
        g(i10 + 19, hrVar.f37747o0, sparseIntArray);
        g(i10 + 20, hrVar.f37749p0, sparseIntArray);
        g(i10 + 21, hrVar.f37751q0, sparseIntArray);
        g(i10 + 22, hrVar.f37754r0, sparseIntArray);
    }
}
