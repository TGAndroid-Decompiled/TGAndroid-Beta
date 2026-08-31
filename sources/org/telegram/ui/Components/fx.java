package org.telegram.ui.Components;

import android.content.Context;
public final class fx extends xh.o {
    public final int f27031q;
    public final Object f27032r;

    public fx(Object obj, Context context, int i10) {
        super(context, 2);
        this.f27031q = i10;
        this.f27032r = obj;
    }

    @Override
    public void e() {
        switch (this.f27031q) {
            case 0:
                ((mz) this.f27032r).f29271c0 = true;
                return;
            case 3:
                ((org.telegram.ui.r61) this.f27032r).f40824t1 = true;
                return;
            case 5:
                ((qh.d1) this.f27032r).Y2 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f27031q) {
            case 0:
                ((mz) this.f27032r).f29271c0 = false;
                return;
            case 1:
                ((lx) this.f27032r).Q.f29271c0 = false;
                return;
            case 2:
                ((org.telegram.ui.e51) this.f27032r).R.f40824t1 = false;
                return;
            case 3:
                ((org.telegram.ui.r61) this.f27032r).f40824t1 = false;
                return;
            case 4:
                ((org.telegram.ui.e51) this.f27032r).R.f40824t1 = false;
                return;
            default:
                ((qh.d1) this.f27032r).Y2 = false;
                return;
        }
    }
}
