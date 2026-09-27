package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class g30 extends s4.n0 {
    public final g60 f33713a;

    public g30(g60 g60Var) {
        this.f33713a = g60Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int i10;
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        if (S >= 0) {
            rect.setEmpty();
            a60 a60Var = this.f33713a.P;
            int i11 = a60Var.G;
            if (S >= i11 && S < a60Var.H) {
                int i12 = S - i11;
                if (g60.F3) {
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
