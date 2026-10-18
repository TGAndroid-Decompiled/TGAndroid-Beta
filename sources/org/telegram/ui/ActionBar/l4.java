package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f21559a;
    public final v4 f21560b;

    public l4(v4 v4Var, int i10) {
        this.f21559a = i10;
        this.f21560b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21559a) {
            case 0:
                this.f21560b.g();
                return;
            case 1:
                this.f21560b.g();
                return;
            default:
                this.f21560b.g();
                return;
        }
    }
}
