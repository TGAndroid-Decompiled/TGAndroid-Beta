package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

public final class er extends f2.q {

    public int f37811b;

    public int f37813e;

    public int f37814f;

    public int f37815g;
    public int h;

    public int f37816i;

    public int f37817j;

    public final lr f37821n;

    public final SparseIntArray f37812c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();

    public final ArrayList f37818k = new ArrayList();

    public final ArrayList f37819l = new ArrayList();

    public final ArrayList f37820m = new ArrayList();

    public er(lr lrVar) {
        this.f37821n = lrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11) && this.f37821n.f40238z0 != i11;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f37816i;
        lr lrVar = this.f37821n;
        if (i10 >= i12 && i10 < this.f37817j && i11 >= lrVar.T0 && i11 < lrVar.U0) {
            return ((TLObject) this.f37819l.get(i10 - i12)).equals(lrVar.C.get(i11 - lrVar.T0));
        }
        int i13 = this.f37815g;
        if (i10 >= i13 && i10 < this.h && i11 >= lrVar.Q0 && i11 < lrVar.R0) {
            return ((TLObject) this.f37820m.get(i10 - i13)).equals(lrVar.D.get(i11 - lrVar.Q0));
        }
        int i14 = this.f37813e;
        if (i10 < i14 || i10 >= this.f37814f || i11 < lrVar.A0 || i11 >= lrVar.B0) {
            return this.f37812c.get(i10) == this.d.get(i11);
        }
        return ((TLObject) this.f37818k.get(i10 - i14)).equals(lrVar.B.get(i11 - lrVar.A0));
    }

    @Override
    public final int d() {
        return this.f37821n.Z0;
    }

    @Override
    public final int e() {
        return this.f37811b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        lr lrVar = this.f37821n;
        g(1, lrVar.f40218r0, sparseIntArray);
        g(2, lrVar.f40227v0, sparseIntArray);
        g(3, lrVar.f40230w0, sparseIntArray);
        g(4, lrVar.f40236y0, sparseIntArray);
        g(5, lrVar.f40238z0, sparseIntArray);
        g(6, lrVar.C0, sparseIntArray);
        g(7, lrVar.D0, sparseIntArray);
        g(8, lrVar.f40211o0, sparseIntArray);
        g(9, lrVar.f40213p0, sparseIntArray);
        g(10, lrVar.f40215q0, sparseIntArray);
        g(11, lrVar.X0, sparseIntArray);
        g(12, lrVar.Y0, sparseIntArray);
        g(13, lrVar.O, sparseIntArray);
        g(14, lrVar.P, sparseIntArray);
        g(15, lrVar.Q, sparseIntArray);
        g(16, lrVar.f40180a0, sparseIntArray);
        g(17, lrVar.Z, sparseIntArray);
        g(18, lrVar.f40183b0, sparseIntArray);
        g(19, lrVar.f40188d0, sparseIntArray);
        g(20, lrVar.f40200i0, sparseIntArray);
        g(21, lrVar.f40191e0, sparseIntArray);
        g(22, lrVar.f40194f0, sparseIntArray);
        int i10 = 23;
        g(23, lrVar.f40196g0, sparseIntArray);
        if (lrVar.f40232x) {
            i10 = 24;
            g(24, lrVar.f40198h0, sparseIntArray);
        }
        g(i10 + 1, lrVar.f40186c0, sparseIntArray);
        g(i10 + 2, lrVar.f40233x0, sparseIntArray);
        g(i10 + 3, lrVar.P0, sparseIntArray);
        g(i10 + 4, lrVar.S0, sparseIntArray);
        g(i10 + 5, lrVar.V0, sparseIntArray);
        g(i10 + 6, lrVar.J0, sparseIntArray);
        g(i10 + 7, lrVar.K0, sparseIntArray);
        g(i10 + 8, lrVar.L0, sparseIntArray);
        g(i10 + 9, lrVar.M0, sparseIntArray);
        g(i10 + 10, lrVar.O0, sparseIntArray);
        g(i10 + 11, lrVar.N0, sparseIntArray);
        g(i10 + 12, lrVar.W0, sparseIntArray);
        g(i10 + 13, lrVar.f40184b1, sparseIntArray);
        g(i10 + 14, lrVar.f40187c1, sparseIntArray);
        g(i10 + 15, lrVar.f40189d1, sparseIntArray);
        g(i10 + 16, lrVar.f40192e1, sparseIntArray);
        g(i10 + 17, lrVar.f40195f1, sparseIntArray);
        g(i10 + 18, lrVar.f40202j0, sparseIntArray);
        g(i10 + 19, lrVar.f40204k0, sparseIntArray);
        g(i10 + 20, lrVar.f40206l0, sparseIntArray);
        g(i10 + 21, lrVar.m0, sparseIntArray);
        g(i10 + 22, lrVar.f40209n0, sparseIntArray);
    }
}
