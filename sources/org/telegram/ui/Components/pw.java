package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class pw extends s4.n0 {
    public final mz f27436a;

    public pw(mz mzVar) {
        this.f27436a = mzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        mz mzVar = this.f27436a;
        s4.h0 adapter = mzVar.f26548h0.getAdapter();
        ry ryVar = mzVar.f26565n0;
        int i10 = 0;
        if (adapter == ryVar && R == ryVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            ryVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        sy syVar = mzVar.f26551i0;
        ryVar.getClass();
        if (!syVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
