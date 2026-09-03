package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m41 extends f2.a1 {
    public final int f28978a;
    public int f28979b;
    public final Object f28980c;

    public m41(p41 p41Var) {
        this.f28978a = 0;
        this.f28980c = p41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f28978a) {
            case 0:
                if (i10 == 0) {
                    this.f28979b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28978a) {
            case 0:
                p41 p41Var = (p41) this.f28980c;
                this.f28979b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28979b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p41Var.f29977e.findFocus();
                    if (findFocus == null) {
                        findFocus = p41Var.f29977e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p41.m(p41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f28979b + i11;
                this.f28979b = i12;
                ((org.telegram.ui.t21) this.f28980c).E.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public m41(org.telegram.ui.t21 t21Var) {
        this.f28978a = 1;
        this.f28980c = t21Var;
        this.f28979b = 0;
    }
}
