package org.telegram.ui.Components;

import android.view.View;
public final class x31 implements View.OnClickListener {
    public final int f29884a;
    public final g41 f29885b;

    public x31(g41 g41Var, int i10) {
        this.f29884a = i10;
        this.f29885b = g41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29884a) {
            case 0:
                this.f29885b.dismiss();
                return;
            case 1:
                this.f29885b.dismiss();
                return;
            case 2:
                this.f29885b.dismiss();
                return;
            case 3:
                g41 g41Var = this.f29885b;
                CharSequence charSequence = g41Var.f24185c0;
                if (charSequence != null) {
                    g41Var.f24186d0.run(charSequence);
                }
                g41Var.dismiss();
                return;
            default:
                g41.P(this.f29885b, view);
                return;
        }
    }
}
