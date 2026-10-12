package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class m30 extends s4.m0 {
    public final n60 f38156a;

    public m30(n60 n60Var) {
        this.f38156a = n60Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        int i10;
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            h60 h60Var = this.f38156a.P;
            int i11 = h60Var.G;
            if (R >= i11 && R < h60Var.H) {
                int i12 = R - i11;
                if (n60.F3) {
                    i10 = 6;
                } else {
                    i10 = 2;
                }
                int i13 = i12 % i10;
                if (i13 == 0) {
                    rect.right = AndroidUtilities.dp(2.0f);
                } else if (i13 == i10 - 1) {
                    rect.left = AndroidUtilities.dp(2.0f);
                } else {
                    rect.left = AndroidUtilities.dp(1.0f);
                }
            }
        }
    }
}
