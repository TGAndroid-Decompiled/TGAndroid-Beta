package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class h41 extends s4.h0 {
    public Context f23516c;
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
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new s4.c1(new qn(this.f23516c, 12));
        }
        return new s4.c1(this.d);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
    }
}
