package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.lj0 {
    public final int f34809r;
    public final Object f34810s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f34809r = i10;
        this.f34810s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34809r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f34810s).f35611f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.f34810s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((if0) this.f34810s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34809r) {
            case 0:
                super.invalidate();
                ((md) this.f34810s).f35611f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.r20) this.f34810s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((l70) this.f34810s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((if0) this.f34810s).h.invalidate();
                return;
        }
    }
}
