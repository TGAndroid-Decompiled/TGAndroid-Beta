package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class v21 extends v4.s0 {
    public final int f38814a = 1;
    public int f38815b;
    public final Object f38816c;

    public v21(bi.g5 g5Var, int i7) {
        this.f38816c = g5Var;
        this.f38815b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.t8 t8Var;
        switch (this.f38814a) {
            case 0:
                if (i7 == 0) {
                    this.f38815b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (t8Var = ((org.telegram.ui.Wallet.y5) ((bi.g5) this.f38816c).f3941c).f43351i0) != null) {
                    t8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f38814a) {
            case 0:
                y21 y21Var = (y21) this.f38816c;
                n31 n31Var = y21Var.f40482k1;
                this.f38815b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f38815b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = n31Var.findFocus();
                    if (findFocus == null) {
                        findFocus = n31Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && n31Var.c()) {
                    y21Var.l1 = n31Var.getContentTopOffset();
                    y21Var.f28615b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) ((bi.g5) this.f38816c).f3941c;
                if (this.f38815b == 0) {
                    y5Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(y5Var, 14));
                    return;
                }
        }
    }

    public v21(y21 y21Var) {
        this.f38816c = y21Var;
    }
}
