package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class c10 extends u4.n0 {
    public final x30 f44189a;

    public c10(x30 x30Var) {
        this.f44189a = x30Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, u4.a1 a1Var) {
        int i3;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            r30 r30Var = this.f44189a.H1;
            int i10 = r30Var.H;
            if (R >= i10 && R < r30Var.I) {
                int i11 = R - i10;
                if (x30.f51713x5) {
                    i3 = 6;
                } else {
                    i3 = 2;
                }
                int i12 = i11 % i3;
                if (i12 == 0) {
                    rect.right = org.telegram.messenger.g0.L(2.0f);
                } else if (i12 == i3 - 1) {
                    rect.left = org.telegram.messenger.g0.L(2.0f);
                } else {
                    rect.left = org.telegram.messenger.g0.L(1.0f);
                }
            }
        }
    }
}
