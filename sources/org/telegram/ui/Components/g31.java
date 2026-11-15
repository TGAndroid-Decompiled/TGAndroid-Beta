package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g31 extends v4.t0 {
    public final int f34786a = 1;
    public int f34787b;
    public final Object f34788c;

    public g31(di.f4 f4Var, int i7) {
        this.f34788c = f4Var;
        this.f34787b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.u8 u8Var;
        switch (this.f34786a) {
            case 0:
                if (i7 == 0) {
                    this.f34787b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (u8Var = ((org.telegram.ui.Wallet.y5) ((di.f4) this.f34788c).f8532c).f44738j0) != null) {
                    u8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f34786a) {
            case 0:
                j31 j31Var = (j31) this.f34788c;
                x31 x31Var = j31Var.f35850o1;
                this.f34787b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f34787b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = x31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = x31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && x31Var.c()) {
                    j31Var.f35851p1 = x31Var.getContentTopOffset();
                    j31Var.f29682b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((di.f4) this.f34788c).f8532c;
                if (this.f34787b == 0) {
                    y5Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.e4(y5Var, 14));
                    return;
                }
        }
    }

    public g31(j31 j31Var) {
        this.f34788c = j31Var;
    }
}
