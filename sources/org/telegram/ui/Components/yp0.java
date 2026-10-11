package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class yp0 extends s4.t0 {
    public final hf f33319a;

    public yp0(hf hfVar) {
        this.f33319a = hfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        hf hfVar = this.f33319a;
        View view = hfVar.f25285u;
        if (hfVar.f25286w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = hfVar.f25287x;
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
        hfVar.f25287x = Boolean.valueOf(z10);
    }
}
