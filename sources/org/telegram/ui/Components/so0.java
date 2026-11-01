package org.telegram.ui.Components;

import android.util.SparseIntArray;
public final class so0 extends th.b {
    public final int f30403g;

    public so0(int i10) {
        this.f30403g = i10;
    }

    @Override
    public void k() {
        switch (this.f30403g) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.t6.f20873a7;
                int i11 = org.telegram.ui.ActionBar.t6.f21002h5;
                int h = h(i11);
                SparseIntArray sparseIntArray = this.f48805b;
                sparseIntArray.put(i10, h);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20931d7, -15264235);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.Le, org.telegram.ui.ActionBar.t6.r1(0.45f, -1));
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21020i5, 352321535);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21286wf, h(i11));
                return;
            case 1:
            default:
                return;
            case 2:
                this.f48805b.put(org.telegram.ui.ActionBar.t6.f20931d7, 352321535);
                return;
            case 3:
                this.f48805b.append(org.telegram.ui.ActionBar.t6.f21002h5, -14671840);
                return;
        }
    }

    public so0() {
        this.f30403g = 1;
        this.f48805b.put(org.telegram.ui.ActionBar.t6.f20930d6, -14537933);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.f21002h5, -14537933);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.f20873a7, -13616313);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.e7, -14142917);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.f7, -8090220);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.Qi, -14142917);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.G8, -13616313);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.H8, -14733761);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.F8, -1);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.E8, -1);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.tj, -231982259);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.f21260v6, -11683585);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.f21243u6, -10637330);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.W6, -12692893);
        this.f48805b.put(org.telegram.ui.ActionBar.t6.f21022i7, -15033089);
    }
}
