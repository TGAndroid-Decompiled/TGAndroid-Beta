package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l51 extends s4.s0 {
    public final int f28283a;
    public int f28284b;
    public final Object f28285c;

    public l51(o51 o51Var) {
        this.f28283a = 0;
        this.f28285c = o51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f28283a) {
            case 0:
                if (i10 == 0) {
                    this.f28284b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28283a) {
            case 0:
                o51 o51Var = (o51) this.f28285c;
                this.f28284b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28284b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = o51Var.f29237e.findFocus();
                    if (findFocus == null) {
                        findFocus = o51Var.f29237e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    o51.m(o51Var);
                    return;
                }
                return;
            default:
                int i12 = this.f28284b + i11;
                this.f28284b = i12;
                ((org.telegram.ui.x21) this.f28285c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public l51(org.telegram.ui.x21 x21Var) {
        this.f28283a = 1;
        this.f28285c = x21Var;
        this.f28284b = 0;
    }
}
