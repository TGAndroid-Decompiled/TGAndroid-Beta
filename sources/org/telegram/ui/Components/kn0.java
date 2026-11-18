package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class kn0 extends v4.u0 {
    public final xe f36832a;

    public kn0(xe xeVar) {
        this.f36832a = xeVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        xe xeVar = this.f36832a;
        View view = xeVar.f38142u;
        if (xeVar.f38143w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = xeVar.f38144x;
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
        xeVar.f38144x = Boolean.valueOf(z10);
    }
}
