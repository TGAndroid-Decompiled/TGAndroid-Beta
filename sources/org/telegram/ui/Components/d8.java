package org.telegram.ui.Components;

import android.view.View;

public final class d8 implements View.OnClickListener {

    public final int f27669a;

    public final hg0 f27670b;

    public d8(hg0 hg0Var, int i10) {
        this.f27669a = i10;
        this.f27670b = hg0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27669a) {
            case 0:
                this.f27670b.b(true);
                break;
            default:
                this.f27670b.b(true);
                break;
        }
    }
}
