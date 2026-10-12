package org.telegram.ui;

import android.view.View;
public final class j51 implements View.OnClickListener {
    public final int f39103a;
    public final n51 f39104b;

    public j51(n51 n51Var, int i10) {
        this.f39103a = i10;
        this.f39104b = n51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39103a) {
            case 0:
                n51 n51Var = this.f39104b;
                if (n51Var.Y == null) {
                    n51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f39104b.dismiss();
                return;
        }
    }
}
