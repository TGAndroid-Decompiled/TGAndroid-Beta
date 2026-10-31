package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yi0 extends s4.m0 {
    public final int f32741a;
    public final mj0 f32742b;

    public yi0(mj0 mj0Var, int i10) {
        this.f32741a = i10;
        this.f32742b = mj0Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.f32741a) {
            case 0:
                super.c(rect, view, recyclerView, z0Var);
                mj0 mj0Var = this.f32742b;
                if (!mj0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.i0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.i0.L(4.0f);
                    if (R == mj0Var.f28498a0.b() - 1) {
                        if ((!mj0Var.U.isEmpty() && !org.telegram.messenger.vp.r1(mj0Var.J).A3()) || mj0Var.q()) {
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
                if (R2 == this.f32742b.f28498a0.b() - 1) {
                    rect.right = org.telegram.messenger.i0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
