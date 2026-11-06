package org.telegram.ui;

import android.view.View;
public final class il extends org.telegram.ui.Components.l6 {
    public final int f46684b;
    public final hl f46685c;

    public il(hl hlVar, int i7) {
        super("p2", 0);
        this.f46684b = i7;
        switch (i7) {
            case 1:
                this.f46685c = hlVar;
                super("progress", 0);
                return;
            case 2:
                this.f46685c = hlVar;
                super("alpha", 0);
                return;
            default:
                this.f46685c = hlVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f46684b) {
            case 0:
                ((org.telegram.messenger.ej) obj).f22216e = f10;
                View view = this.f46685c.f46404c.Q.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.ej) obj).f22218g = f10;
                View view2 = this.f46685c.f46404c.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.ej) obj).f22217f = f10;
                View view3 = this.f46685c.f46404c.Q.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f46684b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.ej) obj).f22216e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.ej) obj).f22218g);
            default:
                return Float.valueOf(((org.telegram.messenger.ej) obj).f22217f);
        }
    }
}
