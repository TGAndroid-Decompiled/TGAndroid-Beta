package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20160a;
    public final l f20161b;

    public b(l lVar, int i10) {
        this.f20160a = i10;
        this.f20161b = lVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20160a) {
            case 0:
                l lVar = this.f20161b;
                if (!lVar.f20497n0 && (runnable = lVar.f20490j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                l lVar2 = this.f20161b;
                if (!lVar2.J && lVar2.f20497n0) {
                    lVar2.k(true);
                    return;
                }
                k kVar = lVar2.f20513u0;
                if (kVar != null) {
                    kVar.b(-1);
                    return;
                }
                return;
        }
    }
}
