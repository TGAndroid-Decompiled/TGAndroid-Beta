package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f17542a;
    public final l f17543b;

    public b(l lVar, int i10) {
        this.f17542a = i10;
        this.f17543b = lVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f17542a) {
            case 0:
                l lVar = this.f17543b;
                if (!lVar.f18389n0 && (runnable = lVar.f18382j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                l lVar2 = this.f17543b;
                if (!lVar2.J && lVar2.f18389n0) {
                    lVar2.h(true);
                    return;
                }
                k kVar = lVar2.f18404u0;
                if (kVar != null) {
                    kVar.b(-1);
                    return;
                }
                return;
        }
    }
}
