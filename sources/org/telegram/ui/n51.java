package org.telegram.ui;

import android.view.View;
public final class n51 implements View.OnClickListener {
    public final int f38144a;
    public final r51 f38145b;

    public n51(r51 r51Var, int i10) {
        this.f38144a = i10;
        this.f38145b = r51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38144a) {
            case 0:
                r51 r51Var = this.f38145b;
                if (r51Var.Y == null) {
                    r51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f38145b.dismiss();
                return;
        }
    }
}
