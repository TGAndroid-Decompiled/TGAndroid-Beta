package org.telegram.ui;

import android.view.View;
public final class jl extends org.telegram.ui.Components.p6 {
    public final int f48977b;
    public final il f48978c;

    public jl(il ilVar, int i7) {
        super("p2", 0);
        this.f48977b = i7;
        switch (i7) {
            case 1:
                this.f48978c = ilVar;
                super("progress", 0);
                return;
            case 2:
                this.f48978c = ilVar;
                super("alpha", 0);
                return;
            default:
                this.f48978c = ilVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48977b) {
            case 0:
                ((org.telegram.messenger.bj) obj).f23082e = f10;
                View view = this.f48978c.f48749c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.bj) obj).f23084g = f10;
                View view2 = this.f48978c.f48749c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.bj) obj).f23083f = f10;
                View view3 = this.f48978c.f48749c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48977b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.bj) obj).f23082e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.bj) obj).f23084g);
            default:
                return Float.valueOf(((org.telegram.messenger.bj) obj).f23083f);
        }
    }
}
