package org.telegram.ui;

import android.view.View;
public final class j5 implements View.OnAttachStateChangeListener {
    public final int f38461a;
    public final Object f38462b;

    public j5(Object obj, int i10) {
        this.f38461a = i10;
        this.f38462b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38461a) {
            case 0:
                ((k5) this.f38462b).f38816b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38462b).a();
                return;
            case 2:
                ((h70) this.f38462b).f37765b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((gp0) this.f38462b).f37650i;
                if (p5Var != null) {
                    p5Var.a();
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f38462b;
                x71Var.h.a();
                x71Var.f43535n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38461a) {
            case 0:
                ((k5) this.f38462b).f38816b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38462b).b();
                return;
            case 2:
                ((h70) this.f38462b).f37765b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((gp0) this.f38462b).f37650i;
                if (p5Var != null) {
                    p5Var.b();
                    return;
                }
                return;
            default:
                x71 x71Var = (x71) this.f38462b;
                x71Var.h.b();
                x71Var.f43535n.b();
                return;
        }
    }
}
