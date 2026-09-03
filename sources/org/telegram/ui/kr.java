package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class kr extends f2.q {
    public int f38402b;
    public int f38404e;
    public int f38405f;
    public int f38406g;
    public int h;
    public int f38407i;
    public int f38408j;
    public final qr f38412n;
    public final SparseIntArray f38403c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f38409k = new ArrayList();
    public final ArrayList f38410l = new ArrayList();
    public final ArrayList f38411m = new ArrayList();

    public kr(qr qrVar) {
        this.f38412n = qrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f38412n.A0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f38407i;
        qr qrVar = this.f38412n;
        if (i10 >= i12 && i10 < this.f38408j && i11 >= qrVar.U0 && i11 < qrVar.V0) {
            return ((TLObject) this.f38410l.get(i10 - i12)).equals(qrVar.D.get(i11 - qrVar.U0));
        }
        int i13 = this.f38406g;
        if (i10 >= i13 && i10 < this.h && i11 >= qrVar.R0 && i11 < qrVar.S0) {
            return ((TLObject) this.f38411m.get(i10 - i13)).equals(qrVar.E.get(i11 - qrVar.R0));
        }
        int i14 = this.f38404e;
        if (i10 >= i14 && i10 < this.f38405f && i11 >= qrVar.B0 && i11 < qrVar.C0) {
            return ((TLObject) this.f38409k.get(i10 - i14)).equals(qrVar.C.get(i11 - qrVar.B0));
        }
        if (this.f38403c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f38412n.f40569a1;
    }

    @Override
    public final int e() {
        return this.f38402b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        qr qrVar = this.f38412n;
        g(1, qrVar.f40609s0, sparseIntArray);
        g(2, qrVar.f40618w0, sparseIntArray);
        g(3, qrVar.f40621x0, sparseIntArray);
        g(4, qrVar.f40626z0, sparseIntArray);
        g(5, qrVar.A0, sparseIntArray);
        g(6, qrVar.D0, sparseIntArray);
        g(7, qrVar.E0, sparseIntArray);
        g(8, qrVar.f40601p0, sparseIntArray);
        g(9, qrVar.f40603q0, sparseIntArray);
        g(10, qrVar.f40606r0, sparseIntArray);
        g(11, qrVar.Y0, sparseIntArray);
        g(12, qrVar.Z0, sparseIntArray);
        g(13, qrVar.P, sparseIntArray);
        g(14, qrVar.Q, sparseIntArray);
        g(15, qrVar.R, sparseIntArray);
        g(16, qrVar.f40571b0, sparseIntArray);
        g(17, qrVar.f40568a0, sparseIntArray);
        g(18, qrVar.f40574c0, sparseIntArray);
        g(19, qrVar.f40579e0, sparseIntArray);
        g(20, qrVar.f40590j0, sparseIntArray);
        g(21, qrVar.f40582f0, sparseIntArray);
        g(22, qrVar.f40584g0, sparseIntArray);
        int i10 = 23;
        g(23, qrVar.f40586h0, sparseIntArray);
        if (qrVar.f40620x) {
            i10 = 24;
            g(24, qrVar.f40588i0, sparseIntArray);
        }
        g(i10 + 1, qrVar.f40576d0, sparseIntArray);
        g(i10 + 2, qrVar.f40624y0, sparseIntArray);
        g(i10 + 3, qrVar.Q0, sparseIntArray);
        g(i10 + 4, qrVar.T0, sparseIntArray);
        g(i10 + 5, qrVar.W0, sparseIntArray);
        g(i10 + 6, qrVar.K0, sparseIntArray);
        g(i10 + 7, qrVar.L0, sparseIntArray);
        g(i10 + 8, qrVar.M0, sparseIntArray);
        g(i10 + 9, qrVar.N0, sparseIntArray);
        g(i10 + 10, qrVar.P0, sparseIntArray);
        g(i10 + 11, qrVar.O0, sparseIntArray);
        g(i10 + 12, qrVar.X0, sparseIntArray);
        g(i10 + 13, qrVar.f40575c1, sparseIntArray);
        g(i10 + 14, qrVar.f40577d1, sparseIntArray);
        g(i10 + 15, qrVar.f40580e1, sparseIntArray);
        g(i10 + 16, qrVar.f40583f1, sparseIntArray);
        g(i10 + 17, qrVar.f40585g1, sparseIntArray);
        g(i10 + 18, qrVar.f40592k0, sparseIntArray);
        g(i10 + 19, qrVar.f40594l0, sparseIntArray);
        g(i10 + 20, qrVar.m0, sparseIntArray);
        g(i10 + 21, qrVar.f40597n0, sparseIntArray);
        g(i10 + 22, qrVar.f40599o0, sparseIntArray);
    }
}
