package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class an0 extends u4.t0 {
    public final le f31951a;

    public an0(le leVar) {
        this.f31951a = leVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        boolean z10;
        float f10;
        le leVar = this.f31951a;
        View view = leVar.f33427u;
        if (leVar.f33428w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = leVar.f33429x;
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
        leVar.f33429x = Boolean.valueOf(z10);
    }
}
