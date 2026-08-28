package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class hr0 extends f2.y0 {
    public final ar0 f29177a;
    public final eu0 f29178b;

    public hr0(eu0 eu0Var, ar0 ar0Var) {
        this.f29178b = eu0Var;
        this.f29177a = ar0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        boolean z10;
        boolean z11;
        ar0 ar0Var = this.f29177a;
        int i9 = 0;
        if (ar0Var.h.getAdapter() == this.f29178b.K) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            br0 br0Var = ar0Var.f34764x;
            br0Var.B1();
            if (R <= br0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!ar0Var.f34764x.E1(R)) {
                i9 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i9;
        } else if (view instanceof org.telegram.ui.Cells.r7) {
            org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) view;
            ar0Var.h.getClass();
            int R2 = RecyclerView.R(r7Var);
            int i10 = ar0Var.f34764x.J;
            boolean z12 = true;
            if (R2 < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            r7Var.T = z10;
            int i11 = R2 % i10;
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            r7Var.R = z11;
            if (i11 != i10 - 1) {
                z12 = false;
            }
            r7Var.S = z12;
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
