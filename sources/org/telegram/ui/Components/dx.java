package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class dx extends s4.o0 {
    public final a00 f25831a;

    public dx(a00 a00Var) {
        this.f25831a = a00Var;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, s4.a1 a1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        a00 a00Var = this.f25831a;
        s4.i0 adapter = a00Var.f24417h0.getAdapter();
        ez ezVar = a00Var.f24434n0;
        int i10 = 0;
        if (adapter == ezVar && R == ezVar.I) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            ezVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        fz fzVar = a00Var.f24420i0;
        ezVar.getClass();
        if (!fzVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
