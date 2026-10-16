package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xb0 extends d91 {
    public final Context f30909a;
    public final vc0 f30910b;

    public xb0(vc0 vc0Var, Context context) {
        this.f30910b = vc0Var;
        this.f30909a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        pc0 pc0Var = (pc0) view;
        pc0Var.h();
        pc0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new pc0(this.f30910b, this.f30909a, i10);
    }

    @Override
    public final int e() {
        return this.f30910b.e.f29035a.size();
    }

    @Override
    public final int h(int i10) {
        return ((sc0) this.f30910b.e.f29035a.get(i10)).f28817a;
    }
}
