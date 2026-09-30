package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class gp0 extends s4.s0 {
    public final ff f24611a;

    public gp0(ff ffVar) {
        this.f24611a = ffVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        ff ffVar = this.f24611a;
        View view = ffVar.f25787u;
        if (ffVar.f25788w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = ffVar.f25789x;
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
        ffVar.f25789x = Boolean.valueOf(z10);
    }
}
