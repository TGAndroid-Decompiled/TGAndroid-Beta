package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f45199a;
    public Object f45200b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f45199a) {
            case 0:
                ((f5) this.f45200b).f45481b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45200b).a();
                return;
            case 2:
                org.telegram.messenger.qs.e().c((ls) this.f45200b, 259);
                return;
            case 3:
                ((q50) this.f45200b).f49109b.P();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.f45200b).f44856i;
                if (g5Var != null) {
                    g5Var.a();
                    return;
                }
                return;
            default:
                h31 h31Var = (h31) this.f45200b;
                h31Var.h.a();
                h31Var.f46211n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f45199a) {
            case 0:
                ((f5) this.f45200b).f45481b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45200b).b();
                return;
            case 2:
                org.telegram.messenger.qs.e().n((ls) this.f45200b, 259);
                return;
            case 3:
                ((q50) this.f45200b).f49109b.R();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((cm0) this.f45200b).f44856i;
                if (g5Var != null) {
                    g5Var.b();
                    return;
                }
                return;
            default:
                h31 h31Var = (h31) this.f45200b;
                h31Var.h.b();
                h31Var.f46211n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f45199a = i7;
        this.f45200b = obj;
    }
}
