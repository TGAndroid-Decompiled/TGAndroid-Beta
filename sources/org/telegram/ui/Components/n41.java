package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n41 extends f2.z0 {
    public final int f27184a;
    public int f27185b;
    public final Object f27186c;

    public n41(q41 q41Var) {
        this.f27184a = 0;
        this.f27186c = q41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f27184a) {
            case 0:
                if (i10 == 0) {
                    this.f27185b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27184a) {
            case 0:
                q41 q41Var = (q41) this.f27186c;
                this.f27185b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f27185b) > AndroidUtilities.dp(96.0f)) {
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
                int i12 = this.f27185b + i11;
                this.f27185b = i12;
                ((org.telegram.ui.t21) this.f27186c).E.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public n41(org.telegram.ui.t21 t21Var) {
        this.f27184a = 1;
        this.f27186c = t21Var;
        this.f27185b = 0;
    }
}
