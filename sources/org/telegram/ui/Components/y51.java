package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y51 extends s4.t0 {
    public final int f32958a;
    public int f32959b;
    public final Object f32960c;

    public y51(c61 c61Var) {
        this.f32958a = 0;
        this.f32960c = c61Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f32958a) {
            case 0:
                if (i10 == 0) {
                    this.f32959b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f32958a) {
            case 0:
                c61 c61Var = (c61) this.f32960c;
                this.f32959b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f32959b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = c61Var.f24842e.findFocus();
                    if (findFocus == null) {
                        findFocus = c61Var.f24842e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    c61.o(c61Var);
                    return;
                }
                return;
            case 1:
                int i12 = this.f32959b + i11;
                this.f32959b = i12;
                ((org.telegram.ui.f31) this.f32960c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
            default:
                org.telegram.ui.Wallet.c5 c5Var = ((org.telegram.ui.Wallet.y3) this.f32960c).f35541a;
                if (this.f32959b == 0) {
                    c5Var.q0();
                    return;
                } else {
                    recyclerView.post(new org.telegram.ui.Wallet.h3(c5Var, 13));
                    return;
                }
        }
    }

    public y51(org.telegram.ui.f31 f31Var) {
        this.f32958a = 1;
        this.f32960c = f31Var;
        this.f32959b = 0;
    }

    public y51(org.telegram.ui.Wallet.y3 y3Var, int i10) {
        this.f32958a = 2;
        this.f32960c = y3Var;
        this.f32959b = i10;
    }
}
