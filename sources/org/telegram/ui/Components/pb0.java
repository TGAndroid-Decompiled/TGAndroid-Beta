package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class pb0 extends m91 {
    public final Context f31517a;
    public final nc0 f31518b;

    public pb0(nc0 nc0Var, Context context) {
        this.f31518b = nc0Var;
        this.f31517a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        hc0 hc0Var = (hc0) view;
        hc0Var.i();
        hc0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new hc0(this.f31518b, this.f31517a, i10);
    }

    @Override
    public final int e() {
        return this.f31518b.e.f30163a.size();
    }

    @Override
    public final int h(int i10) {
        return ((kc0) this.f31518b.e.f30163a.get(i10)).f29899a;
    }
}
