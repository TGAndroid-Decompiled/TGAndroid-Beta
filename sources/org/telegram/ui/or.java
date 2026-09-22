package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class or extends s4.o {
    public int f36324b;
    public int e;
    public int f36326f;
    public int f36327g;
    public int h;
    public int f36328i;
    public int f36329j;
    public final ur f36333n;
    public final SparseIntArray f36325c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f36330k = new ArrayList();
    public final ArrayList f36331l = new ArrayList();
    public final ArrayList f36332m = new ArrayList();

    public or(ur urVar) {
        this.f36333n = urVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f36333n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f36328i;
        ur urVar = this.f36333n;
        if (i10 >= i12 && i10 < this.f36329j && i11 >= urVar.X0 && i11 < urVar.Y0) {
            return ((TLObject) this.f36331l.get(i10 - i12)).equals(urVar.G.get(i11 - urVar.X0));
        }
        int i13 = this.f36327g;
        if (i10 >= i13 && i10 < this.h && i11 >= urVar.U0 && i11 < urVar.V0) {
            return ((TLObject) this.f36332m.get(i10 - i13)).equals(urVar.H.get(i11 - urVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f36326f && i11 >= urVar.E0 && i11 < urVar.F0) {
            return ((TLObject) this.f36330k.get(i10 - i14)).equals(urVar.F.get(i11 - urVar.E0));
        }
        if (this.f36325c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f36333n.f38117d1;
    }

    @Override
    public final int e() {
        return this.f36324b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        ur urVar = this.f36333n;
        g(1, urVar.f38154v0, sparseIntArray);
        g(2, urVar.f38165z0, sparseIntArray);
        g(3, urVar.A0, sparseIntArray);
        g(4, urVar.C0, sparseIntArray);
        g(5, urVar.D0, sparseIntArray);
        g(6, urVar.G0, sparseIntArray);
        g(7, urVar.H0, sparseIntArray);
        g(8, urVar.f38148s0, sparseIntArray);
        g(9, urVar.f38150t0, sparseIntArray);
        g(10, urVar.f38152u0, sparseIntArray);
        g(11, urVar.f38112b1, sparseIntArray);
        g(12, urVar.f38115c1, sparseIntArray);
        g(13, urVar.S, sparseIntArray);
        g(14, urVar.T, sparseIntArray);
        g(15, urVar.U, sparseIntArray);
        g(16, urVar.f38118e0, sparseIntArray);
        g(17, urVar.f38116d0, sparseIntArray);
        g(18, urVar.f38121f0, sparseIntArray);
        g(19, urVar.f38125h0, sparseIntArray);
        g(20, urVar.m0, sparseIntArray);
        g(21, urVar.f38127i0, sparseIntArray);
        g(22, urVar.f38129j0, sparseIntArray);
        int i10 = 23;
        g(23, urVar.f38131k0, sparseIntArray);
        if (urVar.f38159x) {
            i10 = 24;
            g(24, urVar.f38133l0, sparseIntArray);
        }
        g(i10 + 1, urVar.f38123g0, sparseIntArray);
        g(i10 + 2, urVar.B0, sparseIntArray);
        g(i10 + 3, urVar.T0, sparseIntArray);
        g(i10 + 4, urVar.W0, sparseIntArray);
        g(i10 + 5, urVar.Z0, sparseIntArray);
        g(i10 + 6, urVar.N0, sparseIntArray);
        g(i10 + 7, urVar.O0, sparseIntArray);
        g(i10 + 8, urVar.P0, sparseIntArray);
        g(i10 + 9, urVar.Q0, sparseIntArray);
        g(i10 + 10, urVar.S0, sparseIntArray);
        g(i10 + 11, urVar.R0, sparseIntArray);
        g(i10 + 12, urVar.f38109a1, sparseIntArray);
        g(i10 + 13, urVar.f38122f1, sparseIntArray);
        g(i10 + 14, urVar.f38124g1, sparseIntArray);
        g(i10 + 15, urVar.f38126h1, sparseIntArray);
        g(i10 + 16, urVar.f38128i1, sparseIntArray);
        g(i10 + 17, urVar.f38130j1, sparseIntArray);
        g(i10 + 18, urVar.f38136n0, sparseIntArray);
        g(i10 + 19, urVar.f38138o0, sparseIntArray);
        g(i10 + 20, urVar.f38140p0, sparseIntArray);
        g(i10 + 21, urVar.f38142q0, sparseIntArray);
        g(i10 + 22, urVar.f38145r0, sparseIntArray);
    }
}
