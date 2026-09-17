package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f21197a;
    public final v4 f21198b;

    public l4(v4 v4Var, int i10) {
        this.f21197a = i10;
        this.f21198b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f21197a) {
            case 0:
                this.f21198b.g();
                return;
            case 1:
                this.f21198b.g();
                return;
            default:
                this.f21198b.g();
                return;
        }
    }
}
