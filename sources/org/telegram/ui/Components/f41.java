package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class f41 extends s4.s0 {
    public final int f26054a = 1;
    public int f26055b;
    public final Object f26056c;

    public f41(mg.s sVar, int i10) {
        this.f26056c = sVar;
        this.f26055b = i10;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.f26054a) {
            case 0:
                if (i10 == 0) {
                    this.f26055b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (y8Var = ((org.telegram.ui.Wallet.b6) ((mg.s) this.f26056c).f13228c).f34252i0) != null) {
                    y8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26054a) {
            case 0:
                i41 i41Var = (i41) this.f26056c;
                x41 x41Var = i41Var.f27002k1;
                this.f26055b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f26055b) > org.telegram.messenger.i0.L(96.0f)) {
                    View findFocus = x41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = x41Var;
                    }
                    org.telegram.messenger.i0.v1(findFocus);
                }
                if (i11 != 0 && x41Var.c()) {
                    i41Var.l1 = x41Var.getContentTopOffset();
                    i41Var.f21587b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) ((mg.s) this.f26056c).f13228c;
                if (this.f26055b == 0) {
                    b6Var.E0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(b6Var, 14));
                    return;
                }
        }
    }

    public f41(i41 i41Var) {
        this.f26056c = i41Var;
    }
}
