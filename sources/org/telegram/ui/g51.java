package org.telegram.ui;

import android.view.View;
public final class g51 implements View.OnClickListener {
    public final int f33857a;
    public final k51 f33858b;

    public g51(k51 k51Var, int i10) {
        this.f33857a = i10;
        this.f33858b = k51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33857a) {
            case 0:
                k51 k51Var = this.f33858b;
                if (k51Var.Y == null) {
                    k51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f33858b.dismiss();
                return;
        }
    }
}
