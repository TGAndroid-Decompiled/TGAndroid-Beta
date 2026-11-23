package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47799a;
    public final org.telegram.ui.ActionBar.w2 f47800b;

    public fd(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f47799a = i7;
        this.f47800b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47799a) {
            case 0:
                this.f47800b.dismiss();
                return;
            default:
                this.f47800b.dismiss();
                return;
        }
    }
}
