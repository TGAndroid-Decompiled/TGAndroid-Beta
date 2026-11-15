package org.telegram.ui;

import android.view.View;
public final class lz0 implements View.OnClickListener {
    public final int f49077a;
    public final pz0 f49078b;

    public lz0(pz0 pz0Var, int i7) {
        this.f49077a = i7;
        this.f49078b = pz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f49077a) {
            case 0:
                pz0 pz0Var = this.f49078b;
                if (pz0Var.Z == null) {
                    pz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f49078b.dismiss();
                return;
        }
    }
}
