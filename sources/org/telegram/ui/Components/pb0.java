package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class pb0 extends m91 {
    public final Context f31519a;
    public final nc0 f31520b;

    public pb0(nc0 nc0Var, Context context) {
        this.f31520b = nc0Var;
        this.f31519a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        hc0 hc0Var = (hc0) view;
        hc0Var.i();
        hc0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new hc0(this.f31520b, this.f31519a, i10);
    }

    @Override
    public final int e() {
        return this.f31520b.e.f30165a.size();
    }

    @Override
    public final int h(int i10) {
        return ((kc0) this.f31520b.e.f30165a.get(i10)).f29901a;
    }
}
