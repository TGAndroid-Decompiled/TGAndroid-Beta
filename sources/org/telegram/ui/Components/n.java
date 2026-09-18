package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26567a;
    public final q f26568b;

    public n(q qVar, int i10) {
        this.f26567a = i10;
        this.f26568b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26567a) {
            case 0:
                this.f26568b.dismiss();
                return;
            default:
                q.Q(this.f26568b);
                return;
        }
    }
}
