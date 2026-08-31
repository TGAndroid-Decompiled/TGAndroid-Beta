package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class gx {
    public final int f37282a;
    public final hx f37283b;
    public final View f37284c;

    public gx(hx hxVar, View view, int i10) {
        this.f37282a = i10;
        this.f37283b = hxVar;
        this.f37284c = view;
    }

    public final void a(boolean z4) {
        switch (this.f37282a) {
            case 0:
                View view = this.f37284c;
                if (view instanceof oh.o) {
                    this.f37283b.L0.B0.i((oh.o) view, false);
                    if (z4) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(20), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f37284c;
                if (view2 instanceof oh.o) {
                    this.f37283b.L0.B0.i((oh.o) view2, false);
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
