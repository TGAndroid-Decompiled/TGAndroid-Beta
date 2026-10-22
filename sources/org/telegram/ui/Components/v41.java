package org.telegram.ui.Components;

import android.view.View;
public final class v41 implements View.OnClickListener {
    public final int f31152a;
    public final e51 f31153b;

    public v41(e51 e51Var, int i10) {
        this.f31152a = i10;
        this.f31153b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31152a) {
            case 0:
                this.f31153b.dismiss();
                return;
            case 1:
                this.f31153b.dismiss();
                return;
            case 2:
                this.f31153b.dismiss();
                return;
            case 3:
                e51 e51Var = this.f31153b;
                CharSequence charSequence = e51Var.f25735c0;
                if (charSequence != null) {
                    e51Var.f25736d0.run(charSequence);
                }
                e51Var.dismiss();
                return;
            default:
                e51.Q(this.f31153b, view);
                return;
        }
    }
}
