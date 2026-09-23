package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26306a;
    public final q f26307b;

    public n(q qVar, int i10) {
        this.f26306a = i10;
        this.f26307b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26306a) {
            case 0:
                this.f26307b.dismiss();
                return;
            default:
                q.Q(this.f26307b);
                return;
        }
    }
}
