package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18680a;
    public final l f18681b;

    public b(l lVar, int i10) {
        this.f18680a = i10;
        this.f18681b = lVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18680a) {
            case 0:
                l lVar = this.f18681b;
                if (!lVar.f19570n0 && (runnable = lVar.f19563j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                l lVar2 = this.f18681b;
                if (!lVar2.J && lVar2.f19570n0) {
                    lVar2.i(true);
                    return;
                }
                j jVar = lVar2.f19586u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
