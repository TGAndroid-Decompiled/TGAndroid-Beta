package org.telegram.ui;

import android.view.View;
public final class ov {
    public final int f48552a;
    public final pv f48553b;
    public final View f48554c;

    public ov(pv pvVar, View view, int i7) {
        this.f48552a = i7;
        this.f48553b = pvVar;
        this.f48554c = view;
    }

    public final void a(boolean z9) {
        switch (this.f48552a) {
            case 0:
                View view = this.f48554c;
                if (view instanceof di.p) {
                    this.f48553b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.l10(14), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f48554c;
                if (view2 instanceof di.p) {
                    this.f48553b.O0.E0.i((di.p) view2, false);
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
