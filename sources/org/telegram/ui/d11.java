package org.telegram.ui;

import android.view.View;
public final class d11 implements View.OnClickListener {
    public final int f36464a;
    public final h11 f36465b;

    public d11(h11 h11Var, int i10) {
        this.f36464a = i10;
        this.f36465b = h11Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36464a) {
            case 0:
                h11 h11Var = this.f36465b;
                if (h11Var.Y == null) {
                    h11Var.dismiss();
                    return;
                }
                return;
            default:
                this.f36465b.dismiss();
                return;
        }
    }
}
