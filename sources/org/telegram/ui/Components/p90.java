package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class p90 extends n61 {
    public final Context f36957a;
    public final ja0 f36958b;

    public p90(ja0 ja0Var, Context context) {
        this.f36958b = ja0Var;
        this.f36957a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        da0 da0Var = (da0) view;
        da0Var.i();
        da0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new da0(this.f36958b, this.f36957a, i7);
    }

    @Override
    public final int e() {
        return this.f36958b.f34973e.f34259a.size();
    }

    @Override
    public final int h(int i7) {
        return ((ga0) this.f36958b.f34973e.f34259a.get(i7)).f33914a;
    }
}
