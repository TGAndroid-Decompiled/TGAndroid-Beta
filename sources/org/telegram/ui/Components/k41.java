package org.telegram.ui.Components;

import android.view.View;
public final class k41 implements View.OnClickListener {
    public final int f24604a;
    public final t41 f24605b;

    public k41(t41 t41Var, int i10) {
        this.f24604a = i10;
        this.f24605b = t41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24604a) {
            case 0:
                this.f24605b.dismiss();
                return;
            case 1:
                this.f24605b.dismiss();
                return;
            case 2:
                this.f24605b.dismiss();
                return;
            case 3:
                t41 t41Var = this.f24605b;
                CharSequence charSequence = t41Var.f27317c0;
                if (charSequence != null) {
                    t41Var.f27318d0.run(charSequence);
                }
                t41Var.dismiss();
                return;
            default:
                t41.P(this.f24605b, view);
                return;
        }
    }
}
