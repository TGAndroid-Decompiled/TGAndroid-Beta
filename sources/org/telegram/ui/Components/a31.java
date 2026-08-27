package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class a31 extends f2.q0 {

    public Context f26619c;
    public View d;

    public int f26620e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f26620e++;
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
        return this.f26620e;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return i10 == 0 ? new lk0(new zm(this.f26619c, 12)) : new lk0(this.d);
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
    }
}
