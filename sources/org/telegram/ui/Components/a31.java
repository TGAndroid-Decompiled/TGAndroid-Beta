package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class a31 extends v4.h0 {
    public Context f33273c;
    public View d;
    public int f33274e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f33274e++;
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
        return this.f33274e;
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            return new v4.e1(new ln(this.f33273c, 12));
        }
        return new v4.e1(this.d);
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
    }
}
