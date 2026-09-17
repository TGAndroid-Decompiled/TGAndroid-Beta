package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20218a;
    public final k f20219b;

    public b(k kVar, int i10) {
        this.f20218a = i10;
        this.f20219b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20218a) {
            case 0:
                k kVar = this.f20219b;
                if (!kVar.f21104n0 && (runnable = kVar.f21097j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20219b;
                if (!kVar2.J && kVar2.f21104n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21119u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
