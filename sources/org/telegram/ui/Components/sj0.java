package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class sj0 extends f2.v0 {
    public final int f32660a;
    public final fk0 f32661b;

    public sj0(fk0 fk0Var, int i10) {
        this.f32660a = i10;
        this.f32661b = fk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        switch (this.f32660a) {
            case 0:
                super.a(rect, view, recyclerView, k1Var);
                fk0 fk0Var = this.f32661b;
                if (!fk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == fk0Var.T.h() - 1) {
                        if ((!fk0Var.Q.isEmpty() && !MessagesController.getInstance(fk0Var.F).premiumFeaturesBlocked()) || fk0Var.q()) {
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
                if (R2 == this.f32661b.T.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
