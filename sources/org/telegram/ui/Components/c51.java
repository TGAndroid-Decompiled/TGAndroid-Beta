package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c51 extends s4.s0 {
    public final int f23205a;
    public int f23206b;
    public final Object f23207c;

    public c51(f51 f51Var) {
        this.f23205a = 0;
        this.f23207c = f51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f23205a) {
            case 0:
                if (i10 == 0) {
                    this.f23206b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f23205a) {
            case 0:
                f51 f51Var = (f51) this.f23207c;
                this.f23206b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f23206b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = f51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = f51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    f51.m(f51Var);
                    return;
                }
                return;
            default:
                int i12 = this.f23206b + i11;
                this.f23206b = i12;
                ((org.telegram.ui.d31) this.f23207c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public c51(org.telegram.ui.d31 d31Var) {
        this.f23205a = 1;
        this.f23207c = d31Var;
        this.f23206b = 0;
    }
}
