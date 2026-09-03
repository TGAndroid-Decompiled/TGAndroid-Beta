package org.telegram.ui;

import android.view.ViewGroup;
public final class k51 extends k7.c6 {
    public final int f35426a;
    public final ViewGroup f35427b;

    public k51(ViewGroup viewGroup, int i10) {
        this.f35426a = i10;
        this.f35427b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f35426a) {
            case 0:
                ((x61) this.f35427b).f39895t1 = false;
                return;
            default:
                ((ph.d1) this.f35427b).Y2 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f35426a) {
            case 0:
                ((x61) this.f35427b).f39895t1 = true;
                return;
            default:
                ((ph.d1) this.f35427b).Y2 = true;
                return;
        }
    }
}
