package org.telegram.ui;

import android.content.Context;
public final class id extends org.telegram.ui.Components.gk0 {
    public final int f38694r;
    public final Object f38695s;

    public id(Object obj, Context context, int i10) {
        super(context);
        this.f38694r = i10;
        this.f38695s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38694r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.f38695s).f39635f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((j70) this.f38695s).f38899e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ff0) this.f38695s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38694r) {
            case 0:
                super.invalidate();
                ((ld) this.f38695s).f39635f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.j30) this.f38695s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((j70) this.f38695s).f38899e.invalidate();
                return;
            default:
                super.invalidate();
                ((ff0) this.f38695s).h.invalidate();
                return;
        }
    }
}
