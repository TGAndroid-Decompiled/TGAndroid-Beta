package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class o90 extends m61 {
    public final Context f36551a;
    public final ia0 f36552b;

    public o90(ia0 ia0Var, Context context) {
        this.f36552b = ia0Var;
        this.f36551a = context;
    }

    @Override
    public final void b(View view, int i7, int i10) {
        ca0 ca0Var = (ca0) view;
        ca0Var.i();
        ca0Var.l(false);
    }

    @Override
    public final View d(int i7) {
        return new ca0(this.f36552b, this.f36551a, i7);
    }

    @Override
    public final int e() {
        return this.f36552b.f34582e.f33859a.size();
    }

    @Override
    public final int h(int i7) {
        return ((fa0) this.f36552b.f34582e.f33859a.get(i7)).f33509a;
    }
}
