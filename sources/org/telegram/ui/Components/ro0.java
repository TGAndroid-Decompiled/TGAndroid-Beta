package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class ro0 extends s4.s0 {
    public final cf f27657a;

    public ro0(cf cfVar) {
        this.f27657a = cfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        cf cfVar = this.f27657a;
        View view = cfVar.f28856u;
        if (cfVar.f28857w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = cfVar.f28858x;
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
        cfVar.f28858x = Boolean.valueOf(z10);
    }
}
