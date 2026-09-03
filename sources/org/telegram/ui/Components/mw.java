package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class mw extends f2.v0 {
    public final mz f29263a;

    public mw(mz mzVar) {
        this.f29263a = mzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.j1 j1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        mz mzVar = this.f29263a;
        f2.p0 adapter = mzVar.f29280e0.getAdapter();
        qy qyVar = mzVar.f29299k0;
        int i10 = 0;
        if (adapter == qyVar && R == qyVar.F) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            qyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ry ryVar = mzVar.f29284f0;
        qyVar.getClass();
        if (!ryVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
