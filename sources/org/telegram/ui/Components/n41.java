package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n41 extends s4.s0 {
    public final int f26311a;
    public int f26312b;
    public final Object f26313c;

    public n41(q41 q41Var) {
        this.f26311a = 0;
        this.f26313c = q41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f26311a) {
            case 0:
                if (i10 == 0) {
                    this.f26312b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26311a) {
            case 0:
                q41 q41Var = (q41) this.f26313c;
                this.f26312b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f26312b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = q41Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = q41Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    q41.m(q41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f26312b + i11;
                this.f26312b = i12;
                ((org.telegram.ui.e31) this.f26313c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public n41(org.telegram.ui.e31 e31Var) {
        this.f26311a = 1;
        this.f26313c = e31Var;
        this.f26312b = 0;
    }
}
