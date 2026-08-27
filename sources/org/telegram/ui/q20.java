package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class q20 extends f2.w0 {

    public final s50 f41491a;

    public q20(s50 s50Var) {
        this.f41491a = s50Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        recyclerView.getClass();
        int iR = RecyclerView.R(view);
        if (iR >= 0) {
            rect.setEmpty();
            m50 m50Var = this.f41491a.L;
            int i10 = m50Var.C;
            if (iR < i10 || iR >= m50Var.D) {
                return;
            }
            int i11 = iR - i10;
            int i12 = s50.B3 ? 6 : 2;
            int i13 = i11 % i12;
            if (i13 == 0) {
                rect.right = AndroidUtilities.dp(2.0f);
            } else if (i13 == i12 - 1) {
                rect.left = AndroidUtilities.dp(2.0f);
            } else {
                rect.left = AndroidUtilities.dp(1.0f);
            }
        }
    }
}
