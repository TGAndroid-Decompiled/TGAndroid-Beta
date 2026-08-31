package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ab0 extends e81 {
    public final Context f25216a;
    public final yb0 f25217b;

    public ab0(yb0 yb0Var, Context context) {
        this.f25217b = yb0Var;
        this.f25216a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        sb0 sb0Var = (sb0) view;
        sb0Var.h();
        sb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new sb0(this.f25217b, this.f25216a, i10);
    }

    @Override
    public final int e() {
        return this.f25217b.f33435e.f32714a.size();
    }

    @Override
    public final int h(int i10) {
        return ((vb0) this.f25217b.f33435e.f32714a.get(i10)).f31877a;
    }
}
