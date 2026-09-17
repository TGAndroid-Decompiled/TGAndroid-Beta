package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class ro0 extends s4.s0 {
    public final ff f30089a;

    public ro0(ff ffVar) {
        this.f30089a = ffVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        ff ffVar = this.f30089a;
        View view = ffVar.f31414u;
        if (ffVar.f31415w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = ffVar.f31416x;
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
        ffVar.f31416x = Boolean.valueOf(z10);
    }
}
