package org.telegram.ui.Components;

import android.view.View;
public final class w31 implements View.OnClickListener {
    public final int f32112a;
    public final f41 f32113b;

    public w31(f41 f41Var, int i10) {
        this.f32112a = i10;
        this.f32113b = f41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32112a) {
            case 0:
                this.f32113b.dismiss();
                return;
            case 1:
                this.f32113b.dismiss();
                return;
            case 2:
                this.f32113b.dismiss();
                return;
            case 3:
                f41 f41Var = this.f32113b;
                CharSequence charSequence = f41Var.f25905c0;
                if (charSequence != null) {
                    f41Var.f25906d0.run(charSequence);
                }
                f41Var.dismiss();
                return;
            default:
                f41.P(this.f32113b, view);
                return;
        }
    }
}
