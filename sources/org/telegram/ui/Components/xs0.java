package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xs0 extends s4.m0 {
    public final qs0 f32478a;
    public final uv0 f32479b;

    public xs0(uv0 uv0Var, qs0 qs0Var) {
        this.f32479b = uv0Var;
        this.f32478a = qs0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        boolean z10;
        boolean z11;
        qs0 qs0Var = this.f32478a;
        int i10 = 0;
        if (qs0Var.h.getAdapter() == this.f32479b.O) {
            recyclerView.getClass();
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            rs0 rs0Var = qs0Var.f28884x;
            rs0Var.B1();
            if (R <= rs0Var.U) {
                rect.top = 0;
            } else {
                rect.top = AndroidUtilities.dp(2.0f);
            }
            if (!qs0Var.f28884x.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        } else if (view instanceof org.telegram.ui.Cells.s7) {
            org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
            qs0Var.h.getClass();
            int R2 = RecyclerView.R(s7Var);
            int i11 = qs0Var.f28884x.J;
            boolean z12 = true;
            if (R2 < i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            s7Var.f23024a0 = z10;
            int i12 = R2 % i11;
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            s7Var.V = z11;
            if (i12 != i11 - 1) {
                z12 = false;
            }
            s7Var.W = z12;
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
