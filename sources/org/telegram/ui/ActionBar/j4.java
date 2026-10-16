package org.telegram.ui.ActionBar;

import android.view.View;
public final class j4 implements View.OnClickListener {
    public final int f20109a;
    public final t4 f20110b;

    public j4(t4 t4Var, int i10) {
        this.f20109a = i10;
        this.f20110b = t4Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20109a) {
            case 0:
                this.f20110b.g();
                return;
            case 1:
                this.f20110b.g();
                return;
            default:
                this.f20110b.g();
                return;
        }
    }
}
