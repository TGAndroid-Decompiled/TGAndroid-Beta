package org.telegram.ui;

import android.view.View;
public final class l41 implements View.OnClickListener {
    public final int f35955a;
    public final p41 f35956b;

    public l41(p41 p41Var, int i10) {
        this.f35955a = i10;
        this.f35956b = p41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35955a) {
            case 0:
                p41 p41Var = this.f35956b;
                if (p41Var.V == null) {
                    p41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f35956b.dismiss();
                return;
        }
    }
}
