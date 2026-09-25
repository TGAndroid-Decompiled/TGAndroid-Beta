package org.telegram.ui;

import android.content.Context;
public final class id extends org.telegram.ui.Components.lj0 {
    public final int f34494r;
    public final Object f34495s;

    public id(Object obj, Context context, int i10) {
        super(context);
        this.f34494r = i10;
        this.f34495s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34494r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.f34495s).f35308f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((g70) this.f34495s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((bf0) this.f34495s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34494r) {
            case 0:
                super.invalidate();
                ((ld) this.f34495s).f35308f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.s20) this.f34495s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((g70) this.f34495s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((bf0) this.f34495s).h.invalidate();
                return;
        }
    }
}
