package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hi0 extends v4.o0 {
    public final int f35885a;
    public final vi0 f35886b;

    public hi0(vi0 vi0Var, int i7) {
        this.f35885a = i7;
        this.f35886b = vi0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        switch (this.f35885a) {
            case 0:
                super.e(rect, view, recyclerView, c1Var);
                vi0 vi0Var = this.f35886b;
                if (!vi0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == vi0Var.f40642b0.b() - 1) {
                        if ((!vi0Var.V.isEmpty() && !org.telegram.messenger.mp.u1(vi0Var.K).K3()) || vi0Var.q()) {
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
                if (R2 == this.f35886b.f40642b0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
