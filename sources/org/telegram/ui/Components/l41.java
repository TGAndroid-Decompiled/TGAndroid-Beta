package org.telegram.ui.Components;

import android.view.View;
public final class l41 implements View.OnClickListener {
    public final int f26033a;
    public final u41 f26034b;

    public l41(u41 u41Var, int i10) {
        this.f26033a = i10;
        this.f26034b = u41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26033a) {
            case 0:
                this.f26034b.dismiss();
                return;
            case 1:
                this.f26034b.dismiss();
                return;
            case 2:
                this.f26034b.dismiss();
                return;
            case 3:
                u41 u41Var = this.f26034b;
                CharSequence charSequence = u41Var.f28543c0;
                if (charSequence != null) {
                    u41Var.f28544d0.run(charSequence);
                }
                u41Var.dismiss();
                return;
            default:
                u41.P(this.f26034b, view);
                return;
        }
    }
}
