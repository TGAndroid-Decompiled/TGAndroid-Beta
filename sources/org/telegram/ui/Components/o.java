package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f27408a;
    public final r f27409b;

    public o(r rVar, int i10) {
        this.f27408a = i10;
        this.f27409b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27408a) {
            case 0:
                this.f27409b.dismiss();
                return;
            default:
                r.Q(this.f27409b);
                return;
        }
    }
}
