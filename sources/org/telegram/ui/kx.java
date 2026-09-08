package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx {
    public final int f38171a;
    public final lx f38172b;
    public final View f38173c;

    public kx(lx lxVar, View view, int i10) {
        this.f38171a = i10;
        this.f38172b = lxVar;
        this.f38173c = view;
    }

    public final void a(boolean z10) {
        switch (this.f38171a) {
            case 0:
                View view = this.f38173c;
                if (view instanceof bi.u) {
                    this.f38172b.O0.E0.i((bi.u) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(16), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f38173c;
                if (view2 instanceof bi.u) {
                    this.f38172b.O0.E0.i((bi.u) view2, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(16), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
