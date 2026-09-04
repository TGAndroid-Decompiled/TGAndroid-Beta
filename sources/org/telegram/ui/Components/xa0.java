package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xa0 extends a81 {
    public final Context f32489a;
    public final wb0 f32490b;

    public xa0(wb0 wb0Var, Context context) {
        this.f32490b = wb0Var;
        this.f32489a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        qb0 qb0Var = (qb0) view;
        qb0Var.h();
        qb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new qb0(this.f32490b, this.f32489a, i10);
    }

    @Override
    public final int e() {
        return this.f32490b.f32227e.f30849a.size();
    }

    @Override
    public final int h(int i10) {
        return ((tb0) this.f32490b.f32227e.f30849a.get(i10)).f30584a;
    }
}
