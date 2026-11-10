package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f45133a;
    public Object f45134b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f45133a) {
            case 0:
                ((f5) this.f45134b).f45615b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.f5) this.f45134b).a();
                return;
            case 2:
                org.telegram.messenger.qs.e().c((os) this.f45134b, 259);
                return;
            case 3:
                ((t50) this.f45134b).f50130b.P();
                return;
            case 4:
                org.telegram.ui.Components.f5 f5Var = ((fm0) this.f45134b).f45803i;
                if (f5Var != null) {
                    f5Var.a();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f45134b;
                j31Var.h.a();
                j31Var.f46807n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f45133a) {
            case 0:
                ((f5) this.f45134b).f45615b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.f5) this.f45134b).b();
                return;
            case 2:
                org.telegram.messenger.qs.e().n((os) this.f45134b, 259);
                return;
            case 3:
                ((t50) this.f45134b).f50130b.R();
                return;
            case 4:
                org.telegram.ui.Components.f5 f5Var = ((fm0) this.f45134b).f45803i;
                if (f5Var != null) {
                    f5Var.b();
                    return;
                }
                return;
            default:
                j31 j31Var = (j31) this.f45134b;
                j31Var.h.b();
                j31Var.f46807n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f45133a = i7;
        this.f45134b = obj;
    }
}
