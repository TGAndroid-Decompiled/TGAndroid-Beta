package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f47137a;
    public Object f47138b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f47137a) {
            case 0:
                ((f5) this.f47138b).f47581b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f47138b).a();
                return;
            case 2:
                org.telegram.messenger.ks.e().c((os) this.f47138b, 262);
                return;
            case 3:
                ((r50) this.f47138b).f51448b.P();
                return;
            case 4:
                org.telegram.ui.Components.n5 n5Var = ((gm0) this.f47138b).f48144i;
                if (n5Var != null) {
                    n5Var.a();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f47138b;
                j31Var.h.a();
                j31Var.f48880n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f47137a) {
            case 0:
                ((f5) this.f47138b).f47581b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f47138b).b();
                return;
            case 2:
                org.telegram.messenger.ks.e().n((os) this.f47138b, 262);
                return;
            case 3:
                ((r50) this.f47138b).f51448b.R();
                return;
            case 4:
                org.telegram.ui.Components.n5 n5Var = ((gm0) this.f47138b).f48144i;
                if (n5Var != null) {
                    n5Var.b();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f47138b;
                j31Var.h.b();
                j31Var.f48880n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f47137a = i7;
        this.f47138b = obj;
    }
}
