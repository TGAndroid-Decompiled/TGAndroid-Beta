package org.telegram.ui.Components;

import android.view.View;
public final class t41 implements View.OnClickListener {
    public final int f30462a;
    public final c51 f30463b;

    public t41(c51 c51Var, int i10) {
        this.f30462a = i10;
        this.f30463b = c51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30462a) {
            case 0:
                this.f30463b.dismiss();
                return;
            case 1:
                this.f30463b.dismiss();
                return;
            case 2:
                this.f30463b.dismiss();
                return;
            case 3:
                c51 c51Var = this.f30463b;
                CharSequence charSequence = c51Var.f25090c0;
                if (charSequence != null) {
                    c51Var.f25091d0.run(charSequence);
                }
                c51Var.dismiss();
                return;
            default:
                c51.Q(this.f30463b, view);
                return;
        }
    }
}
