package org.telegram.ui;

import android.view.ViewGroup;
public final class f51 extends k7.d6 {
    public final int f36762a;
    public final ViewGroup f36763b;

    public f51(ViewGroup viewGroup, int i10) {
        this.f36762a = i10;
        this.f36763b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f36762a) {
            case 0:
                ((r61) this.f36763b).f40824t1 = false;
                return;
            default:
                ((qh.d1) this.f36763b).Y2 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f36762a) {
            case 0:
                ((r61) this.f36763b).f40824t1 = true;
                return;
            default:
                ((qh.d1) this.f36763b).Y2 = true;
                return;
        }
    }
}
