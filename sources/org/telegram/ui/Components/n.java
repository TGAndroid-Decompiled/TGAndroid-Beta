package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28977a;
    public final q f28978b;

    public n(q qVar, int i10) {
        this.f28977a = i10;
        this.f28978b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28977a) {
            case 0:
                this.f28978b.dismiss();
                return;
            default:
                q.R(this.f28978b);
                return;
        }
    }
}
