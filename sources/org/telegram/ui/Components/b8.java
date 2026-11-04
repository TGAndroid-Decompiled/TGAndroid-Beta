package org.telegram.ui.Components;

import android.view.View;
public final class b8 implements View.OnClickListener {
    public final int f32116a;
    public final xe0 f32117b;

    public b8(xe0 xe0Var, int i3) {
        this.f32116a = i3;
        this.f32117b = xe0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32116a) {
            case 0:
                this.f32117b.b(true);
                return;
            default:
                this.f32117b.b(true);
                return;
        }
    }
}
