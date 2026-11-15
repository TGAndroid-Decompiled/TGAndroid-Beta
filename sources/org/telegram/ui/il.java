package org.telegram.ui;

import android.view.View;
public final class il extends org.telegram.ui.Components.j6 {
    public final int f48082b;
    public final hl f48083c;

    public il(hl hlVar, int i7) {
        super("p2", 0);
        this.f48082b = i7;
        switch (i7) {
            case 1:
                this.f48083c = hlVar;
                super("progress", 0);
                return;
            case 2:
                this.f48083c = hlVar;
                super("alpha", 0);
                return;
            default:
                this.f48083c = hlVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48082b) {
            case 0:
                ((org.telegram.messenger.cj) obj).f22888e = f10;
                View view = this.f48083c.f47738c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.cj) obj).f22890g = f10;
                View view2 = this.f48083c.f47738c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.cj) obj).f22889f = f10;
                View view3 = this.f48083c.f47738c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48082b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f22888e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f22890g);
            default:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f22889f);
        }
    }
}
