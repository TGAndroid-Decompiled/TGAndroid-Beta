package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k51 extends s4.r0 {
    public final int f27717a = 0;
    public int f27718b;
    public final Object f27719c;

    public k51(o51 o51Var) {
        this.f27719c = o51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.f27717a) {
            case 0:
                if (i10 == 0) {
                    this.f27718b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.k4) this.f27719c).f34414b.f34641h0) != null) {
                    n8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27717a) {
            case 0:
                o51 o51Var = (o51) this.f27719c;
                this.f27718b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f27718b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = o51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = o51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    o51.n(o51Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.k4) this.f27719c).f34414b;
                if (this.f27718b == 0) {
                    o5Var.z0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.p3(o5Var, 14));
                    return;
                }
        }
    }

    public k51(org.telegram.ui.Wallet.k4 k4Var, int i10) {
        this.f27719c = k4Var;
        this.f27718b = i10;
    }
}
