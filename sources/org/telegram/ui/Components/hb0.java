package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class hb0 extends q81 {
    public final Context f24775a;
    public final gc0 f24776b;

    public hb0(gc0 gc0Var, Context context) {
        this.f24776b = gc0Var;
        this.f24775a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ac0 ac0Var = (ac0) view;
        ac0Var.h();
        ac0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new ac0(this.f24776b, this.f24775a, i10);
    }

    @Override
    public final int e() {
        return this.f24776b.e.f23928a.size();
    }

    @Override
    public final int h(int i10) {
        return ((dc0) this.f24776b.e.f23928a.get(i10)).f23646a;
    }
}
