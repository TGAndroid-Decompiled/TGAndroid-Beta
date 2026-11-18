package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class q31 extends v4.u0 {
    public final int f38689a = 1;
    public int f38690b;
    public final Object f38691c;

    public q31(di.i4 i4Var, int i7) {
        this.f38691c = i4Var;
        this.f38690b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.j9 j9Var;
        switch (this.f38689a) {
            case 0:
                if (i7 == 0) {
                    this.f38690b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (j9Var = ((org.telegram.ui.Wallet.n6) ((di.i4) this.f38691c).f9011c).f44632j0) != null) {
                    j9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38689a) {
            case 0:
                t31 t31Var = (t31) this.f38691c;
                h41 h41Var = t31Var.f39900o1;
                this.f38690b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f38690b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = h41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = h41Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && h41Var.c()) {
                    t31Var.f39901p1 = h41Var.getContentTopOffset();
                    t31Var.f30192b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) ((di.i4) this.f38691c).f9011c;
                if (this.f38690b == 0) {
                    n6Var.I0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.q4(n6Var, 14));
                    return;
                }
        }
    }

    public q31(t31 t31Var) {
        this.f38691c = t31Var;
    }
}
