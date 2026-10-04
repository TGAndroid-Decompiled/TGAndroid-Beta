package org.telegram.ui.Components;

import android.view.View;
public final class v41 implements View.OnClickListener {
    public final int f31568a;
    public final e51 f31569b;

    public v41(e51 e51Var, int i10) {
        this.f31568a = i10;
        this.f31569b = e51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31568a) {
            case 0:
                this.f31569b.dismiss();
                return;
            case 1:
                this.f31569b.dismiss();
                return;
            case 2:
                this.f31569b.dismiss();
                return;
            case 3:
                e51 e51Var = this.f31569b;
                CharSequence charSequence = e51Var.f25927c0;
                if (charSequence != null) {
                    e51Var.f25928d0.run(charSequence);
                }
                e51Var.dismiss();
                return;
            default:
                e51.N(this.f31569b, view);
                return;
        }
    }
}
