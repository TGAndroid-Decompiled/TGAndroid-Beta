package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class y21 extends f2.r0 {
    public Context f34842c;
    public View d;
    public int f34843e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f34843e++;
        this.d = view;
        m(1);
    }

    @Override
    public final int h() {
        return 2;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return this.f34843e;
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        if (i9 == 0) {
            return new f2.q1(new an(this.f34842c, 14));
        }
        return new f2.q1(this.d);
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
    }
}
