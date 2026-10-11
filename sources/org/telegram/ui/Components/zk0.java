package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class zk0 extends s4.o0 {
    public final int f33563a;
    public final ml0 f33564b;

    public zk0(ml0 ml0Var, int i10) {
        this.f33563a = i10;
        this.f33564b = ml0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        switch (this.f33563a) {
            case 0:
                super.a(rect, view, recyclerView, a1Var);
                ml0 ml0Var = this.f33564b;
                if (!ml0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == ml0Var.f28751a0.h() - 1) {
                        if ((!ml0Var.U.isEmpty() && !MessagesController.getInstance(ml0Var.J).premiumFeaturesBlocked()) || ml0Var.q()) {
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
                if (R2 == this.f33564b.f28751a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
