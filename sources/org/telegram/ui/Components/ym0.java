package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class ym0 extends v4.s0 {
    public final ne f40765a;

    public ym0(ne neVar) {
        this.f40765a = neVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        float f10;
        ne neVar = this.f40765a;
        View view = neVar.f32722u;
        if (neVar.f32723w.I0() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = neVar.f32724x;
        if (bool != null && z9 == bool.booleanValue()) {
            return;
        }
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setDuration(150L).start();
        neVar.f32724x = Boolean.valueOf(z9);
    }
}
