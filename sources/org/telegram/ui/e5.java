package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f47141a;
    public Object f47142b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f47141a) {
            case 0:
                ((f5) this.f47142b).f47585b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f47142b).a();
                return;
            case 2:
                org.telegram.messenger.ls.e().c((os) this.f47142b, 262);
                return;
            case 3:
                ((r50) this.f47142b).f51452b.P();
                return;
            case 4:
                org.telegram.ui.Components.n5 n5Var = ((gm0) this.f47142b).f48148i;
                if (n5Var != null) {
                    n5Var.a();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f47142b;
                j31Var.h.a();
                j31Var.f48884n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f47141a) {
            case 0:
                ((f5) this.f47142b).f47585b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f47142b).b();
                return;
            case 2:
                org.telegram.messenger.ls.e().n((os) this.f47142b, 262);
                return;
            case 3:
                ((r50) this.f47142b).f51452b.R();
                return;
            case 4:
                org.telegram.ui.Components.n5 n5Var = ((gm0) this.f47142b).f48148i;
                if (n5Var != null) {
                    n5Var.b();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f47142b;
                j31Var.h.b();
                j31Var.f48884n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f47141a = i7;
        this.f47142b = obj;
    }
}
