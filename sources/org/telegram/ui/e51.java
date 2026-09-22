package org.telegram.ui;

import android.view.View;
public final class e51 implements View.OnClickListener {
    public final int f33170a;
    public final i51 f33171b;

    public e51(i51 i51Var, int i10) {
        this.f33170a = i10;
        this.f33171b = i51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33170a) {
            case 0:
                i51 i51Var = this.f33171b;
                if (i51Var.Y == null) {
                    i51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f33171b.dismiss();
                return;
        }
    }
}
