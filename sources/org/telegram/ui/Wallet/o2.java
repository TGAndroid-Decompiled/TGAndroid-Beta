package org.telegram.ui.Wallet;

import android.view.View;
public final class o2 implements View.OnClickListener {
    public final int f44787a;
    public final z2 f44788b;

    public o2(z2 z2Var, int i7) {
        this.f44787a = i7;
        this.f44788b = z2Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44787a) {
            case 0:
                z2 z2Var = this.f44788b;
                if (!z2Var.a() && !z2Var.d) {
                    z2Var.d = false;
                    if (!z2Var.f45475f) {
                        z2Var.f45475f = true;
                        z2Var.f45472b.c();
                    }
                    if (!z2Var.f45474e) {
                        z2Var.f45471a.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f44788b;
                if (!z2Var2.a() && !z2Var2.d) {
                    z2Var2.d = false;
                    if (!z2Var2.f45475f) {
                        z2Var2.f45475f = true;
                        z2Var2.f45472b.c();
                    }
                    if (!z2Var2.f45474e) {
                        z2Var2.f45471a.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
