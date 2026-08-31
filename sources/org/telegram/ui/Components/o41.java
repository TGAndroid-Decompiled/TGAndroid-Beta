package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class o41 extends f2.a1 {
    public final int f29667a;
    public int f29668b;
    public final Object f29669c;

    public o41(r41 r41Var) {
        this.f29667a = 0;
        this.f29669c = r41Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f29667a) {
            case 0:
                if (i10 == 0) {
                    this.f29668b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f29667a) {
            case 0:
                r41 r41Var = (r41) this.f29669c;
                this.f29668b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f29668b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = r41Var.f30593e.findFocus();
                    if (findFocus == null) {
                        findFocus = r41Var.f30593e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    r41.m(r41Var);
                    return;
                }
                return;
            default:
                int i12 = this.f29668b + i11;
                this.f29668b = i12;
                ((org.telegram.ui.n21) this.f29669c).E.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public o41(org.telegram.ui.n21 n21Var) {
        this.f29667a = 1;
        this.f29669c = n21Var;
        this.f29668b = 0;
    }
}
