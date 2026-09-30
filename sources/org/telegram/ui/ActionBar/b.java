package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18751a;
    public final k f18752b;

    public b(k kVar, int i10) {
        this.f18751a = i10;
        this.f18752b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18751a) {
            case 0:
                k kVar = this.f18752b;
                if (!kVar.f19572n0 && (runnable = kVar.f19565j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18752b;
                if (!kVar2.J && kVar2.f19572n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19587u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
