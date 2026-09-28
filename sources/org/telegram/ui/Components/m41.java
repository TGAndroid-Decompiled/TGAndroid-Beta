package org.telegram.ui.Components;

import android.view.View;
public final class m41 implements View.OnClickListener {
    public final int f26294a;
    public final v41 f26295b;

    public m41(v41 v41Var, int i10) {
        this.f26294a = i10;
        this.f26295b = v41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26294a) {
            case 0:
                this.f26295b.dismiss();
                return;
            case 1:
                this.f26295b.dismiss();
                return;
            case 2:
                this.f26295b.dismiss();
                return;
            case 3:
                v41 v41Var = this.f26295b;
                CharSequence charSequence = v41Var.f28973c0;
                if (charSequence != null) {
                    v41Var.f28974d0.run(charSequence);
                }
                v41Var.dismiss();
                return;
            default:
                v41.P(this.f26295b, view);
                return;
        }
    }
}
