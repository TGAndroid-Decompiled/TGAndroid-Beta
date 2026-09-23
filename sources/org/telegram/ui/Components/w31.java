package org.telegram.ui.Components;

import android.view.View;
public final class w31 implements View.OnClickListener {
    public final int f29508a;
    public final f41 f29509b;

    public w31(f41 f41Var, int i10) {
        this.f29508a = i10;
        this.f29509b = f41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29508a) {
            case 0:
                this.f29509b.dismiss();
                return;
            case 1:
                this.f29509b.dismiss();
                return;
            case 2:
                this.f29509b.dismiss();
                return;
            case 3:
                f41 f41Var = this.f29509b;
                CharSequence charSequence = f41Var.f23840c0;
                if (charSequence != null) {
                    f41Var.f23841d0.run(charSequence);
                }
                f41Var.dismiss();
                return;
            default:
                f41.P(this.f29509b, view);
                return;
        }
    }
}
