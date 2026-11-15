package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f46553a;
    public Object f46554b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f46553a) {
            case 0:
                ((f5) this.f46554b).f46984b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.e5) this.f46554b).a();
                return;
            case 2:
                org.telegram.messenger.ns.e().c((os) this.f46554b, 259);
                return;
            case 3:
                ((p50) this.f46554b).f50132b.P();
                return;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((em0) this.f46554b).f46867i;
                if (e5Var != null) {
                    e5Var.a();
                    return;
                }
                return;
            default:
                f31 f31Var = (f31) this.f46554b;
                f31Var.h.a();
                f31Var.f46972n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f46553a) {
            case 0:
                ((f5) this.f46554b).f46984b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.e5) this.f46554b).b();
                return;
            case 2:
                org.telegram.messenger.ns.e().n((os) this.f46554b, 259);
                return;
            case 3:
                ((p50) this.f46554b).f50132b.R();
                return;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((em0) this.f46554b).f46867i;
                if (e5Var != null) {
                    e5Var.b();
                    return;
                }
                return;
            default:
                f31 f31Var = (f31) this.f46554b;
                f31Var.h.b();
                f31Var.f46972n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f46553a = i7;
        this.f46554b = obj;
    }
}
