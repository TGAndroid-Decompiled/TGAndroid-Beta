package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47666a;
    public final org.telegram.ui.ActionBar.w2 f47667b;

    public fd(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f47666a = i7;
        this.f47667b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47666a) {
            case 0:
                this.f47667b.dismiss();
                return;
            default:
                this.f47667b.dismiss();
                return;
        }
    }
}
