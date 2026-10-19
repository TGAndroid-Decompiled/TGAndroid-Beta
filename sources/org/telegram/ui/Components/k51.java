package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k51 extends s4.r0 {
    public final int f27715a = 0;
    public int f27716b;
    public final Object f27717c;

    public k51(o51 o51Var) {
        this.f27717c = o51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.f27715a) {
            case 0:
                if (i10 == 0) {
                    this.f27716b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.k4) this.f27717c).f34416b.f34643h0) != null) {
                    n8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27715a) {
            case 0:
                o51 o51Var = (o51) this.f27717c;
                this.f27716b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f27716b) > AndroidUtilities.dp(96.0f)) {
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
                org.telegram.ui.Wallet.o5 o5Var = ((org.telegram.ui.Wallet.k4) this.f27717c).f34416b;
                if (this.f27716b == 0) {
                    o5Var.z0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.p3(o5Var, 14));
                    return;
                }
        }
    }

    public k51(org.telegram.ui.Wallet.k4 k4Var, int i10) {
        this.f27717c = k4Var;
        this.f27716b = i10;
    }
}
