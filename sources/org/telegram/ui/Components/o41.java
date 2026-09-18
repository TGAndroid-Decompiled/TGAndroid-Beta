package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class o41 extends s4.s0 {
    public final int f26623a;
    public int f26624b;
    public final Object f26625c;

    public o41(r41 r41Var) {
        this.f26623a = 0;
        this.f26625c = r41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f26623a) {
            case 0:
                if (i10 == 0) {
                    this.f26624b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26623a) {
            case 0:
                r41 r41Var = (r41) this.f26625c;
                this.f26624b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f26624b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = r41Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = r41Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    r41.m(r41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f26624b + i11;
                this.f26624b = i12;
                ((org.telegram.ui.f31) this.f26625c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public o41(org.telegram.ui.f31 f31Var) {
        this.f26623a = 1;
        this.f26625c = f31Var;
        this.f26624b = 0;
    }
}
