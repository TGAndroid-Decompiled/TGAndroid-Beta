package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g10 extends v4.n0 {
    public final c40 f47270a;

    public g10(c40 c40Var) {
        this.f47270a = c40Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.b1 b1Var) {
        int i7;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            w30 w30Var = this.f47270a.K1;
            int i10 = w30Var.H;
            if (R >= i10 && R < w30Var.I) {
                int i11 = R - i10;
                if (c40.E5) {
                    i7 = 6;
                } else {
                    i7 = 2;
                }
                int i12 = i11 % i7;
                if (i12 == 0) {
                    rect.right = org.telegram.messenger.g0.L(2.0f);
                } else if (i12 == i7 - 1) {
                    rect.left = org.telegram.messenger.g0.L(2.0f);
                } else {
                    rect.left = org.telegram.messenger.g0.L(1.0f);
                }
            }
        }
    }
}
