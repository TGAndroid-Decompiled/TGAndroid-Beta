package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class t31 extends s4.h0 {
    public Context f30553c;
    public View d;
    public int f30554e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f30554e++;
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
        return this.f30554e;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new s4.c1(new jn(this.f30553c, 13));
        }
        return new s4.c1(this.d);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
    }
}
