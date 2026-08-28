package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n20 extends f2.y0 {
    public final o50 f40584a;

    public n20(o50 o50Var) {
        this.f40584a = o50Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        int i9;
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            i50 i50Var = this.f40584a.L;
            int i10 = i50Var.C;
            if (R >= i10 && R < i50Var.D) {
                int i11 = R - i10;
                if (o50.B3) {
                    i9 = 6;
                } else {
                    i9 = 2;
                }
                int i12 = i11 % i9;
                if (i12 == 0) {
                    rect.right = AndroidUtilities.dp(2.0f);
                } else if (i12 == i9 - 1) {
                    rect.left = AndroidUtilities.dp(2.0f);
                } else {
                    rect.left = AndroidUtilities.dp(1.0f);
                }
            }
        }
    }
}
