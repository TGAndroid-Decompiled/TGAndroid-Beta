package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20244a;
    public final k f20245b;

    public b(k kVar, int i10) {
        this.f20244a = i10;
        this.f20245b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20244a) {
            case 0:
                k kVar = this.f20245b;
                if (!kVar.f21130n0 && (runnable = kVar.f21123j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20245b;
                if (!kVar2.J && kVar2.f21130n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21145u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
