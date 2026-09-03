package org.telegram.ui.Components;

import android.view.View;
public final class x31 implements View.OnClickListener {
    public final int f32941a;
    public final g41 f32942b;

    public x31(g41 g41Var, int i10) {
        this.f32941a = i10;
        this.f32942b = g41Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32941a) {
            case 0:
                this.f32942b.dismiss();
                return;
            case 1:
                this.f32942b.dismiss();
                return;
            case 2:
                this.f32942b.dismiss();
                return;
            case 3:
                g41 g41Var = this.f32942b;
                CharSequence charSequence = g41Var.Z;
                if (charSequence != null) {
                    g41Var.f27087a0.run(charSequence);
                }
                g41Var.dismiss();
                return;
            default:
                g41.P(this.f32942b, view);
                return;
        }
    }
}
