package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class u31 extends f2.p0 {
    public Context f31496c;
    public View d;
    public int f31497e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f31497e++;
        this.d = view;
        m(1);
    }

    @Override
    public final int h() {
        return 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.f31497e;
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new f2.m1(new in(this.f31496c, 10));
        }
        return new f2.m1(this.d);
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
    }
}
