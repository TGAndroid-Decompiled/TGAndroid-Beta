package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ck0 extends f2.v0 {
    public final int f25971a;
    public final qk0 f25972b;

    public ck0(qk0 qk0Var, int i10) {
        this.f25971a = i10;
        this.f25972b = qk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        switch (this.f25971a) {
            case 0:
                super.a(rect, view, recyclerView, j1Var);
                qk0 qk0Var = this.f25972b;
                if (!qk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == qk0Var.U.h() - 1) {
                        if ((!qk0Var.R.isEmpty() && !MessagesController.getInstance(qk0Var.G).premiumFeaturesBlocked()) || qk0Var.q()) {
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
                if (R2 == this.f25972b.U.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
