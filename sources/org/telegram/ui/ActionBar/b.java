package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f28793a;
    public final k f28794b;

    public b(k kVar, int i7) {
        this.f28793a = i7;
        this.f28794b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f28793a) {
            case 0:
                k kVar = this.f28794b;
                if (!kVar.f29086o0 && (runnable = kVar.f29080k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f28794b;
                if (!kVar2.K && kVar2.f29086o0) {
                    kVar2.o(true);
                    return;
                }
                j jVar = kVar2.f29102v0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
