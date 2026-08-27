package org.telegram.ui.ActionBar;

import android.view.View;

public final class j4 implements View.OnClickListener {

    public final int f23551a;

    public final t4 f23552b;

    public j4(t4 t4Var, int i10) {
        this.f23551a = i10;
        this.f23552b = t4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f23551a) {
            case 0:
                this.f23552b.g();
                break;
            case 1:
                this.f23552b.g();
                break;
            default:
                this.f23552b.g();
                break;
        }
    }
}
