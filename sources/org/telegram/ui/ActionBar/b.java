package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f22741a;
    public final k f22742b;

    public b(k kVar, int i9) {
        this.f22741a = i9;
        this.f22742b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22741a) {
            case 0:
                k kVar = this.f22742b;
                if (!kVar.f23577j0 && (runnable = kVar.f23569f0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f22742b;
                if (!kVar2.F && kVar2.f23577j0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f23589q0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
