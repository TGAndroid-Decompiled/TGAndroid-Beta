package org.telegram.ui.Components;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class aw extends f2.y0 {
    public final wy f26913a;

    public aw(wy wyVar) {
        this.f26913a = wyVar;
    }

    @Override
    public final void a(Rect rect, View view, RecyclerView recyclerView, f2.n1 n1Var) {
        recyclerView.getClass();
        int R = RecyclerView.R(view);
        wy wyVar = this.f26913a;
        f2.r0 adapter = wyVar.f34394d0.getAdapter();
        ay ayVar = wyVar.f34414j0;
        int i9 = 0;
        if (adapter == ayVar && R == ayVar.E) {
            rect.set(0, 0, 0, 0);
            return;
        }
        if (R == 0) {
            ayVar.getClass();
        }
        rect.left = 0;
        rect.bottom = 0;
        rect.top = AndroidUtilities.dp(2.0f);
        cy cyVar = wyVar.f34398e0;
        ayVar.getClass();
        if (!cyVar.E1(R)) {
            i9 = AndroidUtilities.dp(2.0f);
        }
        rect.right = i9;
    }
}
