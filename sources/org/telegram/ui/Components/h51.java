package org.telegram.ui.Components;

import android.view.View;
public final class h51 implements View.OnClickListener {
    public final int f28805a;
    public final r51 f28806b;

    public h51(r51 r51Var, int i10) {
        this.f28805a = i10;
        this.f28806b = r51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28805a) {
            case 0:
                this.f28806b.dismiss();
                return;
            case 1:
                this.f28806b.dismiss();
                return;
            case 2:
                this.f28806b.dismiss();
                return;
            case 3:
                r51 r51Var = this.f28806b;
                CharSequence charSequence = r51Var.f32105c0;
                if (charSequence != null) {
                    r51Var.f32106d0.run(charSequence);
                }
                r51Var.dismiss();
                return;
            default:
                r51.P(this.f28806b, view);
                return;
        }
    }
}
