package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class qb0 extends d91 {
    public final Context f29875a;
    public final pc0 f29876b;

    public qb0(pc0 pc0Var, Context context) {
        this.f29876b = pc0Var;
        this.f29875a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        jc0 jc0Var = (jc0) view;
        jc0Var.i();
        jc0Var.l(false);
    }

    @Override
    public final View d(int i10) {
        return new jc0(this.f29876b, this.f29875a, i10);
    }

    @Override
    public final int e() {
        return this.f29876b.e.f28867a.size();
    }

    @Override
    public final int h(int i10) {
        return ((mc0) this.f29876b.e.f28867a.get(i10)).f28578a;
    }
}
