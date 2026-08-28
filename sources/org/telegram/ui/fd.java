package org.telegram.ui;

import android.content.Context;
public final class fd extends org.telegram.ui.Components.pi0 {
    public final int f38210r;
    public final Object f38211s;

    public fd(Object obj, Context context, int i9) {
        super(context);
        this.f38210r = i9;
        this.f38211s = obj;
    }

    @Override
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.f38210r) {
            case 0:
                super.invalidate(i9, i10, i11, i12);
                ((id) this.f38211s).f39110f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i9, i10, i11, i12);
                return;
            case 2:
                super.invalidate(i9, i10, i11, i12);
                ((r60) this.f38211s).f42280e.invalidate();
                return;
            case 3:
                super.invalidate(i9, i10, i11, i12);
                ((qe0) this.f38211s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38210r) {
            case 0:
                super.invalidate();
                ((id) this.f38211s).f39110f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.b20) this.f38211s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((r60) this.f38211s).f42280e.invalidate();
                return;
            default:
                super.invalidate();
                ((qe0) this.f38211s).h.invalidate();
                return;
        }
    }
}
