package org.telegram.ui;

import android.view.View;
public final class g51 implements View.OnClickListener {
    public final int f37786a;
    public final k51 f37787b;

    public g51(k51 k51Var, int i10) {
        this.f37786a = i10;
        this.f37787b = k51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37786a) {
            case 0:
                k51 k51Var = this.f37787b;
                if (k51Var.Y == null) {
                    k51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f37787b.dismiss();
                return;
        }
    }
}
