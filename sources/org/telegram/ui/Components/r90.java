package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class r90 extends n61 {
    public final Context f38905a;
    public final ka0 f38906b;

    public r90(ka0 ka0Var, Context context) {
        this.f38906b = ka0Var;
        this.f38905a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        ea0 ea0Var = (ea0) view;
        ea0Var.i();
        ea0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new ea0(this.f38906b, this.f38905a, i7);
    }

    @Override
    public final int e() {
        return this.f38906b.f36338e.f35520a.size();
    }

    @Override
    public final int h(int i7) {
        return ((ha0) this.f38906b.f36338e.f35520a.get(i7)).f35205a;
    }
}
