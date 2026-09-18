package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f18468a;
    public final k f18469b;

    public b(k kVar, int i10) {
        this.f18468a = i10;
        this.f18469b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f18468a) {
            case 0:
                k kVar = this.f18469b;
                if (!kVar.f19305n0 && (runnable = kVar.f19298j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f18469b;
                if (!kVar2.J && kVar2.f19305n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f19321u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
