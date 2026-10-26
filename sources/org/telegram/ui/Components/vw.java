package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vw extends s4.n0 {
    public final sz f34273a;

    public vw(sz szVar) {
        this.f34273a = szVar;
    }

    @Override
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int R = RecyclerView.R(view);
        sz szVar = this.f34273a;
        s4.h0 adapter = szVar.f32734h0.getAdapter();
        xy xyVar = szVar.f32751n0;
        int i10 = 0;
        if (adapter == xyVar && R == xyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            xyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        yy yyVar = szVar.f32737i0;
        xyVar.getClass();
        if (!yyVar.F1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
