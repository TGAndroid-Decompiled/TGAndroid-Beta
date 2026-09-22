package org.telegram.ui;

import android.content.Context;
public final class jd extends org.telegram.ui.Components.nj0 {
    public final int f34918r;
    public final Object f34919s;

    public jd(Object obj, Context context, int i10) {
        super(context);
        this.f34918r = i10;
        this.f34919s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f34918r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((md) this.f34919s).f35688f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((l70) this.f34919s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((jf0) this.f34919s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f34918r) {
            case 0:
                super.invalidate();
                ((md) this.f34919s).f35688f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.r20) this.f34919s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((l70) this.f34919s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((jf0) this.f34919s).h.invalidate();
                return;
        }
    }
}
