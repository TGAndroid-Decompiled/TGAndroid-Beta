package org.telegram.ui.Components;

import android.view.View;
public final class t41 implements View.OnClickListener {
    public final int f30469a;
    public final c51 f30470b;

    public t41(c51 c51Var, int i10) {
        this.f30469a = i10;
        this.f30470b = c51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30469a) {
            case 0:
                this.f30470b.dismiss();
                return;
            case 1:
                this.f30470b.dismiss();
                return;
            case 2:
                this.f30470b.dismiss();
                return;
            case 3:
                c51 c51Var = this.f30470b;
                CharSequence charSequence = c51Var.f25097c0;
                if (charSequence != null) {
                    c51Var.f25098d0.run(charSequence);
                }
                c51Var.dismiss();
                return;
            default:
                c51.Q(this.f30470b, view);
                return;
        }
    }
}
