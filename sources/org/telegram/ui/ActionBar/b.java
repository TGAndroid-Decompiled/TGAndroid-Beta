package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20634a;
    public final k f20635b;

    public b(k kVar, int i10) {
        this.f20634a = i10;
        this.f20635b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20634a) {
            case 0:
                k kVar = this.f20635b;
                if (!kVar.f21497n0 && (runnable = kVar.f21490j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20635b;
                if (!kVar2.J && kVar2.f21497n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21513u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
