package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class jb0 extends o81 {
    public final Context f25371a;
    public final gc0 f25372b;

    public jb0(gc0 gc0Var, Context context) {
        this.f25372b = gc0Var;
        this.f25371a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        ac0 ac0Var = (ac0) view;
        ac0Var.h();
        ac0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new ac0(this.f25372b, this.f25371a, i10);
    }

    @Override
    public final int e() {
        return this.f25372b.e.f23922a.size();
    }

    @Override
    public final int h(int i10) {
        return ((dc0) this.f25372b.e.f23922a.get(i10)).f23660a;
    }
}
