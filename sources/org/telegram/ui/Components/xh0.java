package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xh0 extends u4.n0 {
    public final int f40365a;
    public final li0 f40366b;

    public xh0(li0 li0Var, int i3) {
        this.f40365a = i3;
        this.f40366b = li0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        switch (this.f40365a) {
            case 0:
                super.e(rect, view, recyclerView, a1Var);
                li0 li0Var = this.f40366b;
                if (!li0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == li0Var.f35737b0.b() - 1) {
                        if ((!li0Var.V.isEmpty() && !org.telegram.messenger.hp.s1(li0Var.K).D3()) || li0Var.q()) {
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
                if (R2 == this.f40366b.f35737b0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
