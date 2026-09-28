package org.telegram.ui.Components;

import android.view.View;
public final class m41 implements View.OnClickListener {
    public final int f26295a;
    public final v41 f26296b;

    public m41(v41 v41Var, int i10) {
        this.f26295a = i10;
        this.f26296b = v41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26295a) {
            case 0:
                this.f26296b.dismiss();
                return;
            case 1:
                this.f26296b.dismiss();
                return;
            case 2:
                this.f26296b.dismiss();
                return;
            case 3:
                v41 v41Var = this.f26296b;
                CharSequence charSequence = v41Var.f28974c0;
                if (charSequence != null) {
                    v41Var.f28975d0.run(charSequence);
                }
                v41Var.dismiss();
                return;
            default:
                v41.P(this.f26296b, view);
                return;
        }
    }
}
