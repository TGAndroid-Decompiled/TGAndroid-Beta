package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yh0 extends v4.n0 {
    public final int f41999a;
    public final mi0 f42000b;

    public yh0(mi0 mi0Var, int i7) {
        this.f41999a = i7;
        this.f42000b = mi0Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        switch (this.f41999a) {
            case 0:
                super.e(rect, view, recyclerView, b1Var);
                mi0 mi0Var = this.f42000b;
                if (!mi0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = org.telegram.messenger.g0.L(6.0f);
                    }
                    rect.right = org.telegram.messenger.g0.L(4.0f);
                    if (R == mi0Var.f37260b0.b() - 1) {
                        if ((!mi0Var.V.isEmpty() && !org.telegram.messenger.np.s1(mi0Var.K).D3()) || mi0Var.q()) {
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
                if (R2 == this.f42000b.f37260b0.b() - 1) {
                    rect.right = org.telegram.messenger.g0.L(8.0f);
                    return;
                }
                return;
        }
    }
}
