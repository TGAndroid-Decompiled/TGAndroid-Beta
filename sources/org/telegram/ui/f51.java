package org.telegram.ui;

import android.view.View;
public final class f51 implements View.OnClickListener {
    public final int f37548a;
    public final j51 f37549b;

    public f51(j51 j51Var, int i10) {
        this.f37548a = i10;
        this.f37549b = j51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37548a) {
            case 0:
                j51 j51Var = this.f37549b;
                if (j51Var.Y == null) {
                    j51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f37549b.dismiss();
                return;
        }
    }
}
