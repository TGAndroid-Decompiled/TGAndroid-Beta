package org.telegram.ui;

import android.view.View;
public final class k5 implements View.OnAttachStateChangeListener {
    public final int f38415a;
    public final Object f38416b;

    public k5(Object obj, int i10) {
        this.f38415a = i10;
        this.f38416b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38415a) {
            case 0:
                ((l5) this.f38416b).f38788b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38416b).a();
                return;
            case 2:
                ((d70) this.f38416b).f36280b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38416b).f36436i;
                if (p5Var != null) {
                    p5Var.a();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38416b;
                s71Var.h.a();
                s71Var.f41393n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38415a) {
            case 0:
                ((l5) this.f38416b).f38788b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38416b).b();
                return;
            case 2:
                ((d70) this.f38416b).f36280b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38416b).f36436i;
                if (p5Var != null) {
                    p5Var.b();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38416b;
                s71Var.h.b();
                s71Var.f41393n.b();
                return;
        }
    }
}
