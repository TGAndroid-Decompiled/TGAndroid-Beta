package org.telegram.ui.Components;

import android.view.View;
public final class a51 implements View.OnClickListener {
    public final int f24648a;
    public final k51 f24649b;

    public a51(k51 k51Var, int i10) {
        this.f24648a = i10;
        this.f24649b = k51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24648a) {
            case 0:
                this.f24649b.dismiss();
                return;
            case 1:
                this.f24649b.dismiss();
                return;
            case 2:
                this.f24649b.dismiss();
                return;
            case 3:
                k51 k51Var = this.f24649b;
                CharSequence charSequence = k51Var.f27875c0;
                if (charSequence != null) {
                    k51Var.f27876d0.run(charSequence);
                }
                k51Var.dismiss();
                return;
            default:
                k51.P(this.f24649b, view);
                return;
        }
    }
}
