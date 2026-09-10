package org.telegram.ui;

import android.content.Context;
public final class kd extends org.telegram.ui.Components.kj0 {
    public final int f34334r;
    public final Object f34335s;

    public kd(Object obj, Context context, int i10) {
        super(context);
        this.f34334r = i10;
        this.f34335s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34334r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((nd) this.f34335s).f35226f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((k70) this.f34335s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((hf0) this.f34335s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34334r) {
            case 0:
                super.invalidate();
                ((nd) this.f34335s).f35226f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.a30) this.f34335s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((k70) this.f34335s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((hf0) this.f34335s).h.invalidate();
                return;
        }
    }
}
