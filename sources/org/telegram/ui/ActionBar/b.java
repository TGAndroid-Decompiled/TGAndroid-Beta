package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18720a;
    public final k f18721b;

    public b(k kVar, int i10) {
        this.f18720a = i10;
        this.f18721b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18720a) {
            case 0:
                k kVar = this.f18721b;
                if (!kVar.f19541n0 && (runnable = kVar.f19534j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18721b;
                if (!kVar2.J && kVar2.f19541n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19556u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
