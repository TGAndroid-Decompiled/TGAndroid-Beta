package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class g20 extends s4.m0 {
    public final b50 f37405a;

    public g20(b50 b50Var) {
        this.f37405a = b50Var;
    }

    @Override
    public final void c(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int i10;
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            v40 v40Var = this.f37405a.G1;
            int i11 = v40Var.G;
            if (R >= i11 && R < v40Var.H) {
                int i12 = R - i11;
                if (b50.f35991w5) {
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
