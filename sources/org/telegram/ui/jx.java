package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jx {
    public final int f39032a;
    public final kx f39033b;
    public final View f39034c;

    public jx(kx kxVar, View view, int i10) {
        this.f39032a = i10;
        this.f39033b = kxVar;
        this.f39034c = view;
    }

    public final void a(boolean z10) {
        switch (this.f39032a) {
            case 0:
                View view = this.f39034c;
                if (view instanceof ai.a0) {
                    this.f39033b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f39034c;
                if (view2 instanceof ai.a0) {
                    this.f39033b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
