package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.gk0 {
    public final int f38958r;
    public final Object f38959s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f38958r = i10;
        this.f38959s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38958r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f38959s).f39891f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((j70) this.f38959s).f38892e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((gf0) this.f38959s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38958r) {
            case 0:
                super.invalidate();
                ((md) this.f38959s).f39891f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.j30) this.f38959s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((j70) this.f38959s).f38892e.invalidate();
                return;
            default:
                super.invalidate();
                ((gf0) this.f38959s).h.invalidate();
                return;
        }
    }
}
