package org.telegram.ui;

import android.view.View;
public final class f51 implements View.OnClickListener {
    public final int f37582a;
    public final j51 f37583b;

    public f51(j51 j51Var, int i10) {
        this.f37582a = i10;
        this.f37583b = j51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37582a) {
            case 0:
                j51 j51Var = this.f37583b;
                if (j51Var.Y == null) {
                    j51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f37583b.dismiss();
                return;
        }
    }
}
