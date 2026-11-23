package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class t31 extends v4.t0 {
    public final int f39713a = 1;
    public int f39714b;
    public final Object f39715c;

    public t31(di.i4 i4Var, int i7) {
        this.f39715c = i4Var;
        this.f39714b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.j9 j9Var;
        switch (this.f39713a) {
            case 0:
                if (i7 == 0) {
                    this.f39714b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (j9Var = ((org.telegram.ui.Wallet.n6) ((di.i4) this.f39715c).f9002c).f44642j0) != null) {
                    j9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f39713a) {
            case 0:
                w31 w31Var = (w31) this.f39715c;
                k41 k41Var = w31Var.f41615o1;
                this.f39714b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f39714b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = k41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = k41Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && k41Var.c()) {
                    w31Var.f41616p1 = k41Var.getContentTopOffset();
                    w31Var.f30142b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) ((di.i4) this.f39715c).f9002c;
                if (this.f39714b == 0) {
                    n6Var.I0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.q4(n6Var, 14));
                    return;
                }
        }
    }

    public t31(w31 w31Var) {
        this.f39715c = w31Var;
    }
}
