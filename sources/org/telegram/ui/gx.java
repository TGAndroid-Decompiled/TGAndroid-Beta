package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gx {
    public final int f37179a;
    public final hx f37180b;
    public final View f37181c;

    public gx(hx hxVar, View view, int i10) {
        this.f37179a = i10;
        this.f37180b = hxVar;
        this.f37181c = view;
    }

    public final void a(boolean z4) {
        switch (this.f37179a) {
            case 0:
                View view = this.f37181c;
                if (view instanceof oh.o) {
                    this.f37180b.L0.B0.i((oh.o) view, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(20), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f37181c;
                if (view2 instanceof oh.o) {
                    this.f37180b.L0.B0.i((oh.o) view2, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(20), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
