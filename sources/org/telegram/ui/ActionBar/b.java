package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f28418a;
    public final k f28419b;

    public b(k kVar, int i7) {
        this.f28418a = i7;
        this.f28419b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f28418a) {
            case 0:
                k kVar = this.f28419b;
                if (!kVar.f29304o0 && (runnable = kVar.f29298k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f28419b;
                if (!kVar2.K && kVar2.f29304o0) {
                    kVar2.n(true);
                    return;
                }
                j jVar = kVar2.f29320v0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
