package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20444a;
    public final k f20445b;

    public b(k kVar, int i10) {
        this.f20444a = i10;
        this.f20445b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20444a) {
            case 0:
                k kVar = this.f20445b;
                if (!kVar.f21286n0 && (runnable = kVar.f21279j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20445b;
                if (!kVar2.J && kVar2.f21286n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21302u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
