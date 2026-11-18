package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class x21 extends v4.i0 {
    public Context f41867c;
    public View d;
    public int f41868e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.f41868e++;
        this.d = view;
        g(1);
    }

    @Override
    public final int b() {
        return 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return this.f41868e;
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (i7 == 0) {
            return new v4.f1(new jn(this.f41867c, 12));
        }
        return new v4.f1(this.d);
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
    }
}
