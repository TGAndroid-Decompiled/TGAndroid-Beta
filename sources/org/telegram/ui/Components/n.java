package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28619a;
    public final q f28620b;

    public n(q qVar, int i10) {
        this.f28619a = i10;
        this.f28620b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28619a) {
            case 0:
                this.f28620b.dismiss();
                return;
            default:
                q.R(this.f28620b);
                return;
        }
    }
}
