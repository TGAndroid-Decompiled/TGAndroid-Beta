package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class jx {
    public final int f39034a;
    public final kx f39035b;
    public final View f39036c;

    public jx(kx kxVar, View view, int i10) {
        this.f39034a = i10;
        this.f39035b = kxVar;
        this.f39036c = view;
    }

    public final void a(boolean z10) {
        switch (this.f39034a) {
            case 0:
                View view = this.f39036c;
                if (view instanceof ai.a0) {
                    this.f39035b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f39036c;
                if (view2 instanceof ai.a0) {
                    this.f39035b.O0.E0.i((ai.a0) view2, false);
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
