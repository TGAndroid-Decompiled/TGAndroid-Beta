package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47639a;
    public final org.telegram.ui.ActionBar.x2 f47640b;

    public fd(org.telegram.ui.ActionBar.x2 x2Var, int i7) {
        this.f47639a = i7;
        this.f47640b = x2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47639a) {
            case 0:
                this.f47640b.dismiss();
                return;
            default:
                this.f47640b.dismiss();
                return;
        }
    }
}
