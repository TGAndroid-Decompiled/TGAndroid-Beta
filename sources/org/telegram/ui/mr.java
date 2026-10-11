package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class mr extends s4.o {
    public int f40090b;
    public int f40092e;
    public int f40093f;
    public int f40094g;
    public int h;
    public int f40095i;
    public int f40096j;
    public final sr f40100n;
    public final SparseIntArray f40091c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f40097k = new ArrayList();
    public final ArrayList f40098l = new ArrayList();
    public final ArrayList f40099m = new ArrayList();

    public mr(sr srVar) {
        this.f40100n = srVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f40100n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f40095i;
        sr srVar = this.f40100n;
        if (i10 >= i12 && i10 < this.f40096j && i11 >= srVar.X0 && i11 < srVar.Y0) {
            return ((TLObject) this.f40098l.get(i10 - i12)).equals(srVar.G.get(i11 - srVar.X0));
        }
        int i13 = this.f40094g;
        if (i10 >= i13 && i10 < this.h && i11 >= srVar.U0 && i11 < srVar.V0) {
            return ((TLObject) this.f40099m.get(i10 - i13)).equals(srVar.H.get(i11 - srVar.U0));
        }
        int i14 = this.f40092e;
        if (i10 >= i14 && i10 < this.f40093f && i11 >= srVar.E0 && i11 < srVar.F0) {
            return ((TLObject) this.f40097k.get(i10 - i14)).equals(srVar.F.get(i11 - srVar.E0));
        }
        if (this.f40091c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f40100n.f41828d1;
    }

    @Override
    public final int e() {
        return this.f40090b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        sr srVar = this.f40100n;
        g(1, srVar.f41866v0, sparseIntArray);
        g(2, srVar.f41877z0, sparseIntArray);
        g(3, srVar.A0, sparseIntArray);
        g(4, srVar.C0, sparseIntArray);
        g(5, srVar.D0, sparseIntArray);
        g(6, srVar.G0, sparseIntArray);
        g(7, srVar.H0, sparseIntArray);
        g(8, srVar.f41860s0, sparseIntArray);
        g(9, srVar.f41862t0, sparseIntArray);
        g(10, srVar.f41864u0, sparseIntArray);
        g(11, srVar.f41823b1, sparseIntArray);
        g(12, srVar.f41826c1, sparseIntArray);
        g(13, srVar.S, sparseIntArray);
        g(14, srVar.T, sparseIntArray);
        g(15, srVar.U, sparseIntArray);
        g(16, srVar.f41830e0, sparseIntArray);
        g(17, srVar.f41827d0, sparseIntArray);
        g(18, srVar.f41833f0, sparseIntArray);
        g(19, srVar.f41837h0, sparseIntArray);
        g(20, srVar.m0, sparseIntArray);
        g(21, srVar.f41839i0, sparseIntArray);
        g(22, srVar.f41841j0, sparseIntArray);
        int i10 = 23;
        g(23, srVar.f41843k0, sparseIntArray);
        if (srVar.f41871x) {
            i10 = 24;
            g(24, srVar.f41845l0, sparseIntArray);
        }
        g(i10 + 1, srVar.f41835g0, sparseIntArray);
        g(i10 + 2, srVar.B0, sparseIntArray);
        g(i10 + 3, srVar.T0, sparseIntArray);
        g(i10 + 4, srVar.W0, sparseIntArray);
        g(i10 + 5, srVar.Z0, sparseIntArray);
        g(i10 + 6, srVar.N0, sparseIntArray);
        g(i10 + 7, srVar.O0, sparseIntArray);
        g(i10 + 8, srVar.P0, sparseIntArray);
        g(i10 + 9, srVar.Q0, sparseIntArray);
        g(i10 + 10, srVar.S0, sparseIntArray);
        g(i10 + 11, srVar.R0, sparseIntArray);
        g(i10 + 12, srVar.f41820a1, sparseIntArray);
        g(i10 + 13, srVar.f41834f1, sparseIntArray);
        g(i10 + 14, srVar.f41836g1, sparseIntArray);
        g(i10 + 15, srVar.f41838h1, sparseIntArray);
        g(i10 + 16, srVar.f41840i1, sparseIntArray);
        g(i10 + 17, srVar.f41842j1, sparseIntArray);
        g(i10 + 18, srVar.f41848n0, sparseIntArray);
        g(i10 + 19, srVar.f41850o0, sparseIntArray);
        g(i10 + 20, srVar.f41852p0, sparseIntArray);
        g(i10 + 21, srVar.f41854q0, sparseIntArray);
        g(i10 + 22, srVar.f41857r0, sparseIntArray);
    }
}
