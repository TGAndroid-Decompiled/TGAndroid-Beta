package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class u31 extends f2.o0 {
    public Context f29107c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
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
        return this.e;
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new f2.l1(new gn(this.f29107c, 10));
        }
        return new f2.l1(this.d);
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
    }
}
