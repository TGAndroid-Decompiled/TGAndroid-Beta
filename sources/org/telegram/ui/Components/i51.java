package org.telegram.ui.Components;

import android.view.View;
public final class i51 implements View.OnClickListener {
    public final int f29221a;
    public final s51 f29222b;

    public i51(s51 s51Var, int i10) {
        this.f29221a = i10;
        this.f29222b = s51Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29221a) {
            case 0:
                this.f29222b.dismiss();
                return;
            case 1:
                this.f29222b.dismiss();
                return;
            case 2:
                this.f29222b.dismiss();
                return;
            case 3:
                s51 s51Var = this.f29222b;
                CharSequence charSequence = s51Var.f32477c0;
                if (charSequence != null) {
                    s51Var.f32478d0.run(charSequence);
                }
                s51Var.dismiss();
                return;
            default:
                s51.P(this.f29222b, view);
                return;
        }
    }
}
