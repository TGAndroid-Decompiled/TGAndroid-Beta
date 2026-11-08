package org.telegram.ui.Components;

import android.view.View;
public final class d8 implements View.OnClickListener {
    public final int f32831a;
    public final ve0 f32832b;

    public d8(ve0 ve0Var, int i7) {
        this.f32831a = i7;
        this.f32832b = ve0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32831a) {
            case 0:
                this.f32832b.b(true);
                return;
            default:
                this.f32832b.b(true);
                return;
        }
    }
}
