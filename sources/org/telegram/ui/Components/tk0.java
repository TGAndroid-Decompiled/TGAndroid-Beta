package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class tk0 extends s4.n0 {
    public final int f33076a;
    public final gl0 f33077b;

    public tk0(gl0 gl0Var, int i10) {
        this.f33076a = i10;
        this.f33077b = gl0Var;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        switch (this.f33076a) {
            case 0:
                super.d(rect, view, recyclerView, b1Var);
                gl0 gl0Var = this.f33077b;
                if (!gl0Var.q()) {
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == gl0Var.f28607a0.h() - 1) {
                        if ((!gl0Var.U.isEmpty() && !MessagesController.getInstance(gl0Var.J).premiumFeaturesBlocked()) || gl0Var.q()) {
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
                if (R2 == this.f33077b.f28607a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
