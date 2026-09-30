package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class gk0 extends s4.n0 {
    public final int f24589a;
    public final tk0 f24590b;

    public gk0(tk0 tk0Var, int i10) {
        this.f24589a = i10;
        this.f24590b = tk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.f24589a) {
            case 0:
                super.a(rect, view, recyclerView, z0Var);
                tk0 tk0Var = this.f24590b;
                if (!tk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == tk0Var.f28553a0.h() - 1) {
                        if ((!tk0Var.U.isEmpty() && !MessagesController.getInstance(tk0Var.J).premiumFeaturesBlocked()) || tk0Var.q()) {
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
                if (R2 == this.f24590b.f28553a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
