package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class lr extends f2.q {
    public int f35898b;
    public int e;
    public int f35900f;
    public int f35901g;
    public int h;
    public int f35902i;
    public int f35903j;
    public final rr f35907n;
    public final SparseIntArray f35899c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35904k = new ArrayList();
    public final ArrayList f35905l = new ArrayList();
    public final ArrayList f35906m = new ArrayList();

    public lr(rr rrVar) {
        this.f35907n = rrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35907n.A0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35902i;
        rr rrVar = this.f35907n;
        if (i10 >= i12 && i10 < this.f35903j && i11 >= rrVar.U0 && i11 < rrVar.V0) {
            return ((TLObject) this.f35905l.get(i10 - i12)).equals(rrVar.D.get(i11 - rrVar.U0));
        }
        int i13 = this.f35901g;
        if (i10 >= i13 && i10 < this.h && i11 >= rrVar.R0 && i11 < rrVar.S0) {
            return ((TLObject) this.f35906m.get(i10 - i13)).equals(rrVar.E.get(i11 - rrVar.R0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35900f && i11 >= rrVar.B0 && i11 < rrVar.C0) {
            return ((TLObject) this.f35904k.get(i10 - i14)).equals(rrVar.C.get(i11 - rrVar.B0));
        }
        if (this.f35899c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35907n.f37957a1;
    }

    @Override
    public final int e() {
        return this.f35898b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        rr rrVar = this.f35907n;
        g(1, rrVar.f37996s0, sparseIntArray);
        g(2, rrVar.f38005w0, sparseIntArray);
        g(3, rrVar.f38008x0, sparseIntArray);
        g(4, rrVar.f38013z0, sparseIntArray);
        g(5, rrVar.A0, sparseIntArray);
        g(6, rrVar.D0, sparseIntArray);
        g(7, rrVar.E0, sparseIntArray);
        g(8, rrVar.f37988p0, sparseIntArray);
        g(9, rrVar.f37990q0, sparseIntArray);
        g(10, rrVar.f37993r0, sparseIntArray);
        g(11, rrVar.Y0, sparseIntArray);
        g(12, rrVar.Z0, sparseIntArray);
        g(13, rrVar.P, sparseIntArray);
        g(14, rrVar.Q, sparseIntArray);
        g(15, rrVar.R, sparseIntArray);
        g(16, rrVar.f37959b0, sparseIntArray);
        g(17, rrVar.f37956a0, sparseIntArray);
        g(18, rrVar.f37962c0, sparseIntArray);
        g(19, rrVar.f37966e0, sparseIntArray);
        g(20, rrVar.f37977j0, sparseIntArray);
        g(21, rrVar.f37969f0, sparseIntArray);
        g(22, rrVar.f37971g0, sparseIntArray);
        int i10 = 23;
        g(23, rrVar.f37973h0, sparseIntArray);
        if (rrVar.f38007x) {
            i10 = 24;
            g(24, rrVar.f37975i0, sparseIntArray);
        }
        g(i10 + 1, rrVar.f37964d0, sparseIntArray);
        g(i10 + 2, rrVar.f38011y0, sparseIntArray);
        g(i10 + 3, rrVar.Q0, sparseIntArray);
        g(i10 + 4, rrVar.T0, sparseIntArray);
        g(i10 + 5, rrVar.W0, sparseIntArray);
        g(i10 + 6, rrVar.K0, sparseIntArray);
        g(i10 + 7, rrVar.L0, sparseIntArray);
        g(i10 + 8, rrVar.M0, sparseIntArray);
        g(i10 + 9, rrVar.N0, sparseIntArray);
        g(i10 + 10, rrVar.P0, sparseIntArray);
        g(i10 + 11, rrVar.O0, sparseIntArray);
        g(i10 + 12, rrVar.X0, sparseIntArray);
        g(i10 + 13, rrVar.f37963c1, sparseIntArray);
        g(i10 + 14, rrVar.f37965d1, sparseIntArray);
        g(i10 + 15, rrVar.f37967e1, sparseIntArray);
        g(i10 + 16, rrVar.f37970f1, sparseIntArray);
        g(i10 + 17, rrVar.f37972g1, sparseIntArray);
        g(i10 + 18, rrVar.f37979k0, sparseIntArray);
        g(i10 + 19, rrVar.f37981l0, sparseIntArray);
        g(i10 + 20, rrVar.m0, sparseIntArray);
        g(i10 + 21, rrVar.f37984n0, sparseIntArray);
        g(i10 + 22, rrVar.f37986o0, sparseIntArray);
    }
}
