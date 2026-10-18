package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20637a;
    public final k f20638b;

    public b(k kVar, int i10) {
        this.f20637a = i10;
        this.f20638b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20637a) {
            case 0:
                k kVar = this.f20638b;
                if (!kVar.f21500n0 && (runnable = kVar.f21493j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20638b;
                if (!kVar2.J && kVar2.f21500n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21516u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
