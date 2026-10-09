package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class xk0 extends s4.o0 {
    public final int f32902a;
    public final kl0 f32903b;

    public xk0(kl0 kl0Var, int i10) {
        this.f32902a = i10;
        this.f32903b = kl0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        switch (this.f32902a) {
            case 0:
                super.a(rect, view, recyclerView, a1Var);
                kl0 kl0Var = this.f32903b;
                if (!kl0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == kl0Var.f28065a0.h() - 1) {
                        if ((!kl0Var.U.isEmpty() && !MessagesController.getInstance(kl0Var.J).premiumFeaturesBlocked()) || kl0Var.q()) {
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
                if (R2 == this.f32903b.f28065a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
