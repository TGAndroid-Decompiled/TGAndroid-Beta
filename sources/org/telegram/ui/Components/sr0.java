package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sr0 extends f2.v0 {
    public final lr0 f32711a;
    public final qu0 f32712b;

    public sr0(qu0 qu0Var, lr0 lr0Var) {
        this.f32712b = qu0Var;
        this.f32711a = lr0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        boolean z10;
        boolean z11;
        lr0 lr0Var = this.f32711a;
        int i10 = 0;
        if (lr0Var.h.getAdapter() == this.f32712b.K) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            mr0 mr0Var = lr0Var.f29472x;
            mr0Var.B1();
            if (R <= mr0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!lr0Var.f29472x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.p7) {
            org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
            lr0Var.h.getClass();
            int R2 = RecyclerView.R(p7Var);
            int i11 = lr0Var.f29472x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7Var.T = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            p7Var.R = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            p7Var.S = z12;
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
