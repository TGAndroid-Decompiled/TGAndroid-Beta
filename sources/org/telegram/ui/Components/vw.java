package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends s4.m0 {
    public final tz f31880a;

    public vw(tz tzVar) {
        this.f31880a = tzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        tz tzVar = this.f31880a;
        s4.g0 adapter = tzVar.f30737h0.getAdapter();
        yy yyVar = tzVar.f30754n0;
        int i10 = 0;
        if (adapter == yyVar && R == yyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            yyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        zy zyVar = tzVar.f30740i0;
        yyVar.getClass();
        if (!zyVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
