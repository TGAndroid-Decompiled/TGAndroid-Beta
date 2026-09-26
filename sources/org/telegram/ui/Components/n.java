package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26596a;
    public final q f26597b;

    public n(q qVar, int i10) {
        this.f26596a = i10;
        this.f26597b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26596a) {
            case 0:
                this.f26597b.dismiss();
                return;
            default:
                q.Q(this.f26597b);
                return;
        }
    }
}
