package org.telegram.ui;

import android.util.SparseIntArray;
public final class gt0 extends v4.o {
    public int f46110b;
    public final SparseIntArray f46111c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f46112e;

    public gt0(PrivacyControlActivity privacyControlActivity) {
        this.f46112e = privacyControlActivity;
    }

    public static void g(int i7, int i10, SparseIntArray sparseIntArray) {
        if (i10 >= 0) {
            sparseIntArray.put(i10, i7);
        }
    }

    @Override
    public final boolean a(int i7, int i10) {
        return b(i7, i10);
    }

    @Override
    public final boolean b(int i7, int i10) {
        int i11 = this.f46111c.get(i7, -1);
        if (i11 == this.d.get(i10, -1) && i11 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f46112e.f41666s0;
    }

    @Override
    public final int e() {
        return this.f46110b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.f46112e;
        g(1, privacyControlActivity.N, sparseIntArray);
        g(2, privacyControlActivity.O, sparseIntArray);
        i7 = privacyControlActivity.everybodyRow;
        g(3, i7, sparseIntArray);
        g(4, privacyControlActivity.P, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.f41653h0, sparseIntArray);
        g(7, privacyControlActivity.Q, sparseIntArray);
        g(8, privacyControlActivity.S, sparseIntArray);
        g(9, privacyControlActivity.T, sparseIntArray);
        g(10, privacyControlActivity.U, sparseIntArray);
        g(11, privacyControlActivity.V, sparseIntArray);
        g(12, privacyControlActivity.W, sparseIntArray);
        g(13, privacyControlActivity.X, sparseIntArray);
        g(14, privacyControlActivity.Y, sparseIntArray);
        g(15, privacyControlActivity.Z, sparseIntArray);
        i11 = privacyControlActivity.photoForRestRow;
        g(16, i11, sparseIntArray);
        i12 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i12, sparseIntArray);
        g(18, privacyControlActivity.f41642a0, sparseIntArray);
        g(19, privacyControlActivity.f41644b0, sparseIntArray);
        g(20, privacyControlActivity.f41646c0, sparseIntArray);
        g(21, privacyControlActivity.f41647d0, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.f41649e0, sparseIntArray);
        g(24, privacyControlActivity.f41651f0, sparseIntArray);
        g(25, privacyControlActivity.f41652g0, sparseIntArray);
        g(26, privacyControlActivity.f41654i0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.f41656k0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.f41657l0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.f41659n0, sparseIntArray);
        g(33, privacyControlActivity.m0, sparseIntArray);
        g(34, privacyControlActivity.f41660o0, sparseIntArray);
        g(35, privacyControlActivity.f41661p0, sparseIntArray);
        g(36, privacyControlActivity.f41662q0, sparseIntArray);
        g(37, privacyControlActivity.f41664r0, sparseIntArray);
    }
}
