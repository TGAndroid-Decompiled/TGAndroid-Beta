package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f19320a;
    public final k f19321b;

    public b(k kVar, int i10) {
        this.f19320a = i10;
        this.f19321b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f19320a) {
            case 0:
                k kVar = this.f19321b;
                if (!kVar.f20142n0 && (runnable = kVar.f20135j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f19321b;
                if (!kVar2.J && kVar2.f20142n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f20158u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
