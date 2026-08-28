package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class hj0 extends f2.y0 {
    public final int f29102a;
    public final uj0 f29103b;

    public hj0(uj0 uj0Var, int i9) {
        this.f29102a = i9;
        this.f29103b = uj0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        switch (this.f29102a) {
            case 0:
                super.a(rect, view, recyclerView, n1Var);
                uj0 uj0Var = this.f29103b;
                if (!uj0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == uj0Var.T.h() - 1) {
                        if ((!uj0Var.Q.isEmpty() && !MessagesController.getInstance(uj0Var.F).premiumFeaturesBlocked()) || uj0Var.q()) {
                            rect.right = AndroidUtilities.dp(2.0f);
                            return;
                        } else {
                            rect.right = AndroidUtilities.dp(6.0f);
                            return;
                        }
                    }
                    return;
                }
                rect.left = 0;
                rect.right = 0;
                return;
            default:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = AndroidUtilities.dp(8.0f);
                }
                if (R2 == this.f29103b.T.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
