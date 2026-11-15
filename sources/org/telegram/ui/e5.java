package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f46563a;
    public Object f46564b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f46563a) {
            case 0:
                ((f5) this.f46564b).f47000b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.e5) this.f46564b).a();
                return;
            case 2:
                org.telegram.messenger.ns.e().c((os) this.f46564b, 259);
                return;
            case 3:
                ((p50) this.f46564b).f50155b.P();
                return;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((dm0) this.f46564b).f46434i;
                if (e5Var != null) {
                    e5Var.a();
                    return;
                }
                return;
            default:
                f31 f31Var = (f31) this.f46564b;
                f31Var.h.a();
                f31Var.f46988n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f46563a) {
            case 0:
                ((f5) this.f46564b).f47000b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.e5) this.f46564b).b();
                return;
            case 2:
                org.telegram.messenger.ns.e().n((os) this.f46564b, 259);
                return;
            case 3:
                ((p50) this.f46564b).f50155b.R();
                return;
            case 4:
                org.telegram.ui.Components.e5 e5Var = ((dm0) this.f46564b).f46434i;
                if (e5Var != null) {
                    e5Var.b();
                    return;
                }
                return;
            default:
                f31 f31Var = (f31) this.f46564b;
                f31Var.h.b();
                f31Var.f46988n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f46563a = i7;
        this.f46564b = obj;
    }
}
