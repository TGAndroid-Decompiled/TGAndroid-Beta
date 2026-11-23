package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f47434a;
    public Object f47435b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f47434a) {
            case 0:
                ((f5) this.f47435b).f47679b.Q();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f47435b).a();
                return;
            case 2:
                org.telegram.messenger.ks.e().c((os) this.f47435b, 262);
                return;
            case 3:
                ((r50) this.f47435b).f51626b.Q();
                return;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((em0) this.f47435b).f47585i;
                if (m5Var != null) {
                    m5Var.a();
                    return;
                }
                return;
            default:
                i31 i31Var = (i31) this.f47435b;
                i31Var.h.a();
                i31Var.f48707n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f47434a) {
            case 0:
                ((f5) this.f47435b).f47679b.S();
                return;
            case 1:
                ((org.telegram.ui.Components.m5) this.f47435b).b();
                return;
            case 2:
                org.telegram.messenger.ks.e().n((os) this.f47435b, 262);
                return;
            case 3:
                ((r50) this.f47435b).f51626b.S();
                return;
            case 4:
                org.telegram.ui.Components.m5 m5Var = ((em0) this.f47435b).f47585i;
                if (m5Var != null) {
                    m5Var.b();
                    return;
                }
                return;
            default:
                i31 i31Var = (i31) this.f47435b;
                i31Var.h.b();
                i31Var.f48707n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f47434a = i7;
        this.f47435b = obj;
    }
}
