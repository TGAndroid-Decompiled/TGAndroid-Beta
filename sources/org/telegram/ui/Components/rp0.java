package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class rp0 extends s4.r0 {
    public final cf f30255a;

    public rp0(cf cfVar) {
        this.f30255a = cfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        cf cfVar = this.f30255a;
        View view = cfVar.f32014u;
        if (cfVar.f32015w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = cfVar.f32016x;
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
        cfVar.f32016x = Boolean.valueOf(z10);
    }
}
