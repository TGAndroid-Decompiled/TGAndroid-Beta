package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f28897a;
    public final r f28898b;

    public o(r rVar, int i10) {
        this.f28897a = i10;
        this.f28898b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28897a) {
            case 0:
                this.f28898b.dismiss();
                return;
            default:
                r.Q(this.f28898b);
                return;
        }
    }
}
