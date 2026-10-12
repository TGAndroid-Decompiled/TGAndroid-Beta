package org.telegram.ui.Components;

import android.view.View;
public final class i51 implements View.OnClickListener {
    public final int f27042a;
    public final r51 f27043b;

    public i51(r51 r51Var, int i10) {
        this.f27042a = i10;
        this.f27043b = r51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27042a) {
            case 0:
                this.f27043b.dismiss();
                return;
            case 1:
                this.f27043b.dismiss();
                return;
            case 2:
                this.f27043b.dismiss();
                return;
            case 3:
                r51 r51Var = this.f27043b;
                CharSequence charSequence = r51Var.f30044c0;
                if (charSequence != null) {
                    r51Var.f30045d0.run(charSequence);
                }
                r51Var.dismiss();
                return;
            default:
                r51.Q(this.f27043b, view);
                return;
        }
    }
}
