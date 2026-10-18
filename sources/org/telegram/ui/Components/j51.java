package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j51 extends s4.r0 {
    public final int f27413a = 0;
    public int f27414b;
    public final Object f27415c;

    public j51(n51 n51Var) {
        this.f27415c = n51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.f27413a) {
            case 0:
                if (i10 == 0) {
                    this.f27414b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (n8Var = ((org.telegram.ui.Wallet.j4) this.f27415c).f34354b.f34587h0) != null) {
                    n8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27413a) {
            case 0:
                n51 n51Var = (n51) this.f27415c;
                this.f27414b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f27414b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = n51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = n51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    n51.n(n51Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.Wallet.n5 n5Var = ((org.telegram.ui.Wallet.j4) this.f27415c).f34354b;
                if (this.f27414b == 0) {
                    n5Var.y0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.o3(n5Var, 13));
                    return;
                }
        }
    }

    public j51(org.telegram.ui.Wallet.j4 j4Var, int i10) {
        this.f27415c = j4Var;
        this.f27414b = i10;
    }
}
