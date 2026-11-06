package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class j21 extends v4.g0 {
    public Context f34856c;
    public View d;
    public int f34857e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f34857e++;
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
        return this.f34857e;
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            return new v4.d1(new tm(this.f34856c, 12));
        }
        return new v4.d1(this.d);
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
    }
}
