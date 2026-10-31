package org.telegram.ui;

import android.view.View;
public final class em extends org.telegram.ui.Components.h6 {
    public final int f37082b;
    public final dm f37083c;

    public em(dm dmVar, int i10) {
        super("p2", 0);
        this.f37082b = i10;
        switch (i10) {
            case 1:
                this.f37083c = dmVar;
                super("progress", 0);
                return;
            case 2:
                this.f37083c = dmVar;
                super("alpha", 0);
                return;
            default:
                this.f37083c = dmVar;
                return;
        }
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f37082b) {
            case 0:
                ((org.telegram.messenger.fj) obj).e = f7;
                View view = this.f37083c.f36800c.Q.fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                ((org.telegram.messenger.fj) obj).f15581g = f7;
                View view2 = this.f37083c.f36800c.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                ((org.telegram.messenger.fj) obj).f15580f = f7;
                View view3 = this.f37083c.f36800c.Q.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f37082b) {
            case 0:
                return Float.valueOf(((org.telegram.messenger.fj) obj).e);
            case 1:
                return Float.valueOf(((org.telegram.messenger.fj) obj).f15581g);
            default:
                return Float.valueOf(((org.telegram.messenger.fj) obj).f15580f);
        }
    }
}
