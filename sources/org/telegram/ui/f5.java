package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f33518a;
    public final Object f33519b;

    public f5(Object obj, int i10) {
        this.f33518a = i10;
        this.f33519b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f33518a) {
            case 0:
                ((g5) this.f33519b).f33828b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f33519b).a();
                return;
            case 2:
                ((x70) this.f33519b).f39385b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((xp0) this.f33519b).f39731i;
                if (n5Var != null) {
                    n5Var.a();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f33519b;
                d91Var.h.a();
                d91Var.f33000n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f33518a) {
            case 0:
                ((g5) this.f33519b).f33828b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f33519b).b();
                return;
            case 2:
                ((x70) this.f33519b).f39385b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((xp0) this.f33519b).f39731i;
                if (n5Var != null) {
                    n5Var.b();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f33519b;
                d91Var.h.b();
                d91Var.f33000n.b();
                return;
        }
    }
}
