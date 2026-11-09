package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vh0 extends v4.m0 {
    public final int f39075a;
    public final ji0 f39076b;

    public vh0(ji0 ji0Var, int i7) {
        this.f39075a = i7;
        this.f39076b = ji0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        switch (this.f39075a) {
            case 0:
                super.e(rect, view, recyclerView, a1Var);
                ji0 ji0Var = this.f39076b;
                if (!ji0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == ji0Var.f35026a0.b() - 1) {
                        if ((!ji0Var.U.isEmpty() && !org.telegram.messenger.qp.s1(ji0Var.J).D3()) || ji0Var.q()) {
                            rect.right = org.telegram.messenger.g0.L(2.0f);
                            return;
                        } else {
                            rect.right = org.telegram.messenger.g0.L(6.0f);
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
                    rect.left = org.telegram.messenger.g0.L(8.0f);
                }
                if (R2 == this.f39076b.f35026a0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
