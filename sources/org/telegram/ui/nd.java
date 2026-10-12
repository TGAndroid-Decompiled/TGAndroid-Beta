package org.telegram.ui;

import android.content.Context;
public final class nd extends org.telegram.ui.Components.ik0 {
    public final int f40385r;
    public final Object f40386s;

    public nd(Object obj, Context context, int i10) {
        super(context);
        this.f40385r = i10;
        this.f40386s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f40385r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((qd) this.f40386s).f41283f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.f40386s).f39647e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((hf0) this.f40386s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f40385r) {
            case 0:
                super.invalidate();
                ((qd) this.f40386s).f41283f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.l30) this.f40386s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((l70) this.f40386s).f39647e.invalidate();
                return;
            default:
                super.invalidate();
                ((hf0) this.f40386s).h.invalidate();
                return;
        }
    }
}
