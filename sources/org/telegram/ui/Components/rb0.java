package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class rb0 extends v81 {
    public final Context f29920a;
    public final oc0 f29921b;

    public rb0(oc0 oc0Var, Context context) {
        this.f29921b = oc0Var;
        this.f29920a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ic0 ic0Var = (ic0) view;
        ic0Var.i();
        ic0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new ic0(this.f29921b, this.f29920a, i10);
    }

    @Override
    public final int e() {
        return this.f29921b.e.f28512a.size();
    }

    @Override
    public final int h(int i10) {
        return ((lc0) this.f29921b.e.f28512a.get(i10)).f28183a;
    }
}
