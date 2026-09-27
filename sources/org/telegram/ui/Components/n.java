package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26670a;
    public final q f26671b;

    public n(q qVar, int i10) {
        this.f26670a = i10;
        this.f26671b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26670a) {
            case 0:
                this.f26671b.dismiss();
                return;
            default:
                q.Q(this.f26671b);
                return;
        }
    }
}
