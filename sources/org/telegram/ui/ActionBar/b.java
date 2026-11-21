package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f28795a;
    public final k f28796b;

    public b(k kVar, int i7) {
        this.f28795a = i7;
        this.f28796b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f28795a) {
            case 0:
                k kVar = this.f28796b;
                if (!kVar.f29147o0 && (runnable = kVar.f29141k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f28796b;
                if (!kVar2.K && kVar2.f29147o0) {
                    kVar2.n(true);
                    return;
                }
                j jVar = kVar2.f29163v0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
