package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u51 extends s4.t0 {
    public final int f31445a;
    public int f31446b;
    public final Object f31447c;

    public u51(y51 y51Var) {
        this.f31445a = 0;
        this.f31447c = y51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f31445a) {
            case 0:
                if (i10 == 0) {
                    this.f31446b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f31445a) {
            case 0:
                y51 y51Var = (y51) this.f31447c;
                this.f31446b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f31446b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = y51Var.f33150e.findFocus();
                    if (findFocus == null) {
                        findFocus = y51Var.f33150e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    y51.o(y51Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f31446b + i11;
                this.f31446b = i12;
                ((org.telegram.ui.c31) this.f31447c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = ((org.telegram.ui.Wallet.y3) this.f31447c).f35765a;
                if (this.f31446b == 0) {
                    c5Var.q0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.h3(c5Var, 13));
                    return;
                }
        }
    }

    public u51(org.telegram.ui.c31 c31Var) {
        this.f31445a = 1;
        this.f31447c = c31Var;
        this.f31446b = 0;
    }

    public u51(org.telegram.ui.Wallet.y3 y3Var, int i10) {
        this.f31445a = 2;
        this.f31447c = y3Var;
        this.f31446b = i10;
    }
}
