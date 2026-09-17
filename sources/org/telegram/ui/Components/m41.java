package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m41 extends s4.s0 {
    public final int f28379a;
    public int f28380b;
    public final Object f28381c;

    public m41(p41 p41Var) {
        this.f28379a = 0;
        this.f28381c = p41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f28379a) {
            case 0:
                if (i10 == 0) {
                    this.f28380b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28379a) {
            case 0:
                p41 p41Var = (p41) this.f28381c;
                this.f28380b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28380b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p41Var.f29275e.findFocus();
                    if (findFocus == null) {
                        findFocus = p41Var.f29275e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p41.m(p41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f28380b + i11;
                this.f28380b = i12;
                ((org.telegram.ui.f31) this.f28381c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public m41(org.telegram.ui.f31 f31Var) {
        this.f28379a = 1;
        this.f28381c = f31Var;
        this.f28380b = 0;
    }
}
