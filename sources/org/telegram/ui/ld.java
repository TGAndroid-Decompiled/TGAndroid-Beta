package org.telegram.ui;

import android.content.Context;
public final class ld extends org.telegram.ui.Components.xj0 {
    public final int f38798r;
    public final Object f38799s;

    public ld(Object obj, Context context, int i10) {
        super(context);
        this.f38798r = i10;
        this.f38799s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38798r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((od) this.f38799s).f39731f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((u60) this.f38799s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((pe0) this.f38799s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38798r) {
            case 0:
                super.invalidate();
                ((od) this.f38799s).f39731f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.z20) this.f38799s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((u60) this.f38799s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((pe0) this.f38799s).h.invalidate();
                return;
        }
    }
}
