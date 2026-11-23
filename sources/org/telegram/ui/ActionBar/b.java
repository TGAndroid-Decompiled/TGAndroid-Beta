package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f28857a;
    public final k f28858b;

    public b(k kVar, int i7) {
        this.f28857a = i7;
        this.f28858b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f28857a) {
            case 0:
                k kVar = this.f28858b;
                if (!kVar.f29166o0 && (runnable = kVar.f29160k0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f28858b;
                if (!kVar2.K && kVar2.f29166o0) {
                    kVar2.n(true);
                    return;
                }
                j jVar = kVar2.f29182v0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
