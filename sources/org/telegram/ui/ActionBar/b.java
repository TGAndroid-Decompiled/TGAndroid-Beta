package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18734a;
    public final k f18735b;

    public b(k kVar, int i10) {
        this.f18734a = i10;
        this.f18735b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18734a) {
            case 0:
                k kVar = this.f18735b;
                if (!kVar.f19555n0 && (runnable = kVar.f19548j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18735b;
                if (!kVar2.J && kVar2.f19555n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19570u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
