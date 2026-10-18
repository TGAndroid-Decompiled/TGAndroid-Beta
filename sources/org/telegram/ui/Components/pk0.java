package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class pk0 extends s4.m0 {
    public final int f29330a;
    public final cl0 f29331b;

    public pk0(cl0 cl0Var, int i10) {
        this.f29330a = i10;
        this.f29331b = cl0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        switch (this.f29330a) {
            case 0:
                super.a(rect, view, recyclerView, y0Var);
                cl0 cl0Var = this.f29331b;
                if (!cl0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == cl0Var.f25258a0.h() - 1) {
                        if ((!cl0Var.U.isEmpty() && !MessagesController.getInstance(cl0Var.J).premiumFeaturesBlocked()) || cl0Var.q()) {
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
                if (R2 == this.f29331b.f25258a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
