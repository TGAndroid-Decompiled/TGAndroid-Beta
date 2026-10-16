package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ox {
    public final int f38763a;
    public final px f38764b;
    public final View f38765c;

    public ox(px pxVar, View view, int i10) {
        this.f38763a = i10;
        this.f38764b = pxVar;
        this.f38765c = view;
    }

    public final void a(boolean z10) {
        switch (this.f38763a) {
            case 0:
                View view = this.f38765c;
                if (view instanceof bi.u) {
                    this.f38764b.O0.E0.i((bi.u) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(18), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f38765c;
                if (view2 instanceof bi.u) {
                    this.f38764b.O0.E0.i((bi.u) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(18), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
