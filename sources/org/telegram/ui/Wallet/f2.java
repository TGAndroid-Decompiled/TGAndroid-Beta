package org.telegram.ui.Wallet;

import android.view.View;
public final class f2 implements View.OnClickListener {
    public final int f43824a;
    public final r2 f43825b;

    public f2(r2 r2Var, int i7) {
        this.f43824a = i7;
        this.f43825b = r2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43824a) {
            case 0:
                r2 r2Var = this.f43825b;
                if (!r2Var.a() && !r2Var.d) {
                    r2Var.d = false;
                    if (!r2Var.f44433f) {
                        r2Var.f44433f = true;
                        r2Var.f44430b.c();
                    }
                    if (!r2Var.f44432e) {
                        r2Var.f44429a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                r2 r2Var2 = this.f43825b;
                if (!r2Var2.a() && !r2Var2.d) {
                    r2Var2.d = false;
                    if (!r2Var2.f44433f) {
                        r2Var2.f44433f = true;
                        r2Var2.f44430b.c();
                    }
                    if (!r2Var2.f44432e) {
                        r2Var2.f44429a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
