package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.ak0 {
    public final int f40885r;
    public final Object f40886s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f40885r = i10;
        this.f40886s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f40885r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f40886s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((x60) this.f40886s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((re0) this.f40886s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f40885r) {
            case 0:
                super.invalidate();
                ((nd) this.f40886s).h.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.b30) this.f40886s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((x60) this.f40886s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((re0) this.f40886s).h.invalidate();
                return;
        }
    }
}
