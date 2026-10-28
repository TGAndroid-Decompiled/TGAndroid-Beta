package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class it0 extends s4.n0 {
    public final bt0 f29420a;
    public final bw0 f29421b;

    public it0(bw0 bw0Var, bt0 bt0Var) {
        this.f29421b = bw0Var;
        this.f29420a = bt0Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        boolean z10;
        boolean z11;
        bt0 bt0Var = this.f29420a;
        int i10 = 0;
        if (bt0Var.h.getAdapter() == this.f29421b.Q) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            ct0 ct0Var = bt0Var.f33471w;
            ct0Var.C1();
            if (R <= ct0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!bt0Var.f33471w.F1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.w7) {
            org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) view;
            bt0Var.h.getClass();
            int R2 = RecyclerView.R(w7Var);
            int i11 = bt0Var.f33471w.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            w7Var.f25637a0 = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            w7Var.V = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            w7Var.W = z12;
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
