package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f45194a;
    public Object f45195b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f45194a) {
            case 0:
                ((f5) this.f45195b).f45440b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45195b).a();
                return;
            case 2:
                org.telegram.messenger.qs.e().c((ls) this.f45195b, 259);
                return;
            case 3:
                ((q50) this.f45195b).f49112b.P();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.f45195b).f44861i;
                if (g5Var != null) {
                    g5Var.a();
                    return;
                }
                return;
            default:
                h31 h31Var = (h31) this.f45195b;
                h31Var.h.a();
                h31Var.f46213n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f45194a) {
            case 0:
                ((f5) this.f45195b).f45440b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45195b).b();
                return;
            case 2:
                org.telegram.messenger.qs.e().n((ls) this.f45195b, 259);
                return;
            case 3:
                ((q50) this.f45195b).f49112b.R();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.f45195b).f44861i;
                if (g5Var != null) {
                    g5Var.b();
                    return;
                }
                return;
            default:
                h31 h31Var = (h31) this.f45195b;
                h31Var.h.b();
                h31Var.f46213n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f45194a = i7;
        this.f45195b = obj;
    }
}
