package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class t51 extends s4.t0 {
    public final int f30997a;
    public int f30998b;
    public final Object f30999c;

    public t51(x51 x51Var) {
        this.f30997a = 0;
        this.f30999c = x51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f30997a) {
            case 0:
                if (i10 == 0) {
                    this.f30998b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f30997a) {
            case 0:
                x51 x51Var = (x51) this.f30999c;
                this.f30998b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f30998b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = x51Var.f32755e.findFocus();
                    if (findFocus == null) {
                        findFocus = x51Var.f32755e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    x51.o(x51Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f30998b + i11;
                this.f30998b = i12;
                ((org.telegram.ui.d31) this.f30999c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
            default:
                org.telegram.ui.Wallet.z4 z4Var = ((org.telegram.ui.Wallet.v3) this.f30999c).f35551a;
                if (this.f30998b == 0) {
                    z4Var.q0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.e3(z4Var, 13));
                    return;
                }
        }
    }

    public t51(org.telegram.ui.d31 d31Var) {
        this.f30997a = 1;
        this.f30999c = d31Var;
        this.f30998b = 0;
    }

    public t51(org.telegram.ui.Wallet.v3 v3Var, int i10) {
        this.f30997a = 2;
        this.f30999c = v3Var;
        this.f30998b = i10;
    }
}
