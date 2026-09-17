package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20245a;
    public final k f20246b;

    public b(k kVar, int i10) {
        this.f20245a = i10;
        this.f20246b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20245a) {
            case 0:
                k kVar = this.f20246b;
                if (!kVar.f21131n0 && (runnable = kVar.f21124j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20246b;
                if (!kVar2.J && kVar2.f21131n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21146u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
