package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class mr extends s4.o {
    public int f35720b;
    public int e;
    public int f35722f;
    public int f35723g;
    public int h;
    public int f35724i;
    public int f35725j;
    public final sr f35729n;
    public final SparseIntArray f35721c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35726k = new ArrayList();
    public final ArrayList f35727l = new ArrayList();
    public final ArrayList f35728m = new ArrayList();

    public mr(sr srVar) {
        this.f35729n = srVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35729n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35724i;
        sr srVar = this.f35729n;
        if (i10 >= i12 && i10 < this.f35725j && i11 >= srVar.X0 && i11 < srVar.Y0) {
            return ((TLObject) this.f35727l.get(i10 - i12)).equals(srVar.G.get(i11 - srVar.X0));
        }
        int i13 = this.f35723g;
        if (i10 >= i13 && i10 < this.h && i11 >= srVar.U0 && i11 < srVar.V0) {
            return ((TLObject) this.f35728m.get(i10 - i13)).equals(srVar.H.get(i11 - srVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35722f && i11 >= srVar.E0 && i11 < srVar.F0) {
            return ((TLObject) this.f35726k.get(i10 - i14)).equals(srVar.F.get(i11 - srVar.E0));
        }
        if (this.f35721c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35729n.f37402d1;
    }

    @Override
    public final int e() {
        return this.f35720b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        sr srVar = this.f35729n;
        g(1, srVar.f37439v0, sparseIntArray);
        g(2, srVar.f37450z0, sparseIntArray);
        g(3, srVar.A0, sparseIntArray);
        g(4, srVar.C0, sparseIntArray);
        g(5, srVar.D0, sparseIntArray);
        g(6, srVar.G0, sparseIntArray);
        g(7, srVar.H0, sparseIntArray);
        g(8, srVar.f37433s0, sparseIntArray);
        g(9, srVar.f37435t0, sparseIntArray);
        g(10, srVar.f37437u0, sparseIntArray);
        g(11, srVar.f37397b1, sparseIntArray);
        g(12, srVar.f37400c1, sparseIntArray);
        g(13, srVar.S, sparseIntArray);
        g(14, srVar.T, sparseIntArray);
        g(15, srVar.U, sparseIntArray);
        g(16, srVar.f37403e0, sparseIntArray);
        g(17, srVar.f37401d0, sparseIntArray);
        g(18, srVar.f37406f0, sparseIntArray);
        g(19, srVar.f37410h0, sparseIntArray);
        g(20, srVar.m0, sparseIntArray);
        g(21, srVar.f37412i0, sparseIntArray);
        g(22, srVar.f37414j0, sparseIntArray);
        int i10 = 23;
        g(23, srVar.f37416k0, sparseIntArray);
        if (srVar.f37444x) {
            i10 = 24;
            g(24, srVar.f37418l0, sparseIntArray);
        }
        g(i10 + 1, srVar.f37408g0, sparseIntArray);
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
        g(i10 + 12, srVar.f37394a1, sparseIntArray);
        g(i10 + 13, srVar.f37407f1, sparseIntArray);
        g(i10 + 14, srVar.f37409g1, sparseIntArray);
        g(i10 + 15, srVar.f37411h1, sparseIntArray);
        g(i10 + 16, srVar.f37413i1, sparseIntArray);
        g(i10 + 17, srVar.f37415j1, sparseIntArray);
        g(i10 + 18, srVar.f37421n0, sparseIntArray);
        g(i10 + 19, srVar.f37423o0, sparseIntArray);
        g(i10 + 20, srVar.f37425p0, sparseIntArray);
        g(i10 + 21, srVar.f37427q0, sparseIntArray);
        g(i10 + 22, srVar.f37430r0, sparseIntArray);
    }
}
