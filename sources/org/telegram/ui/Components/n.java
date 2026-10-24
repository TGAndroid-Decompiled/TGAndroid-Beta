package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28735a;
    public final q f28736b;

    public n(q qVar, int i10) {
        this.f28735a = i10;
        this.f28736b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28735a) {
            case 0:
                this.f28736b.dismiss();
                return;
            default:
                q.Q(this.f28736b);
                return;
        }
    }
}
