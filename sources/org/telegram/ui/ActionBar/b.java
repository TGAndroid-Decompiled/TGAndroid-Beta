package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f27334a;
    public final k f27335b;

    public b(k kVar, int i7) {
        this.f27334a = i7;
        this.f27335b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27334a) {
            case 0:
                k kVar = this.f27335b;
                if (!kVar.f27680n0 && (runnable = kVar.f27673j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f27335b;
                if (!kVar2.J && kVar2.f27680n0) {
                    kVar2.l(true);
                    return;
                }
                j jVar = kVar2.f27695u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
