package org.telegram.ui.Components;

import android.view.View;
public final class v41 implements View.OnClickListener {
    public final int f31562a;
    public final e51 f31563b;

    public v41(e51 e51Var, int i10) {
        this.f31562a = i10;
        this.f31563b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31562a) {
            case 0:
                this.f31563b.dismiss();
                return;
            case 1:
                this.f31563b.dismiss();
                return;
            case 2:
                this.f31563b.dismiss();
                return;
            case 3:
                e51 e51Var = this.f31563b;
                CharSequence charSequence = e51Var.f25922c0;
                if (charSequence != null) {
                    e51Var.f25923d0.run(charSequence);
                }
                e51Var.dismiss();
                return;
            default:
                e51.N(this.f31563b, view);
                return;
        }
    }
}
