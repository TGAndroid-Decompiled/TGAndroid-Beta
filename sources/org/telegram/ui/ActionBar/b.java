package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20631a;
    public final k f20632b;

    public b(k kVar, int i10) {
        this.f20631a = i10;
        this.f20632b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20631a) {
            case 0:
                k kVar = this.f20632b;
                if (!kVar.f21494n0 && (runnable = kVar.f21487j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20632b;
                if (!kVar2.J && kVar2.f21494n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21510u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
