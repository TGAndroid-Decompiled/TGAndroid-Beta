package org.telegram.ui;

import android.view.View;
public final class h51 implements View.OnClickListener {
    public final int f34124a;
    public final l51 f34125b;

    public h51(l51 l51Var, int i10) {
        this.f34124a = i10;
        this.f34125b = l51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34124a) {
            case 0:
                l51 l51Var = this.f34125b;
                if (l51Var.Y == null) {
                    l51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f34125b.dismiss();
                return;
        }
    }
}
