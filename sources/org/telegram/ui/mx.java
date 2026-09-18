package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mx {
    public final int f35905a;
    public final nx f35906b;
    public final View f35907c;

    public mx(nx nxVar, View view, int i10) {
        this.f35905a = i10;
        this.f35906b = nxVar;
        this.f35907c = view;
    }

    public final void a(boolean z10) {
        switch (this.f35905a) {
            case 0:
                View view = this.f35907c;
                if (view instanceof ai.a0) {
                    this.f35906b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(15), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f35907c;
                if (view2 instanceof ai.a0) {
                    this.f35906b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(15), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
