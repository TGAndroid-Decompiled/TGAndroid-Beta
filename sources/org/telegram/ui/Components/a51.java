package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class a51 extends s4.s0 {
    public final int f21387a;
    public int f21388b;
    public final Object f21389c;

    public a51(d51 d51Var) {
        this.f21387a = 0;
        this.f21389c = d51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f21387a) {
            case 0:
                if (i10 == 0) {
                    this.f21388b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f21387a) {
            case 0:
                d51 d51Var = (d51) this.f21389c;
                this.f21388b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f21388b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = d51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = d51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    d51.m(d51Var);
                    return;
                }
                return;
            default:
                int i12 = this.f21388b + i11;
                this.f21388b = i12;
                ((org.telegram.ui.j31) this.f21389c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public a51(org.telegram.ui.j31 j31Var) {
        this.f21387a = 1;
        this.f21389c = j31Var;
        this.f21388b = 0;
    }
}
