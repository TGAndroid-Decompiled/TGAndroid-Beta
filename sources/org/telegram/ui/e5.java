package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f45170a;
    public Object f45171b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f45170a) {
            case 0:
                ((f5) this.f45171b).f45477b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45171b).a();
                return;
            case 2:
                org.telegram.messenger.qs.e().c((ls) this.f45171b, 259);
                return;
            case 3:
                ((q50) this.f45171b).f49083b.P();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.f45171b).f44836i;
                if (g5Var != null) {
                    g5Var.a();
                    return;
                }
                return;
            default:
                h31 h31Var = (h31) this.f45171b;
                h31Var.h.a();
                h31Var.f46192n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f45170a) {
            case 0:
                ((f5) this.f45171b).f45477b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45171b).b();
                return;
            case 2:
                org.telegram.messenger.qs.e().n((ls) this.f45171b, 259);
                return;
            case 3:
                ((q50) this.f45171b).f49083b.R();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.f45171b).f44836i;
                if (g5Var != null) {
                    g5Var.b();
                    return;
                }
                return;
            default:
                h31 h31Var = (h31) this.f45171b;
                h31Var.h.b();
                h31Var.f46192n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f45170a = i7;
        this.f45171b = obj;
    }
}
