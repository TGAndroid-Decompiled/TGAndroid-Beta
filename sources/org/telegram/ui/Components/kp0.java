package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class kp0 extends s4.s0 {
    public final gf f28177a;

    public kp0(gf gfVar) {
        this.f28177a = gfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        gf gfVar = this.f28177a;
        View view = gfVar.f29432u;
        if (gfVar.f29433w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = gfVar.f29434x;
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
        gfVar.f29434x = Boolean.valueOf(z10);
    }
}
