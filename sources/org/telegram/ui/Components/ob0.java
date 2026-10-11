package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ob0 extends s4.o0 {
    public final pb0 f29366a;

    public ob0(pb0 pb0Var) {
        this.f29366a = pb0Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        int R;
        int i10 = 0;
        rect.left = 0;
        rect.right = 0;
        rect.top = 0;
        rect.bottom = 0;
        s4.p0 layoutManager = recyclerView.getLayoutManager();
        qb0 qb0Var = this.f29366a.Z2;
        if (layoutManager == qb0Var.d && (R = RecyclerView.R(view)) != 0 && !qb0Var.f30116f.N()) {
            if (qb0Var.f30116f.I() == null && qb0Var.f30116f.U == null) {
                rect.top = AndroidUtilities.dp(2.0f);
            } else if (R != 0) {
                R--;
                jb0 jb0Var = qb0Var.d;
                jb0Var.B1();
                if (R > jb0Var.U) {
                    rect.top = AndroidUtilities.dp(2.0f);
                }
            } else {
                return;
            }
            if (!qb0Var.d.E1(R)) {
                i10 = AndroidUtilities.dp(2.0f);
            }
            rect.right = i10;
        }
    }
}
