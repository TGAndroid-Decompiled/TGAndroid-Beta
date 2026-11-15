package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class o21 extends v4.h0 {
    public Context f37821c;
    public View d;
    public int f37822e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f37822e++;
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
        return this.f37822e;
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            return new v4.e1(new bn(this.f37821c, 12));
        }
        return new v4.e1(this.d);
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
    }
}
