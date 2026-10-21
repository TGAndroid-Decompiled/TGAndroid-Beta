package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class qk0 extends s4.m0 {
    public final int f29627a;
    public final dl0 f29628b;

    public qk0(dl0 dl0Var, int i10) {
        this.f29627a = i10;
        this.f29628b = dl0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        switch (this.f29627a) {
            case 0:
                super.a(rect, view, recyclerView, y0Var);
                dl0 dl0Var = this.f29628b;
                if (!dl0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == dl0Var.f25523a0.h() - 1) {
                        if ((!dl0Var.U.isEmpty() && !MessagesController.getInstance(dl0Var.J).premiumFeaturesBlocked()) || dl0Var.q()) {
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
                if (R2 == this.f29628b.f25523a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
