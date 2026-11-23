package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class s31 extends v4.u0 {
    public final int f39485a = 1;
    public int f39486b;
    public final Object f39487c;

    public s31(di.i4 i4Var, int i7) {
        this.f39487c = i4Var;
        this.f39486b = i7;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.Wallet.k9 k9Var;
        switch (this.f39485a) {
            case 0:
                if (i7 == 0) {
                    this.f39486b = 0;
                    return;
                }
                return;
            default:
                if (i7 == 1 && (k9Var = ((org.telegram.ui.Wallet.o6) ((di.i4) this.f39487c).f8999c).f44804j0) != null) {
                    k9Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f39485a) {
            case 0:
                v31 v31Var = (v31) this.f39487c;
                j41 j41Var = v31Var.f40555o1;
                this.f39486b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f39486b) > org.telegram.messenger.g0.L(96.0f)) {
                    View findFocus = j41Var.findFocus();
                    if (findFocus == null) {
                        findFocus = j41Var;
                    }
                    org.telegram.messenger.g0.v1(findFocus);
                }
                if (i10 != 0 && j41Var.c()) {
                    v31Var.f40556p1 = j41Var.getContentTopOffset();
                    v31Var.f30226b.invalidate();
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) ((di.i4) this.f39487c).f8999c;
                if (this.f39486b == 0) {
                    o6Var.I0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.r4(o6Var, 14));
                    return;
                }
        }
    }

    public s31(v31 v31Var) {
        this.f39487c = v31Var;
    }
}
