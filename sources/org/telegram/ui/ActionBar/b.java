package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18735a;
    public final k f18736b;

    public b(k kVar, int i10) {
        this.f18735a = i10;
        this.f18736b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18735a) {
            case 0:
                k kVar = this.f18736b;
                if (!kVar.f19556n0 && (runnable = kVar.f19549j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18736b;
                if (!kVar2.J && kVar2.f19556n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19571u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
