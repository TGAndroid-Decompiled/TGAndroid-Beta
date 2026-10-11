package org.telegram.ui.Components;

import android.view.View;
public final class f51 implements View.OnClickListener {
    public final int f26220a;
    public final o51 f26221b;

    public f51(o51 o51Var, int i10) {
        this.f26220a = i10;
        this.f26221b = o51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26220a) {
            case 0:
                this.f26221b.dismiss();
                return;
            case 1:
                this.f26221b.dismiss();
                return;
            case 2:
                this.f26221b.dismiss();
                return;
            case 3:
                o51 o51Var = this.f26221b;
                CharSequence charSequence = o51Var.f29263c0;
                if (charSequence != null) {
                    o51Var.f29264d0.run(charSequence);
                }
                o51Var.dismiss();
                return;
            default:
                o51.Q(this.f26221b, view);
                return;
        }
    }
}
