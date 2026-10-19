package org.telegram.ui;

import android.view.View;
public final class k5 implements View.OnAttachStateChangeListener {
    public final int f38409a;
    public final Object f38410b;

    public k5(Object obj, int i10) {
        this.f38409a = i10;
        this.f38410b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38409a) {
            case 0:
                ((l5) this.f38410b).f38782b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38410b).a();
                return;
            case 2:
                ((d70) this.f38410b).f36274b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38410b).f36430i;
                if (p5Var != null) {
                    p5Var.a();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38410b;
                s71Var.h.a();
                s71Var.f41387n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38409a) {
            case 0:
                ((l5) this.f38410b).f38782b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38410b).b();
                return;
            case 2:
                ((d70) this.f38410b).f36274b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38410b).f36430i;
                if (p5Var != null) {
                    p5Var.b();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38410b;
                s71Var.h.b();
                s71Var.f41387n.b();
                return;
        }
    }
}
