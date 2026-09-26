package org.telegram.ui.Components;

import android.view.View;
public final class l41 implements View.OnClickListener {
    public final int f25964a;
    public final u41 f25965b;

    public l41(u41 u41Var, int i10) {
        this.f25964a = i10;
        this.f25965b = u41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25964a) {
            case 0:
                this.f25965b.dismiss();
                return;
            case 1:
                this.f25965b.dismiss();
                return;
            case 2:
                this.f25965b.dismiss();
                return;
            case 3:
                u41 u41Var = this.f25965b;
                CharSequence charSequence = u41Var.f28697c0;
                if (charSequence != null) {
                    u41Var.f28698d0.run(charSequence);
                }
                u41Var.dismiss();
                return;
            default:
                u41.P(this.f25965b, view);
                return;
        }
    }
}
