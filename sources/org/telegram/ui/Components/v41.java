package org.telegram.ui.Components;

import android.view.View;
public final class v41 implements View.OnClickListener {
    public final int f31561a;
    public final e51 f31562b;

    public v41(e51 e51Var, int i10) {
        this.f31561a = i10;
        this.f31562b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31561a) {
            case 0:
                this.f31562b.dismiss();
                return;
            case 1:
                this.f31562b.dismiss();
                return;
            case 2:
                this.f31562b.dismiss();
                return;
            case 3:
                e51 e51Var = this.f31562b;
                CharSequence charSequence = e51Var.f25921c0;
                if (charSequence != null) {
                    e51Var.f25922d0.run(charSequence);
                }
                e51Var.dismiss();
                return;
            default:
                e51.N(this.f31562b, view);
                return;
        }
    }
}
