package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class l31 extends s4.g0 {
    public Context f28005c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
        this.d = view;
        g(1);
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new s4.c1(new bn(this.f28005c, 9));
        }
        return new s4.c1(this.d);
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
    }
}
