package org.telegram.ui;

import android.view.ViewGroup;
public final class k51 extends k7.d6 {
    public final int f38192a;
    public final ViewGroup f38193b;

    public k51(ViewGroup viewGroup, int i10) {
        this.f38192a = i10;
        this.f38193b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f38192a) {
            case 0:
                ((w61) this.f38193b).f42347t1 = false;
                return;
            default:
                ((qh.d1) this.f38193b).Y2 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f38192a) {
            case 0:
                ((w61) this.f38193b).f42347t1 = true;
                return;
            default:
                ((qh.d1) this.f38193b).Y2 = true;
                return;
        }
    }
}
