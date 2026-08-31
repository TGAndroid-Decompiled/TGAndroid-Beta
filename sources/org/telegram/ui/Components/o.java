package org.telegram.ui.Components;

import android.view.View;
public final class o implements View.OnClickListener {
    public final int f29633a;
    public final r f29634b;

    public o(r rVar, int i10) {
        this.f29633a = i10;
        this.f29634b = rVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f29633a) {
            case 0:
                this.f29634b.dismiss();
                return;
            default:
                r.Q(this.f29634b);
                return;
        }
    }
}
