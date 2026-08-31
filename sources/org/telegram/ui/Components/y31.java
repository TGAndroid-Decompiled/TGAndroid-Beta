package org.telegram.ui.Components;

import android.view.View;
public final class y31 implements View.OnClickListener {
    public final int f33292a;
    public final h41 f33293b;

    public y31(h41 h41Var, int i10) {
        this.f33292a = i10;
        this.f33293b = h41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33292a) {
            case 0:
                this.f33293b.dismiss();
                return;
            case 1:
                this.f33293b.dismiss();
                return;
            case 2:
                this.f33293b.dismiss();
                return;
            case 3:
                h41 h41Var = this.f33293b;
                CharSequence charSequence = h41Var.Z;
                if (charSequence != null) {
                    h41Var.f27376a0.run(charSequence);
                }
                h41Var.dismiss();
                return;
            default:
                h41.P(this.f33293b, view);
                return;
        }
    }
}
