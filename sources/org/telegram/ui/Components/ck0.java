package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ck0 extends s4.n0 {
    public final int f22151a;
    public final pk0 f22152b;

    public ck0(pk0 pk0Var, int i10) {
        this.f22151a = i10;
        this.f22152b = pk0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        switch (this.f22151a) {
            case 0:
                super.a(rect, view, recyclerView, z0Var);
                pk0 pk0Var = this.f22152b;
                if (!pk0Var.q()) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(view);
                    if (R == 0) {
                        rect.left = AndroidUtilities.dp(6.0f);
                    }
                    rect.right = AndroidUtilities.dp(4.0f);
                    if (R == pk0Var.f26159a0.h() - 1) {
                        if ((!pk0Var.U.isEmpty() && !MessagesController.getInstance(pk0Var.J).premiumFeaturesBlocked()) || pk0Var.q()) {
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
                if (R2 == this.f22152b.f26159a0.h() - 1) {
                    rect.right = AndroidUtilities.dp(8.0f);
                    return;
                }
                return;
        }
    }
}
