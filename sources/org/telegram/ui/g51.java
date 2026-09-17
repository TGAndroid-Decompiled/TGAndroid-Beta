package org.telegram.ui;

import android.view.View;
public final class g51 implements View.OnClickListener {
    public final int f36598a;
    public final k51 f36599b;

    public g51(k51 k51Var, int i10) {
        this.f36598a = i10;
        this.f36599b = k51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36598a) {
            case 0:
                k51 k51Var = this.f36599b;
                if (k51Var.Y == null) {
                    k51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f36599b.dismiss();
                return;
        }
    }
}
