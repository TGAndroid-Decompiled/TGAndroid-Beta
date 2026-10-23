package org.telegram.ui.Components;

import android.view.View;
public final class v41 implements View.OnClickListener {
    public final int f31153a;
    public final e51 f31154b;

    public v41(e51 e51Var, int i10) {
        this.f31153a = i10;
        this.f31154b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31153a) {
            case 0:
                this.f31154b.dismiss();
                return;
            case 1:
                this.f31154b.dismiss();
                return;
            case 2:
                this.f31154b.dismiss();
                return;
            case 3:
                e51 e51Var = this.f31154b;
                CharSequence charSequence = e51Var.f25736c0;
                if (charSequence != null) {
                    e51Var.f25737d0.run(charSequence);
                }
                e51Var.dismiss();
                return;
            default:
                e51.Q(this.f31154b, view);
                return;
        }
    }
}
