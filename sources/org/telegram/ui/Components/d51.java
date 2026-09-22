package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class d51 extends s4.s0 {
    public final int f23565a;
    public int f23566b;
    public final Object f23567c;

    public d51(g51 g51Var) {
        this.f23565a = 0;
        this.f23567c = g51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f23565a) {
            case 0:
                if (i10 == 0) {
                    this.f23566b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f23565a) {
            case 0:
                g51 g51Var = (g51) this.f23567c;
                this.f23566b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f23566b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = g51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = g51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    g51.m(g51Var);
                    return;
                }
                return;
            default:
                int i12 = this.f23566b + i11;
                this.f23566b = i12;
                ((org.telegram.ui.e31) this.f23567c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public d51(org.telegram.ui.e31 e31Var) {
        this.f23565a = 1;
        this.f23567c = e31Var;
        this.f23566b = 0;
    }
}
