package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx {
    public final int f35281a;
    public final lx f35282b;
    public final View f35283c;

    public kx(lx lxVar, View view, int i10) {
        this.f35281a = i10;
        this.f35282b = lxVar;
        this.f35283c = view;
    }

    public final void a(boolean z10) {
        switch (this.f35281a) {
            case 0:
                View view = this.f35283c;
                if (view instanceof ai.a0) {
                    this.f35282b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(15), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f35283c;
                if (view2 instanceof ai.a0) {
                    this.f35282b.O0.E0.i((ai.a0) view2, false);
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
