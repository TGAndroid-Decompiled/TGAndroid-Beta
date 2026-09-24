package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class a51 extends s4.s0 {
    public final int f22582a;
    public int f22583b;
    public final Object f22584c;

    public a51(d51 d51Var) {
        this.f22582a = 0;
        this.f22584c = d51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f22582a) {
            case 0:
                if (i10 == 0) {
                    this.f22583b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f22582a) {
            case 0:
                d51 d51Var = (d51) this.f22584c;
                this.f22583b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f22583b) > AndroidUtilities.dp(96.0f)) {
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
                int i12 = this.f22583b + i11;
                this.f22583b = i12;
                ((org.telegram.ui.v21) this.f22584c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public a51(org.telegram.ui.v21 v21Var) {
        this.f22582a = 1;
        this.f22584c = v21Var;
        this.f22583b = 0;
    }
}
