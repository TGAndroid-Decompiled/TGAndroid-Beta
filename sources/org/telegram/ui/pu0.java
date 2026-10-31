package org.telegram.ui;

import android.util.SparseIntArray;
public final class pu0 extends s4.n {
    public int f40790b;
    public final SparseIntArray f40791c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity e;

    public pu0(PrivacyControlActivity privacyControlActivity) {
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
        int i12 = this.f40791c.get(i10, -1);
        if (i12 == this.d.get(i11, -1) && i12 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.e.f33744q0;
    }

    @Override
    public final int e() {
        return this.f40790b;
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
        g(6, privacyControlActivity.f33733f0, sparseIntArray);
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
        g(20, privacyControlActivity.f33725a0, sparseIntArray);
        g(21, privacyControlActivity.f33727b0, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.f33729c0, sparseIntArray);
        g(24, privacyControlActivity.f33730d0, sparseIntArray);
        g(25, privacyControlActivity.f33731e0, sparseIntArray);
        g(26, privacyControlActivity.f33734g0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.f33736i0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.f33737j0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.f33739l0, sparseIntArray);
        g(33, privacyControlActivity.f33738k0, sparseIntArray);
        g(34, privacyControlActivity.m0, sparseIntArray);
        g(35, privacyControlActivity.f33741n0, sparseIntArray);
        g(36, privacyControlActivity.f33742o0, sparseIntArray);
        g(37, privacyControlActivity.f33743p0, sparseIntArray);
    }
}
