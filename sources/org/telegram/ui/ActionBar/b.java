package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18452a;
    public final k f18453b;

    public b(k kVar, int i10) {
        this.f18452a = i10;
        this.f18453b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18452a) {
            case 0:
                k kVar = this.f18453b;
                if (!kVar.f19313n0 && (runnable = kVar.f19306j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18453b;
                if (!kVar2.J && kVar2.f19313n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19328u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
