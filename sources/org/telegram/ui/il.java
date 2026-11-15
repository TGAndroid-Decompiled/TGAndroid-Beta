package org.telegram.ui;

import android.view.View;
public final class il extends org.telegram.ui.Components.j6 {
    public final int f48072b;
    public final hl f48073c;

    public il(hl hlVar, int i7) {
        super("p2", 0);
        this.f48072b = i7;
        switch (i7) {
            case 1:
                this.f48073c = hlVar;
                super("progress", 0);
                return;
            case 2:
                this.f48073c = hlVar;
                super("alpha", 0);
                return;
            default:
                this.f48073c = hlVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48072b) {
            case 0:
                ((org.telegram.messenger.cj) obj).f22892e = f10;
                View view = this.f48073c.f47728c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.cj) obj).f22894g = f10;
                View view2 = this.f48073c.f47728c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.cj) obj).f22893f = f10;
                View view3 = this.f48073c.f47728c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48072b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f22892e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f22894g);
            default:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f22893f);
        }
    }
}
