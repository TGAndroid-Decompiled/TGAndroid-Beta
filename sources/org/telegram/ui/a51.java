package org.telegram.ui;

import android.view.View;
public final class a51 implements View.OnClickListener {
    public final int f34677a;
    public final e51 f34678b;

    public a51(e51 e51Var, int i10) {
        this.f34677a = i10;
        this.f34678b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34677a) {
            case 0:
                e51 e51Var = this.f34678b;
                if (e51Var.Y == null) {
                    e51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f34678b.dismiss();
                return;
        }
    }
}
