package org.telegram.ui.Components;

import android.content.Context;
public final class dx extends wh.o {
    public final int f24392q;
    public final Object f24393r;

    public dx(Object obj, Context context, int i10) {
        super(context, 2);
        this.f24392q = i10;
        this.f24393r = obj;
    }

    @Override
    public void e() {
        switch (this.f24392q) {
            case 0:
                ((kz) this.f24393r).f26429c0 = true;
                return;
            case 3:
                ((org.telegram.ui.x61) this.f24393r).f39895t1 = true;
                return;
            case 5:
                ((ph.d1) this.f24393r).Y2 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f24392q) {
            case 0:
                ((kz) this.f24393r).f26429c0 = false;
                return;
            case 1:
                ((jx) this.f24393r).Q.f26429c0 = false;
                return;
            case 2:
                ((org.telegram.ui.j51) this.f24393r).R.f39895t1 = false;
                return;
            case 3:
                ((org.telegram.ui.x61) this.f24393r).f39895t1 = false;
                return;
            case 4:
                ((org.telegram.ui.j51) this.f24393r).R.f39895t1 = false;
                return;
            default:
                ((ph.d1) this.f24393r).Y2 = false;
                return;
        }
    }
}
