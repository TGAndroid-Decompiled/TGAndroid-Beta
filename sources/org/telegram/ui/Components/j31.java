package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class j31 extends f2.p0 {
    public Context f29541c;
    public View d;
    public int f29542e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f29542e++;
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
        return this.f29542e;
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new f2.n1(new fn(this.f29541c, 11));
        }
        return new f2.n1(this.d);
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
    }
}
