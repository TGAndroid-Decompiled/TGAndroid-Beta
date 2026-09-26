package org.telegram.ui;

import android.content.Context;
public final class id extends org.telegram.ui.Components.mj0 {
    public final int f34492r;
    public final Object f34493s;

    public id(Object obj, Context context, int i10) {
        super(context);
        this.f34492r = i10;
        this.f34493s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34492r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.f34493s).f35306f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((g70) this.f34493s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((bf0) this.f34493s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34492r) {
            case 0:
                super.invalidate();
                ((ld) this.f34493s).f35306f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.t20) this.f34493s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((g70) this.f34493s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((bf0) this.f34493s).h.invalidate();
                return;
        }
    }
}
