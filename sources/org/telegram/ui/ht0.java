package org.telegram.ui;

import android.util.SparseIntArray;
public final class ht0 extends v4.o {
    public int f48526b;
    public final SparseIntArray f48527c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f48528e;

    public ht0(PrivacyControlActivity privacyControlActivity) {
        this.f48528e = privacyControlActivity;
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
        int i11 = this.f48527c.get(i7, -1);
        if (i11 == this.d.get(i10, -1) && i11 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f48528e.f43527t0;
    }

    @Override
    public final int e() {
        return this.f48526b;
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
        PrivacyControlActivity privacyControlActivity = this.f48528e;
        g(1, privacyControlActivity.O, sparseIntArray);
        g(2, privacyControlActivity.P, sparseIntArray);
        i7 = privacyControlActivity.everybodyRow;
        g(3, i7, sparseIntArray);
        g(4, privacyControlActivity.Q, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.f43514i0, sparseIntArray);
        g(7, privacyControlActivity.R, sparseIntArray);
        g(8, privacyControlActivity.T, sparseIntArray);
        g(9, privacyControlActivity.U, sparseIntArray);
        g(10, privacyControlActivity.V, sparseIntArray);
        g(11, privacyControlActivity.W, sparseIntArray);
        g(12, privacyControlActivity.X, sparseIntArray);
        g(13, privacyControlActivity.Y, sparseIntArray);
        g(14, privacyControlActivity.Z, sparseIntArray);
        g(15, privacyControlActivity.f43502a0, sparseIntArray);
        i11 = privacyControlActivity.photoForRestRow;
        g(16, i11, sparseIntArray);
        i12 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i12, sparseIntArray);
        g(18, privacyControlActivity.f43504b0, sparseIntArray);
        g(19, privacyControlActivity.f43506c0, sparseIntArray);
        g(20, privacyControlActivity.f43507d0, sparseIntArray);
        g(21, privacyControlActivity.f43509e0, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.f43511f0, sparseIntArray);
        g(24, privacyControlActivity.f43512g0, sparseIntArray);
        g(25, privacyControlActivity.f43513h0, sparseIntArray);
        g(26, privacyControlActivity.f43515j0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.f43517l0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.m0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.f43520o0, sparseIntArray);
        g(33, privacyControlActivity.f43519n0, sparseIntArray);
        g(34, privacyControlActivity.f43521p0, sparseIntArray);
        g(35, privacyControlActivity.f43522q0, sparseIntArray);
        g(36, privacyControlActivity.f43524r0, sparseIntArray);
        g(37, privacyControlActivity.f43526s0, sparseIntArray);
    }
}
