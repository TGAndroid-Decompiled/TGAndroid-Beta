package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rw extends s4.n0 {
    public final nz f30598a;

    public rw(nz nzVar) {
        this.f30598a = nzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        nz nzVar = this.f30598a;
        s4.h0 adapter = nzVar.f29210h0.getAdapter();
        sy syVar = nzVar.f29227n0;
        int i10 = 0;
        if (adapter == syVar && R == syVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            syVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        ty tyVar = nzVar.f29213i0;
        syVar.getClass();
        if (!tyVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
