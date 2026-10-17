package org.telegram.ui;

import android.view.View;
public final class k5 implements View.OnAttachStateChangeListener {
    public final int f38399a;
    public final Object f38400b;

    public k5(Object obj, int i10) {
        this.f38399a = i10;
        this.f38400b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38399a) {
            case 0:
                ((l5) this.f38400b).f38789b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38400b).a();
                return;
            case 2:
                ((f70) this.f38400b).f36818b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((ep0) this.f38400b).f36581i;
                if (p5Var != null) {
                    p5Var.a();
                    return;
                }
                return;
            default:
                u71 u71Var = (u71) this.f38400b;
                u71Var.h.a();
                u71Var.f41911n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38399a) {
            case 0:
                ((l5) this.f38400b).f38789b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38400b).b();
                return;
            case 2:
                ((f70) this.f38400b).f36818b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((ep0) this.f38400b).f36581i;
                if (p5Var != null) {
                    p5Var.b();
                    return;
                }
                return;
            default:
                u71 u71Var = (u71) this.f38400b;
                u71Var.h.b();
                u71Var.f41911n.b();
                return;
        }
    }
}
