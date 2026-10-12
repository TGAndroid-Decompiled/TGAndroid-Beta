package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28689a;
    public final q f28690b;

    public n(q qVar, int i10) {
        this.f28689a = i10;
        this.f28690b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28689a) {
            case 0:
                this.f28690b.dismiss();
                return;
            default:
                q.R(this.f28690b);
                return;
        }
    }
}
