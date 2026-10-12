package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20217a;
    public final k f20218b;

    public b(k kVar, int i10) {
        this.f20217a = i10;
        this.f20218b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20217a) {
            case 0:
                k kVar = this.f20218b;
                if (!kVar.f21061n0 && (runnable = kVar.f21054j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20218b;
                if (!kVar2.J && kVar2.f21061n0) {
                    kVar2.i(true);
                    return;
                }
                j jVar = kVar2.f21077u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
