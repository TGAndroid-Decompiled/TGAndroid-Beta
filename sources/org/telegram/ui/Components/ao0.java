package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class ao0 extends f2.d1 {
    public final ve f26875a;

    public ao0(ve veVar) {
        this.f26875a = veVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        boolean z10;
        float f10;
        ve veVar = this.f26875a;
        View view = veVar.f28097u;
        if (veVar.f28098w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = veVar.f28099x;
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
        veVar.f28099x = Boolean.valueOf(z10);
    }
}
