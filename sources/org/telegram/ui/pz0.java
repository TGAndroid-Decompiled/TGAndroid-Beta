package org.telegram.ui;

import android.view.View;
public final class pz0 implements View.OnClickListener {
    public final int f50967a;
    public final tz0 f50968b;

    public pz0(tz0 tz0Var, int i7) {
        this.f50967a = i7;
        this.f50968b = tz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50967a) {
            case 0:
                tz0 tz0Var = this.f50968b;
                if (tz0Var.Z == null) {
                    tz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f50968b.dismiss();
                return;
        }
    }
}
