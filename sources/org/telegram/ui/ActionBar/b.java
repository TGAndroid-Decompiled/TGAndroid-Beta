package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20630a;
    public final k f20631b;

    public b(k kVar, int i10) {
        this.f20630a = i10;
        this.f20631b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20630a) {
            case 0:
                k kVar = this.f20631b;
                if (!kVar.f21493n0 && (runnable = kVar.f21486j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20631b;
                if (!kVar2.J && kVar2.f21493n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21509u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
