package org.telegram.ui;

import android.view.View;
public final class f5 implements View.OnAttachStateChangeListener {
    public final int f36291a;
    public final Object f36292b;

    public f5(Object obj, int i10) {
        this.f36291a = i10;
        this.f36292b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36291a) {
            case 0:
                ((g5) this.f36292b).f36589b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36292b).a();
                return;
            case 2:
                ((x70) this.f36292b).f42634b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.f36292b).f42482i;
                if (o5Var != null) {
                    o5Var.a();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f36292b;
                d91Var.h.a();
                d91Var.f35766n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36291a) {
            case 0:
                ((g5) this.f36292b).f36589b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.o5) this.f36292b).b();
                return;
            case 2:
                ((x70) this.f36292b).f42634b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = ((wp0) this.f36292b).f42482i;
                if (o5Var != null) {
                    o5Var.b();
                    return;
                }
                return;
            default:
                d91 d91Var = (d91) this.f36292b;
                d91Var.h.b();
                d91Var.f35766n.b();
                return;
        }
    }
}
