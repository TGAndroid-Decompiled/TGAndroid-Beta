package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f27331a;
    public final k f27332b;

    public b(k kVar, int i7) {
        this.f27331a = i7;
        this.f27332b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27331a) {
            case 0:
                k kVar = this.f27332b;
                if (!kVar.f27677n0 && (runnable = kVar.f27670j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f27332b;
                if (!kVar2.J && kVar2.f27677n0) {
                    kVar2.l(true);
                    return;
                }
                j jVar = kVar2.f27692u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
