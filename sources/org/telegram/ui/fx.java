package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class fx {
    public final int f34409a;
    public final gx f34410b;
    public final View f34411c;

    public fx(gx gxVar, View view, int i10) {
        this.f34409a = i10;
        this.f34410b = gxVar;
        this.f34411c = view;
    }

    public final void a(boolean z4) {
        switch (this.f34409a) {
            case 0:
                View view = this.f34411c;
                if (view instanceof nh.p) {
                    this.f34410b.L0.B0.i((nh.p) view, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(18), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f34411c;
                if (view2 instanceof nh.p) {
                    this.f34410b.L0.B0.i((nh.p) view2, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(18), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
