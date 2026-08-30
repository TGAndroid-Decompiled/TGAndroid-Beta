package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class kw extends f2.u0 {
    public final kz f26393a;

    public kw(kz kzVar) {
        this.f26393a = kzVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.i1 i1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        kz kzVar = this.f26393a;
        f2.o0 adapter = kzVar.f26423e0.getAdapter();
        oy oyVar = kzVar.f26442k0;
        int i10 = 0;
        if (adapter == oyVar && R == oyVar.F) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            oyVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        py pyVar = kzVar.f26427f0;
        oyVar.getClass();
        if (!pyVar.E1(R)) {
            i10 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i10;
    }
}
