package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47670a;
    public final org.telegram.ui.ActionBar.w2 f47671b;

    public fd(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f47670a = i7;
        this.f47671b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47670a) {
            case 0:
                this.f47671b.dismiss();
                return;
            default:
                this.f47671b.dismiss();
                return;
        }
    }
}
