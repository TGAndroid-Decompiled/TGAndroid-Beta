package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class cq0 extends s4.t0 {
    public final kf f25003a;

    public cq0(kf kfVar) {
        this.f25003a = kfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        kf kfVar = this.f25003a;
        View view = kfVar.f26492u;
        if (kfVar.f26493w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = kfVar.f26494x;
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
        kfVar.f26494x = Boolean.valueOf(z10);
    }
}
