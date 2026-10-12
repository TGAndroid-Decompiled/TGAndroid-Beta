package org.telegram.ui;

import android.view.View;
public final class j5 implements View.OnAttachStateChangeListener {
    public final int f37257a;
    public final Object f37258b;

    public j5(Object obj, int i10) {
        this.f37257a = i10;
        this.f37258b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37257a) {
            case 0:
                ((k5) this.f37258b).f37566b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37258b).a();
                return;
            case 2:
                ((b80) this.f37258b).f34445b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((bq0) this.f37258b).f34616i;
                if (q5Var != null) {
                    q5Var.a();
                    return;
                }
                return;
            default:
                j91 j91Var = (j91) this.f37258b;
                j91Var.h.a();
                j91Var.f37330n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37257a) {
            case 0:
                ((k5) this.f37258b).f37566b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.q5) this.f37258b).b();
                return;
            case 2:
                ((b80) this.f37258b).f34445b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.q5 q5Var = ((bq0) this.f37258b).f34616i;
                if (q5Var != null) {
                    q5Var.b();
                    return;
                }
                return;
            default:
                j91 j91Var = (j91) this.f37258b;
                j91Var.h.b();
                j91Var.f37330n.b();
                return;
        }
    }
}
