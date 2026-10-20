package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class br extends s4.o {
    public int f35725b;
    public int e;
    public int f35727f;
    public int f35728g;
    public int h;
    public int f35729i;
    public int f35730j;
    public final hr f35734n;
    public final SparseIntArray f35726c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35731k = new ArrayList();
    public final ArrayList f35732l = new ArrayList();
    public final ArrayList f35733m = new ArrayList();

    public br(hr hrVar) {
        this.f35734n = hrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35734n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35729i;
        hr hrVar = this.f35734n;
        if (i10 >= i12 && i10 < this.f35730j && i11 >= hrVar.X0 && i11 < hrVar.Y0) {
            return ((TLObject) this.f35732l.get(i10 - i12)).equals(hrVar.G.get(i11 - hrVar.X0));
        }
        int i13 = this.f35728g;
        if (i10 >= i13 && i10 < this.h && i11 >= hrVar.U0 && i11 < hrVar.V0) {
            return ((TLObject) this.f35733m.get(i10 - i13)).equals(hrVar.H.get(i11 - hrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35727f && i11 >= hrVar.E0 && i11 < hrVar.F0) {
            return ((TLObject) this.f35731k.get(i10 - i14)).equals(hrVar.F.get(i11 - hrVar.E0));
        }
        if (this.f35726c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35734n.f37725d1;
    }

    @Override
    public final int e() {
        return this.f35725b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hr hrVar = this.f35734n;
        g(1, hrVar.f37762v0, sparseIntArray);
        g(2, hrVar.f37773z0, sparseIntArray);
        g(3, hrVar.A0, sparseIntArray);
        g(4, hrVar.C0, sparseIntArray);
        g(5, hrVar.D0, sparseIntArray);
        g(6, hrVar.G0, sparseIntArray);
        g(7, hrVar.H0, sparseIntArray);
        g(8, hrVar.f37756s0, sparseIntArray);
        g(9, hrVar.f37758t0, sparseIntArray);
        g(10, hrVar.f37760u0, sparseIntArray);
        g(11, hrVar.f37720b1, sparseIntArray);
        g(12, hrVar.f37723c1, sparseIntArray);
        g(13, hrVar.S, sparseIntArray);
        g(14, hrVar.T, sparseIntArray);
        g(15, hrVar.U, sparseIntArray);
        g(16, hrVar.f37726e0, sparseIntArray);
        g(17, hrVar.f37724d0, sparseIntArray);
        g(18, hrVar.f37729f0, sparseIntArray);
        g(19, hrVar.f37733h0, sparseIntArray);
        g(20, hrVar.m0, sparseIntArray);
        g(21, hrVar.f37735i0, sparseIntArray);
        g(22, hrVar.f37737j0, sparseIntArray);
        int i10 = 23;
        g(23, hrVar.f37739k0, sparseIntArray);
        if (hrVar.f37767x) {
            i10 = 24;
            g(24, hrVar.f37741l0, sparseIntArray);
        }
        g(i10 + 1, hrVar.f37731g0, sparseIntArray);
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
        g(i10 + 12, hrVar.f37717a1, sparseIntArray);
        g(i10 + 13, hrVar.f37730f1, sparseIntArray);
        g(i10 + 14, hrVar.f37732g1, sparseIntArray);
        g(i10 + 15, hrVar.f37734h1, sparseIntArray);
        g(i10 + 16, hrVar.f37736i1, sparseIntArray);
        g(i10 + 17, hrVar.f37738j1, sparseIntArray);
        g(i10 + 18, hrVar.f37744n0, sparseIntArray);
        g(i10 + 19, hrVar.f37746o0, sparseIntArray);
        g(i10 + 20, hrVar.f37748p0, sparseIntArray);
        g(i10 + 21, hrVar.f37750q0, sparseIntArray);
        g(i10 + 22, hrVar.f37753r0, sparseIntArray);
    }
}
