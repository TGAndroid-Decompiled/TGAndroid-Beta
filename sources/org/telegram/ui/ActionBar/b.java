package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18639a;
    public final k f18640b;

    public b(k kVar, int i10) {
        this.f18639a = i10;
        this.f18640b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18639a) {
            case 0:
                k kVar = this.f18640b;
                if (!kVar.f19505n0 && (runnable = kVar.f19498j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18640b;
                if (!kVar2.J && kVar2.f19505n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19521u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
