package org.telegram.ui;

import android.view.View;
public final class h51 implements View.OnClickListener {
    public final int f34140a;
    public final l51 f34141b;

    public h51(l51 l51Var, int i10) {
        this.f34140a = i10;
        this.f34141b = l51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34140a) {
            case 0:
                l51 l51Var = this.f34141b;
                if (l51Var.Y == null) {
                    l51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f34141b.dismiss();
                return;
        }
    }
}
