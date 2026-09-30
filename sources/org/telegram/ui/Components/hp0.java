package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class hp0 extends s4.s0 {
    public final gf f24925a;

    public hp0(gf gfVar) {
        this.f24925a = gfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        gf gfVar = this.f24925a;
        View view = gfVar.f26079u;
        if (gfVar.f26080w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = gfVar.f26081x;
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
        gfVar.f26081x = Boolean.valueOf(z10);
    }
}
