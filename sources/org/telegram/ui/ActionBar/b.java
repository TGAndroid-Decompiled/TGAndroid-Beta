package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20705a;
    public final k f20706b;

    public b(k kVar, int i10) {
        this.f20705a = i10;
        this.f20706b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20705a) {
            case 0:
                k kVar = this.f20706b;
                if (!kVar.f21068n0 && (runnable = kVar.f21061j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20706b;
                if (!kVar2.J && kVar2.f21068n0) {
                    kVar2.g(true);
                    return;
                }
                j jVar = kVar2.f21084u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
