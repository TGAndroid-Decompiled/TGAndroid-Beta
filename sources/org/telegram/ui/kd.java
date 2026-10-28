package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.bk0 {
    public final int f40732r;
    public final Object f40733s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f40732r = i10;
        this.f40733s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f40732r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f40733s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((z60) this.f40733s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((te0) this.f40733s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f40732r) {
            case 0:
                super.invalidate();
                ((nd) this.f40733s).h.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.b30) this.f40733s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((z60) this.f40733s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((te0) this.f40733s).h.invalidate();
                return;
        }
    }
}
