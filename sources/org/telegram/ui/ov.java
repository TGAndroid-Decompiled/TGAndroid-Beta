package org.telegram.ui;

import android.view.View;
public final class ov {
    public final int f48545a;
    public final pv f48546b;
    public final View f48547c;

    public ov(pv pvVar, View view, int i7) {
        this.f48545a = i7;
        this.f48546b = pvVar;
        this.f48547c = view;
    }

    public final void a(boolean z9) {
        switch (this.f48545a) {
            case 0:
                View view = this.f48547c;
                if (view instanceof di.p) {
                    this.f48546b.O0.E0.i((di.p) view, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vs(16), 500L);
                        return;
                    }
                    return;
                }
                return;
            default:
                View view2 = this.f48547c;
                if (view2 instanceof di.p) {
                    this.f48546b.O0.E0.i((di.p) view2, false);
                    if (z9) {
                        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.vs(16), 500L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
