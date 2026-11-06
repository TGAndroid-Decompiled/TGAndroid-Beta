package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class o90 extends l61 {
    public final Context f36558a;
    public final ia0 f36559b;

    public o90(ia0 ia0Var, Context context) {
        this.f36559b = ia0Var;
        this.f36558a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        ca0 ca0Var = (ca0) view;
        ca0Var.i();
        ca0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new ca0(this.f36559b, this.f36558a, i7);
    }

    @Override
    public final int e() {
        return this.f36559b.f34541e.f33870a.size();
    }

    @Override
    public final int h(int i7) {
        return ((fa0) this.f36559b.f34541e.f33870a.get(i7)).f33492a;
    }
}
