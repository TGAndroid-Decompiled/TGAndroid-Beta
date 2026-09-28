package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gx {
    public final int f34073a;
    public final hx f34074b;
    public final View f34075c;

    public gx(hx hxVar, View view, int i10) {
        this.f34073a = i10;
        this.f34074b = hxVar;
        this.f34075c = view;
    }

    public final void a(boolean z10) {
        switch (this.f34073a) {
            case 0:
                View view = this.f34075c;
                if (view instanceof ai.a0) {
                    this.f34074b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f34075c;
                if (view2 instanceof ai.a0) {
                    this.f34074b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(17), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
