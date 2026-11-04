package org.telegram.ui;

import android.view.View;
public final class fd implements View.OnClickListener {
    public final int f45259a;
    public final org.telegram.ui.ActionBar.t2 f45260b;

    public fd(org.telegram.ui.ActionBar.t2 t2Var, int i3) {
        this.f45259a = i3;
        this.f45260b = t2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45259a) {
            case 0:
                this.f45260b.dismiss();
                return;
            default:
                this.f45260b.dismiss();
                return;
        }
    }
}
