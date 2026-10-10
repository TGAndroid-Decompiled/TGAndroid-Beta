package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class yk0 extends s4.o0 {
    public final int f33325a;
    public final ll0 f33326b;

    public yk0(ll0 ll0Var, int i10) {
        this.f33325a = i10;
        this.f33326b = ll0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        switch (this.f33325a) {
            case 0:
                super.a(rect, view, recyclerView, a1Var);
                ll0 ll0Var = this.f33326b;
                if (!ll0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == ll0Var.f28380a0.h() - 1) {
                        if ((!ll0Var.U.isEmpty() && !MessagesController.getInstance(ll0Var.J).premiumFeaturesBlocked()) || ll0Var.q()) {
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
                if (R2 == this.f33326b.f28380a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
