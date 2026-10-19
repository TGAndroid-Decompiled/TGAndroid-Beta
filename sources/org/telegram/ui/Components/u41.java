package org.telegram.ui.Components;

import android.view.View;
public final class u41 implements View.OnClickListener {
    public final int f30887a;
    public final d51 f30888b;

    public u41(d51 d51Var, int i10) {
        this.f30887a = i10;
        this.f30888b = d51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30887a) {
            case 0:
                this.f30888b.dismiss();
                return;
            case 1:
                this.f30888b.dismiss();
                return;
            case 2:
                this.f30888b.dismiss();
                return;
            case 3:
                d51 d51Var = this.f30888b;
                CharSequence charSequence = d51Var.f25415c0;
                if (charSequence != null) {
                    d51Var.f25416d0.run(charSequence);
                }
                d51Var.dismiss();
                return;
            default:
                d51.Q(this.f30888b, view);
                return;
        }
    }
}
