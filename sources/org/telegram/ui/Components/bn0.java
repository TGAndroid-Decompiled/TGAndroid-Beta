package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class bn0 extends v4.t0 {
    public final oe f33331a;

    public bn0(oe oeVar) {
        this.f33331a = oeVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        oe oeVar = this.f33331a;
        View view = oeVar.f34660u;
        if (oeVar.f34661w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = oeVar.f34662x;
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
        oeVar.f34662x = Boolean.valueOf(z10);
    }
}
