package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gx {
    public final int f34060a;
    public final hx f34061b;
    public final View f34062c;

    public gx(hx hxVar, View view, int i10) {
        this.f34060a = i10;
        this.f34061b = hxVar;
        this.f34062c = view;
    }

    public final void a(boolean z10) {
        switch (this.f34060a) {
            case 0:
                View view = this.f34062c;
                if (view instanceof ai.a0) {
                    this.f34061b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f34062c;
                if (view2 instanceof ai.a0) {
                    this.f34061b.O0.E0.i((ai.a0) view2, false);
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
