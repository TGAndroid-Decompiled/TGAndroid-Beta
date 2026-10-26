package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class sk0 extends s4.n0 {
    public final int f32591a;
    public final fl0 f32592b;

    public sk0(fl0 fl0Var, int i10) {
        this.f32591a = i10;
        this.f32592b = fl0Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        switch (this.f32591a) {
            case 0:
                super.d(rect, view, recyclerView, b1Var);
                fl0 fl0Var = this.f32592b;
                if (!fl0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == fl0Var.f28229a0.h() - 1) {
                        if ((!fl0Var.U.isEmpty() && !MessagesController.getInstance(fl0Var.J).premiumFeaturesBlocked()) || fl0Var.q()) {
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
                int R2 = RecyclerView.R(view);
                if (R2 == 0) {
                    rect.left = AndroidUtilities.dp(8.0f);
                }
                if (R2 == this.f32592b.f28229a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
