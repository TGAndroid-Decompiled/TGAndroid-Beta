package org.telegram.ui.ActionBar;

import android.view.View;
public final class h0 implements View.OnClickListener {
    public final int f20674a;
    public final f1 f20675b;

    public h0(f1 f1Var, int i10) {
        this.f20674a = i10;
        this.f20675b = f1Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f20674a) {
            case 0:
                this.f20675b.b();
                return;
            default:
                this.f20675b.b();
                return;
        }
    }
}
