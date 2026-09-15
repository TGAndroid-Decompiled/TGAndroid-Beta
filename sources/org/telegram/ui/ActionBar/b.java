package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18454a;
    public final k f18455b;

    public b(k kVar, int i10) {
        this.f18454a = i10;
        this.f18455b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18454a) {
            case 0:
                k kVar = this.f18455b;
                if (!kVar.f19316n0 && (runnable = kVar.f19309j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18455b;
                if (!kVar2.J && kVar2.f19316n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19332u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
