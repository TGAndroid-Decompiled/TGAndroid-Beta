package org.telegram.ui;

import android.view.View;
public final class lz0 implements View.OnClickListener {
    public final int f49081a;
    public final pz0 f49082b;

    public lz0(pz0 pz0Var, int i7) {
        this.f49081a = i7;
        this.f49082b = pz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49081a) {
            case 0:
                pz0 pz0Var = this.f49082b;
                if (pz0Var.Z == null) {
                    pz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f49082b.dismiss();
                return;
        }
    }
}
