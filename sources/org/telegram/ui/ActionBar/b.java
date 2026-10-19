package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f20633a;
    public final k f20634b;

    public b(k kVar, int i10) {
        this.f20633a = i10;
        this.f20634b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f20633a) {
            case 0:
                k kVar = this.f20634b;
                if (!kVar.f21496n0 && (runnable = kVar.f21489j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f20634b;
                if (!kVar2.J && kVar2.f21496n0) {
                    kVar2.h(true);
                    return;
                }
                j jVar = kVar2.f21512u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
