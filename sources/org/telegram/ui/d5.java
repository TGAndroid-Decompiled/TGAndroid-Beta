package org.telegram.ui;

import android.view.View;
public final class d5 implements View.OnAttachStateChangeListener {
    public final int f36485a;
    public Object f36486b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36485a) {
            case 0:
                ((e5) this.f36486b).f36731b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.d5) this.f36486b).a();
                return;
            case 2:
                org.telegram.messenger.at.e().c((lt) this.f36486b, 259);
                return;
            case 3:
                ((n60) this.f36486b).f39709b.P();
                return;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((mn0) this.f36486b).f39584i;
                if (d5Var != null) {
                    d5Var.a();
                    return;
                }
                return;
            default:
                x41 x41Var = (x41) this.f36486b;
                x41Var.h.a();
                x41Var.f43241n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36485a) {
            case 0:
                ((e5) this.f36486b).f36731b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.d5) this.f36486b).b();
                return;
            case 2:
                org.telegram.messenger.at.e().n((lt) this.f36486b, 259);
                return;
            case 3:
                ((n60) this.f36486b).f39709b.R();
                return;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((mn0) this.f36486b).f39584i;
                if (d5Var != null) {
                    d5Var.b();
                    return;
                }
                return;
            default:
                x41 x41Var = (x41) this.f36486b;
                x41Var.h.b();
                x41Var.f43241n.b();
                return;
        }
    }

    public d5(Object obj, int i10) {
        this.f36485a = i10;
        this.f36486b = obj;
    }
}
