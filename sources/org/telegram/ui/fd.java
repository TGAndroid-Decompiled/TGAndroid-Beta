package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47122a;
    public final org.telegram.ui.ActionBar.u2 f47123b;

    public fd(org.telegram.ui.ActionBar.u2 u2Var, int i7) {
        this.f47122a = i7;
        this.f47123b = u2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47122a) {
            case 0:
                this.f47123b.dismiss();
                return;
            default:
                this.f47123b.dismiss();
                return;
        }
    }
}
