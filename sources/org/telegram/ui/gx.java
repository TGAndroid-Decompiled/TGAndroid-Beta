package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gx {
    public final int f34074a;
    public final hx f34075b;
    public final View f34076c;

    public gx(hx hxVar, View view, int i10) {
        this.f34074a = i10;
        this.f34075b = hxVar;
        this.f34076c = view;
    }

    public final void a(boolean z10) {
        switch (this.f34074a) {
            case 0:
                View view = this.f34076c;
                if (view instanceof ai.a0) {
                    this.f34075b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f34076c;
                if (view2 instanceof ai.a0) {
                    this.f34075b.O0.E0.i((ai.a0) view2, false);
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
