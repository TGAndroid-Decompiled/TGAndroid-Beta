package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20480a;
    public final k f20481b;

    public b(k kVar, int i10) {
        this.f20480a = i10;
        this.f20481b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20480a) {
            case 0:
                k kVar = this.f20481b;
                if (!kVar.f21322n0 && (runnable = kVar.f21315j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20481b;
                if (!kVar2.J && kVar2.f21322n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21338u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
