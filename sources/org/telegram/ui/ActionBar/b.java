package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20400a;
    public final k f20401b;

    public b(k kVar, int i10) {
        this.f20400a = i10;
        this.f20401b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20400a) {
            case 0:
                k kVar = this.f20401b;
                if (!kVar.f21285n0 && (runnable = kVar.f21278j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20401b;
                if (!kVar2.J && kVar2.f21285n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21301u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
