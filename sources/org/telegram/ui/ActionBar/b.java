package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20216a;
    public final k f20217b;

    public b(k kVar, int i10) {
        this.f20216a = i10;
        this.f20217b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20216a) {
            case 0:
                k kVar = this.f20217b;
                if (!kVar.f21060n0 && (runnable = kVar.f21053j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20217b;
                if (!kVar2.J && kVar2.f21060n0) {
                    kVar2.i(true);
                    return;
                }
                j jVar = kVar2.f21076u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
