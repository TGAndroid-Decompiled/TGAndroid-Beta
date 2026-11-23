package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class mn0 extends v4.u0 {
    public final xe f37588a;

    public mn0(xe xeVar) {
        this.f37588a = xeVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        xe xeVar = this.f37588a;
        View view = xeVar.f38961u;
        if (xeVar.f38962w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = xeVar.f38963x;
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
        xeVar.f38963x = Boolean.valueOf(z10);
    }
}
