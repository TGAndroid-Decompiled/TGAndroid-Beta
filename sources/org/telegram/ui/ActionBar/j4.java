package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 implements View.OnClickListener {
    public final int f21275a;
    public final t4 f21276b;

    public j4(t4 t4Var, int i10) {
        this.f21275a = i10;
        this.f21276b = t4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21275a) {
            case 0:
                this.f21276b.g();
                return;
            case 1:
                this.f21276b.g();
                return;
            default:
                this.f21276b.g();
                return;
        }
    }
}
