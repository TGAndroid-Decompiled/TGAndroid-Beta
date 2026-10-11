package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ix {
    public final int f38791a;
    public final jx f38792b;
    public final View f38793c;

    public ix(jx jxVar, View view, int i10) {
        this.f38791a = i10;
        this.f38792b = jxVar;
        this.f38793c = view;
    }

    public final void a(boolean z10) {
        switch (this.f38791a) {
            case 0:
                View view = this.f38793c;
                if (view instanceof ai.a0) {
                    this.f38792b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f38793c;
                if (view2 instanceof ai.a0) {
                    this.f38792b.O0.E0.i((ai.a0) view2, false);
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
