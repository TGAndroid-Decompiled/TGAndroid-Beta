package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class v51 extends s4.t0 {
    public final int f31681a;
    public int f31682b;
    public final Object f31683c;

    public v51(z51 z51Var) {
        this.f31681a = 0;
        this.f31683c = z51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f31681a) {
            case 0:
                if (i10 == 0) {
                    this.f31682b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f31681a) {
            case 0:
                z51 z51Var = (z51) this.f31683c;
                this.f31682b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f31682b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = z51Var.f33417e.findFocus();
                    if (findFocus == null) {
                        findFocus = z51Var.f33417e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    z51.o(z51Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f31682b + i11;
                this.f31682b = i12;
                ((org.telegram.ui.c31) this.f31683c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = ((org.telegram.ui.Wallet.y3) this.f31683c).f35731a;
                if (this.f31682b == 0) {
                    c5Var.q0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.h3(c5Var, 13));
                    return;
                }
        }
    }

    public v51(org.telegram.ui.c31 c31Var) {
        this.f31681a = 1;
        this.f31683c = c31Var;
        this.f31682b = 0;
    }

    public v51(org.telegram.ui.Wallet.y3 y3Var, int i10) {
        this.f31681a = 2;
        this.f31683c = y3Var;
        this.f31682b = i10;
    }
}
