package org.telegram.ui;

import android.content.Context;
public final class pd extends org.telegram.ui.Components.bk0 {
    public final int f38883r;
    public final Object f38884s;

    public pd(Object obj, Context context, int i10) {
        super(context);
        this.f38883r = i10;
        this.f38884s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f38883r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((sd) this.f38884s).f39768f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((p70) this.f38884s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((lf0) this.f38884s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f38883r) {
            case 0:
                super.invalidate();
                ((sd) this.f38884s).f39768f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.e30) this.f38884s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((p70) this.f38884s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((lf0) this.f38884s).h.invalidate();
                return;
        }
    }
}
