package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class xa0 extends a81 {
    public final Context f32516a;
    public final wb0 f32517b;

    public xa0(wb0 wb0Var, Context context) {
        this.f32517b = wb0Var;
        this.f32516a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        qb0 qb0Var = (qb0) view;
        qb0Var.h();
        qb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new qb0(this.f32517b, this.f32516a, i10);
    }

    @Override
    public final int e() {
        return this.f32517b.f32254e.f30876a.size();
    }

    @Override
    public final int h(int i10) {
        return ((tb0) this.f32517b.f32254e.f30876a.get(i10)).f30611a;
    }
}
