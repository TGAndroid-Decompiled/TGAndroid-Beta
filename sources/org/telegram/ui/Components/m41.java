package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m41 extends s4.s0 {
    public final int f26092a;
    public int f26093b;
    public final Object f26094c;

    public m41(p41 p41Var) {
        this.f26092a = 0;
        this.f26094c = p41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f26092a) {
            case 0:
                if (i10 == 0) {
                    this.f26093b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26092a) {
            case 0:
                p41 p41Var = (p41) this.f26094c;
                this.f26093b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f26093b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p41Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = p41Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p41.m(p41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f26093b + i11;
                this.f26093b = i12;
                ((org.telegram.ui.w21) this.f26094c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public m41(org.telegram.ui.w21 w21Var) {
        this.f26092a = 1;
        this.f26094c = w21Var;
        this.f26093b = 0;
    }
}
