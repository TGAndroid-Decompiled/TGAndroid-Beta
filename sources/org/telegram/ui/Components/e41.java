package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class e41 extends s4.s0 {
    public final int f25640a = 1;
    public int f25641b;
    public final Object f25642c;

    public e41(mg.s sVar, int i10) {
        this.f25642c = sVar;
        this.f25641b = i10;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.y8 y8Var;
        switch (this.f25640a) {
            case 0:
                if (i10 == 0) {
                    this.f25641b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (y8Var = ((org.telegram.ui.Wallet.b6) ((mg.s) this.f25642c).f13227c).f34250i0) != null) {
                    y8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f25640a) {
            case 0:
                h41 h41Var = (h41) this.f25642c;
                w41 w41Var = h41Var.f26623k1;
                this.f25641b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f25641b) > org.telegram.messenger.i0.L(96.0f)) {
                    View findFocus = w41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = w41Var;
                    }
                    org.telegram.messenger.i0.v1(findFocus);
                }
                if (i11 != 0 && w41Var.c()) {
                    h41Var.l1 = w41Var.getContentTopOffset();
                    h41Var.f21586b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) ((mg.s) this.f25642c).f13227c;
                if (this.f25641b == 0) {
                    b6Var.D0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.f4(b6Var, 14));
                    return;
                }
        }
    }

    public e41(h41 h41Var) {
        this.f25642c = h41Var;
    }
}
