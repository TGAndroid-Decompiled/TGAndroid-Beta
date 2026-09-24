package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class pw extends s4.n0 {
    public final lz f27433a;

    public pw(lz lzVar) {
        this.f27433a = lzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        lz lzVar = this.f27433a;
        s4.h0 adapter = lzVar.f26244h0.getAdapter();
        qy qyVar = lzVar.f26261n0;
        int i10 = 0;
        if (adapter == qyVar && R == qyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            qyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ry ryVar = lzVar.f26247i0;
        qyVar.getClass();
        if (!ryVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
