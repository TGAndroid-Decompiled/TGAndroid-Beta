package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class f20 extends s4.m0 {
    public final a50 f36979a;

    public f20(a50 a50Var) {
        this.f36979a = a50Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int i10;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            u40 u40Var = this.f36979a.G1;
            int i11 = u40Var.G;
            if (R >= i11 && R < u40Var.H) {
                int i12 = R - i11;
                if (a50.f35575w5) {
                    i10 = 6;
                } else {
                    i10 = 2;
                }
                int i13 = i12 % i10;
                if (i13 == 0) {
                    rect.right = org.telegram.messenger.i0.L(2.0f);
                } else if (i13 == i10 - 1) {
                    rect.left = org.telegram.messenger.i0.L(2.0f);
                } else {
                    rect.left = org.telegram.messenger.i0.L(1.0f);
                }
            }
        }
    }
}
