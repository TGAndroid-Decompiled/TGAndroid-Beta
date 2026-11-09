package org.telegram.ui.ActionBar;

import android.view.View;
public final class b implements View.OnClickListener {
    public final int f27336a;
    public final k f27337b;

    public b(k kVar, int i7) {
        this.f27336a = i7;
        this.f27337b = kVar;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        switch (this.f27336a) {
            case 0:
                k kVar = this.f27337b;
                if (!kVar.f27664n0 && (runnable = kVar.f27657j0) != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                k kVar2 = this.f27337b;
                if (!kVar2.J && kVar2.f27664n0) {
                    kVar2.m(true);
                    return;
                }
                j jVar = kVar2.f27679u0;
                if (jVar != null) {
                    jVar.b(-1);
                    return;
                }
                return;
        }
    }
}
