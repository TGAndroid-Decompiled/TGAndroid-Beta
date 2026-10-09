package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28983a;
    public final q f28984b;

    public n(q qVar, int i10) {
        this.f28983a = i10;
        this.f28984b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28983a) {
            case 0:
                this.f28984b.dismiss();
                return;
            default:
                q.R(this.f28984b);
                return;
        }
    }
}
