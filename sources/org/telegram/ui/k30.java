package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k30 extends s4.n0 {
    public final k60 f34985a;

    public k30(k60 k60Var) {
        this.f34985a = k60Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int i10;
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        if (S >= 0) {
            rect.setEmpty();
            e60 e60Var = this.f34985a.P;
            int i11 = e60Var.G;
            if (S >= i11 && S < e60Var.H) {
                int i12 = S - i11;
                if (k60.F3) {
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
