package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qw extends s4.n0 {
    public final mz f27839a;

    public qw(mz mzVar) {
        this.f27839a = mzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.z0 z0Var) {
        recyclerView.getClass();
        int S = RecyclerView.S(view);
        mz mzVar = this.f27839a;
        s4.h0 adapter = mzVar.f26589h0.getAdapter();
        ry ryVar = mzVar.f26606n0;
        int i10 = 0;
        if (adapter == ryVar && S == ryVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (S == 0) {
            ryVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        sy syVar = mzVar.f26592i0;
        ryVar.getClass();
        if (!syVar.E1(S)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
