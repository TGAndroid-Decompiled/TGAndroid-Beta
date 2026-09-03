package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.kj0 {
    public final int f38253r;
    public final Object f38254s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f38253r = i10;
        this.f38254s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38253r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f38254s).f39306f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((f70) this.f38254s).f36693e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((af0) this.f38254s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38253r) {
            case 0:
                super.invalidate();
                ((nd) this.f38254s).f39306f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.t20) this.f38254s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((f70) this.f38254s).f36693e.invalidate();
                return;
            default:
                super.invalidate();
                ((af0) this.f38254s).h.invalidate();
                return;
        }
    }
}
