package org.telegram.ui;

import android.view.View;
public final class k5 implements View.OnAttachStateChangeListener {
    public final int f38393a;
    public final Object f38394b;

    public k5(Object obj, int i10) {
        this.f38393a = i10;
        this.f38394b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38393a) {
            case 0:
                ((l5) this.f38394b).f38735b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38394b).a();
                return;
            case 2:
                ((f70) this.f38394b).f36825b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((fp0) this.f38394b).f36964i;
                if (p5Var != null) {
                    p5Var.a();
                    return;
                }
                return;
            default:
                u71 u71Var = (u71) this.f38394b;
                u71Var.h.a();
                u71Var.f41885n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38393a) {
            case 0:
                ((l5) this.f38394b).f38735b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38394b).b();
                return;
            case 2:
                ((f70) this.f38394b).f36825b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((fp0) this.f38394b).f36964i;
                if (p5Var != null) {
                    p5Var.b();
                    return;
                }
                return;
            default:
                u71 u71Var = (u71) this.f38394b;
                u71Var.h.b();
                u71Var.f41885n.b();
                return;
        }
    }
}
