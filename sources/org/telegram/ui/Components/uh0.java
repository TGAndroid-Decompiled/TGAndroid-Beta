package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class uh0 extends v4.m0 {
    public final int f38660a;
    public final ii0 f38661b;

    public uh0(ii0 ii0Var, int i7) {
        this.f38660a = i7;
        this.f38661b = ii0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        switch (this.f38660a) {
            case 0:
                super.e(rect, view, recyclerView, a1Var);
                ii0 ii0Var = this.f38661b;
                if (!ii0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == ii0Var.f34635a0.b() - 1) {
                        if ((!ii0Var.U.isEmpty() && !org.telegram.messenger.qp.s1(ii0Var.J).D3()) || ii0Var.q()) {
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
                if (R2 == this.f38661b.f34635a0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
