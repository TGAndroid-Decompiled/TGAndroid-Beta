package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;

public final class jj0 extends f2.w0 {

    public final int f29712a;

    public final wj0 f29713b;

    public jj0(wj0 wj0Var, int i10) {
        this.f29712a = i10;
        this.f29713b = wj0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        switch (this.f29712a) {
            case 0:
                super.a(rect, view, recyclerView, l1Var);
                wj0 wj0Var = this.f29713b;
                if (!wj0Var.q()) {
                    recyclerView.getClass();
                    int iR = RecyclerView.R(view);
                    if (iR == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (iR == wj0Var.T.h() - 1) {
                        if (!(wj0Var.Q.isEmpty() || MessagesController.getInstance(wj0Var.F).premiumFeaturesBlocked()) || wj0Var.q()) {
                            rect.right = AndroidUtilities.dp(2.0f);
                        } else {
                            rect.right = AndroidUtilities.dp(6.0f);
                        }
                    }
                } else {
                    rect.left = 0;
                    rect.right = 0;
                }
                break;
            default:
                recyclerView.getClass();
                int iR2 = RecyclerView.R(view);
                if (iR2 == 0) {
                    rect.left = AndroidUtilities.dp(8.0f);
                }
                if (iR2 == this.f29713b.T.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                }
                break;
        }
    }
}
