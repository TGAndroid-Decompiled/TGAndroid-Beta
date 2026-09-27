package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.nj0 {
    public final int f35006r;
    public final Object f35007s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f35006r = i10;
        this.f35007s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f35006r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f35007s).f35942f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((j70) this.f35007s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ef0) this.f35007s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f35006r) {
            case 0:
                super.invalidate();
                ((nd) this.f35007s).f35942f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.u20) this.f35007s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((j70) this.f35007s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((ef0) this.f35007s).h.invalidate();
                return;
        }
    }
}
