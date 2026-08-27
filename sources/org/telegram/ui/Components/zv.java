package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

public final class zv extends f2.w0 {

    public final yy f35392a;

    public zv(yy yyVar) {
        this.f35392a = yyVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.l1 l1Var) {
        recyclerView.getClass();
        int iR = RecyclerView.R(view);
        yy yyVar = this.f35392a;
        f2.q0 adapter = yyVar.f34987d0.getAdapter();
        cy cyVar = yyVar.f35007j0;
        if (adapter == cyVar && iR == cyVar.E) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (iR == 0) {
            cyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        dy dyVar = yyVar.f34991e0;
        cyVar.getClass();
        rect.right = dyVar.E1(iR) ? 0 : AndroidUtilities.dp(2.0f);
    }
}
