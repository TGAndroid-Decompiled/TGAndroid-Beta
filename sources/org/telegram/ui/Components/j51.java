package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j51 extends s4.r0 {
    public final int f27420a = 0;
    public int f27421b;
    public final Object f27422c;

    public j51(n51 n51Var) {
        this.f27422c = n51Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.Wallet.t8 t8Var;
        switch (this.f27420a) {
            case 0:
                if (i10 == 0) {
                    this.f27421b = 0;
                    return;
                }
                return;
            default:
                if (i10 == 1 && (t8Var = ((org.telegram.ui.Wallet.i4) this.f27422c).f34330b.f34577j0) != null) {
                    t8Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27420a) {
            case 0:
                n51 n51Var = (n51) this.f27422c;
                this.f27421b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f27421b) > AndroidUtilities.dp(96.0f)) {
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
                org.telegram.ui.Wallet.m5 m5Var = ((org.telegram.ui.Wallet.i4) this.f27422c).f34330b;
                if (this.f27421b == 0) {
                    m5Var.x0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.n3(m5Var, 14));
                    return;
                }
        }
    }

    public j51(org.telegram.ui.Wallet.i4 i4Var, int i10) {
        this.f27422c = i4Var;
        this.f27421b = i10;
    }
}
