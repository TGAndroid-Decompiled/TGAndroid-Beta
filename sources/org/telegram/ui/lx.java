package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class lx {
    public final int f39861a;
    public final mx f39862b;
    public final View f39863c;

    public lx(mx mxVar, View view, int i10) {
        this.f39861a = i10;
        this.f39862b = mxVar;
        this.f39863c = view;
    }

    public final void a(boolean z10) {
        switch (this.f39861a) {
            case 0:
                View view = this.f39863c;
                if (view instanceof ai.a0) {
                    this.f39862b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f39863c;
                if (view2 instanceof ai.a0) {
                    this.f39862b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
