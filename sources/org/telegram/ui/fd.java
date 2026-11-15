package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47106a;
    public final org.telegram.ui.ActionBar.u2 f47107b;

    public fd(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f47106a = i7;
        this.f47107b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47106a) {
            case 0:
                this.f47107b.dismiss();
                return;
            default:
                this.f47107b.dismiss();
                return;
        }
    }
}
