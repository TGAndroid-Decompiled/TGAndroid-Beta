package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20402a;
    public final k f20403b;

    public b(k kVar, int i10) {
        this.f20402a = i10;
        this.f20403b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20402a) {
            case 0:
                k kVar = this.f20403b;
                if (!kVar.f21276n0 && (runnable = kVar.f21269j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20403b;
                if (!kVar2.J && kVar2.f21276n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21292u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
