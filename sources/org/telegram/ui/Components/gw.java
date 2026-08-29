package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class gw extends f2.v0 {
    public final fz f29004a;

    public gw(fz fzVar) {
        this.f29004a = fzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.k1 k1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        fz fzVar = this.f29004a;
        f2.p0 adapter = fzVar.f28585d0.getAdapter();
        jy jyVar = fzVar.f28605j0;
        int i10 = 0;
        if (adapter == jyVar && R == jyVar.E) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            jyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ky kyVar = fzVar.f28589e0;
        jyVar.getClass();
        if (!kyVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
