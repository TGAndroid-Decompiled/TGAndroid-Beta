package org.telegram.ui;

import android.view.View;
public final class j5 implements View.OnAttachStateChangeListener {
    public final int f35085a;
    public final Object f35086b;

    public j5(Object obj, int i10) {
        this.f35085a = i10;
        this.f35086b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f35085a) {
            case 0:
                ((k5) this.f35086b).f35420b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f35086b).a();
                return;
            case 2:
                ((r70) this.f35086b).f37725b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.f35086b).f35016i;
                if (j5Var != null) {
                    j5Var.a();
                    return;
                }
                return;
            default:
                r81 r81Var = (r81) this.f35086b;
                r81Var.h.a();
                r81Var.f37744n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f35085a) {
            case 0:
                ((k5) this.f35086b).f35420b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.j5) this.f35086b).b();
                return;
            case 2:
                ((r70) this.f35086b).f37725b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.j5 j5Var = ((ip0) this.f35086b).f35016i;
                if (j5Var != null) {
                    j5Var.b();
                    return;
                }
                return;
            default:
                r81 r81Var = (r81) this.f35086b;
                r81Var.h.b();
                r81Var.f37744n.b();
                return;
        }
    }
}
