package org.telegram.ui;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
public final class kq extends v4.o {
    public int f48737b;
    public int f48739e;
    public int f48740f;
    public int f48741g;
    public int h;
    public int f48742i;
    public int f48743j;
    public final qq f48747n;
    public final SparseIntArray f48738c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final ArrayList f48744k = new ArrayList();
    public final ArrayList f48745l = new ArrayList();
    public final ArrayList f48746m = new ArrayList();

    public kq(qq qqVar) {
        this.f48747n = qqVar;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        if (!b(i7, i10) || this.f48747n.D0 == i10) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f48742i;
        qq qqVar = this.f48747n;
        if (i7 >= i11 && i7 < this.f48743j && i10 >= qqVar.X0 && i10 < qqVar.Y0) {
            return ((TLObject) this.f48745l.get(i7 - i11)).equals(qqVar.G.get(i10 - qqVar.X0));
        }
        int i12 = this.f48741g;
        if (i7 >= i12 && i7 < this.h && i10 >= qqVar.U0 && i10 < qqVar.V0) {
            return ((TLObject) this.f48746m.get(i7 - i12)).equals(qqVar.H.get(i10 - qqVar.U0));
        }
        int i13 = this.f48739e;
        if (i7 >= i13 && i7 < this.f48740f && i10 >= qqVar.E0 && i10 < qqVar.F0) {
            return ((TLObject) this.f48744k.get(i7 - i13)).equals(qqVar.F.get(i10 - qqVar.E0));
        }
        if (this.f48738c.get(i7) == this.d.get(i10)) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f48747n.f50719d1;
    }

    @Override
    public final int e() {
        return this.f48737b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        qq qqVar = this.f48747n;
        g(1, qqVar.f50756v0, sparseIntArray);
        g(2, qqVar.f50767z0, sparseIntArray);
        g(3, qqVar.A0, sparseIntArray);
        g(4, qqVar.C0, sparseIntArray);
        g(5, qqVar.D0, sparseIntArray);
        g(6, qqVar.G0, sparseIntArray);
        g(7, qqVar.H0, sparseIntArray);
        g(8, qqVar.f50750s0, sparseIntArray);
        g(9, qqVar.f50752t0, sparseIntArray);
        g(10, qqVar.f50754u0, sparseIntArray);
        g(11, qqVar.f50714b1, sparseIntArray);
        g(12, qqVar.f50717c1, sparseIntArray);
        g(13, qqVar.S, sparseIntArray);
        g(14, qqVar.T, sparseIntArray);
        g(15, qqVar.U, sparseIntArray);
        g(16, qqVar.f50721e0, sparseIntArray);
        g(17, qqVar.f50718d0, sparseIntArray);
        g(18, qqVar.f50724f0, sparseIntArray);
        g(19, qqVar.f50728h0, sparseIntArray);
        g(20, qqVar.m0, sparseIntArray);
        g(21, qqVar.f50730i0, sparseIntArray);
        g(22, qqVar.f50732j0, sparseIntArray);
        int i7 = 23;
        g(23, qqVar.f50734k0, sparseIntArray);
        if (qqVar.f50761x) {
            i7 = 24;
            g(24, qqVar.f50736l0, sparseIntArray);
        }
        g(i7 + 1, qqVar.f50726g0, sparseIntArray);
        g(i7 + 2, qqVar.B0, sparseIntArray);
        g(i7 + 3, qqVar.T0, sparseIntArray);
        g(i7 + 4, qqVar.W0, sparseIntArray);
        g(i7 + 5, qqVar.Z0, sparseIntArray);
        g(i7 + 6, qqVar.N0, sparseIntArray);
        g(i7 + 7, qqVar.O0, sparseIntArray);
        g(i7 + 8, qqVar.P0, sparseIntArray);
        g(i7 + 9, qqVar.Q0, sparseIntArray);
        g(i7 + 10, qqVar.S0, sparseIntArray);
        g(i7 + 11, qqVar.R0, sparseIntArray);
        g(i7 + 12, qqVar.f50711a1, sparseIntArray);
        g(i7 + 13, qqVar.f50725f1, sparseIntArray);
        g(i7 + 14, qqVar.f50727g1, sparseIntArray);
        g(i7 + 15, qqVar.f50729h1, sparseIntArray);
        g(i7 + 16, qqVar.f50731i1, sparseIntArray);
        g(i7 + 17, qqVar.f50733j1, sparseIntArray);
        g(i7 + 18, qqVar.f50739n0, sparseIntArray);
        g(i7 + 19, qqVar.f50740o0, sparseIntArray);
        g(i7 + 20, qqVar.f50742p0, sparseIntArray);
        g(i7 + 21, qqVar.f50744q0, sparseIntArray);
        g(i7 + 22, qqVar.f50747r0, sparseIntArray);
    }
}
