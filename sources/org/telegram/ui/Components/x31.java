package org.telegram.ui.Components;

import android.view.View;
public final class x31 implements View.OnClickListener {
    public final int f29881a;
    public final g41 f29882b;

    public x31(g41 g41Var, int i10) {
        this.f29881a = i10;
        this.f29882b = g41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29881a) {
            case 0:
                this.f29882b.dismiss();
                return;
            case 1:
                this.f29882b.dismiss();
                return;
            case 2:
                this.f29882b.dismiss();
                return;
            case 3:
                g41 g41Var = this.f29882b;
                CharSequence charSequence = g41Var.f24182c0;
                if (charSequence != null) {
                    g41Var.f24183d0.run(charSequence);
                }
                g41Var.dismiss();
                return;
            default:
                g41.P(this.f29882b, view);
                return;
        }
    }
}
