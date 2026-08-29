package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class dr extends f2.q {
    public int f37611b;
    public int f37613e;
    public int f37614f;
    public int f37615g;
    public int h;
    public int f37616i;
    public int f37617j;
    public final jr f37621n;
    public final SparseIntArray f37612c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f37618k = new ArrayList();
    public final ArrayList f37619l = new ArrayList();
    public final ArrayList f37620m = new ArrayList();

    public dr(jr jrVar) {
        this.f37621n = jrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f37621n.f39677z0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f37616i;
        jr jrVar = this.f37621n;
        if (i10 >= i12 && i10 < this.f37617j && i11 >= jrVar.T0 && i11 < jrVar.U0) {
            return ((TLObject) this.f37619l.get(i10 - i12)).equals(jrVar.C.get(i11 - jrVar.T0));
        }
        int i13 = this.f37615g;
        if (i10 >= i13 && i10 < this.h && i11 >= jrVar.Q0 && i11 < jrVar.R0) {
            return ((TLObject) this.f37620m.get(i10 - i13)).equals(jrVar.D.get(i11 - jrVar.Q0));
        }
        int i14 = this.f37613e;
        if (i10 >= i14 && i10 < this.f37614f && i11 >= jrVar.A0 && i11 < jrVar.B0) {
            return ((TLObject) this.f37618k.get(i10 - i14)).equals(jrVar.B.get(i11 - jrVar.A0));
        }
        if (this.f37612c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f37621n.Z0;
    }

    @Override
    public final int e() {
        return this.f37611b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        jr jrVar = this.f37621n;
        g(1, jrVar.f39657r0, sparseIntArray);
        g(2, jrVar.f39666v0, sparseIntArray);
        g(3, jrVar.f39669w0, sparseIntArray);
        g(4, jrVar.f39675y0, sparseIntArray);
        g(5, jrVar.f39677z0, sparseIntArray);
        g(6, jrVar.C0, sparseIntArray);
        g(7, jrVar.D0, sparseIntArray);
        g(8, jrVar.f39650o0, sparseIntArray);
        g(9, jrVar.f39652p0, sparseIntArray);
        g(10, jrVar.f39654q0, sparseIntArray);
        g(11, jrVar.X0, sparseIntArray);
        g(12, jrVar.Y0, sparseIntArray);
        g(13, jrVar.O, sparseIntArray);
        g(14, jrVar.P, sparseIntArray);
        g(15, jrVar.Q, sparseIntArray);
        g(16, jrVar.f39619a0, sparseIntArray);
        g(17, jrVar.Z, sparseIntArray);
        g(18, jrVar.f39622b0, sparseIntArray);
        g(19, jrVar.f39627d0, sparseIntArray);
        g(20, jrVar.f39639i0, sparseIntArray);
        g(21, jrVar.f39630e0, sparseIntArray);
        g(22, jrVar.f39633f0, sparseIntArray);
        int i10 = 23;
        g(23, jrVar.f39635g0, sparseIntArray);
        if (jrVar.f39671x) {
            i10 = 24;
            g(24, jrVar.f39637h0, sparseIntArray);
        }
        g(i10 + 1, jrVar.f39625c0, sparseIntArray);
        g(i10 + 2, jrVar.f39672x0, sparseIntArray);
        g(i10 + 3, jrVar.P0, sparseIntArray);
        g(i10 + 4, jrVar.S0, sparseIntArray);
        g(i10 + 5, jrVar.V0, sparseIntArray);
        g(i10 + 6, jrVar.J0, sparseIntArray);
        g(i10 + 7, jrVar.K0, sparseIntArray);
        g(i10 + 8, jrVar.L0, sparseIntArray);
        g(i10 + 9, jrVar.M0, sparseIntArray);
        g(i10 + 10, jrVar.O0, sparseIntArray);
        g(i10 + 11, jrVar.N0, sparseIntArray);
        g(i10 + 12, jrVar.W0, sparseIntArray);
        g(i10 + 13, jrVar.f39623b1, sparseIntArray);
        g(i10 + 14, jrVar.f39626c1, sparseIntArray);
        g(i10 + 15, jrVar.f39628d1, sparseIntArray);
        g(i10 + 16, jrVar.f39631e1, sparseIntArray);
        g(i10 + 17, jrVar.f39634f1, sparseIntArray);
        g(i10 + 18, jrVar.f39641j0, sparseIntArray);
        g(i10 + 19, jrVar.f39643k0, sparseIntArray);
        g(i10 + 20, jrVar.f39645l0, sparseIntArray);
        g(i10 + 21, jrVar.m0, sparseIntArray);
        g(i10 + 22, jrVar.f39648n0, sparseIntArray);
    }
}
