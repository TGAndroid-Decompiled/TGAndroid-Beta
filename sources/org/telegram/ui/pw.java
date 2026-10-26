package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class pw {
    public final int f42671a;
    public final qw f42672b;
    public final View f42673c;

    public pw(qw qwVar, View view, int i10) {
        this.f42671a = i10;
        this.f42672b = qwVar;
        this.f42673c = view;
    }

    public final void a(boolean z10) {
        switch (this.f42671a) {
            case 0:
                View view = this.f42673c;
                if (view instanceof di.q) {
                    this.f42672b.O0.E0.i((di.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f42673c;
                if (view2 instanceof di.q) {
                    this.f42672b.O0.E0.i((di.q) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
