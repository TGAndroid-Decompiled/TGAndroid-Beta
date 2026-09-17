package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class kx {
    public final int f38172a;
    public final lx f38173b;
    public final View f38174c;

    public kx(lx lxVar, View view, int i10) {
        this.f38172a = i10;
        this.f38173b = lxVar;
        this.f38174c = view;
    }

    public final void a(boolean z10) {
        switch (this.f38172a) {
            case 0:
                View view = this.f38174c;
                if (view instanceof bi.u) {
                    this.f38173b.O0.E0.i((bi.u) view, false);
                    if (z10) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue(16), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f38174c;
                if (view2 instanceof bi.u) {
                    this.f38173b.O0.E0.i((bi.u) view2, false);
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
