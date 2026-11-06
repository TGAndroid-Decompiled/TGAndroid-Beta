package org.telegram.ui.Components;

import android.view.View;
public final class d8 implements View.OnClickListener {
    public final int f32781a;
    public final ve0 f32782b;

    public d8(ve0 ve0Var, int i7) {
        this.f32781a = i7;
        this.f32782b = ve0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32781a) {
            case 0:
                this.f32782b.b(true);
                return;
            default:
                this.f32782b.b(true);
                return;
        }
    }
}
