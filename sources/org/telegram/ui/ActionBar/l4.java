package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f21566a;
    public final v4 f21567b;

    public l4(v4 v4Var, int i10) {
        this.f21566a = i10;
        this.f21567b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21566a) {
            case 0:
                this.f21567b.g();
                return;
            case 1:
                this.f21567b.g();
                return;
            default:
                this.f21567b.g();
                return;
        }
    }
}
