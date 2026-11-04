package org.telegram.ui;

import android.view.View;
public final class ez0 implements View.OnClickListener {
    public final int f45112a;
    public final iz0 f45113b;

    public ez0(iz0 iz0Var, int i3) {
        this.f45112a = i3;
        this.f45113b = iz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f45112a) {
            case 0:
                iz0 iz0Var = this.f45113b;
                if (iz0Var.Z == null) {
                    iz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f45113b.dismiss();
                return;
        }
    }
}
