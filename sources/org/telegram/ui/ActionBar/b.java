package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f22756a;
    public final l f22757b;

    public b(l lVar, int i10) {
        this.f22756a = i10;
        this.f22757b = lVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f22756a) {
            case 0:
                l lVar = this.f22757b;
                if (!lVar.f23612j0 && (runnable = lVar.f23604f0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                l lVar2 = this.f22757b;
                if (!lVar2.F && lVar2.f23612j0) {
                    lVar2.h(true);
                    return;
                }
                k kVar = lVar2.f23624q0;
                if (kVar != null) {
                    kVar.b(-1);
                    return;
                }
                return;
        }
    }
}
