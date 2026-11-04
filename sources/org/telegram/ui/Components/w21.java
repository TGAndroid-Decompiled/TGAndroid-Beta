package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class w21 extends u4.t0 {
    public final int f39864a = 1;
    public int f39865b;
    public final Object f39866c;

    public w21(ci.o4 o4Var, int i3) {
        this.f39866c = o4Var;
        this.f39865b = i3;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        org.telegram.ui.Wallet.s8 s8Var;
        switch (this.f39864a) {
            case 0:
                if (i3 == 0) {
                    this.f39865b = 0;
                    return;
                }
                return;
            default:
                if (i3 == 1 && (s8Var = ((org.telegram.ui.Wallet.w5) ((ci.o4) this.f39866c).f5683c).f43330j0) != null) {
                    s8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.f39864a) {
            case 0:
                z21 z21Var = (z21) this.f39866c;
                n31 n31Var = z21Var.f40901l1;
                this.f39865b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f39865b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = n31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = n31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && n31Var.c()) {
                    z21Var.m1 = n31Var.getContentTopOffset();
                    z21Var.f28586b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) ((ci.o4) this.f39866c).f5683c;
                if (this.f39865b == 0) {
                    w5Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.d4(w5Var, 14));
                    return;
                }
        }
    }

    public w21(z21 z21Var) {
        this.f39866c = z21Var;
    }
}
