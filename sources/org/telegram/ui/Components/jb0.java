package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jb0 extends p81 {
    public final Context f25441a;
    public final gc0 f25442b;

    public jb0(gc0 gc0Var, Context context) {
        this.f25442b = gc0Var;
        this.f25441a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ac0 ac0Var = (ac0) view;
        ac0Var.h();
        ac0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new ac0(this.f25442b, this.f25441a, i10);
    }

    @Override
    public final int e() {
        return this.f25442b.e.f24006a.size();
    }

    @Override
    public final int h(int i10) {
        return ((dc0) this.f25442b.e.f24006a.get(i10)).f23628a;
    }
}
