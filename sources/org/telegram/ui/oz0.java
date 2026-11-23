package org.telegram.ui;

import android.view.View;
public final class oz0 implements View.OnClickListener {
    public final int f50795a;
    public final sz0 f50796b;

    public oz0(sz0 sz0Var, int i7) {
        this.f50795a = i7;
        this.f50796b = sz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f50795a) {
            case 0:
                sz0 sz0Var = this.f50796b;
                if (sz0Var.Z == null) {
                    sz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f50796b.dismiss();
                return;
        }
    }
}
