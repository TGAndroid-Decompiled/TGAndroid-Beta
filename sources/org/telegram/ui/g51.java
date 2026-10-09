package org.telegram.ui;

import android.view.View;
public final class g51 implements View.OnClickListener {
    public final int f37784a;
    public final k51 f37785b;

    public g51(k51 k51Var, int i10) {
        this.f37784a = i10;
        this.f37785b = k51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37784a) {
            case 0:
                k51 k51Var = this.f37785b;
                if (k51Var.Y == null) {
                    k51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f37785b.dismiss();
                return;
        }
    }
}
