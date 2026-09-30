package org.telegram.ui;

import android.content.Context;
public final class id extends org.telegram.ui.Components.oj0 {
    public final int f34588r;
    public final Object f34589s;

    public id(Object obj, Context context, int i10) {
        super(context);
        this.f34588r = i10;
        this.f34589s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34588r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.f34589s).f35398f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((g70) this.f34589s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((bf0) this.f34589s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34588r) {
            case 0:
                super.invalidate();
                ((ld) this.f34589s).f35398f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.v20) this.f34589s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((g70) this.f34589s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((bf0) this.f34589s).h.invalidate();
                return;
        }
    }
}
