package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28793a;
    public final q f28794b;

    public n(q qVar, int i10) {
        this.f28793a = i10;
        this.f28794b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28793a) {
            case 0:
                this.f28794b.dismiss();
                return;
            default:
                q.Q(this.f28794b);
                return;
        }
    }
}
