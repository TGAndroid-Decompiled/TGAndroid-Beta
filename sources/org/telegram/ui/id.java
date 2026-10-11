package org.telegram.ui;

import android.content.Context;
public final class id extends org.telegram.ui.Components.hk0 {
    public final int f38660r;
    public final Object f38661s;

    public id(Object obj, Context context, int i10) {
        super(context);
        this.f38660r = i10;
        this.f38661s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38660r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.f38661s).f39601f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((j70) this.f38661s).f38865e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ff0) this.f38661s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38660r) {
            case 0:
                super.invalidate();
                ((ld) this.f38661s).f39601f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.j30) this.f38661s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((j70) this.f38661s).f38865e.invalidate();
                return;
            default:
                super.invalidate();
                ((ff0) this.f38661s).h.invalidate();
                return;
        }
    }
}
