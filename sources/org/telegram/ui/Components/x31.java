package org.telegram.ui.Components;

import android.view.View;
public final class x31 implements View.OnClickListener {
    public final int f30459a;
    public final g41 f30460b;

    public x31(g41 g41Var, int i10) {
        this.f30459a = i10;
        this.f30460b = g41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30459a) {
            case 0:
                this.f30460b.dismiss();
                return;
            case 1:
                this.f30460b.dismiss();
                return;
            case 2:
                this.f30460b.dismiss();
                return;
            case 3:
                g41 g41Var = this.f30460b;
                CharSequence charSequence = g41Var.Z;
                if (charSequence != null) {
                    g41Var.f25042a0.run(charSequence);
                }
                g41Var.dismiss();
                return;
            default:
                g41.P(this.f30460b, view);
                return;
        }
    }
}
