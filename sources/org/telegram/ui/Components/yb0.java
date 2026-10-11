package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class yb0 extends g91 {
    public final Context f33219a;
    public final vc0 f33220b;

    public yb0(vc0 vc0Var, Context context) {
        this.f33220b = vc0Var;
        this.f33219a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pc0 pc0Var = (pc0) view;
        pc0Var.h();
        pc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new pc0(this.f33220b, this.f33219a, i10);
    }

    @Override
    public final int e() {
        return this.f33220b.f31854e.f31204a.size();
    }

    @Override
    public final int h(int i10) {
        return ((sc0) this.f33220b.f31854e.f31204a.get(i10)).f30845a;
    }
}
