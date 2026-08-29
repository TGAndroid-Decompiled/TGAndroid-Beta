package org.telegram.ui;

import android.util.SparseIntArray;
public final class pw0 extends f2.q {
    public int f41481b;
    public final SparseIntArray f41482c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f41483e;

    public pw0(PrivacyControlActivity privacyControlActivity) {
        this.f41483e = privacyControlActivity;
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
        int i12 = this.f41482c.get(i10, -1);
        if (i12 == this.d.get(i11, -1) && i12 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f41483e.f35955n0;
    }

    @Override
    public final int e() {
        return this.f41481b;
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
        PrivacyControlActivity privacyControlActivity = this.f41483e;
        g(1, privacyControlActivity.I, sparseIntArray);
        g(2, privacyControlActivity.J, sparseIntArray);
        i10 = privacyControlActivity.everybodyRow;
        g(3, i10, sparseIntArray);
        g(4, privacyControlActivity.K, sparseIntArray);
        i11 = privacyControlActivity.nobodyRow;
        g(5, i11, sparseIntArray);
        g(6, privacyControlActivity.f35942c0, sparseIntArray);
        g(7, privacyControlActivity.L, sparseIntArray);
        g(8, privacyControlActivity.N, sparseIntArray);
        g(9, privacyControlActivity.O, sparseIntArray);
        g(10, privacyControlActivity.P, sparseIntArray);
        g(11, privacyControlActivity.Q, sparseIntArray);
        g(12, privacyControlActivity.R, sparseIntArray);
        g(13, privacyControlActivity.S, sparseIntArray);
        g(14, privacyControlActivity.T, sparseIntArray);
        g(15, privacyControlActivity.U, sparseIntArray);
        i12 = privacyControlActivity.photoForRestRow;
        g(16, i12, sparseIntArray);
        i13 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i13, sparseIntArray);
        g(18, privacyControlActivity.V, sparseIntArray);
        g(19, privacyControlActivity.W, sparseIntArray);
        g(20, privacyControlActivity.X, sparseIntArray);
        g(21, privacyControlActivity.Y, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.Z, sparseIntArray);
        g(24, privacyControlActivity.f35938a0, sparseIntArray);
        g(25, privacyControlActivity.f35940b0, sparseIntArray);
        g(26, privacyControlActivity.f35943d0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.f35947f0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.f35948g0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.f35950i0, sparseIntArray);
        g(33, privacyControlActivity.f35949h0, sparseIntArray);
        g(34, privacyControlActivity.f35951j0, sparseIntArray);
        g(35, privacyControlActivity.f35952k0, sparseIntArray);
        g(36, privacyControlActivity.f35953l0, sparseIntArray);
        g(37, privacyControlActivity.m0, sparseIntArray);
    }
}
