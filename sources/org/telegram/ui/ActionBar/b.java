package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18686a;
    public final k f18687b;

    public b(k kVar, int i10) {
        this.f18686a = i10;
        this.f18687b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18686a) {
            case 0:
                k kVar = this.f18687b;
                if (!kVar.f19552n0 && (runnable = kVar.f19545j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18687b;
                if (!kVar2.J && kVar2.f19552n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19568u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
