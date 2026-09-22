package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx {
    public final int f35275a;
    public final lx f35276b;
    public final View f35277c;

    public kx(lx lxVar, View view, int i10) {
        this.f35275a = i10;
        this.f35276b = lxVar;
        this.f35277c = view;
    }

    public final void a(boolean z10) {
        switch (this.f35275a) {
            case 0:
                View view = this.f35277c;
                if (view instanceof ai.a0) {
                    this.f35276b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f35277c;
                if (view2 instanceof ai.a0) {
                    this.f35276b.O0.E0.i((ai.a0) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
