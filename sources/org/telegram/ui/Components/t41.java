package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class t41 extends s4.h0 {
    public Context f31057c;
    public View d;
    public int f31058e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f31058e++;
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
        return this.f31058e;
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new s4.c1(new nn(this.f31057c, 13));
        }
        return new s4.c1(this.d);
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
    }
}
