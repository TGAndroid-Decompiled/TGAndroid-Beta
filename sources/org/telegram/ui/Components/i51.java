package org.telegram.ui.Components;

import android.view.View;
public final class i51 implements View.OnClickListener {
    public final int f27057a;
    public final r51 f27058b;

    public i51(r51 r51Var, int i10) {
        this.f27057a = i10;
        this.f27058b = r51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27057a) {
            case 0:
                this.f27058b.dismiss();
                return;
            case 1:
                this.f27058b.dismiss();
                return;
            case 2:
                this.f27058b.dismiss();
                return;
            case 3:
                r51 r51Var = this.f27058b;
                CharSequence charSequence = r51Var.f30043c0;
                if (charSequence != null) {
                    r51Var.f30044d0.run(charSequence);
                }
                r51Var.dismiss();
                return;
            default:
                r51.Q(this.f27058b, view);
                return;
        }
    }
}
