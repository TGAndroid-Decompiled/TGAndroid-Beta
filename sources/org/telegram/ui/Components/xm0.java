package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class xm0 extends v4.s0 {
    public final me f40352a;

    public xm0(me meVar) {
        this.f40352a = meVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        float f10;
        me meVar = this.f40352a;
        View view = meVar.f32297u;
        if (meVar.f32298w.I0() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = meVar.f32299x;
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
        meVar.f32299x = Boolean.valueOf(z9);
    }
}
