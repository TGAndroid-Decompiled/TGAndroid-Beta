package org.telegram.ui.Components;

import android.view.View;
public final class z41 implements View.OnClickListener {
    public final int f31764a;
    public final i51 f31765b;

    public z41(i51 i51Var, int i10) {
        this.f31764a = i10;
        this.f31765b = i51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31764a) {
            case 0:
                this.f31765b.dismiss();
                return;
            case 1:
                this.f31765b.dismiss();
                return;
            case 2:
                this.f31765b.dismiss();
                return;
            case 3:
                i51 i51Var = this.f31765b;
                CharSequence charSequence = i51Var.f25841c0;
                if (charSequence != null) {
                    i51Var.f25842d0.run(charSequence);
                }
                i51Var.dismiss();
                return;
            default:
                i51.Q(this.f31765b, view);
                return;
        }
    }
}
