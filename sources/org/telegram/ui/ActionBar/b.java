package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18440a;
    public final k f18441b;

    public b(k kVar, int i10) {
        this.f18440a = i10;
        this.f18441b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18440a) {
            case 0:
                k kVar = this.f18441b;
                if (!kVar.f19296n0 && (runnable = kVar.f19289j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18441b;
                if (!kVar2.J && kVar2.f19296n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19311u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
