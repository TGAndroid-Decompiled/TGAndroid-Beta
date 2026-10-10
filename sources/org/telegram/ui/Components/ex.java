package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ex extends s4.o0 {
    public final b00 f26189a;

    public ex(b00 b00Var) {
        this.f26189a = b00Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        b00 b00Var = this.f26189a;
        s4.i0 adapter = b00Var.f24705h0.getAdapter();
        fz fzVar = b00Var.f24722n0;
        int i10 = 0;
        if (adapter == fzVar && R == fzVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            fzVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        gz gzVar = b00Var.f24708i0;
        fzVar.getClass();
        if (!gzVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
