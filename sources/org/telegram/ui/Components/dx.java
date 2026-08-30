package org.telegram.ui.Components;

import android.content.Context;
public final class dx extends wh.o {
    public final int f24383q;
    public final Object f24384r;

    public dx(Object obj, Context context, int i10) {
        super(context, 2);
        this.f24383q = i10;
        this.f24384r = obj;
    }

    @Override
    public void e() {
        switch (this.f24383q) {
            case 0:
                ((kz) this.f24384r).f26417c0 = true;
                return;
            case 3:
                ((org.telegram.ui.q61) this.f24384r).f37638t1 = true;
                return;
            case 5:
                ((ph.d1) this.f24384r).Y2 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f24383q) {
            case 0:
                ((kz) this.f24384r).f26417c0 = false;
                return;
            case 1:
                ((jx) this.f24384r).Q.f26417c0 = false;
                return;
            case 2:
                ((org.telegram.ui.c51) this.f24384r).R.f37638t1 = false;
                return;
            case 3:
                ((org.telegram.ui.q61) this.f24384r).f37638t1 = false;
                return;
            case 4:
                ((org.telegram.ui.c51) this.f24384r).R.f37638t1 = false;
                return;
            default:
                ((ph.d1) this.f24384r).Y2 = false;
                return;
        }
    }
}
