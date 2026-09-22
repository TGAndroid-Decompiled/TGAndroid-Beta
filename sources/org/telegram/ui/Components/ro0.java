package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class ro0 extends s4.s0 {
    public final cf f27654a;

    public ro0(cf cfVar) {
        this.f27654a = cfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        cf cfVar = this.f27654a;
        View view = cfVar.f28853u;
        if (cfVar.f28854w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = cfVar.f28855x;
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
        cfVar.f28855x = Boolean.valueOf(z10);
    }
}
