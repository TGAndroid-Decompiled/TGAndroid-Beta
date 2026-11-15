package org.telegram.ui;

import android.view.View;
public final class pv {
    public final int f50370a;
    public final qv f50371b;
    public final View f50372c;

    public pv(qv qvVar, View view, int i7) {
        this.f50370a = i7;
        this.f50371b = qvVar;
        this.f50372c = view;
    }

    public final void a(boolean z10) {
        switch (this.f50370a) {
            case 0:
                View view = this.f50372c;
                if (view instanceof fi.p) {
                    this.f50371b.P0.F0.i((fi.p) view, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.ih(20), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f50372c;
                if (view2 instanceof fi.p) {
                    this.f50371b.P0.F0.i((fi.p) view2, false);
                    if (z10) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.ih(20), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
