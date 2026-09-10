package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class mx {
    public final int f35070a;
    public final nx f35071b;
    public final View f35072c;

    public mx(nx nxVar, View view, int i10) {
        this.f35070a = i10;
        this.f35071b = nxVar;
        this.f35072c = view;
    }

    public final void a(boolean z10) {
        switch (this.f35070a) {
            case 0:
                View view = this.f35072c;
                if (view instanceof zh.k) {
                    this.f35071b.O0.E0.i((zh.k) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(10), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f35072c;
                if (view2 instanceof zh.k) {
                    this.f35071b.O0.E0.i((zh.k) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c30(10), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
