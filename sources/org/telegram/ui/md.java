package org.telegram.ui;

import android.content.Context;
public final class md extends org.telegram.ui.Components.jj0 {
    public final int f36031r;
    public final Object f36032s;

    public md(Object obj, Context context, int i10) {
        super(context);
        this.f36031r = i10;
        this.f36032s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f36031r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((pd) this.f36032s).f37083f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((g70) this.f36032s).e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((bf0) this.f36032s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f36031r) {
            case 0:
                super.invalidate();
                ((pd) this.f36032s).f37083f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.t20) this.f36032s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((g70) this.f36032s).e.invalidate();
                return;
            default:
                super.invalidate();
                ((bf0) this.f36032s).h.invalidate();
                return;
        }
    }
}
