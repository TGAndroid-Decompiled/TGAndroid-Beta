package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class a51 extends s4.i0 {
    public Context f24610c;
    public View d;
    public int f24611e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f24611e++;
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
        return this.f24611e;
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new s4.d1(new ao(this.f24610c, 13));
        }
        return new s4.d1(this.d);
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
    }
}
