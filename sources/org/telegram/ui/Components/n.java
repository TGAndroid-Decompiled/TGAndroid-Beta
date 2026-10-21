package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28638a;
    public final q f28639b;

    public n(q qVar, int i10) {
        this.f28638a = i10;
        this.f28639b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28638a) {
            case 0:
                this.f28639b.dismiss();
                return;
            default:
                q.R(this.f28639b);
                return;
        }
    }
}
