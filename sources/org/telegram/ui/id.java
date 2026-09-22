package org.telegram.ui;

import android.content.Context;
public final class id extends org.telegram.ui.Components.aj0 {
    public final int f34604r;
    public final Object f34605s;

    public id(Object obj, Context context, int i10) {
        super(context);
        this.f34604r = i10;
        this.f34605s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34604r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((ld) this.f34605s).f35415f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.f34605s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((hf0) this.f34605s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34604r) {
            case 0:
                super.invalidate();
                ((ld) this.f34605s).f35415f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.r20) this.f34605s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((l70) this.f34605s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((hf0) this.f34605s).h.invalidate();
                return;
        }
    }
}
