package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class o90 extends h61 {
    public final Context f36680a;
    public final ia0 f36681b;

    public o90(ia0 ia0Var, Context context) {
        this.f36681b = ia0Var;
        this.f36680a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        ca0 ca0Var = (ca0) view;
        ca0Var.i();
        ca0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new ca0(this.f36681b, this.f36680a, i7);
    }

    @Override
    public final int e() {
        return this.f36681b.f34578e.f33922a.size();
    }

    @Override
    public final int h(int i7) {
        return ((fa0) this.f36681b.f34578e.f33922a.get(i7)).f33548a;
    }
}
