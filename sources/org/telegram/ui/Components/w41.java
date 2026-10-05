package org.telegram.ui.Components;

import android.view.View;
public final class w41 implements View.OnClickListener {
    public final int f32520a;
    public final f51 f32521b;

    public w41(f51 f51Var, int i10) {
        this.f32520a = i10;
        this.f32521b = f51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32520a) {
            case 0:
                this.f32521b.dismiss();
                return;
            case 1:
                this.f32521b.dismiss();
                return;
            case 2:
                this.f32521b.dismiss();
                return;
            case 3:
                f51 f51Var = this.f32521b;
                CharSequence charSequence = f51Var.f26336c0;
                if (charSequence != null) {
                    f51Var.f26337d0.run(charSequence);
                }
                f51Var.dismiss();
                return;
            default:
                f51.N(this.f32521b, view);
                return;
        }
    }
}
