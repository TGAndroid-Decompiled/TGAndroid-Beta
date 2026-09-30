package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18736a;
    public final k f18737b;

    public b(k kVar, int i10) {
        this.f18736a = i10;
        this.f18737b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18736a) {
            case 0:
                k kVar = this.f18737b;
                if (!kVar.f19557n0 && (runnable = kVar.f19550j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18737b;
                if (!kVar2.J && kVar2.f19557n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19572u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
