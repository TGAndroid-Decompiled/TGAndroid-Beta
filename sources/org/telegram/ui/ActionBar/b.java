package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f28798a;
    public final k f28799b;

    public b(k kVar, int i7) {
        this.f28798a = i7;
        this.f28799b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f28798a) {
            case 0:
                k kVar = this.f28799b;
                if (!kVar.f29150o0 && (runnable = kVar.f29144k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f28799b;
                if (!kVar2.K && kVar2.f29150o0) {
                    kVar2.n(true);
                    return;
                }
                j jVar = kVar2.f29166v0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
