package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx {
    public final int f35257a;
    public final lx f35258b;
    public final View f35259c;

    public kx(lx lxVar, View view, int i10) {
        this.f35257a = i10;
        this.f35258b = lxVar;
        this.f35259c = view;
    }

    public final void a(boolean z10) {
        switch (this.f35257a) {
            case 0:
                View view = this.f35259c;
                if (view instanceof ai.a0) {
                    this.f35258b.O0.E0.i((ai.a0) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(17), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f35259c;
                if (view2 instanceof ai.a0) {
                    this.f35258b.O0.E0.i((ai.a0) view2, false);
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
