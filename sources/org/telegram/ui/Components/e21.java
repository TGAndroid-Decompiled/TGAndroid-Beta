package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class e21 extends u4.h0 {
    public Context f33275c;
    public View d;
    public int f33276e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f33276e++;
        this.d = view;
        g(1);
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return this.f33276e;
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        if (i3 == 0) {
            return new u4.d1(new sm(this.f33275c, 13));
        }
        return new u4.d1(this.d);
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
    }
}
