package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class al0 extends s4.o0 {
    public final int f24428a;
    public final nl0 f24429b;

    public al0(nl0 nl0Var, int i10) {
        this.f24428a = i10;
        this.f24429b = nl0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        switch (this.f24428a) {
            case 0:
                super.a(rect, view, recyclerView, a1Var);
                nl0 nl0Var = this.f24429b;
                if (!nl0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == nl0Var.f28825a0.h() - 1) {
                        if ((!nl0Var.U.isEmpty() && !MessagesController.getInstance(nl0Var.J).premiumFeaturesBlocked()) || nl0Var.q()) {
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
                if (R2 == this.f24429b.f28825a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
