package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ox {
    public final int f39058a;
    public final px f39059b;
    public final View f39060c;

    public ox(px pxVar, View view, int i10) {
        this.f39058a = i10;
        this.f39059b = pxVar;
        this.f39060c = view;
    }

    public final void a(boolean z10) {
        switch (this.f39058a) {
            case 0:
                View view = this.f39060c;
                if (view instanceof bi.u) {
                    this.f39059b.O0.E0.i((bi.u) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ve(18), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f39060c;
                if (view2 instanceof bi.u) {
                    this.f39059b.O0.E0.i((bi.u) view2, false);
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
