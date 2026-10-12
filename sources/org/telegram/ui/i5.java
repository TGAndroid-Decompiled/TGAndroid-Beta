package org.telegram.ui;

import android.view.View;
public final class i5 implements View.OnAttachStateChangeListener {
    public final int f38669a;
    public final Object f38670b;

    public i5(Object obj, int i10) {
        this.f38669a = i10;
        this.f38670b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38669a) {
            case 0:
                ((j5) this.f38670b).f39095b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f38670b).a();
                return;
            case 2:
                ((y70) this.f38670b).f44314b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((xp0) this.f38670b).f44145i;
                if (q5Var != null) {
                    q5Var.a();
                    return;
                }
                return;
            default:
                f91 f91Var = (f91) this.f38670b;
                f91Var.h.a();
                f91Var.f37687n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38669a) {
            case 0:
                ((j5) this.f38670b).f39095b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f38670b).b();
                return;
            case 2:
                ((y70) this.f38670b).f44314b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((xp0) this.f38670b).f44145i;
                if (q5Var != null) {
                    q5Var.b();
                    return;
                }
                return;
            default:
                f91 f91Var = (f91) this.f38670b;
                f91Var.h.b();
                f91Var.f37687n.b();
                return;
        }
    }
}
