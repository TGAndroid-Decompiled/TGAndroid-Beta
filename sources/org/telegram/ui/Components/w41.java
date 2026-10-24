package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class w41 extends s4.g0 {
    public Context f32128c;
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
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new s4.b1(new sn(this.f32128c, 13));
        }
        return new s4.b1(this.d);
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
    }
}
