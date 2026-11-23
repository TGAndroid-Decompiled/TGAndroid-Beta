package org.telegram.ui;

import android.view.View;
public final class jl extends org.telegram.ui.Components.q6 {
    public final int f49014b;
    public final il f49015c;

    public jl(il ilVar, int i7) {
        super("p2", 0);
        this.f49014b = i7;
        switch (i7) {
            case 1:
                this.f49015c = ilVar;
                super("progress", 0);
                return;
            case 2:
                this.f49015c = ilVar;
                super("alpha", 0);
                return;
            default:
                this.f49015c = ilVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f49014b) {
            case 0:
                ((org.telegram.messenger.cj) obj).f23324e = f10;
                View view = this.f49015c.f48775c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.cj) obj).f23326g = f10;
                View view2 = this.f49015c.f48775c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.cj) obj).f23325f = f10;
                View view3 = this.f49015c.f48775c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f49014b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f23324e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f23326g);
            default:
                return Float.valueOf(((org.telegram.messenger.cj) obj).f23325f);
        }
    }
}
