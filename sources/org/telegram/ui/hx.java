package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class hx {
    public final int f33941a;
    public final ix f33942b;
    public final View f33943c;

    public hx(ix ixVar, View view, int i10) {
        this.f33941a = i10;
        this.f33942b = ixVar;
        this.f33943c = view;
    }

    public final void a(boolean z10) {
        switch (this.f33941a) {
            case 0:
                View view = this.f33943c;
                if (view instanceof ai.a0) {
                    this.f33942b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(15), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f33943c;
                if (view2 instanceof ai.a0) {
                    this.f33942b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.th(15), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
