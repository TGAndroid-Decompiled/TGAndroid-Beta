package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class yn0 extends s4.s0 {
    public final ie f32767a;

    public yn0(ie ieVar) {
        this.f32767a = ieVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f7;
        ie ieVar = this.f32767a;
        View view = ieVar.f25118u;
        if (ieVar.f25119w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = ieVar.f25120x;
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
        ieVar.f25120x = Boolean.valueOf(z10);
    }
}
