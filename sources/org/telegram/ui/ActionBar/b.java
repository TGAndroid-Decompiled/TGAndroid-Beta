package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18671a;
    public final k f18672b;

    public b(k kVar, int i10) {
        this.f18671a = i10;
        this.f18672b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18671a) {
            case 0:
                k kVar = this.f18672b;
                if (!kVar.f19537n0 && (runnable = kVar.f19530j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18672b;
                if (!kVar2.J && kVar2.f19537n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19553u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
