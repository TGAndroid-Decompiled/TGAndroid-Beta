package org.telegram.ui;

import android.view.View;
public final class j51 implements View.OnClickListener {
    public final int f33931a;
    public final n51 f33932b;

    public j51(n51 n51Var, int i10) {
        this.f33931a = i10;
        this.f33932b = n51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33931a) {
            case 0:
                n51 n51Var = this.f33932b;
                if (n51Var.Y == null) {
                    n51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f33932b.dismiss();
                return;
        }
    }
}
