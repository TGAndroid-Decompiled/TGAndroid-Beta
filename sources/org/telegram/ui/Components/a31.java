package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class a31 extends v4.i0 {
    public Context f33294c;
    public View d;
    public int f33295e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f33295e++;
        this.d = view;
        g(1);
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return this.f33295e;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            return new v4.f1(new ln(this.f33294c, 12));
        }
        return new v4.f1(this.d);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
    }
}
