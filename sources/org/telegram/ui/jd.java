package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.yj0 {
    public final int f38232r;
    public final Object f38233s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f38232r = i10;
        this.f38233s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38232r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f38233s).f39185f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((s60) this.f38233s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ne0) this.f38233s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38232r) {
            case 0:
                super.invalidate();
                ((md) this.f38233s).f39185f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.z20) this.f38233s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((s60) this.f38233s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((ne0) this.f38233s).h.invalidate();
                return;
        }
    }
}
