package org.telegram.ui.ActionBar;

import android.view.View;
public final class i0 implements View.OnClickListener {
    public final int f17815a;
    public final g1 f17816b;

    public i0(g1 g1Var, int i10) {
        this.f17815a = i10;
        this.f17816b = g1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17815a) {
            case 0:
                this.f17816b.b();
                return;
            default:
                this.f17816b.b();
                return;
        }
    }
}
