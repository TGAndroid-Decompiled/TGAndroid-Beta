package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f21186a;
    public final k f21187b;

    public b(k kVar, int i10) {
        this.f21186a = i10;
        this.f21187b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f21186a) {
            case 0:
                k kVar = this.f21187b;
                if (!kVar.f21546k0 && (runnable = kVar.f21538g0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f21187b;
                if (!kVar2.G && kVar2.f21546k0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21559r0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
