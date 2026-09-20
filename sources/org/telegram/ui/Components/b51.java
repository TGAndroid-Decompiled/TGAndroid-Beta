package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class b51 extends s4.s0 {
    public final int f22899a;
    public int f22900b;
    public final Object f22901c;

    public b51(e51 e51Var) {
        this.f22899a = 0;
        this.f22901c = e51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f22899a) {
            case 0:
                if (i10 == 0) {
                    this.f22900b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f22899a) {
            case 0:
                e51 e51Var = (e51) this.f22901c;
                this.f22900b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f22900b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = e51Var.e.findFocus();
                    if (findFocus == null) {
                        findFocus = e51Var.e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    e51.m(e51Var);
                    return;
                }
                return;
            default:
                int i12 = this.f22900b + i11;
                this.f22900b = i12;
                ((org.telegram.ui.e31) this.f22901c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public b51(org.telegram.ui.e31 e31Var) {
        this.f22899a = 1;
        this.f22901c = e31Var;
        this.f22900b = 0;
    }
}
