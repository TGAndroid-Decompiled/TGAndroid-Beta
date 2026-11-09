package org.telegram.ui;

import android.view.View;
public final class e5 implements View.OnAttachStateChangeListener {
    public final int f45298a;
    public Object f45299b;

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f45298a) {
            case 0:
                ((f5) this.f45299b).f45576b.P();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45299b).a();
                return;
            case 2:
                org.telegram.messenger.qs.e().c((ns) this.f45299b, 259);
                return;
            case 3:
                ((s50) this.f45299b).f49765b.P();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((em0) this.f45299b).f45470i;
                if (g5Var != null) {
                    g5Var.a();
                    return;
                }
                return;
            default:
                i31 i31Var = (i31) this.f45299b;
                i31Var.h.a();
                i31Var.f46457n.a();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f45298a) {
            case 0:
                ((f5) this.f45299b).f45576b.R();
                return;
            case 1:
                ((org.telegram.ui.Components.g5) this.f45299b).b();
                return;
            case 2:
                org.telegram.messenger.qs.e().n((ns) this.f45299b, 259);
                return;
            case 3:
                ((s50) this.f45299b).f49765b.R();
                return;
            case 4:
                org.telegram.ui.Components.g5 g5Var = ((em0) this.f45299b).f45470i;
                if (g5Var != null) {
                    g5Var.b();
                    return;
                }
                return;
            default:
                i31 i31Var = (i31) this.f45299b;
                i31Var.h.b();
                i31Var.f46457n.b();
                return;
        }
    }

    public e5(Object obj, int i7) {
        this.f45298a = i7;
        this.f45299b = obj;
    }
}
