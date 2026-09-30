package org.telegram.ui.Components;

import android.view.View;
public final class m41 implements View.OnClickListener {
    public final int f26293a;
    public final v41 f26294b;

    public m41(v41 v41Var, int i10) {
        this.f26293a = i10;
        this.f26294b = v41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26293a) {
            case 0:
                this.f26294b.dismiss();
                return;
            case 1:
                this.f26294b.dismiss();
                return;
            case 2:
                this.f26294b.dismiss();
                return;
            case 3:
                v41 v41Var = this.f26294b;
                CharSequence charSequence = v41Var.f28967c0;
                if (charSequence != null) {
                    v41Var.f28968d0.run(charSequence);
                }
                v41Var.dismiss();
                return;
            default:
                v41.P(this.f26294b, view);
                return;
        }
    }
}
