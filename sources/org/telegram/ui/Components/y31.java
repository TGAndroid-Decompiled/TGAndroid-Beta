package org.telegram.ui.Components;

import android.view.View;
public final class y31 implements View.OnClickListener {
    public final int f30115a;
    public final h41 f30116b;

    public y31(h41 h41Var, int i10) {
        this.f30115a = i10;
        this.f30116b = h41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30115a) {
            case 0:
                this.f30116b.dismiss();
                return;
            case 1:
                this.f30116b.dismiss();
                return;
            case 2:
                this.f30116b.dismiss();
                return;
            case 3:
                h41 h41Var = this.f30116b;
                CharSequence charSequence = h41Var.f24476c0;
                if (charSequence != null) {
                    h41Var.f24477d0.run(charSequence);
                }
                h41Var.dismiss();
                return;
            default:
                h41.P(this.f30116b, view);
                return;
        }
    }
}
