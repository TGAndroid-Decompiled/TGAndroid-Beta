package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class zi0 extends s4.m0 {
    public final int f33170a;
    public final nj0 f33171b;

    public zi0(nj0 nj0Var, int i10) {
        this.f33170a = i10;
        this.f33171b = nj0Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.f33170a) {
            case 0:
                super.c(rect, view, recyclerView, z0Var);
                nj0 nj0Var = this.f33171b;
                if (!nj0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.i0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.i0.L(4.0f);
                    if (R == nj0Var.f28859a0.b() - 1) {
                        if ((!nj0Var.U.isEmpty() && !org.telegram.messenger.wp.r1(nj0Var.J).A3()) || nj0Var.q()) {
                            rect.right = org.telegram.messenger.i0.L(2.0f);
                            return;
                        } else {
                            rect.right = org.telegram.messenger.i0.L(6.0f);
                            return;
                        }
                    }
                    return;
                }
                rect.left = 0;
                rect.right = 0;
                return;
            default:
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = org.telegram.messenger.i0.L(8.0f);
                }
                if (R2 == this.f33171b.f28859a0.b() - 1) {
                    rect.right = org.telegram.messenger.i0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
