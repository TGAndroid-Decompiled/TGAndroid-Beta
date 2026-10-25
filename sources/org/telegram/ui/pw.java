package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class pw {
    public final int f42668a;
    public final qw f42669b;
    public final View f42670c;

    public pw(qw qwVar, View view, int i10) {
        this.f42668a = i10;
        this.f42669b = qwVar;
        this.f42670c = view;
    }

    public final void a(boolean z10) {
        switch (this.f42668a) {
            case 0:
                View view = this.f42670c;
                if (view instanceof di.q) {
                    this.f42669b.O0.E0.i((di.q) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(25), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f42670c;
                if (view2 instanceof di.q) {
                    this.f42669b.O0.E0.i((di.q) view2, false);
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
