package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class i10 extends v4.o0 {
    public final e40 f48688a;

    public i10(e40 e40Var) {
        this.f48688a = e40Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.c1 c1Var) {
        int i7;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            y30 y30Var = this.f48688a.K1;
            int i10 = y30Var.H;
            if (R >= i10 && R < y30Var.I) {
                int i11 = R - i10;
                if (e40.E5) {
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
