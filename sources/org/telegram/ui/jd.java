package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.kj0 {
    public final int f34893r;
    public final Object f34894s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f34893r = i10;
        this.f34894s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34893r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f34894s).f35665f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.f34894s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((jf0) this.f34894s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34893r) {
            case 0:
                super.invalidate();
                ((md) this.f34894s).f35665f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.r20) this.f34894s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((l70) this.f34894s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((jf0) this.f34894s).h.invalidate();
                return;
        }
    }
}
