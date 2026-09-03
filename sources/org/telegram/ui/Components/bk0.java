package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class bk0 extends f2.u0 {
    public final int f23715a;
    public final pk0 f23716b;

    public bk0(pk0 pk0Var, int i10) {
        this.f23715a = i10;
        this.f23716b = pk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        switch (this.f23715a) {
            case 0:
                super.a(rect, view, recyclerView, i1Var);
                pk0 pk0Var = this.f23716b;
                if (!pk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == pk0Var.U.h() - 1) {
                        if ((!pk0Var.R.isEmpty() && !MessagesController.getInstance(pk0Var.G).premiumFeaturesBlocked()) || pk0Var.q()) {
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
                if (R2 == this.f23716b.U.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
