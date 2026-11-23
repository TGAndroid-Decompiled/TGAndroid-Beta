package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class t31 extends v4.u0 {
    public final int f39759a = 1;
    public int f39760b;
    public final Object f39761c;

    public t31(di.i4 i4Var, int i7) {
        this.f39761c = i4Var;
        this.f39760b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.j9 j9Var;
        switch (this.f39759a) {
            case 0:
                if (i7 == 0) {
                    this.f39760b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (j9Var = ((org.telegram.ui.Wallet.n6) ((di.i4) this.f39761c).f9038c).f44676j0) != null) {
                    j9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f39759a) {
            case 0:
                w31 w31Var = (w31) this.f39761c;
                k41 k41Var = w31Var.f41642o1;
                this.f39760b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f39760b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = k41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = k41Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && k41Var.c()) {
                    w31Var.f41643p1 = k41Var.getContentTopOffset();
                    w31Var.f30176b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) ((di.i4) this.f39761c).f9038c;
                if (this.f39760b == 0) {
                    n6Var.I0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.q4(n6Var, 14));
                    return;
                }
        }
    }

    public t31(w31 w31Var) {
        this.f39761c = w31Var;
    }
}
