package org.telegram.ui;

import android.content.Context;
public final class id extends org.telegram.ui.Components.lj0 {
    public final int f34480r;
    public final Object f34481s;

    public id(Object obj, Context context, int i10) {
        super(context);
        this.f34480r = i10;
        this.f34481s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34480r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.f34481s).f35275f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((g70) this.f34481s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((bf0) this.f34481s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34480r) {
            case 0:
                super.invalidate();
                ((ld) this.f34481s).f35275f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.s20) this.f34481s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((g70) this.f34481s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((bf0) this.f34481s).h.invalidate();
                return;
        }
    }
}
