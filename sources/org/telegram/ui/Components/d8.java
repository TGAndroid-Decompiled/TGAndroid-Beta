package org.telegram.ui.Components;

import android.view.View;
public final class d8 implements View.OnClickListener {
    public final int f32794a;
    public final ve0 f32795b;

    public d8(ve0 ve0Var, int i7) {
        this.f32794a = i7;
        this.f32795b = ve0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32794a) {
            case 0:
                this.f32795b.b(true);
                return;
            default:
                this.f32795b.b(true);
                return;
        }
    }
}
