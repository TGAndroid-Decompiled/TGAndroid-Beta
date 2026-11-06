package org.telegram.ui;

import android.view.View;
public final class ov {
    public final int f48551a;
    public final pv f48552b;
    public final View f48553c;

    public ov(pv pvVar, View view, int i7) {
        this.f48551a = i7;
        this.f48552b = pvVar;
        this.f48553c = view;
    }

    public final void a(boolean z9) {
        switch (this.f48551a) {
            case 0:
                View view = this.f48553c;
                if (view instanceof di.p) {
                    this.f48552b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l10(14), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f48553c;
                if (view2 instanceof di.p) {
                    this.f48552b.O0.E0.i((di.p) view2, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l10(14), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
