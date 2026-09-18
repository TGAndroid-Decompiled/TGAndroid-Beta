package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class tj0 extends s4.n0 {
    public final int f28120a;
    public final gk0 f28121b;

    public tj0(gk0 gk0Var, int i10) {
        this.f28120a = i10;
        this.f28121b = gk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.f28120a) {
            case 0:
                super.a(rect, view, recyclerView, z0Var);
                gk0 gk0Var = this.f28121b;
                if (!gk0Var.q()) {
                    recyclerView.getClass();
                    int S = RecyclerView.S(view);
                    if (S == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (S == gk0Var.f24269a0.h() - 1) {
                        if ((!gk0Var.U.isEmpty() && !MessagesController.getInstance(gk0Var.J).premiumFeaturesBlocked()) || gk0Var.q()) {
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
                if (S2 == this.f28121b.f24269a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
