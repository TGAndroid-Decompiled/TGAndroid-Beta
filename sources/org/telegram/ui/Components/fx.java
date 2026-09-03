package org.telegram.ui.Components;

import android.content.Context;
public final class fx extends xh.o {
    public final int f27019q;
    public final Object f27020r;

    public fx(Object obj, Context context, int i10) {
        super(context, 2);
        this.f27019q = i10;
        this.f27020r = obj;
    }

    @Override
    public void e() {
        switch (this.f27019q) {
            case 0:
                ((mz) this.f27020r).f29273c0 = true;
                return;
            case 3:
                ((org.telegram.ui.w61) this.f27020r).f42347t1 = true;
                return;
            case 5:
                ((qh.d1) this.f27020r).Y2 = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f27019q) {
            case 0:
                ((mz) this.f27020r).f29273c0 = false;
                return;
            case 1:
                ((lx) this.f27020r).Q.f29273c0 = false;
                return;
            case 2:
                ((org.telegram.ui.j51) this.f27020r).R.f42347t1 = false;
                return;
            case 3:
                ((org.telegram.ui.w61) this.f27020r).f42347t1 = false;
                return;
            case 4:
                ((org.telegram.ui.j51) this.f27020r).R.f42347t1 = false;
                return;
            default:
                ((qh.d1) this.f27020r).Y2 = false;
                return;
        }
    }
}
