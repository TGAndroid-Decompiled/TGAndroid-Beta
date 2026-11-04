package org.telegram.ui;

import android.view.View;
public final class lv {
    public final int f47444a;
    public final mv f47445b;
    public final View f47446c;

    public lv(mv mvVar, View view, int i3) {
        this.f47444a = i3;
        this.f47445b = mvVar;
        this.f47446c = view;
    }

    public final void a(boolean z10) {
        switch (this.f47444a) {
            case 0:
                View view = this.f47446c;
                if (view instanceof ei.q) {
                    this.f47445b.P0.F0.i((ei.q) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.go(15), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f47446c;
                if (view2 instanceof ei.q) {
                    this.f47445b.P0.F0.i((ei.q) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.go(15), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
