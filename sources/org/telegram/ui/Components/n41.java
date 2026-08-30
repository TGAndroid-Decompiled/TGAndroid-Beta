package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n41 extends f2.z0 {
    public final int f27190a;
    public int f27191b;
    public final Object f27192c;

    public n41(q41 q41Var) {
        this.f27190a = 0;
        this.f27192c = q41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f27190a) {
            case 0:
                if (i10 == 0) {
                    this.f27191b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f27190a) {
            case 0:
                q41 q41Var = (q41) this.f27192c;
                this.f27191b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f27191b) > AndroidUtilities.dp(96.0f)) {
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
                int i12 = this.f27191b + i11;
                this.f27191b = i12;
                ((org.telegram.ui.l21) this.f27192c).E.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public n41(org.telegram.ui.l21 l21Var) {
        this.f27190a = 1;
        this.f27192c = l21Var;
        this.f27191b = 0;
    }
}
