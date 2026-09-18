package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class dk0 extends s4.n0 {
    public final int f23599a;
    public final qk0 f23600b;

    public dk0(qk0 qk0Var, int i10) {
        this.f23599a = i10;
        this.f23600b = qk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.f23599a) {
            case 0:
                super.a(rect, view, recyclerView, z0Var);
                qk0 qk0Var = this.f23600b;
                if (!qk0Var.q()) {
                    recyclerView.getClass();
                    int S = RecyclerView.S(view);
                    if (S == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (S == qk0Var.f27635a0.h() - 1) {
                        if ((!qk0Var.U.isEmpty() && !MessagesController.getInstance(qk0Var.J).premiumFeaturesBlocked()) || qk0Var.q()) {
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
                int S2 = RecyclerView.S(view);
                if (S2 == 0) {
                    rect.left = AndroidUtilities.dp(8.0f);
                }
                if (S2 == this.f23600b.f27635a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
