package org.telegram.ui;

import android.view.View;
public final class k5 implements View.OnAttachStateChangeListener {
    public final int f38419a;
    public final Object f38420b;

    public k5(Object obj, int i10) {
        this.f38419a = i10;
        this.f38420b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f38419a) {
            case 0:
                ((l5) this.f38420b).f38792b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38420b).a();
                return;
            case 2:
                ((d70) this.f38420b).f36284b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38420b).f36440i;
                if (p5Var != null) {
                    p5Var.a();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38420b;
                s71Var.h.a();
                s71Var.f41396n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f38419a) {
            case 0:
                ((l5) this.f38420b).f38792b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.p5) this.f38420b).b();
                return;
            case 2:
                ((d70) this.f38420b).f36284b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.p5 p5Var = ((dp0) this.f38420b).f36440i;
                if (p5Var != null) {
                    p5Var.b();
                    return;
                }
                return;
            default:
                s71 s71Var = (s71) this.f38420b;
                s71Var.h.b();
                s71Var.f41396n.b();
                return;
        }
    }
}
