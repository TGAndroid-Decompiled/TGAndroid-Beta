package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f19620a;
    public final k f19621b;

    public b(k kVar, int i10) {
        this.f19620a = i10;
        this.f19621b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f19620a) {
            case 0:
                k kVar = this.f19621b;
                if (!kVar.f20442n0 && (runnable = kVar.f20435j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f19621b;
                if (!kVar2.J && kVar2.f20442n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f20458u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
