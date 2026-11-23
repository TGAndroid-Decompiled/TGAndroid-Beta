package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ji0 extends v4.o0 {
    public final int f36515a;
    public final xi0 f36516b;

    public ji0(xi0 xi0Var, int i7) {
        this.f36515a = i7;
        this.f36516b = xi0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        switch (this.f36515a) {
            case 0:
                super.e(rect, view, recyclerView, c1Var);
                xi0 xi0Var = this.f36516b;
                if (!xi0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == xi0Var.f42105b0.b() - 1) {
                        if ((!xi0Var.V.isEmpty() && !org.telegram.messenger.np.u1(xi0Var.K).K3()) || xi0Var.q()) {
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
                if (R2 == this.f36516b.f42105b0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
