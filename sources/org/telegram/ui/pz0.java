package org.telegram.ui;

import android.view.View;
public final class pz0 implements View.OnClickListener {
    public final int f50948a;
    public final tz0 f50949b;

    public pz0(tz0 tz0Var, int i7) {
        this.f50948a = i7;
        this.f50949b = tz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50948a) {
            case 0:
                tz0 tz0Var = this.f50949b;
                if (tz0Var.Z == null) {
                    tz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f50949b.dismiss();
                return;
        }
    }
}
