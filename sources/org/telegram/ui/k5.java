package org.telegram.ui;

import android.view.View;
public final class k5 implements View.OnAttachStateChangeListener {
    public final int f38408a;
    public final Object f38409b;

    public k5(Object obj, int i10) {
        this.f38408a = i10;
        this.f38409b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38408a) {
            case 0:
                ((l5) this.f38409b).f38784b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38409b).a();
                return;
            case 2:
                ((d70) this.f38409b).f36302b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38409b).f36439i;
                if (p5Var != null) {
                    p5Var.a();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38409b;
                s71Var.h.a();
                s71Var.f41389n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38408a) {
            case 0:
                ((l5) this.f38409b).f38784b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38409b).b();
                return;
            case 2:
                ((d70) this.f38409b).f36302b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38409b).f36439i;
                if (p5Var != null) {
                    p5Var.b();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38409b;
                s71Var.h.b();
                s71Var.f41389n.b();
                return;
        }
    }
}
