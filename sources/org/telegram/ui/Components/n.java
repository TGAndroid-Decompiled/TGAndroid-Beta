package org.telegram.ui.Components;

import android.view.View;
public final class n implements View.OnClickListener {
    public final int f26471a;
    public final q f26472b;

    public n(q qVar, int i10) {
        this.f26471a = i10;
        this.f26472b = qVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26471a) {
            case 0:
                this.f26472b.dismiss();
                return;
            default:
                q.Q(this.f26472b);
                return;
        }
    }
}
