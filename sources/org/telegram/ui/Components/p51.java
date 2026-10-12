package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class p51 extends s4.r0 {
    public final int f28154a;
    public int f28155b;
    public final Object f28156c;

    public p51(t51 t51Var) {
        this.f28154a = 0;
        this.f28156c = t51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f28154a) {
            case 0:
                if (i10 == 0) {
                    this.f28155b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28154a) {
            case 0:
                t51 t51Var = (t51) this.f28156c;
                this.f28155b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28155b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = t51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = t51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    t51.n(t51Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f28155b + i11;
                this.f28155b = i12;
                ((org.telegram.ui.k31) this.f28156c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
            default:
                org.telegram.ui.Wallet.z4 z4Var = ((org.telegram.ui.Wallet.w3) this.f28156c).f33794a;
                if (this.f28155b == 0) {
                    z4Var.q0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.f3(z4Var, 13));
                    return;
                }
        }
    }

    public p51(org.telegram.ui.k31 k31Var) {
        this.f28154a = 1;
        this.f28156c = k31Var;
        this.f28155b = 0;
    }

    public p51(org.telegram.ui.Wallet.w3 w3Var, int i10) {
        this.f28154a = 2;
        this.f28156c = w3Var;
        this.f28155b = i10;
    }
}
