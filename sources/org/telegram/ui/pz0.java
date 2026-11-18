package org.telegram.ui;

import android.view.View;
public final class pz0 implements View.OnClickListener {
    public final int f51046a;
    public final tz0 f51047b;

    public pz0(tz0 tz0Var, int i7) {
        this.f51046a = i7;
        this.f51047b = tz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f51046a) {
            case 0:
                tz0 tz0Var = this.f51047b;
                if (tz0Var.Z == null) {
                    tz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f51047b.dismiss();
                return;
        }
    }
}
