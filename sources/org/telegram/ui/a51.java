package org.telegram.ui;

import android.view.View;
public final class a51 implements View.OnClickListener {
    public final int f31970a;
    public final e51 f31971b;

    public a51(e51 e51Var, int i10) {
        this.f31970a = i10;
        this.f31971b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31970a) {
            case 0:
                e51 e51Var = this.f31971b;
                if (e51Var.Y == null) {
                    e51Var.dismiss();
                    return;
                }
                return;
            default:
                this.f31971b.dismiss();
                return;
        }
    }
}
