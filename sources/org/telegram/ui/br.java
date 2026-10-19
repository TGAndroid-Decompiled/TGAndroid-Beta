package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class br extends s4.o {
    public int f35719b;
    public int e;
    public int f35721f;
    public int f35722g;
    public int h;
    public int f35723i;
    public int f35724j;
    public final hr f35728n;
    public final SparseIntArray f35720c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35725k = new ArrayList();
    public final ArrayList f35726l = new ArrayList();
    public final ArrayList f35727m = new ArrayList();

    public br(hr hrVar) {
        this.f35728n = hrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35728n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35723i;
        hr hrVar = this.f35728n;
        if (i10 >= i12 && i10 < this.f35724j && i11 >= hrVar.X0 && i11 < hrVar.Y0) {
            return ((TLObject) this.f35726l.get(i10 - i12)).equals(hrVar.G.get(i11 - hrVar.X0));
        }
        int i13 = this.f35722g;
        if (i10 >= i13 && i10 < this.h && i11 >= hrVar.U0 && i11 < hrVar.V0) {
            return ((TLObject) this.f35727m.get(i10 - i13)).equals(hrVar.H.get(i11 - hrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35721f && i11 >= hrVar.E0 && i11 < hrVar.F0) {
            return ((TLObject) this.f35725k.get(i10 - i14)).equals(hrVar.F.get(i11 - hrVar.E0));
        }
        if (this.f35720c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35728n.f37719d1;
    }

    @Override
    public final int e() {
        return this.f35719b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        hr hrVar = this.f35728n;
        g(1, hrVar.f37756v0, sparseIntArray);
        g(2, hrVar.f37767z0, sparseIntArray);
        g(3, hrVar.A0, sparseIntArray);
        g(4, hrVar.C0, sparseIntArray);
        g(5, hrVar.D0, sparseIntArray);
        g(6, hrVar.G0, sparseIntArray);
        g(7, hrVar.H0, sparseIntArray);
        g(8, hrVar.f37750s0, sparseIntArray);
        g(9, hrVar.f37752t0, sparseIntArray);
        g(10, hrVar.f37754u0, sparseIntArray);
        g(11, hrVar.f37714b1, sparseIntArray);
        g(12, hrVar.f37717c1, sparseIntArray);
        g(13, hrVar.S, sparseIntArray);
        g(14, hrVar.T, sparseIntArray);
        g(15, hrVar.U, sparseIntArray);
        g(16, hrVar.f37720e0, sparseIntArray);
        g(17, hrVar.f37718d0, sparseIntArray);
        g(18, hrVar.f37723f0, sparseIntArray);
        g(19, hrVar.f37727h0, sparseIntArray);
        g(20, hrVar.m0, sparseIntArray);
        g(21, hrVar.f37729i0, sparseIntArray);
        g(22, hrVar.f37731j0, sparseIntArray);
        int i10 = 23;
        g(23, hrVar.f37733k0, sparseIntArray);
        if (hrVar.f37761x) {
            i10 = 24;
            g(24, hrVar.f37735l0, sparseIntArray);
        }
        g(i10 + 1, hrVar.f37725g0, sparseIntArray);
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
        g(i10 + 12, hrVar.f37711a1, sparseIntArray);
        g(i10 + 13, hrVar.f37724f1, sparseIntArray);
        g(i10 + 14, hrVar.f37726g1, sparseIntArray);
        g(i10 + 15, hrVar.f37728h1, sparseIntArray);
        g(i10 + 16, hrVar.f37730i1, sparseIntArray);
        g(i10 + 17, hrVar.f37732j1, sparseIntArray);
        g(i10 + 18, hrVar.f37738n0, sparseIntArray);
        g(i10 + 19, hrVar.f37740o0, sparseIntArray);
        g(i10 + 20, hrVar.f37742p0, sparseIntArray);
        g(i10 + 21, hrVar.f37744q0, sparseIntArray);
        g(i10 + 22, hrVar.f37747r0, sparseIntArray);
    }
}
