package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class nw extends s4.n0 {
    public final kz f26556a;

    public nw(kz kzVar) {
        this.f26556a = kzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        kz kzVar = this.f26556a;
        s4.h0 adapter = kzVar.f25731h0.getAdapter();
        py pyVar = kzVar.f25748n0;
        int i10 = 0;
        if (adapter == pyVar && S == pyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (S == 0) {
            pyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        qy qyVar = kzVar.f25734i0;
        pyVar.getClass();
        if (!qyVar.E1(S)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
