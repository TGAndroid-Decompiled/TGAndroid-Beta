package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26627a;
    public final q f26628b;

    public n(q qVar, int i10) {
        this.f26627a = i10;
        this.f26628b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26627a) {
            case 0:
                this.f26628b.dismiss();
                return;
            default:
                q.Q(this.f26628b);
                return;
        }
    }
}
