package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ow extends s4.n0 {
    public final kz f29227a;

    public ow(kz kzVar) {
        this.f29227a = kzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        kz kzVar = this.f29227a;
        s4.h0 adapter = kzVar.f27948h0.getAdapter();
        py pyVar = kzVar.f27965n0;
        int i10 = 0;
        if (adapter == pyVar && R == pyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            pyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        qy qyVar = kzVar.f27951i0;
        pyVar.getClass();
        if (!qyVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
