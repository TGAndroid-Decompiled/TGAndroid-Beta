package org.telegram.ui.Components;

import android.view.View;
public final class u41 implements View.OnClickListener {
    public final int f30889a;
    public final d51 f30890b;

    public u41(d51 d51Var, int i10) {
        this.f30889a = i10;
        this.f30890b = d51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30889a) {
            case 0:
                this.f30890b.dismiss();
                return;
            case 1:
                this.f30890b.dismiss();
                return;
            case 2:
                this.f30890b.dismiss();
                return;
            case 3:
                d51 d51Var = this.f30890b;
                CharSequence charSequence = d51Var.f25417c0;
                if (charSequence != null) {
                    d51Var.f25418d0.run(charSequence);
                }
                d51Var.dismiss();
                return;
            default:
                d51.Q(this.f30890b, view);
                return;
        }
    }
}
