package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class kr extends s4.o {
    public int f35133b;
    public int e;
    public int f35135f;
    public int f35136g;
    public int h;
    public int f35137i;
    public int f35138j;
    public final qr f35142n;
    public final SparseIntArray f35134c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f35139k = new ArrayList();
    public final ArrayList f35140l = new ArrayList();
    public final ArrayList f35141m = new ArrayList();

    public kr(qr qrVar) {
        this.f35142n = qrVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f35142n.D0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35137i;
        qr qrVar = this.f35142n;
        if (i10 >= i12 && i10 < this.f35138j && i11 >= qrVar.X0 && i11 < qrVar.Y0) {
            return ((TLObject) this.f35140l.get(i10 - i12)).equals(qrVar.G.get(i11 - qrVar.X0));
        }
        int i13 = this.f35136g;
        if (i10 >= i13 && i10 < this.h && i11 >= qrVar.U0 && i11 < qrVar.V0) {
            return ((TLObject) this.f35141m.get(i10 - i13)).equals(qrVar.H.get(i11 - qrVar.U0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f35135f && i11 >= qrVar.E0 && i11 < qrVar.F0) {
            return ((TLObject) this.f35139k.get(i10 - i14)).equals(qrVar.F.get(i11 - qrVar.E0));
        }
        if (this.f35134c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35142n.f36827d1;
    }

    @Override
    public final int e() {
        return this.f35133b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        qr qrVar = this.f35142n;
        g(1, qrVar.f36864v0, sparseIntArray);
        g(2, qrVar.f36875z0, sparseIntArray);
        g(3, qrVar.A0, sparseIntArray);
        g(4, qrVar.C0, sparseIntArray);
        g(5, qrVar.D0, sparseIntArray);
        g(6, qrVar.G0, sparseIntArray);
        g(7, qrVar.H0, sparseIntArray);
        g(8, qrVar.f36858s0, sparseIntArray);
        g(9, qrVar.f36860t0, sparseIntArray);
        g(10, qrVar.f36862u0, sparseIntArray);
        g(11, qrVar.f36822b1, sparseIntArray);
        g(12, qrVar.f36825c1, sparseIntArray);
        g(13, qrVar.S, sparseIntArray);
        g(14, qrVar.T, sparseIntArray);
        g(15, qrVar.U, sparseIntArray);
        g(16, qrVar.f36828e0, sparseIntArray);
        g(17, qrVar.f36826d0, sparseIntArray);
        g(18, qrVar.f36831f0, sparseIntArray);
        g(19, qrVar.f36835h0, sparseIntArray);
        g(20, qrVar.m0, sparseIntArray);
        g(21, qrVar.f36837i0, sparseIntArray);
        g(22, qrVar.f36839j0, sparseIntArray);
        int i10 = 23;
        g(23, qrVar.f36841k0, sparseIntArray);
        if (qrVar.f36869x) {
            i10 = 24;
            g(24, qrVar.f36843l0, sparseIntArray);
        }
        g(i10 + 1, qrVar.f36833g0, sparseIntArray);
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
        g(i10 + 12, qrVar.f36819a1, sparseIntArray);
        g(i10 + 13, qrVar.f36832f1, sparseIntArray);
        g(i10 + 14, qrVar.f36834g1, sparseIntArray);
        g(i10 + 15, qrVar.f36836h1, sparseIntArray);
        g(i10 + 16, qrVar.f36838i1, sparseIntArray);
        g(i10 + 17, qrVar.f36840j1, sparseIntArray);
        g(i10 + 18, qrVar.f36846n0, sparseIntArray);
        g(i10 + 19, qrVar.f36848o0, sparseIntArray);
        g(i10 + 20, qrVar.f36850p0, sparseIntArray);
        g(i10 + 21, qrVar.f36852q0, sparseIntArray);
        g(i10 + 22, qrVar.f36855r0, sparseIntArray);
    }
}
