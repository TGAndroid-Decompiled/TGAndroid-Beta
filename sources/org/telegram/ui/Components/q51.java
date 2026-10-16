package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q51 extends s4.r0 {
    public final int f28206a;
    public int f28207b;
    public final Object f28208c;

    public q51(u51 u51Var) {
        this.f28206a = 0;
        this.f28208c = u51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f28206a) {
            case 0:
                if (i10 == 0) {
                    this.f28207b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28206a) {
            case 0:
                u51 u51Var = (u51) this.f28208c;
                this.f28207b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28207b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = u51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = u51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    u51.n(u51Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f28207b + i11;
                this.f28207b = i12;
                ((org.telegram.ui.k31) this.f28208c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
            default:
                org.telegram.ui.Wallet.a5 a5Var = ((org.telegram.ui.Wallet.x3) this.f28208c).f33583a;
                if (this.f28207b == 0) {
                    a5Var.q0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.g3(a5Var, 13));
                    return;
                }
        }
    }

    public q51(org.telegram.ui.k31 k31Var) {
        this.f28206a = 1;
        this.f28208c = k31Var;
        this.f28207b = 0;
    }

    public q51(org.telegram.ui.Wallet.x3 x3Var, int i10) {
        this.f28206a = 2;
        this.f28208c = x3Var;
        this.f28207b = i10;
    }
}
