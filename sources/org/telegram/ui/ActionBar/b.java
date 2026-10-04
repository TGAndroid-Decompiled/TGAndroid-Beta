package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20403a;
    public final k f20404b;

    public b(k kVar, int i10) {
        this.f20403a = i10;
        this.f20404b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20403a) {
            case 0:
                k kVar = this.f20404b;
                if (!kVar.f21277n0 && (runnable = kVar.f21270j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20404b;
                if (!kVar2.J && kVar2.f21277n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21293u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
