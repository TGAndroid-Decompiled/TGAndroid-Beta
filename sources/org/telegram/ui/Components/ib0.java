package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ib0 extends n81 {
    public final Context f25006a;
    public final fc0 f25007b;

    public ib0(fc0 fc0Var, Context context) {
        this.f25007b = fc0Var;
        this.f25006a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        zb0 zb0Var = (zb0) view;
        zb0Var.h();
        zb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new zb0(this.f25007b, this.f25006a, i10);
    }

    @Override
    public final int e() {
        return this.f25007b.e.f23586a.size();
    }

    @Override
    public final int h(int i10) {
        return ((cc0) this.f25007b.e.f23586a.get(i10)).f23309a;
    }
}
