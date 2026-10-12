package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class cq0 extends s4.t0 {
    public final kf f24988a;

    public cq0(kf kfVar) {
        this.f24988a = kfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        kf kfVar = this.f24988a;
        View view = kfVar.f26494u;
        if (kfVar.f26495w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = kfVar.f26496x;
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
        kfVar.f26496x = Boolean.valueOf(z10);
    }
}
