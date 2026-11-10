package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class k10 extends v4.m0 {
    public final f40 f47133a;

    public k10(f40 f40Var) {
        this.f47133a = f40Var;
    }

    @Override
    public final void e(Rect rect, View view, RecyclerView recyclerView, v4.a1 a1Var) {
        int i7;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            z30 z30Var = this.f47133a.J1;
            int i10 = z30Var.G;
            if (R >= i10 && R < z30Var.H) {
                int i11 = R - i10;
                if (f40.f45503z5) {
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
