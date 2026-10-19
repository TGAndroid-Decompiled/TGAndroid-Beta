package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.xj0 {
    public final int f38224r;
    public final Object f38225s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f38224r = i10;
        this.f38225s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38224r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f38225s).f39214f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((s60) this.f38225s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((ne0) this.f38225s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38224r) {
            case 0:
                super.invalidate();
                ((md) this.f38225s).f39214f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.z20) this.f38225s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((s60) this.f38225s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((ne0) this.f38225s).h.invalidate();
                return;
        }
    }
}
