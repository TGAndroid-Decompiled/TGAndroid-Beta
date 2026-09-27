package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class c51 extends s4.s0 {
    public final int f23228a;
    public int f23229b;
    public final Object f23230c;

    public c51(f51 f51Var) {
        this.f23228a = 0;
        this.f23230c = f51Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f23228a) {
            case 0:
                if (i10 == 0) {
                    this.f23229b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f23228a) {
            case 0:
                f51 f51Var = (f51) this.f23230c;
                this.f23229b += i11;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f23229b) > AndroidUtilities.dp(96.0f)) {
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
                int i12 = this.f23229b + i11;
                this.f23229b = i12;
                ((org.telegram.ui.x21) this.f23230c).H.setAlpha((i12 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public c51(org.telegram.ui.x21 x21Var) {
        this.f23228a = 1;
        this.f23230c = x21Var;
        this.f23229b = 0;
    }
}
