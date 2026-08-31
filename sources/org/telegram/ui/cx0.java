package org.telegram.ui;

import android.util.SparseIntArray;
public final class cx0 extends f2.q {
    public int f35924b;
    public final SparseIntArray f35925c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f35926e;

    public cx0(PrivacyControlActivity privacyControlActivity) {
        this.f35926e = privacyControlActivity;
    }

    public static void g(int i10, int i11, SparseIntArray sparseIntArray) {
        if (i11 >= 0) {
            sparseIntArray.put(i11, i10);
        }
    }

    @Override
    public final boolean a(int i10, int i11) {
        return b(i10, i11);
    }

    @Override
    public final boolean b(int i10, int i11) {
        int i12 = this.f35925c.get(i10, -1);
        if (i12 == this.d.get(i11, -1) && i12 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f35926e.f34532o0;
    }

    @Override
    public final int e() {
        return this.f35924b;
    }

    public final void f(SparseIntArray sparseIntArray) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        sparseIntArray.clear();
        PrivacyControlActivity privacyControlActivity = this.f35926e;
        g(1, privacyControlActivity.J, sparseIntArray);
        g(2, privacyControlActivity.K, sparseIntArray);
        i10 = privacyControlActivity.everybodyRow;
        g(3, i10, sparseIntArray);
        g(4, privacyControlActivity.L, sparseIntArray);
        i11 = privacyControlActivity.nobodyRow;
        g(5, i11, sparseIntArray);
        g(6, privacyControlActivity.f34519d0, sparseIntArray);
        g(7, privacyControlActivity.M, sparseIntArray);
        g(8, privacyControlActivity.O, sparseIntArray);
        g(9, privacyControlActivity.P, sparseIntArray);
        g(10, privacyControlActivity.Q, sparseIntArray);
        g(11, privacyControlActivity.R, sparseIntArray);
        g(12, privacyControlActivity.S, sparseIntArray);
        g(13, privacyControlActivity.T, sparseIntArray);
        g(14, privacyControlActivity.U, sparseIntArray);
        g(15, privacyControlActivity.V, sparseIntArray);
        i12 = privacyControlActivity.photoForRestRow;
        g(16, i12, sparseIntArray);
        i13 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i13, sparseIntArray);
        g(18, privacyControlActivity.W, sparseIntArray);
        g(19, privacyControlActivity.X, sparseIntArray);
        g(20, privacyControlActivity.Y, sparseIntArray);
        g(21, privacyControlActivity.Z, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.f34514a0, sparseIntArray);
        g(24, privacyControlActivity.f34516b0, sparseIntArray);
        g(25, privacyControlActivity.f34518c0, sparseIntArray);
        g(26, privacyControlActivity.f34521e0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.f34524g0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.f34525h0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.f34527j0, sparseIntArray);
        g(33, privacyControlActivity.f34526i0, sparseIntArray);
        g(34, privacyControlActivity.f34528k0, sparseIntArray);
        g(35, privacyControlActivity.f34529l0, sparseIntArray);
        g(36, privacyControlActivity.m0, sparseIntArray);
        g(37, privacyControlActivity.f34531n0, sparseIntArray);
    }
}
