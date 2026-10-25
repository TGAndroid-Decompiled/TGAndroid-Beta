package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class er extends s4.p {
    public int f39158b;
    public int e;
    public int f39160f;
    public int f39161g;
    public int h;
    public int f39162i;
    public int f39163j;
    public final kr f39167n;
    public final SparseIntArray f39159c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f39164k = new ArrayList();
    public final ArrayList f39165l = new ArrayList();
    public final ArrayList f39166m = new ArrayList();

    public er(kr krVar) {
        this.f39167n = krVar;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        if (!b(i10, i11) || this.f39167n.C0 == i11) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f39162i;
        kr krVar = this.f39167n;
        if (i10 >= i12 && i10 < this.f39163j && i11 >= krVar.W0 && i11 < krVar.X0) {
            return ((TLObject) this.f39165l.get(i10 - i12)).equals(krVar.F.get(i11 - krVar.W0));
        }
        int i13 = this.f39161g;
        if (i10 >= i13 && i10 < this.h && i11 >= krVar.T0 && i11 < krVar.U0) {
            return ((TLObject) this.f39166m.get(i10 - i13)).equals(krVar.G.get(i11 - krVar.T0));
        }
        int i14 = this.e;
        if (i10 >= i14 && i10 < this.f39160f && i11 >= krVar.D0 && i11 < krVar.E0) {
            return ((TLObject) this.f39164k.get(i10 - i14)).equals(krVar.E.get(i11 - krVar.D0));
        }
        if (this.f39159c.get(i10) == this.d.get(i11)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f39167n.f41009c1;
    }

    @Override
    public final int e() {
        return this.f39158b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        kr krVar = this.f39167n;
        g(1, krVar.f41046u0, sparseIntArray);
        g(2, krVar.f41057y0, sparseIntArray);
        g(3, krVar.f41059z0, sparseIntArray);
        g(4, krVar.B0, sparseIntArray);
        g(5, krVar.C0, sparseIntArray);
        g(6, krVar.F0, sparseIntArray);
        g(7, krVar.G0, sparseIntArray);
        g(8, krVar.f41039r0, sparseIntArray);
        g(9, krVar.f41042s0, sparseIntArray);
        g(10, krVar.f41044t0, sparseIntArray);
        g(11, krVar.f41003a1, sparseIntArray);
        g(12, krVar.f41006b1, sparseIntArray);
        g(13, krVar.R, sparseIntArray);
        g(14, krVar.S, sparseIntArray);
        g(15, krVar.T, sparseIntArray);
        g(16, krVar.f41010d0, sparseIntArray);
        g(17, krVar.f41008c0, sparseIntArray);
        g(18, krVar.f41012e0, sparseIntArray);
        g(19, krVar.f41017g0, sparseIntArray);
        g(20, krVar.f41027l0, sparseIntArray);
        g(21, krVar.f41019h0, sparseIntArray);
        g(22, krVar.f41021i0, sparseIntArray);
        int i10 = 23;
        g(23, krVar.f41023j0, sparseIntArray);
        if (krVar.f41050w) {
            i10 = 24;
            g(24, krVar.f41025k0, sparseIntArray);
        }
        g(i10 + 1, krVar.f41015f0, sparseIntArray);
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
        g(i10 + 13, krVar.f41013e1, sparseIntArray);
        g(i10 + 14, krVar.f41016f1, sparseIntArray);
        g(i10 + 15, krVar.f41018g1, sparseIntArray);
        g(i10 + 16, krVar.f41020h1, sparseIntArray);
        g(i10 + 17, krVar.f41022i1, sparseIntArray);
        g(i10 + 18, krVar.m0, sparseIntArray);
        g(i10 + 19, krVar.f41030n0, sparseIntArray);
        g(i10 + 20, krVar.f41032o0, sparseIntArray);
        g(i10 + 21, krVar.f41034p0, sparseIntArray);
        g(i10 + 22, krVar.f41036q0, sparseIntArray);
    }
}
