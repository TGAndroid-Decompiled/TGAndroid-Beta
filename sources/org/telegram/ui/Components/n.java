package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f28937a;
    public final q f28938b;

    public n(q qVar, int i10) {
        this.f28937a = i10;
        this.f28938b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f28937a) {
            case 0:
                this.f28938b.dismiss();
                return;
            default:
                q.R(this.f28938b);
                return;
        }
    }
}
