package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class jr extends f2.q {
    public int f35467b;
    public int e;
    public int f35469f;
    public int f35470g;
    public int h;
    public int f35471i;
    public int f35472j;
    public final pr f35476n;
    public final SparseIntArray f35468c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35473k = new ArrayList();
    public final ArrayList f35474l = new ArrayList();
    public final ArrayList f35475m = new ArrayList();

    public jr(pr prVar) {
        this.f35476n = prVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35476n.A0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35471i;
        pr prVar = this.f35476n;
        if (i10 >= i12 && i10 < this.f35472j && i11 >= prVar.U0 && i11 < prVar.V0) {
            return ((TLObject) this.f35474l.get(i10 - i12)).equals(prVar.D.get(i11 - prVar.U0));
        }
        int i13 = this.f35470g;
        if (i10 >= i13 && i10 < this.h && i11 >= prVar.R0 && i11 < prVar.S0) {
            return ((TLObject) this.f35475m.get(i10 - i13)).equals(prVar.E.get(i11 - prVar.R0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35469f && i11 >= prVar.B0 && i11 < prVar.C0) {
            return ((TLObject) this.f35473k.get(i10 - i14)).equals(prVar.C.get(i11 - prVar.B0));
        }
        if (this.f35468c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35476n.f37446a1;
    }

    @Override
    public final int e() {
        return this.f35467b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        pr prVar = this.f35476n;
        g(1, prVar.f37485s0, sparseIntArray);
        g(2, prVar.f37494w0, sparseIntArray);
        g(3, prVar.f37497x0, sparseIntArray);
        g(4, prVar.f37502z0, sparseIntArray);
        g(5, prVar.A0, sparseIntArray);
        g(6, prVar.D0, sparseIntArray);
        g(7, prVar.E0, sparseIntArray);
        g(8, prVar.f37477p0, sparseIntArray);
        g(9, prVar.f37479q0, sparseIntArray);
        g(10, prVar.f37482r0, sparseIntArray);
        g(11, prVar.Y0, sparseIntArray);
        g(12, prVar.Z0, sparseIntArray);
        g(13, prVar.P, sparseIntArray);
        g(14, prVar.Q, sparseIntArray);
        g(15, prVar.R, sparseIntArray);
        g(16, prVar.f37448b0, sparseIntArray);
        g(17, prVar.f37445a0, sparseIntArray);
        g(18, prVar.f37451c0, sparseIntArray);
        g(19, prVar.f37455e0, sparseIntArray);
        g(20, prVar.f37466j0, sparseIntArray);
        g(21, prVar.f37458f0, sparseIntArray);
        g(22, prVar.f37460g0, sparseIntArray);
        int i10 = 23;
        g(23, prVar.f37462h0, sparseIntArray);
        if (prVar.f37496x) {
            i10 = 24;
            g(24, prVar.f37464i0, sparseIntArray);
        }
        g(i10 + 1, prVar.f37453d0, sparseIntArray);
        g(i10 + 2, prVar.f37500y0, sparseIntArray);
        g(i10 + 3, prVar.Q0, sparseIntArray);
        g(i10 + 4, prVar.T0, sparseIntArray);
        g(i10 + 5, prVar.W0, sparseIntArray);
        g(i10 + 6, prVar.K0, sparseIntArray);
        g(i10 + 7, prVar.L0, sparseIntArray);
        g(i10 + 8, prVar.M0, sparseIntArray);
        g(i10 + 9, prVar.N0, sparseIntArray);
        g(i10 + 10, prVar.P0, sparseIntArray);
        g(i10 + 11, prVar.O0, sparseIntArray);
        g(i10 + 12, prVar.X0, sparseIntArray);
        g(i10 + 13, prVar.f37452c1, sparseIntArray);
        g(i10 + 14, prVar.f37454d1, sparseIntArray);
        g(i10 + 15, prVar.f37456e1, sparseIntArray);
        g(i10 + 16, prVar.f37459f1, sparseIntArray);
        g(i10 + 17, prVar.f37461g1, sparseIntArray);
        g(i10 + 18, prVar.f37468k0, sparseIntArray);
        g(i10 + 19, prVar.f37470l0, sparseIntArray);
        g(i10 + 20, prVar.m0, sparseIntArray);
        g(i10 + 21, prVar.f37473n0, sparseIntArray);
        g(i10 + 22, prVar.f37475o0, sparseIntArray);
    }
}
