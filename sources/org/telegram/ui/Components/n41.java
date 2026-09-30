package org.telegram.ui.Components;

import android.view.View;
public final class n41 implements View.OnClickListener {
    public final int f26584a;
    public final w41 f26585b;

    public n41(w41 w41Var, int i10) {
        this.f26584a = i10;
        this.f26585b = w41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26584a) {
            case 0:
                this.f26585b.dismiss();
                return;
            case 1:
                this.f26585b.dismiss();
                return;
            case 2:
                this.f26585b.dismiss();
                return;
            case 3:
                w41 w41Var = this.f26585b;
                CharSequence charSequence = w41Var.f29820c0;
                if (charSequence != null) {
                    w41Var.f29821d0.run(charSequence);
                }
                w41Var.dismiss();
                return;
            default:
                w41.P(this.f26585b, view);
                return;
        }
    }
}
