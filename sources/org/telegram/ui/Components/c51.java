package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c51 extends s4.s0 {
    public final int f23211a;
    public int f23212b;
    public final Object f23213c;

    public c51(f51 f51Var) {
        this.f23211a = 0;
        this.f23213c = f51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f23211a) {
            case 0:
                if (i10 == 0) {
                    this.f23212b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f23211a) {
            case 0:
                f51 f51Var = (f51) this.f23213c;
                this.f23212b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f23212b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = f51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = f51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    f51.m(f51Var);
                    return;
                }
                return;
            default:
                int i12 = this.f23212b + i11;
                this.f23212b = i12;
                ((org.telegram.ui.v21) this.f23213c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public c51(org.telegram.ui.v21 v21Var) {
        this.f23211a = 1;
        this.f23213c = v21Var;
        this.f23212b = 0;
    }
}
