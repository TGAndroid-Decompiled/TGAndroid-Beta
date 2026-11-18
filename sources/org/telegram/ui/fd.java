package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f47597a;
    public final org.telegram.ui.ActionBar.x2 f47598b;

    public fd(org.telegram.ui.ActionBar.x2 x2Var, int i7) {
        this.f47597a = i7;
        this.f47598b = x2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47597a) {
            case 0:
                this.f47598b.dismiss();
                return;
            default:
                this.f47598b.dismiss();
                return;
        }
    }
}
