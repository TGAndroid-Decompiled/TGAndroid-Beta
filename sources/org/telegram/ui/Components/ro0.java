package org.telegram.ui.Components;

import android.util.SparseIntArray;
public final class ro0 extends th.b {
    public final int f29991g;

    public ro0(int i10) {
        this.f29991g = i10;
    }

    @Override
    public void k() {
        switch (this.f29991g) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.t6.f20872a7;
                int i11 = org.telegram.ui.ActionBar.t6.f21001h5;
                int h = h(i11);
                SparseIntArray sparseIntArray = this.f48791b;
                sparseIntArray.put(i10, h);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20930d7, -15264235);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.Le, org.telegram.ui.ActionBar.t6.r1(0.45f, -1));
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21019i5, 352321535);
                sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21285wf, h(i11));
                return;
            case 1:
            default:
                return;
            case 2:
                this.f48791b.put(org.telegram.ui.ActionBar.t6.f20930d7, 352321535);
                return;
            case 3:
                this.f48791b.append(org.telegram.ui.ActionBar.t6.f21001h5, -14671840);
                return;
        }
    }

    public ro0() {
        this.f29991g = 1;
        this.f48791b.put(org.telegram.ui.ActionBar.t6.f20929d6, -14537933);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.f21001h5, -14537933);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.f20872a7, -13616313);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.e7, -14142917);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.f7, -8090220);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.Qi, -14142917);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.G8, -13616313);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.H8, -14733761);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.F8, -1);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.E8, -1);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.tj, -231982259);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.f21259v6, -11683585);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.f21242u6, -10637330);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.W6, -12692893);
        this.f48791b.put(org.telegram.ui.ActionBar.t6.f21021i7, -15033089);
    }
}
