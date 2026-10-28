package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class z51 extends s4.u0 {
    public final int f35248a = 0;
    public int f35249b;
    public final Object f35250c;

    public z51(c61 c61Var) {
        this.f35250c = c61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.f35248a) {
            case 0:
                if (i10 == 0) {
                    this.f35249b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.h4) this.f35250c).f36656b.f36950i0) != null) {
                    n8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f35248a) {
            case 0:
                c61 c61Var = (c61) this.f35250c;
                this.f35249b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f35249b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = c61Var.d.findFocus();
                    if (findFocus == null) {
                        findFocus = c61Var.d;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    c61.m(c61Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.h4) this.f35250c).f36656b;
                if (this.f35249b == 0) {
                    m5Var.A0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.o3(m5Var, 14));
                    return;
                }
        }
    }

    public z51(org.telegram.ui.Wallet.h4 h4Var, int i10) {
        this.f35250c = h4Var;
        this.f35249b = i10;
    }
}
