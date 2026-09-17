package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m41 extends s4.s0 {
    public final int f28406a;
    public int f28407b;
    public final Object f28408c;

    public m41(p41 p41Var) {
        this.f28406a = 0;
        this.f28408c = p41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f28406a) {
            case 0:
                if (i10 == 0) {
                    this.f28407b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28406a) {
            case 0:
                p41 p41Var = (p41) this.f28408c;
                this.f28407b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28407b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p41Var.f29302e.findFocus();
                    if (findFocus == null) {
                        findFocus = p41Var.f29302e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p41.m(p41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f28407b + i11;
                this.f28407b = i12;
                ((org.telegram.ui.f31) this.f28408c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public m41(org.telegram.ui.f31 f31Var) {
        this.f28406a = 1;
        this.f28408c = f31Var;
        this.f28407b = 0;
    }
}
