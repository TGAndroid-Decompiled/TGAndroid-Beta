package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f27321a;
    public final l f27322b;

    public b(l lVar, int i7) {
        this.f27321a = i7;
        this.f27322b = lVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27321a) {
            case 0:
                l lVar = this.f27322b;
                if (!lVar.f27691n0 && (runnable = lVar.f27684j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                l lVar2 = this.f27322b;
                if (!lVar2.J && lVar2.f27691n0) {
                    lVar2.n(true);
                    return;
                }
                k kVar = lVar2.f27706u0;
                if (kVar != null) {
                    kVar.b(-1);
                    return;
                }
                return;
        }
    }
}
