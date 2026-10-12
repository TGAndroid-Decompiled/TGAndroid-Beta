package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class pr extends s4.o {
    public int f41073b;
    public int f41075e;
    public int f41076f;
    public int f41077g;
    public int h;
    public int f41078i;
    public int f41079j;
    public final wr f41083n;
    public final SparseIntArray f41074c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f41080k = new ArrayList();
    public final ArrayList f41081l = new ArrayList();
    public final ArrayList f41082m = new ArrayList();

    public pr(wr wrVar) {
        this.f41083n = wrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f41083n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f41078i;
        wr wrVar = this.f41083n;
        if (i10 >= i12 && i10 < this.f41079j && i11 >= wrVar.X0 && i11 < wrVar.Y0) {
            return ((TLObject) this.f41081l.get(i10 - i12)).equals(wrVar.G.get(i11 - wrVar.X0));
        }
        int i13 = this.f41077g;
        if (i10 >= i13 && i10 < this.h && i11 >= wrVar.U0 && i11 < wrVar.V0) {
            return ((TLObject) this.f41082m.get(i10 - i13)).equals(wrVar.H.get(i11 - wrVar.U0));
        }
        int i14 = this.f41075e;
        if (i10 >= i14 && i10 < this.f41076f && i11 >= wrVar.E0 && i11 < wrVar.F0) {
            return ((TLObject) this.f41080k.get(i10 - i14)).equals(wrVar.F.get(i11 - wrVar.E0));
        }
        if (this.f41074c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f41083n.f43618d1;
    }

    @Override
    public final int e() {
        return this.f41073b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        wr wrVar = this.f41083n;
        g(1, wrVar.f43656v0, sparseIntArray);
        g(2, wrVar.f43667z0, sparseIntArray);
        g(3, wrVar.A0, sparseIntArray);
        g(4, wrVar.C0, sparseIntArray);
        g(5, wrVar.D0, sparseIntArray);
        g(6, wrVar.G0, sparseIntArray);
        g(7, wrVar.H0, sparseIntArray);
        g(8, wrVar.f43650s0, sparseIntArray);
        g(9, wrVar.f43652t0, sparseIntArray);
        g(10, wrVar.f43654u0, sparseIntArray);
        g(11, wrVar.f43613b1, sparseIntArray);
        g(12, wrVar.f43616c1, sparseIntArray);
        g(13, wrVar.S, sparseIntArray);
        g(14, wrVar.T, sparseIntArray);
        g(15, wrVar.U, sparseIntArray);
        g(16, wrVar.f43620e0, sparseIntArray);
        g(17, wrVar.f43617d0, sparseIntArray);
        g(18, wrVar.f43623f0, sparseIntArray);
        g(19, wrVar.f43627h0, sparseIntArray);
        g(20, wrVar.m0, sparseIntArray);
        g(21, wrVar.f43629i0, sparseIntArray);
        g(22, wrVar.f43631j0, sparseIntArray);
        int i10 = 23;
        g(23, wrVar.f43633k0, sparseIntArray);
        if (wrVar.f43661x) {
            i10 = 24;
            g(24, wrVar.f43635l0, sparseIntArray);
        }
        g(i10 + 1, wrVar.f43625g0, sparseIntArray);
        g(i10 + 2, wrVar.B0, sparseIntArray);
        g(i10 + 3, wrVar.T0, sparseIntArray);
        g(i10 + 4, wrVar.W0, sparseIntArray);
        g(i10 + 5, wrVar.Z0, sparseIntArray);
        g(i10 + 6, wrVar.N0, sparseIntArray);
        g(i10 + 7, wrVar.O0, sparseIntArray);
        g(i10 + 8, wrVar.P0, sparseIntArray);
        g(i10 + 9, wrVar.Q0, sparseIntArray);
        g(i10 + 10, wrVar.S0, sparseIntArray);
        g(i10 + 11, wrVar.R0, sparseIntArray);
        g(i10 + 12, wrVar.f43610a1, sparseIntArray);
        g(i10 + 13, wrVar.f43624f1, sparseIntArray);
        g(i10 + 14, wrVar.f43626g1, sparseIntArray);
        g(i10 + 15, wrVar.f43628h1, sparseIntArray);
        g(i10 + 16, wrVar.f43630i1, sparseIntArray);
        g(i10 + 17, wrVar.f43632j1, sparseIntArray);
        g(i10 + 18, wrVar.f43638n0, sparseIntArray);
        g(i10 + 19, wrVar.f43640o0, sparseIntArray);
        g(i10 + 20, wrVar.f43642p0, sparseIntArray);
        g(i10 + 21, wrVar.f43644q0, sparseIntArray);
        g(i10 + 22, wrVar.f43647r0, sparseIntArray);
    }
}
