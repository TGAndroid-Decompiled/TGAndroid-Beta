package org.telegram.ui;

import android.view.View;
public final class g51 implements View.OnClickListener {
    public final int f36597a;
    public final k51 f36598b;

    public g51(k51 k51Var, int i10) {
        this.f36597a = i10;
        this.f36598b = k51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36597a) {
            case 0:
                k51 k51Var = this.f36598b;
                if (k51Var.Y == null) {
                    k51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f36598b.dismiss();
                return;
        }
    }
}
