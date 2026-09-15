package org.telegram.ui;

import android.view.View;
public final class d51 implements View.OnClickListener {
    public final int f32931a;
    public final h51 f32932b;

    public d51(h51 h51Var, int i10) {
        this.f32931a = i10;
        this.f32932b = h51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32931a) {
            case 0:
                h51 h51Var = this.f32932b;
                if (h51Var.Y == null) {
                    h51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f32932b.dismiss();
                return;
        }
    }
}
