package org.telegram.ui;

import android.util.SparseIntArray;
public final class bx0 extends s4.o {
    public int f36158b;
    public final SparseIntArray f36159c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity e;

    public bx0(PrivacyControlActivity privacyControlActivity) {
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
        int i12 = this.f36159c.get(i10, -1);
        if (i12 == this.d.get(i11, -1) && i12 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.e.f33860s0;
    }

    @Override
    public final int e() {
        return this.f36158b;
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
        g(1, privacyControlActivity.N, sparseIntArray);
        g(2, privacyControlActivity.O, sparseIntArray);
        i10 = privacyControlActivity.everybodyRow;
        g(3, i10, sparseIntArray);
        g(4, privacyControlActivity.P, sparseIntArray);
        i11 = privacyControlActivity.nobodyRow;
        g(5, i11, sparseIntArray);
        g(6, privacyControlActivity.f33847h0, sparseIntArray);
        g(7, privacyControlActivity.Q, sparseIntArray);
        g(8, privacyControlActivity.S, sparseIntArray);
        g(9, privacyControlActivity.T, sparseIntArray);
        g(10, privacyControlActivity.U, sparseIntArray);
        g(11, privacyControlActivity.V, sparseIntArray);
        g(12, privacyControlActivity.W, sparseIntArray);
        g(13, privacyControlActivity.X, sparseIntArray);
        g(14, privacyControlActivity.Y, sparseIntArray);
        g(15, privacyControlActivity.Z, sparseIntArray);
        i12 = privacyControlActivity.photoForRestRow;
        g(16, i12, sparseIntArray);
        i13 = privacyControlActivity.currentPhotoForRestRow;
        g(17, i13, sparseIntArray);
        g(18, privacyControlActivity.f33837a0, sparseIntArray);
        g(19, privacyControlActivity.f33839b0, sparseIntArray);
        g(20, privacyControlActivity.f33841c0, sparseIntArray);
        g(21, privacyControlActivity.f33842d0, sparseIntArray);
        i14 = privacyControlActivity.readRow;
        g(22, i14, sparseIntArray);
        g(23, privacyControlActivity.f33843e0, sparseIntArray);
        g(24, privacyControlActivity.f33845f0, sparseIntArray);
        g(25, privacyControlActivity.f33846g0, sparseIntArray);
        g(26, privacyControlActivity.f33848i0, sparseIntArray);
        i15 = privacyControlActivity.priceRow;
        g(27, i15, sparseIntArray);
        g(28, privacyControlActivity.f33850k0, sparseIntArray);
        i16 = privacyControlActivity.showGiftIconRow;
        g(29, i16, sparseIntArray);
        g(30, privacyControlActivity.f33851l0, sparseIntArray);
        i17 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i17, sparseIntArray);
        g(32, privacyControlActivity.f33853n0, sparseIntArray);
        g(33, privacyControlActivity.m0, sparseIntArray);
        g(34, privacyControlActivity.f33854o0, sparseIntArray);
        g(35, privacyControlActivity.f33855p0, sparseIntArray);
        g(36, privacyControlActivity.f33856q0, sparseIntArray);
        g(37, privacyControlActivity.f33858r0, sparseIntArray);
    }
}
