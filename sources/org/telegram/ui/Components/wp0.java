package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class wp0 extends s4.t0 {
    public final hf f32656a;

    public wp0(hf hfVar) {
        this.f32656a = hfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        hf hfVar = this.f32656a;
        View view = hfVar.f24744u;
        if (hfVar.f24745w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = hfVar.f24746x;
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
        hfVar.f24746x = Boolean.valueOf(z10);
    }
}
