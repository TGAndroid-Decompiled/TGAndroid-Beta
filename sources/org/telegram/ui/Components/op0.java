package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class op0 extends s4.r0 {
    public final ef f29121a;

    public op0(ef efVar) {
        this.f29121a = efVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        ef efVar = this.f29121a;
        View view = efVar.f30338u;
        if (efVar.f30339w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = efVar.f30340x;
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
        efVar.f30340x = Boolean.valueOf(z10);
    }
}
