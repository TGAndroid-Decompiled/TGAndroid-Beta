package org.telegram.ui.Components;

import android.view.View;
public final class k41 implements View.OnClickListener {
    public final int f25656a;
    public final t41 f25657b;

    public k41(t41 t41Var, int i10) {
        this.f25656a = i10;
        this.f25657b = t41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25656a) {
            case 0:
                this.f25657b.dismiss();
                return;
            case 1:
                this.f25657b.dismiss();
                return;
            case 2:
                this.f25657b.dismiss();
                return;
            case 3:
                t41 t41Var = this.f25657b;
                CharSequence charSequence = t41Var.f28409c0;
                if (charSequence != null) {
                    t41Var.f28410d0.run(charSequence);
                }
                t41Var.dismiss();
                return;
            default:
                t41.P(this.f25657b, view);
                return;
        }
    }
}
