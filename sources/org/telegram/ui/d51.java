package org.telegram.ui;

import android.view.ViewGroup;
public final class d51 extends k7.c6 {
    public final int f33518a;
    public final ViewGroup f33519b;

    public d51(ViewGroup viewGroup, int i10) {
        this.f33518a = i10;
        this.f33519b = viewGroup;
    }

    @Override
    public final void a() {
        switch (this.f33518a) {
            case 0:
                ((q61) this.f33519b).f37638t1 = false;
                return;
            default:
                ((ph.d1) this.f33519b).Y2 = false;
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f33518a) {
            case 0:
                ((q61) this.f33519b).f37638t1 = true;
                return;
            default:
                ((ph.d1) this.f33519b).Y2 = true;
                return;
        }
    }
}
