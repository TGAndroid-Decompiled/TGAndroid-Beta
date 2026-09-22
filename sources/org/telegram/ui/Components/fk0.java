package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class fk0 extends s4.n0 {
    public final int f24250a;
    public final sk0 f24251b;

    public fk0(sk0 sk0Var, int i10) {
        this.f24250a = i10;
        this.f24251b = sk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.f24250a) {
            case 0:
                super.a(rect, view, recyclerView, z0Var);
                sk0 sk0Var = this.f24251b;
                if (!sk0Var.q()) {
                    recyclerView.getClass();
                    int S = RecyclerView.S(view);
                    if (S == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (S == sk0Var.f28227a0.h() - 1) {
                        if ((!sk0Var.U.isEmpty() && !MessagesController.getInstance(sk0Var.J).premiumFeaturesBlocked()) || sk0Var.q()) {
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
                if (S2 == this.f24251b.f28227a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
