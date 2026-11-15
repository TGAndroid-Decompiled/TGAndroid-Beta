package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class bn0 extends v4.t0 {
    public final oe f33328a;

    public bn0(oe oeVar) {
        this.f33328a = oeVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        oe oeVar = this.f33328a;
        View view = oeVar.f34656u;
        if (oeVar.f34657w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = oeVar.f34658x;
        if (bool != null && z10 == bool.booleanValue()) {
            return;
        }
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setDuration(150L).start();
        oeVar.f34658x = Boolean.valueOf(z10);
    }
}
