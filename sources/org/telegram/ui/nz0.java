package org.telegram.ui;

import android.view.View;
public final class nz0 implements View.OnClickListener {
    public final int f48178a;
    public final rz0 f48179b;

    public nz0(rz0 rz0Var, int i7) {
        this.f48178a = i7;
        this.f48179b = rz0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48178a) {
            case 0:
                rz0 rz0Var = this.f48179b;
                if (rz0Var.Y == null) {
                    rz0Var.dismiss();
                    return;
                }
                return;
            default:
                this.f48179b.dismiss();
                return;
        }
    }
}
