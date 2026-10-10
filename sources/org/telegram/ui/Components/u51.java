package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u51 extends s4.t0 {
    public final int f31326a;
    public int f31327b;
    public final Object f31328c;

    public u51(y51 y51Var) {
        this.f31326a = 0;
        this.f31328c = y51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f31326a) {
            case 0:
                if (i10 == 0) {
                    this.f31327b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f31326a) {
            case 0:
                y51 y51Var = (y51) this.f31328c;
                this.f31327b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f31327b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = y51Var.f33112e.findFocus();
                    if (findFocus == null) {
                        findFocus = y51Var.f33112e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    y51.o(y51Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f31327b + i11;
                this.f31327b = i12;
                ((org.telegram.ui.d31) this.f31328c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
            default:
                org.telegram.ui.Wallet.b5 b5Var = ((org.telegram.ui.Wallet.x3) this.f31328c).f35701a;
                if (this.f31327b == 0) {
                    b5Var.q0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.g3(b5Var, 13));
                    return;
                }
        }
    }

    public u51(org.telegram.ui.d31 d31Var) {
        this.f31326a = 1;
        this.f31328c = d31Var;
        this.f31327b = 0;
    }

    public u51(org.telegram.ui.Wallet.x3 x3Var, int i10) {
        this.f31326a = 2;
        this.f31328c = x3Var;
        this.f31327b = i10;
    }
}
