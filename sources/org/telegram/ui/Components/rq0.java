package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class rq0 extends v4.n0 {
    public final kq0 f39274a;
    public final jt0 f39275b;

    public rq0(jt0 jt0Var, kq0 kq0Var) {
        this.f39275b = jt0Var;
        this.f39274a = kq0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        boolean z10;
        boolean z11;
        kq0 kq0Var = this.f39274a;
        int i7 = 0;
        if (kq0Var.h.getAdapter() == this.f39275b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            lq0 lq0Var = kq0Var.f34544x;
            lq0Var.B1();
            if (R <= lq0Var.U) {
                rect.top = 0;
            } else {
                rect.top = org.telegram.messenger.g0.L(2.0f);
            }
            if (!kq0Var.f34544x.E1(R)) {
                i7 = org.telegram.messenger.g0.L(2.0f);
            }
            rect.right = i7;
        } else if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            kq0Var.h.getClass();
            int R2 = RecyclerView.R(p7Var);
            int i10 = kq0Var.f34544x.J;
            boolean z12 = true;
            if (R2 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.f31222b0 = z10;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7Var.W = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            p7Var.f31220a0 = z12;
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        } else {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
        }
    }
}
