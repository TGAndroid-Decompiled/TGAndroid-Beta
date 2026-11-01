package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20161a;
    public final l f20162b;

    public b(l lVar, int i10) {
        this.f20161a = i10;
        this.f20162b = lVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20161a) {
            case 0:
                l lVar = this.f20162b;
                if (!lVar.f20498n0 && (runnable = lVar.f20491j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                l lVar2 = this.f20162b;
                if (!lVar2.J && lVar2.f20498n0) {
                    lVar2.k(true);
                    return;
                }
                k kVar = lVar2.f20514u0;
                if (kVar != null) {
                    kVar.b(-1);
                    return;
                }
                return;
        }
    }
}
