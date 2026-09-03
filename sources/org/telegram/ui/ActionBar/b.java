package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f21188a;
    public final k f21189b;

    public b(k kVar, int i10) {
        this.f21188a = i10;
        this.f21189b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f21188a) {
            case 0:
                k kVar = this.f21189b;
                if (!kVar.f21548k0 && (runnable = kVar.f21540g0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f21189b;
                if (!kVar2.G && kVar2.f21548k0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21561r0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
