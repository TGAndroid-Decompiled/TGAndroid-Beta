package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class d30 extends s4.n0 {
    public final d60 f32904a;

    public d30(d60 d60Var) {
        this.f32904a = d60Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        int i10;
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        if (R >= 0) {
            rect.setEmpty();
            x50 x50Var = this.f32904a.P;
            int i11 = x50Var.G;
            if (R >= i11 && R < x50Var.H) {
                int i12 = R - i11;
                if (d60.F3) {
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
