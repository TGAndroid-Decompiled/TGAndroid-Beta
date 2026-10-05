package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ix {
    public final int f37501a;
    public final jx f37502b;
    public final View f37503c;

    public ix(jx jxVar, View view, int i10) {
        this.f37501a = i10;
        this.f37502b = jxVar;
        this.f37503c = view;
    }

    public final void a(boolean z10) {
        switch (this.f37501a) {
            case 0:
                View view = this.f37503c;
                if (view instanceof ai.a0) {
                    this.f37502b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f37503c;
                if (view2 instanceof ai.a0) {
                    this.f37502b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
