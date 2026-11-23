package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f28764a;
    public final k f28765b;

    public b(k kVar, int i7) {
        this.f28764a = i7;
        this.f28765b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f28764a) {
            case 0:
                k kVar = this.f28765b;
                if (!kVar.f29116o0 && (runnable = kVar.f29110k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f28765b;
                if (!kVar2.K && kVar2.f29116o0) {
                    kVar2.n(true);
                    return;
                }
                j jVar = kVar2.f29132v0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
