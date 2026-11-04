package org.telegram.ui;

import android.view.View;
public final class el extends org.telegram.ui.Components.j6 {
    public final int f44999b;
    public final dl f45000c;

    public el(dl dlVar, int i3) {
        super("p2", 0);
        this.f44999b = i3;
        switch (i3) {
            case 1:
                this.f45000c = dlVar;
                super("progress", 0);
                return;
            case 2:
                this.f45000c = dlVar;
                super("alpha", 0);
                return;
            default:
                this.f45000c = dlVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f44999b) {
            case 0:
                ((org.telegram.messenger.vi) obj).f25885e = f10;
                View view = this.f45000c.f44733c.R.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.vi) obj).f25887g = f10;
                View view2 = this.f45000c.f44733c.R.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.vi) obj).f25886f = f10;
                View view3 = this.f45000c.f44733c.R.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f44999b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.vi) obj).f25885e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.vi) obj).f25887g);
            default:
                return Float.valueOf(((org.telegram.messenger.vi) obj).f25886f);
        }
    }
}
