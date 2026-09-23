package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class kr extends s4.o {
    public int f34784b;
    public int e;
    public int f34786f;
    public int f34787g;
    public int h;
    public int f34788i;
    public int f34789j;
    public final qr f34793n;
    public final SparseIntArray f34785c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f34790k = new ArrayList();
    public final ArrayList f34791l = new ArrayList();
    public final ArrayList f34792m = new ArrayList();

    public kr(qr qrVar) {
        this.f34793n = qrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f34793n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f34788i;
        qr qrVar = this.f34793n;
        if (i10 >= i12 && i10 < this.f34789j && i11 >= qrVar.X0 && i11 < qrVar.Y0) {
            return ((TLObject) this.f34791l.get(i10 - i12)).equals(qrVar.G.get(i11 - qrVar.X0));
        }
        int i13 = this.f34787g;
        if (i10 >= i13 && i10 < this.h && i11 >= qrVar.U0 && i11 < qrVar.V0) {
            return ((TLObject) this.f34792m.get(i10 - i13)).equals(qrVar.H.get(i11 - qrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f34786f && i11 >= qrVar.E0 && i11 < qrVar.F0) {
            return ((TLObject) this.f34790k.get(i10 - i14)).equals(qrVar.F.get(i11 - qrVar.E0));
        }
        if (this.f34785c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f34793n.f36555d1;
    }

    @Override
    public final int e() {
        return this.f34784b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        qr qrVar = this.f34793n;
        g(1, qrVar.f36592v0, sparseIntArray);
        g(2, qrVar.f36603z0, sparseIntArray);
        g(3, qrVar.A0, sparseIntArray);
        g(4, qrVar.C0, sparseIntArray);
        g(5, qrVar.D0, sparseIntArray);
        g(6, qrVar.G0, sparseIntArray);
        g(7, qrVar.H0, sparseIntArray);
        g(8, qrVar.f36586s0, sparseIntArray);
        g(9, qrVar.f36588t0, sparseIntArray);
        g(10, qrVar.f36590u0, sparseIntArray);
        g(11, qrVar.f36550b1, sparseIntArray);
        g(12, qrVar.f36553c1, sparseIntArray);
        g(13, qrVar.S, sparseIntArray);
        g(14, qrVar.T, sparseIntArray);
        g(15, qrVar.U, sparseIntArray);
        g(16, qrVar.f36556e0, sparseIntArray);
        g(17, qrVar.f36554d0, sparseIntArray);
        g(18, qrVar.f36559f0, sparseIntArray);
        g(19, qrVar.f36563h0, sparseIntArray);
        g(20, qrVar.m0, sparseIntArray);
        g(21, qrVar.f36565i0, sparseIntArray);
        g(22, qrVar.f36567j0, sparseIntArray);
        int i10 = 23;
        g(23, qrVar.f36569k0, sparseIntArray);
        if (qrVar.f36597x) {
            i10 = 24;
            g(24, qrVar.f36571l0, sparseIntArray);
        }
        g(i10 + 1, qrVar.f36561g0, sparseIntArray);
        g(i10 + 2, qrVar.B0, sparseIntArray);
        g(i10 + 3, qrVar.T0, sparseIntArray);
        g(i10 + 4, qrVar.W0, sparseIntArray);
        g(i10 + 5, qrVar.Z0, sparseIntArray);
        g(i10 + 6, qrVar.N0, sparseIntArray);
        g(i10 + 7, qrVar.O0, sparseIntArray);
        g(i10 + 8, qrVar.P0, sparseIntArray);
        g(i10 + 9, qrVar.Q0, sparseIntArray);
        g(i10 + 10, qrVar.S0, sparseIntArray);
        g(i10 + 11, qrVar.R0, sparseIntArray);
        g(i10 + 12, qrVar.f36547a1, sparseIntArray);
        g(i10 + 13, qrVar.f36560f1, sparseIntArray);
        g(i10 + 14, qrVar.f36562g1, sparseIntArray);
        g(i10 + 15, qrVar.f36564h1, sparseIntArray);
        g(i10 + 16, qrVar.f36566i1, sparseIntArray);
        g(i10 + 17, qrVar.f36568j1, sparseIntArray);
        g(i10 + 18, qrVar.f36574n0, sparseIntArray);
        g(i10 + 19, qrVar.f36576o0, sparseIntArray);
        g(i10 + 20, qrVar.f36578p0, sparseIntArray);
        g(i10 + 21, qrVar.f36580q0, sparseIntArray);
        g(i10 + 22, qrVar.f36583r0, sparseIntArray);
    }
}
