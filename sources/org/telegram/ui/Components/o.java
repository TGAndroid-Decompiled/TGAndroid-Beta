package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f27412a;
    public final r f27413b;

    public o(r rVar, int i10) {
        this.f27412a = i10;
        this.f27413b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27412a) {
            case 0:
                this.f27413b.dismiss();
                return;
            default:
                r.Q(this.f27413b);
                return;
        }
    }
}
