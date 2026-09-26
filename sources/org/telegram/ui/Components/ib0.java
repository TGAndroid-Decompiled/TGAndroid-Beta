package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
public final class ib0 extends n81 {
    public final Context f25005a;
    public final fc0 f25006b;

    public ib0(fc0 fc0Var, Context context) {
        this.f25006b = fc0Var;
        this.f25005a = context;
    }

    @Override
    public final void b(View view, int i10, int i11) {
        zb0 zb0Var = (zb0) view;
        zb0Var.h();
        zb0Var.k(false);
    }

    @Override
    public final View d(int i10) {
        return new zb0(this.f25006b, this.f25005a, i10);
    }

    @Override
    public final int e() {
        return this.f25006b.e.f23585a.size();
    }

    @Override
    public final int h(int i10) {
        return ((cc0) this.f25006b.e.f23585a.get(i10)).f23308a;
    }
}
