package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m51 extends s4.s0 {
    public final int f28612a;
    public int f28613b;
    public final Object f28614c;

    public m51(p51 p51Var) {
        this.f28612a = 0;
        this.f28614c = p51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f28612a) {
            case 0:
                if (i10 == 0) {
                    this.f28613b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f28612a) {
            case 0:
                p51 p51Var = (p51) this.f28614c;
                this.f28613b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f28613b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = p51Var.f29599e.findFocus();
                    if (findFocus == null) {
                        findFocus = p51Var.f29599e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i11 != 0) {
                    p51.m(p51Var);
                    return;
                }
                return;
            default:
                int i12 = this.f28613b + i11;
                this.f28613b = i12;
                ((org.telegram.ui.x21) this.f28614c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public m51(org.telegram.ui.x21 x21Var) {
        this.f28612a = 1;
        this.f28614c = x21Var;
        this.f28613b = 0;
    }
}
