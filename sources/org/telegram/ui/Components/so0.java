package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class so0 extends s4.s0 {
    public final cf f27898a;

    public so0(cf cfVar) {
        this.f27898a = cfVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        cf cfVar = this.f27898a;
        View view = cfVar.f29719u;
        if (cfVar.f29720w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = cfVar.f29721x;
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
        cfVar.f29721x = Boolean.valueOf(z10);
    }
}
