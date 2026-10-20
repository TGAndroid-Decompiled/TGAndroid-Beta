package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l51 extends s4.r0 {
    public final int f28025a = 0;
    public int f28026b;
    public final Object f28027c;

    public l51(p51 p51Var) {
        this.f28027c = p51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.f28025a) {
            case 0:
                if (i10 == 0) {
                    this.f28026b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.k4) this.f28027c).f34422b.f34649h0) != null) {
                    n8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28025a) {
            case 0:
                p51 p51Var = (p51) this.f28027c;
                this.f28026b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28026b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = p51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p51.n(p51Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.k4) this.f28027c).f34422b;
                if (this.f28026b == 0) {
                    o5Var.z0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.p3(o5Var, 14));
                    return;
                }
        }
    }

    public l51(org.telegram.ui.Wallet.k4 k4Var, int i10) {
        this.f28027c = k4Var;
        this.f28026b = i10;
    }
}
