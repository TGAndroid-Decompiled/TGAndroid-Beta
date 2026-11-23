package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
public final class ln0 extends v4.u0 {
    public final ye f37185a;

    public ln0(ye yeVar) {
        this.f37185a = yeVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        float f10;
        ye yeVar = this.f37185a;
        View view = yeVar.f38521u;
        if (yeVar.f38522w.I0() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = yeVar.f38523x;
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
        yeVar.f38523x = Boolean.valueOf(z10);
    }
}
