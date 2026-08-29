package org.telegram.ui;

import android.content.Context;
public final class ed extends org.telegram.ui.Components.aj0 {
    public final int f37791r;
    public final Object f37792s;

    public ed(Object obj, Context context, int i10) {
        super(context);
        this.f37791r = i10;
        this.f37792s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f37791r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((hd) this.f37792s).f38858f.invalidate();
                return;
            case 1:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 2:
                super.invalidate(i10, i11, i12, i13);
                ((t60) this.f37792s).f42560e.invalidate();
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((pe0) this.f37792s).h.invalidate();
                return;
        }
    }

    @Override
    public final void invalidate() {
        switch (this.f37791r) {
            case 0:
                super.invalidate();
                ((hd) this.f37792s).f38858f.invalidate();
                return;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Components.n20) this.f37792s).invalidate();
                return;
            case 2:
                super.invalidate();
                ((t60) this.f37792s).f42560e.invalidate();
                return;
            default:
                super.invalidate();
                ((pe0) this.f37792s).h.invalidate();
                return;
        }
    }
}
