package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class q31 extends f2.d1 {
    public final int f31825a;
    public int f31826b;
    public final Object f31827c;

    public q31(t31 t31Var) {
        this.f31825a = 0;
        this.f31827c = t31Var;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        switch (this.f31825a) {
            case 0:
                if (i9 == 0) {
                    this.f31826b = 0;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        switch (this.f31825a) {
            case 0:
                t31 t31Var = (t31) this.f31827c;
                this.f31826b += i10;
                if (recyclerView.getScrollState() == 1 && Math.abs(this.f31826b) > AndroidUtilities.dp(96.0f)) {
                    View findFocus = t31Var.f32619e.findFocus();
                    if (findFocus == null) {
                        findFocus = t31Var.f32619e;
                    }
                    AndroidUtilities.hideKeyboard(findFocus);
                }
                if (i10 != 0) {
                    t31.m(t31Var);
                    return;
                }
                return;
            default:
                int i11 = this.f31826b + i10;
                this.f31826b = i11;
                ((org.telegram.ui.y11) this.f31827c).D.setAlpha((i11 * 1.0f) / AndroidUtilities.dp(6.0f));
                return;
        }
    }

    public q31(org.telegram.ui.y11 y11Var) {
        this.f31825a = 1;
        this.f31827c = y11Var;
        this.f31826b = 0;
    }
}
