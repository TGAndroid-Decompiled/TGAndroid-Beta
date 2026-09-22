package org.telegram.ui.ActionBar;

import android.view.View;
public final class l4 implements View.OnClickListener {
    public final int f19617a;
    public final v4 f19618b;

    public l4(v4 v4Var, int i10) {
        this.f19617a = i10;
        this.f19618b = v4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19617a) {
            case 0:
                this.f19618b.g();
                return;
            case 1:
                this.f19618b.g();
                return;
            default:
                this.f19618b.g();
                return;
        }
    }
}
