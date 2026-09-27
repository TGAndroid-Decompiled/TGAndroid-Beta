package org.telegram.ui.ActionBar;

import android.view.View;
public final class i0 implements View.OnClickListener {
    public final int f18972a;
    public final g1 f18973b;

    public i0(g1 g1Var, int i10) {
        this.f18972a = i10;
        this.f18973b = g1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18972a) {
            case 0:
                this.f18973b.b();
                return;
            default:
                this.f18973b.b();
                return;
        }
    }
}
