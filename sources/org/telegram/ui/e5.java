package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f47064a;
    public Object f47065b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f47064a) {
            case 0:
                ((f5) this.f47065b).f47513b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f47065b).a();
                return;
            case 2:
                org.telegram.messenger.ks.e().c((os) this.f47065b, 262);
                return;
            case 3:
                ((r50) this.f47065b).f51459b.P();
                return;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((gm0) this.f47065b).f48067i;
                if (m5Var != null) {
                    m5Var.a();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f47065b;
                j31Var.h.a();
                j31Var.f48866n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f47064a) {
            case 0:
                ((f5) this.f47065b).f47513b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f47065b).b();
                return;
            case 2:
                org.telegram.messenger.ks.e().n((os) this.f47065b, 262);
                return;
            case 3:
                ((r50) this.f47065b).f51459b.R();
                return;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((gm0) this.f47065b).f48067i;
                if (m5Var != null) {
                    m5Var.b();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f47065b;
                j31Var.h.b();
                j31Var.f48866n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f47064a = i7;
        this.f47065b = obj;
    }
}
