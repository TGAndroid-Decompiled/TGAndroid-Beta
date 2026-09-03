package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hx {
    public final int f34764a;
    public final ix f34765b;
    public final View f34766c;

    public hx(ix ixVar, View view, int i10) {
        this.f34764a = i10;
        this.f34765b = ixVar;
        this.f34766c = view;
    }

    public final void a(boolean z4) {
        switch (this.f34764a) {
            case 0:
                View view = this.f34766c;
                if (view instanceof nh.p) {
                    this.f34765b.L0.B0.i((nh.p) view, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(18), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f34766c;
                if (view2 instanceof nh.p) {
                    this.f34765b.L0.B0.i((nh.p) view2, false);
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
