package org.telegram.ui;

import android.view.View;
public final class d5 implements View.OnAttachStateChangeListener {
    public final int f36617a;
    public Object f36618b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f36617a) {
            case 0:
                ((e5) this.f36618b).f36920b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.d5) this.f36618b).a();
                return;
            case 2:
                org.telegram.messenger.zs.e().c((mt) this.f36618b, 259);
                return;
            case 3:
                ((o60) this.f36618b).f40151b.P();
                return;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((on0) this.f36618b).f40313i;
                if (d5Var != null) {
                    d5Var.a();
                    return;
                }
                return;
            default:
                z41 z41Var = (z41) this.f36618b;
                z41Var.h.a();
                z41Var.f44016n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f36617a) {
            case 0:
                ((e5) this.f36618b).f36920b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.d5) this.f36618b).b();
                return;
            case 2:
                org.telegram.messenger.zs.e().n((mt) this.f36618b, 259);
                return;
            case 3:
                ((o60) this.f36618b).f40151b.R();
                return;
            case 4:
                org.telegram.ui.Components.d5 d5Var = ((on0) this.f36618b).f40313i;
                if (d5Var != null) {
                    d5Var.b();
                    return;
                }
                return;
            default:
                z41 z41Var = (z41) this.f36618b;
                z41Var.h.b();
                z41Var.f44016n.b();
                return;
        }
    }

    public d5(Object obj, int i10) {
        this.f36617a = i10;
        this.f36618b = obj;
    }
}
