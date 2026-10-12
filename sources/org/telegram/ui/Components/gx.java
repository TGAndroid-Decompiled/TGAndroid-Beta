package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class gx extends s4.o0 {
    public final d00 f26543a;

    public gx(d00 d00Var) {
        this.f26543a = d00Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        d00 d00Var = this.f26543a;
        s4.i0 adapter = d00Var.f25096h0.getAdapter();
        hz hzVar = d00Var.f25113n0;
        int i10 = 0;
        if (adapter == hzVar && R == hzVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            hzVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        iz izVar = d00Var.f25099i0;
        hzVar.getClass();
        if (!izVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
