package org.telegram.ui.Components;

import android.view.View;
public final class e51 implements View.OnClickListener {
    public final int f25921a;
    public final n51 f25922b;

    public e51(n51 n51Var, int i10) {
        this.f25921a = i10;
        this.f25922b = n51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25921a) {
            case 0:
                this.f25922b.dismiss();
                return;
            case 1:
                this.f25922b.dismiss();
                return;
            case 2:
                this.f25922b.dismiss();
                return;
            case 3:
                n51 n51Var = this.f25922b;
                CharSequence charSequence = n51Var.f28997c0;
                if (charSequence != null) {
                    n51Var.f28998d0.run(charSequence);
                }
                n51Var.dismiss();
                return;
            default:
                n51.Q(this.f25922b, view);
                return;
        }
    }
}
