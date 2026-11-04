package org.telegram.ui;

import android.view.View;
public final class g5 implements View.OnAttachStateChangeListener {
    public final int f45531a;
    public Object f45532b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f45531a) {
            case 0:
                ((h5) this.f45532b).f45811b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.e5) this.f45532b).a();
                return;
            case 2:
                org.telegram.messenger.hs.e().c((js) this.f45532b, 259);
                return;
            case 3:
                ((k50) this.f45532b).f46772b.P();
                return;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((xl0) this.f45532b).f52049i;
                if (e5Var != null) {
                    e5Var.a();
                    return;
                }
                return;
            default:
                x21 x21Var = (x21) this.f45532b;
                x21Var.h.a();
                x21Var.f51702n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f45531a) {
            case 0:
                ((h5) this.f45532b).f45811b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.e5) this.f45532b).b();
                return;
            case 2:
                org.telegram.messenger.hs.e().n((js) this.f45532b, 259);
                return;
            case 3:
                ((k50) this.f45532b).f46772b.R();
                return;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((xl0) this.f45532b).f52049i;
                if (e5Var != null) {
                    e5Var.b();
                    return;
                }
                return;
            default:
                x21 x21Var = (x21) this.f45532b;
                x21Var.h.b();
                x21Var.f51702n.b();
                return;
        }
    }

    public g5(Object obj, int i3) {
        this.f45531a = i3;
        this.f45532b = obj;
    }
}
