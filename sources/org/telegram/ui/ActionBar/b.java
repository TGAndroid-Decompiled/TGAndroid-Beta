package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20706a;
    public final k f20707b;

    public b(k kVar, int i10) {
        this.f20706a = i10;
        this.f20707b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20706a) {
            case 0:
                k kVar = this.f20707b;
                if (!kVar.f21069n0 && (runnable = kVar.f21062j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20707b;
                if (!kVar2.J && kVar2.f21069n0) {
                    kVar2.g(true);
                    return;
                }
                j jVar = kVar2.f21085u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
