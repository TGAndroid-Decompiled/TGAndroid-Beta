package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28642a;
    public final q f28643b;

    public n(q qVar, int i10) {
        this.f28642a = i10;
        this.f28643b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28642a) {
            case 0:
                this.f28643b.dismiss();
                return;
            default:
                q.R(this.f28643b);
                return;
        }
    }
}
