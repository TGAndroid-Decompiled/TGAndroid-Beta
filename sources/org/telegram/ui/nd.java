package org.telegram.ui;

import android.content.Context;
public final class nd extends org.telegram.ui.Components.ik0 {
    public final int f40382r;
    public final Object f40383s;

    public nd(Object obj, Context context, int i10) {
        super(context);
        this.f40382r = i10;
        this.f40383s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f40382r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((qd) this.f40383s).f41279f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.f40383s).f39653e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((hf0) this.f40383s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f40382r) {
            case 0:
                super.invalidate();
                ((qd) this.f40383s).f41279f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.l30) this.f40383s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((l70) this.f40383s).f39653e.invalidate();
                return;
            default:
                super.invalidate();
                ((hf0) this.f40383s).h.invalidate();
                return;
        }
    }
}
