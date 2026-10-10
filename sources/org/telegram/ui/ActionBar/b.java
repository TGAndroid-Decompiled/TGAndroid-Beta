package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20404a;
    public final k f20405b;

    public b(k kVar, int i10) {
        this.f20404a = i10;
        this.f20405b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20404a) {
            case 0:
                k kVar = this.f20405b;
                if (!kVar.f21289n0 && (runnable = kVar.f21282j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20405b;
                if (!kVar2.J && kVar2.f21289n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21305u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
