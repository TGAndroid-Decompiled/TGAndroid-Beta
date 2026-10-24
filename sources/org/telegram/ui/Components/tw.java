package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class tw extends s4.m0 {
    public final rz f30906a;

    public tw(rz rzVar) {
        this.f30906a = rzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.y0 y0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        rz rzVar = this.f30906a;
        s4.g0 adapter = rzVar.f30325h0.getAdapter();
        wy wyVar = rzVar.f30342n0;
        int i10 = 0;
        if (adapter == wyVar && R == wyVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            wyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        xy xyVar = rzVar.f30328i0;
        wyVar.getClass();
        if (!xyVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
