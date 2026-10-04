package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20407a;
    public final k f20408b;

    public b(k kVar, int i10) {
        this.f20407a = i10;
        this.f20408b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20407a) {
            case 0:
                k kVar = this.f20408b;
                if (!kVar.f21281n0 && (runnable = kVar.f21274j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20408b;
                if (!kVar2.J && kVar2.f21281n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21297u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
