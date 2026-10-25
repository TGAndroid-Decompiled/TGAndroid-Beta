package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.ak0 {
    public final int f40882r;
    public final Object f40883s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f40882r = i10;
        this.f40883s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f40882r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f40883s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((x60) this.f40883s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((re0) this.f40883s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f40882r) {
            case 0:
                super.invalidate();
                ((nd) this.f40883s).h.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.b30) this.f40883s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((x60) this.f40883s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((re0) this.f40883s).h.invalidate();
                return;
        }
    }
}
