package org.telegram.ui;

import android.view.View;
public final class j5 implements View.OnAttachStateChangeListener {
    public final int f38457a;
    public final Object f38458b;

    public j5(Object obj, int i10) {
        this.f38457a = i10;
        this.f38458b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38457a) {
            case 0:
                ((k5) this.f38458b).f38789b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f38458b).a();
                return;
            case 2:
                ((h70) this.f38458b).f37770b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((fp0) this.f38458b).f37370i;
                if (n5Var != null) {
                    n5Var.a();
                    return;
                }
                return;
            default:
                w71 w71Var = (w71) this.f38458b;
                w71Var.h.a();
                w71Var.f42939n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38457a) {
            case 0:
                ((k5) this.f38458b).f38789b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.n5) this.f38458b).b();
                return;
            case 2:
                ((h70) this.f38458b).f37770b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.n5 n5Var = ((fp0) this.f38458b).f37370i;
                if (n5Var != null) {
                    n5Var.b();
                    return;
                }
                return;
            default:
                w71 w71Var = (w71) this.f38458b;
                w71Var.h.b();
                w71Var.f42939n.b();
                return;
        }
    }
}
