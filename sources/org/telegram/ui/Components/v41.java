package org.telegram.ui.Components;

import android.view.View;
public final class v41 implements View.OnClickListener {
    public final int f31148a;
    public final e51 f31149b;

    public v41(e51 e51Var, int i10) {
        this.f31148a = i10;
        this.f31149b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31148a) {
            case 0:
                this.f31149b.dismiss();
                return;
            case 1:
                this.f31149b.dismiss();
                return;
            case 2:
                this.f31149b.dismiss();
                return;
            case 3:
                e51 e51Var = this.f31149b;
                CharSequence charSequence = e51Var.f25732c0;
                if (charSequence != null) {
                    e51Var.f25733d0.run(charSequence);
                }
                e51Var.dismiss();
                return;
            default:
                e51.Q(this.f31149b, view);
                return;
        }
    }
}
