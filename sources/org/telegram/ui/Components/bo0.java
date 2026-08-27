package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class bo0 extends f2.b1 {

    public final re f27187a;

    public bo0(re reVar) {
        this.f27187a = reVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        re reVar = this.f27187a;
        View view = reVar.f28417u;
        boolean z10 = reVar.f28418w.I0() != 0;
        Boolean bool = reVar.f28419x;
        if (bool == null || z10 != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).start();
            reVar.f28419x = Boolean.valueOf(z10);
        }
    }
}
