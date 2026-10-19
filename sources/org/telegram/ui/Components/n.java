package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28632a;
    public final q f28633b;

    public n(q qVar, int i10) {
        this.f28632a = i10;
        this.f28633b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28632a) {
            case 0:
                this.f28633b.dismiss();
                return;
            default:
                q.R(this.f28633b);
                return;
        }
    }
}
