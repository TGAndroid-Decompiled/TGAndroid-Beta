package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.bj0 {
    public final int f35217r;
    public final Object f35218s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f35217r = i10;
        this.f35218s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f35217r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f35218s).f36050f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((n70) this.f35218s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((jf0) this.f35218s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f35217r) {
            case 0:
                super.invalidate();
                ((nd) this.f35218s).f36050f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.r20) this.f35218s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((n70) this.f35218s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((jf0) this.f35218s).h.invalidate();
                return;
        }
    }
}
