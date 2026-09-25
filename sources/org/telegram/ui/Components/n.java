package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26597a;
    public final q f26598b;

    public n(q qVar, int i10) {
        this.f26597a = i10;
        this.f26598b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26597a) {
            case 0:
                this.f26598b.dismiss();
                return;
            default:
                q.Q(this.f26598b);
                return;
        }
    }
}
