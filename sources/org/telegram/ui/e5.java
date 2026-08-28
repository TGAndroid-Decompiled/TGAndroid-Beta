package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f37821a;
    public final Object f37822b;

    public e5(Object obj, int i9) {
        this.f37821a = i9;
        this.f37822b = obj;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f37821a) {
            case 0:
                ((f5) this.f37822b).f38137b.onAttachedToWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.i5) this.f37822b).a();
                return;
            case 2:
                ((c70) this.f37822b).f37081b.onAttachedToWindow();
                return;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((vo0) this.f37822b).f43557i;
                if (i5Var != null) {
                    i5Var.a();
                    return;
                }
                return;
            default:
                u71 u71Var = (u71) this.f37822b;
                u71Var.h.a();
                u71Var.f43161n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f37821a) {
            case 0:
                ((f5) this.f37822b).f38137b.onDetachedFromWindow();
                return;
            case 1:
                ((org.telegram.ui.Components.i5) this.f37822b).b();
                return;
            case 2:
                ((c70) this.f37822b).f37081b.onDetachedFromWindow();
                return;
            case 3:
                org.telegram.ui.Components.i5 i5Var = ((vo0) this.f37822b).f43557i;
                if (i5Var != null) {
                    i5Var.b();
                    return;
                }
                return;
            default:
                u71 u71Var = (u71) this.f37822b;
                u71Var.h.b();
                u71Var.f43161n.b();
                return;
        }
    }
}
