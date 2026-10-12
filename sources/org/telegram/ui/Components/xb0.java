package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xb0 extends c91 {
    public final Context f31225a;
    public final vc0 f31226b;

    public xb0(vc0 vc0Var, Context context) {
        this.f31226b = vc0Var;
        this.f31225a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pc0 pc0Var = (pc0) view;
        pc0Var.h();
        pc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new pc0(this.f31226b, this.f31225a, i10);
    }

    @Override
    public final int e() {
        return this.f31226b.e.f29348a.size();
    }

    @Override
    public final int h(int i10) {
        return ((sc0) this.f31226b.e.f29348a.get(i10)).f29114a;
    }
}
