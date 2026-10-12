package org.telegram.ui;

import android.view.View;
public final class n51 implements View.OnClickListener {
    public final int f38429a;
    public final r51 f38430b;

    public n51(r51 r51Var, int i10) {
        this.f38429a = i10;
        this.f38430b = r51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38429a) {
            case 0:
                r51 r51Var = this.f38430b;
                if (r51Var.Y == null) {
                    r51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f38430b.dismiss();
                return;
        }
    }
}
