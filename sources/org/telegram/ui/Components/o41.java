package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class o41 extends s4.s0 {
    public final int f26620a;
    public int f26621b;
    public final Object f26622c;

    public o41(r41 r41Var) {
        this.f26620a = 0;
        this.f26622c = r41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f26620a) {
            case 0:
                if (i10 == 0) {
                    this.f26621b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f26620a) {
            case 0:
                r41 r41Var = (r41) this.f26622c;
                this.f26621b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f26621b) > AndroidUtilities.dp(96.0f)) {
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
                int i12 = this.f26621b + i11;
                this.f26621b = i12;
                ((org.telegram.ui.f31) this.f26622c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public o41(org.telegram.ui.f31 f31Var) {
        this.f26620a = 1;
        this.f26622c = f31Var;
        this.f26621b = 0;
    }
}
