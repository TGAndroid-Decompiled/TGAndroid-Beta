package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18467a;
    public final k f18468b;

    public b(k kVar, int i10) {
        this.f18467a = i10;
        this.f18468b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18467a) {
            case 0:
                k kVar = this.f18468b;
                if (!kVar.f19304n0 && (runnable = kVar.f19297j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18468b;
                if (!kVar2.J && kVar2.f19304n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19320u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
