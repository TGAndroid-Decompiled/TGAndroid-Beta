package org.telegram.ui;

import android.view.View;
public final class n41 implements View.OnClickListener {
    public final int f39289a;
    public final r41 f39290b;

    public n41(r41 r41Var, int i10) {
        this.f39289a = i10;
        this.f39290b = r41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39289a) {
            case 0:
                r41 r41Var = this.f39290b;
                if (r41Var.V == null) {
                    r41Var.dismiss();
                    return;
                }
                return;
            default:
                this.f39290b.dismiss();
                return;
        }
    }
}
