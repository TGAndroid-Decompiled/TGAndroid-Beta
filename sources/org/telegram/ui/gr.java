package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class gr extends s4.p {
    public int f39671b;
    public int e;
    public int f39673f;
    public int f39674g;
    public int h;
    public int f39675i;
    public int f39676j;
    public final mr f39680n;
    public final SparseIntArray f39672c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39677k = new ArrayList();
    public final ArrayList f39678l = new ArrayList();
    public final ArrayList f39679m = new ArrayList();

    public gr(mr mrVar) {
        this.f39680n = mrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f39680n.C0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f39675i;
        mr mrVar = this.f39680n;
        if (i10 >= i12 && i10 < this.f39676j && i11 >= mrVar.W0 && i11 < mrVar.X0) {
            return ((TLObject) this.f39678l.get(i10 - i12)).equals(mrVar.F.get(i11 - mrVar.W0));
        }
        int i13 = this.f39674g;
        if (i10 >= i13 && i10 < this.h && i11 >= mrVar.T0 && i11 < mrVar.U0) {
            return ((TLObject) this.f39679m.get(i10 - i13)).equals(mrVar.G.get(i11 - mrVar.T0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f39673f && i11 >= mrVar.D0 && i11 < mrVar.E0) {
            return ((TLObject) this.f39677k.get(i10 - i14)).equals(mrVar.E.get(i11 - mrVar.D0));
        }
        if (this.f39672c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39680n.f41510c1;
    }

    @Override
    public final int e() {
        return this.f39671b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        mr mrVar = this.f39680n;
        g(1, mrVar.f41547u0, sparseIntArray);
        g(2, mrVar.f41558y0, sparseIntArray);
        g(3, mrVar.f41560z0, sparseIntArray);
        g(4, mrVar.B0, sparseIntArray);
        g(5, mrVar.C0, sparseIntArray);
        g(6, mrVar.F0, sparseIntArray);
        g(7, mrVar.G0, sparseIntArray);
        g(8, mrVar.f41540r0, sparseIntArray);
        g(9, mrVar.f41543s0, sparseIntArray);
        g(10, mrVar.f41545t0, sparseIntArray);
        g(11, mrVar.f41504a1, sparseIntArray);
        g(12, mrVar.f41507b1, sparseIntArray);
        g(13, mrVar.R, sparseIntArray);
        g(14, mrVar.S, sparseIntArray);
        g(15, mrVar.T, sparseIntArray);
        g(16, mrVar.f41511d0, sparseIntArray);
        g(17, mrVar.f41509c0, sparseIntArray);
        g(18, mrVar.f41513e0, sparseIntArray);
        g(19, mrVar.f41518g0, sparseIntArray);
        g(20, mrVar.f41528l0, sparseIntArray);
        g(21, mrVar.f41520h0, sparseIntArray);
        g(22, mrVar.f41522i0, sparseIntArray);
        int i10 = 23;
        g(23, mrVar.f41524j0, sparseIntArray);
        if (mrVar.f41551w) {
            i10 = 24;
            g(24, mrVar.f41526k0, sparseIntArray);
        }
        g(i10 + 1, mrVar.f41516f0, sparseIntArray);
        g(i10 + 2, mrVar.A0, sparseIntArray);
        g(i10 + 3, mrVar.S0, sparseIntArray);
        g(i10 + 4, mrVar.V0, sparseIntArray);
        g(i10 + 5, mrVar.Y0, sparseIntArray);
        g(i10 + 6, mrVar.M0, sparseIntArray);
        g(i10 + 7, mrVar.N0, sparseIntArray);
        g(i10 + 8, mrVar.O0, sparseIntArray);
        g(i10 + 9, mrVar.P0, sparseIntArray);
        g(i10 + 10, mrVar.R0, sparseIntArray);
        g(i10 + 11, mrVar.Q0, sparseIntArray);
        g(i10 + 12, mrVar.Z0, sparseIntArray);
        g(i10 + 13, mrVar.f41514e1, sparseIntArray);
        g(i10 + 14, mrVar.f41517f1, sparseIntArray);
        g(i10 + 15, mrVar.f41519g1, sparseIntArray);
        g(i10 + 16, mrVar.f41521h1, sparseIntArray);
        g(i10 + 17, mrVar.f41523i1, sparseIntArray);
        g(i10 + 18, mrVar.m0, sparseIntArray);
        g(i10 + 19, mrVar.f41531n0, sparseIntArray);
        g(i10 + 20, mrVar.f41533o0, sparseIntArray);
        g(i10 + 21, mrVar.f41535p0, sparseIntArray);
        g(i10 + 22, mrVar.f41537q0, sparseIntArray);
    }
}
