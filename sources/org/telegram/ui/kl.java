package org.telegram.ui;

import android.view.View;
public final class kl extends org.telegram.ui.Components.k6 {
    public final int f47321b;
    public final jl f47322c;

    public kl(jl jlVar, int i7) {
        super("p2", 0);
        this.f47321b = i7;
        switch (i7) {
            case 1:
                this.f47322c = jlVar;
                super("progress", 0);
                return;
            case 2:
                this.f47322c = jlVar;
                super("alpha", 0);
                return;
            default:
                this.f47322c = jlVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f47321b) {
            case 0:
                ((org.telegram.messenger.ej) obj).f22246e = f10;
                View view = this.f47322c.f47034c.Q.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.ej) obj).f22248g = f10;
                View view2 = this.f47322c.f47034c.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.ej) obj).f22247f = f10;
                View view3 = this.f47322c.f47034c.Q.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f47321b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.ej) obj).f22246e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.ej) obj).f22248g);
            default:
                return Float.valueOf(((org.telegram.messenger.ej) obj).f22247f);
        }
    }
}
