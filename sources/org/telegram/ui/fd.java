package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47631a;
    public final org.telegram.ui.ActionBar.w2 f47632b;

    public fd(org.telegram.ui.ActionBar.w2 w2Var, int i7) {
        this.f47631a = i7;
        this.f47632b = w2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47631a) {
            case 0:
                this.f47632b.dismiss();
                return;
            default:
                this.f47632b.dismiss();
                return;
        }
    }
}
