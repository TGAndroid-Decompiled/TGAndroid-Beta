package org.telegram.ui;

import android.util.SparseIntArray;
public final class gt0 extends v4.o {
    public int f46108b;
    public final SparseIntArray f46109c = new SparseIntArray();
    public final SparseIntArray d = new SparseIntArray();
    public final PrivacyControlActivity f46110e;

    public gt0(PrivacyControlActivity privacyControlActivity) {
        this.f46110e = privacyControlActivity;
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
        int i11 = this.f46109c.get(i7, -1);
        if (i11 == this.d.get(i10, -1) && i11 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int d() {
        return this.f46110e.f41662s0;
    }

    @Override
    public final int e() {
        return this.f46108b;
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
        PrivacyControlActivity privacyControlActivity = this.f46110e;
        g(1, privacyControlActivity.N, sparseIntArray);
        g(2, privacyControlActivity.O, sparseIntArray);
        i7 = privacyControlActivity.everybodyRow;
        g(3, i7, sparseIntArray);
        g(4, privacyControlActivity.P, sparseIntArray);
        i10 = privacyControlActivity.nobodyRow;
        g(5, i10, sparseIntArray);
        g(6, privacyControlActivity.f41649h0, sparseIntArray);
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
        g(18, privacyControlActivity.f41638a0, sparseIntArray);
        g(19, privacyControlActivity.f41640b0, sparseIntArray);
        g(20, privacyControlActivity.f41642c0, sparseIntArray);
        g(21, privacyControlActivity.f41643d0, sparseIntArray);
        i13 = privacyControlActivity.readRow;
        g(22, i13, sparseIntArray);
        g(23, privacyControlActivity.f41645e0, sparseIntArray);
        g(24, privacyControlActivity.f41647f0, sparseIntArray);
        g(25, privacyControlActivity.f41648g0, sparseIntArray);
        g(26, privacyControlActivity.f41650i0, sparseIntArray);
        i14 = privacyControlActivity.priceRow;
        g(27, i14, sparseIntArray);
        g(28, privacyControlActivity.f41652k0, sparseIntArray);
        i15 = privacyControlActivity.showGiftIconRow;
        g(29, i15, sparseIntArray);
        g(30, privacyControlActivity.f41653l0, sparseIntArray);
        i16 = privacyControlActivity.giftTypesHeaderRow;
        g(31, i16, sparseIntArray);
        g(32, privacyControlActivity.f41655n0, sparseIntArray);
        g(33, privacyControlActivity.m0, sparseIntArray);
        g(34, privacyControlActivity.f41656o0, sparseIntArray);
        g(35, privacyControlActivity.f41657p0, sparseIntArray);
        g(36, privacyControlActivity.f41658q0, sparseIntArray);
        g(37, privacyControlActivity.f41660r0, sparseIntArray);
    }
}
