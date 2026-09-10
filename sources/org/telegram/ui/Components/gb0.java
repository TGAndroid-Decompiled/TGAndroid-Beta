package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class gb0 extends n81 {
    public final Context f23319a;
    public final ec0 f23320b;

    public gb0(ec0 ec0Var, Context context) {
        this.f23320b = ec0Var;
        this.f23319a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        yb0 yb0Var = (yb0) view;
        yb0Var.h();
        yb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new yb0(this.f23320b, this.f23319a, i10);
    }

    @Override
    public final int e() {
        return this.f23320b.e.f22094a.size();
    }

    @Override
    public final int h(int i10) {
        return ((bc0) this.f23320b.e.f22094a.get(i10)).f21799a;
    }
}
