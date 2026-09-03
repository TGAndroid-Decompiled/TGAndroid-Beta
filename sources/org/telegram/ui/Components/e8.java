package org.telegram.ui.Components;

import android.view.View;
public final class e8 implements View.OnClickListener {
    public final int f24506a;
    public final bh0 f24507b;

    public e8(bh0 bh0Var, int i10) {
        this.f24506a = i10;
        this.f24507b = bh0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f24506a) {
            case 0:
                this.f24507b.b(true);
                return;
            default:
                this.f24507b.b(true);
                return;
        }
    }
}
