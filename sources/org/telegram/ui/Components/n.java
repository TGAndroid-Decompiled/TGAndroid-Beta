package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26269a;
    public final q f26270b;

    public n(q qVar, int i10) {
        this.f26269a = i10;
        this.f26270b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26269a) {
            case 0:
                this.f26270b.dismiss();
                return;
            default:
                q.Q(this.f26270b);
                return;
        }
    }
}
