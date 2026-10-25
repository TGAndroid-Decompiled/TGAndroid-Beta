package org.telegram.ui;

import android.util.SparseIntArray;
public final class gx0 extends s4.p {
    public int f39793b;
    public final SparseIntArray f39794c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity e;

    public gx0(PrivacyControlActivity privacyControlActivity) {
        this.e = privacyControlActivity;
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
        int i12 = this.f39794c.get(i10, -1);
        if (i12 == this.d.get(i11, -1) && i12 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.e.f35917q0;
    }

    @Override
    public final int e() {
        return this.f39793b;
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
        PrivacyControlActivity privacyControlActivity = this.e;
        g(1, privacyControlActivity.L, sparseIntArray);
        g(2, privacyControlActivity.M, sparseIntArray);
        i10 = privacyControlActivity.everybodyRow;
        g(3, i10, sparseIntArray);
        g(4, privacyControlActivity.N, sparseIntArray);
        i11 = privacyControlActivity.nobodyRow;
        g(5, i11, sparseIntArray);
        g(6, privacyControlActivity.f35906f0, sparseIntArray);
        g(7, privacyControlActivity.O, sparseIntArray);
        g(8, privacyControlActivity.Q, sparseIntArray);
        g(9, privacyControlActivity.R, sparseIntArray);
        g(10, privacyControlActivity.S, sparseIntArray);
        g(11, privacyControlActivity.T, sparseIntArray);
        g(12, privacyControlActivity.U, sparseIntArray);
        g(13, privacyControlActivity.V, sparseIntArray);
        g(14, privacyControlActivity.W, sparseIntArray);
        g(15, privacyControlActivity.X, sparseIntArray);
        i12 = privacyControlActivity.photoForRestRow;
        g(16, i12, sparseIntArray);
        i13 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i13, sparseIntArray);
        g(18, privacyControlActivity.Y, sparseIntArray);
        g(19, privacyControlActivity.Z, sparseIntArray);
        g(20, privacyControlActivity.f35898a0, sparseIntArray);
        g(21, privacyControlActivity.f35900b0, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.f35902c0, sparseIntArray);
        g(24, privacyControlActivity.f35903d0, sparseIntArray);
        g(25, privacyControlActivity.f35904e0, sparseIntArray);
        g(26, privacyControlActivity.f35907g0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.f35909i0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.f35910j0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.f35912l0, sparseIntArray);
        g(33, privacyControlActivity.f35911k0, sparseIntArray);
        g(34, privacyControlActivity.m0, sparseIntArray);
        g(35, privacyControlActivity.f35914n0, sparseIntArray);
        g(36, privacyControlActivity.f35915o0, sparseIntArray);
        g(37, privacyControlActivity.f35916p0, sparseIntArray);
    }
}
