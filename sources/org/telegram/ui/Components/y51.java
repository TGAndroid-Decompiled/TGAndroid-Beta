package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y51 extends s4.u0 {
    public final int f34930a = 0;
    public int f34931b;
    public final Object f34932c;

    public y51(b61 b61Var) {
        this.f34932c = b61Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.f34930a) {
            case 0:
                if (i10 == 0) {
                    this.f34931b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.h4) this.f34932c).f36628b.f36942i0) != null) {
                    n8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f34930a) {
            case 0:
                b61 b61Var = (b61) this.f34932c;
                this.f34931b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f34931b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = b61Var.d.findFocus();
                    if (findFocus == null) {
                        findFocus = b61Var.d;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    b61.m(b61Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.h4) this.f34932c).f36628b;
                if (this.f34931b == 0) {
                    m5Var.A0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.o3(m5Var, 14));
                    return;
                }
        }
    }

    public y51(org.telegram.ui.Wallet.h4 h4Var, int i10) {
        this.f34932c = h4Var;
        this.f34931b = i10;
    }
}
