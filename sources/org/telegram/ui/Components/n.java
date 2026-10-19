package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28630a;
    public final q f28631b;

    public n(q qVar, int i10) {
        this.f28630a = i10;
        this.f28631b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28630a) {
            case 0:
                this.f28631b.dismiss();
                return;
            default:
                q.R(this.f28631b);
                return;
        }
    }
}
