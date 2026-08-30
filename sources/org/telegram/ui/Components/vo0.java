package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class vo0 extends f2.z0 {
    public final ve f29545a;

    public vo0(ve veVar) {
        this.f29545a = veVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z4;
        float f10;
        ve veVar = this.f29545a;
        View view = veVar.f31419u;
        if (veVar.f31420w.I0() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        Boolean bool = veVar.f31421x;
        if (bool != null && z4 == bool.booleanValue()) {
            return;
        }
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setDuration(150L).start();
        veVar.f31421x = Boolean.valueOf(z4);
    }
}
