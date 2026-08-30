package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f19518a;
    public final k f19519b;

    public b(k kVar, int i10) {
        this.f19518a = i10;
        this.f19519b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f19518a) {
            case 0:
                k kVar = this.f19519b;
                if (!kVar.f20330k0 && (runnable = kVar.f20322g0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f19519b;
                if (!kVar2.G && kVar2.f20330k0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f20343r0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
