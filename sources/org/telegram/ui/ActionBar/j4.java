package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 implements View.OnClickListener {
    public final int f19496a;
    public final t4 f19497b;

    public j4(t4 t4Var, int i10) {
        this.f19496a = i10;
        this.f19497b = t4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19496a) {
            case 0:
                this.f19497b.g();
                return;
            case 1:
                this.f19497b.g();
                return;
            default:
                this.f19497b.g();
                return;
        }
    }
}
