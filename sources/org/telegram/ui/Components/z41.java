package org.telegram.ui.Components;

import android.view.View;
public final class z41 implements View.OnClickListener {
    public final int f33150a;
    public final j51 f33151b;

    public z41(j51 j51Var, int i10) {
        this.f33150a = i10;
        this.f33151b = j51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33150a) {
            case 0:
                this.f33151b.dismiss();
                return;
            case 1:
                this.f33151b.dismiss();
                return;
            case 2:
                this.f33151b.dismiss();
                return;
            case 3:
                j51 j51Var = this.f33151b;
                CharSequence charSequence = j51Var.f27566c0;
                if (charSequence != null) {
                    j51Var.f27567d0.run(charSequence);
                }
                j51Var.dismiss();
                return;
            default:
                j51.P(this.f33151b, view);
                return;
        }
    }
}
