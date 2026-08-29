package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class lo0 extends f2.a1 {
    public final ye f30403a;

    public lo0(ye yeVar) {
        this.f30403a = yeVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        float f9;
        ye yeVar = this.f30403a;
        View view = yeVar.f31725u;
        if (yeVar.f31726w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = yeVar.f31727x;
        if (bool != null && z10 == bool.booleanValue()) {
            return;
        }
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        animate.alpha(f9).setDuration(150L).start();
        yeVar.f31727x = Boolean.valueOf(z10);
    }
}
