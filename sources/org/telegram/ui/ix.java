package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ix {
    public final int f38825a;
    public final jx f38826b;
    public final View f38827c;

    public ix(jx jxVar, View view, int i10) {
        this.f38825a = i10;
        this.f38826b = jxVar;
        this.f38827c = view;
    }

    public final void a(boolean z10) {
        switch (this.f38825a) {
            case 0:
                View view = this.f38827c;
                if (view instanceof ai.a0) {
                    this.f38826b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f38827c;
                if (view2 instanceof ai.a0) {
                    this.f38826b.O0.E0.i((ai.a0) view2, false);
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
