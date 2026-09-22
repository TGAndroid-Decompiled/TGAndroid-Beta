package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26569a;
    public final q f26570b;

    public n(q qVar, int i10) {
        this.f26569a = i10;
        this.f26570b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26569a) {
            case 0:
                this.f26570b.dismiss();
                return;
            default:
                q.Q(this.f26570b);
                return;
        }
    }
}
