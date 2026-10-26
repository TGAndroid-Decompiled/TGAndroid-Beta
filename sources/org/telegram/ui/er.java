package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class er extends s4.p {
    public int f39161b;
    public int e;
    public int f39163f;
    public int f39164g;
    public int h;
    public int f39165i;
    public int f39166j;
    public final kr f39170n;
    public final SparseIntArray f39162c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39167k = new ArrayList();
    public final ArrayList f39168l = new ArrayList();
    public final ArrayList f39169m = new ArrayList();

    public er(kr krVar) {
        this.f39170n = krVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f39170n.C0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f39165i;
        kr krVar = this.f39170n;
        if (i10 >= i12 && i10 < this.f39166j && i11 >= krVar.W0 && i11 < krVar.X0) {
            return ((TLObject) this.f39168l.get(i10 - i12)).equals(krVar.F.get(i11 - krVar.W0));
        }
        int i13 = this.f39164g;
        if (i10 >= i13 && i10 < this.h && i11 >= krVar.T0 && i11 < krVar.U0) {
            return ((TLObject) this.f39169m.get(i10 - i13)).equals(krVar.G.get(i11 - krVar.T0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f39163f && i11 >= krVar.D0 && i11 < krVar.E0) {
            return ((TLObject) this.f39167k.get(i10 - i14)).equals(krVar.E.get(i11 - krVar.D0));
        }
        if (this.f39162c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39170n.f41012c1;
    }

    @Override
    public final int e() {
        return this.f39161b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kr krVar = this.f39170n;
        g(1, krVar.f41049u0, sparseIntArray);
        g(2, krVar.f41060y0, sparseIntArray);
        g(3, krVar.f41062z0, sparseIntArray);
        g(4, krVar.B0, sparseIntArray);
        g(5, krVar.C0, sparseIntArray);
        g(6, krVar.F0, sparseIntArray);
        g(7, krVar.G0, sparseIntArray);
        g(8, krVar.f41042r0, sparseIntArray);
        g(9, krVar.f41045s0, sparseIntArray);
        g(10, krVar.f41047t0, sparseIntArray);
        g(11, krVar.f41006a1, sparseIntArray);
        g(12, krVar.f41009b1, sparseIntArray);
        g(13, krVar.R, sparseIntArray);
        g(14, krVar.S, sparseIntArray);
        g(15, krVar.T, sparseIntArray);
        g(16, krVar.f41013d0, sparseIntArray);
        g(17, krVar.f41011c0, sparseIntArray);
        g(18, krVar.f41015e0, sparseIntArray);
        g(19, krVar.f41020g0, sparseIntArray);
        g(20, krVar.f41030l0, sparseIntArray);
        g(21, krVar.f41022h0, sparseIntArray);
        g(22, krVar.f41024i0, sparseIntArray);
        int i10 = 23;
        g(23, krVar.f41026j0, sparseIntArray);
        if (krVar.f41053w) {
            i10 = 24;
            g(24, krVar.f41028k0, sparseIntArray);
        }
        g(i10 + 1, krVar.f41018f0, sparseIntArray);
        g(i10 + 2, krVar.A0, sparseIntArray);
        g(i10 + 3, krVar.S0, sparseIntArray);
        g(i10 + 4, krVar.V0, sparseIntArray);
        g(i10 + 5, krVar.Y0, sparseIntArray);
        g(i10 + 6, krVar.M0, sparseIntArray);
        g(i10 + 7, krVar.N0, sparseIntArray);
        g(i10 + 8, krVar.O0, sparseIntArray);
        g(i10 + 9, krVar.P0, sparseIntArray);
        g(i10 + 10, krVar.R0, sparseIntArray);
        g(i10 + 11, krVar.Q0, sparseIntArray);
        g(i10 + 12, krVar.Z0, sparseIntArray);
        g(i10 + 13, krVar.f41016e1, sparseIntArray);
        g(i10 + 14, krVar.f41019f1, sparseIntArray);
        g(i10 + 15, krVar.f41021g1, sparseIntArray);
        g(i10 + 16, krVar.f41023h1, sparseIntArray);
        g(i10 + 17, krVar.f41025i1, sparseIntArray);
        g(i10 + 18, krVar.m0, sparseIntArray);
        g(i10 + 19, krVar.f41033n0, sparseIntArray);
        g(i10 + 20, krVar.f41035o0, sparseIntArray);
        g(i10 + 21, krVar.f41037p0, sparseIntArray);
        g(i10 + 22, krVar.f41039q0, sparseIntArray);
    }
}
