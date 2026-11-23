package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class z21 extends v4.i0 {
    public Context f42651c;
    public View d;
    public int f42652e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f42652e++;
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
        return this.f42652e;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            return new v4.f1(new in(this.f42651c, 12));
        }
        return new v4.f1(this.d);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
    }
}
