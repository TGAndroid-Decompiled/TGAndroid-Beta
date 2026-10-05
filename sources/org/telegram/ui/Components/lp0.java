package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class lp0 extends s4.s0 {
    public final gf f28511a;

    public lp0(gf gfVar) {
        this.f28511a = gfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        gf gfVar = this.f28511a;
        View view = gfVar.f29804u;
        if (gfVar.f29805w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = gfVar.f29806x;
        if (bool != null && z10 == bool.booleanValue()) {
            return;
        }
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).setDuration(150L).start();
        gfVar.f29806x = Boolean.valueOf(z10);
    }
}
